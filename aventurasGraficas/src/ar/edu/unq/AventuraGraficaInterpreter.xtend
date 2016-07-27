package ar.edu.unq

import ar.edu.unq.aventuraGrafica.Accion
import ar.edu.unq.aventuraGrafica.Acciones
import ar.edu.unq.aventuraGrafica.CambiarEstado
import ar.edu.unq.aventuraGrafica.Comando
import ar.edu.unq.aventuraGrafica.DescribirObjeto
import ar.edu.unq.aventuraGrafica.EjecutarAccion
import ar.edu.unq.aventuraGrafica.EstadoDeObjeto
import ar.edu.unq.aventuraGrafica.IrA
import ar.edu.unq.aventuraGrafica.Juego
import ar.edu.unq.aventuraGrafica.MostrarInventario
import ar.edu.unq.aventuraGrafica.MostrarObjetos
import ar.edu.unq.aventuraGrafica.Objeto
import ar.edu.unq.aventuraGrafica.Posicion
import ar.edu.unq.aventuraGrafica.RecogerObjeto
import com.google.inject.Injector
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator

import static extension org.eclipse.xtext.nodemodel.util.NodeModelUtils.*

class AventuraGraficaInterpreter {

	var estados = newHashMap
	val inventario = newArrayList
	
	def static void main(String[] args) {
		if (args.isEmpty) {
			throw new RuntimeException(
				"Debe invocar este interprete con la ruta completa a un archivo .ag como argumento!")
		}
		val fileName = args.get(0)
		val juego = parsear(fileName)
		new AventuraGraficaInterpreter().interpret(juego)
	}

	def static parsear(String fileName) {
		val injector = new AventuraGraficaStandaloneSetup().createInjectorAndDoEMFRegistration()
		val resourceSet = injector.getInstance(XtextResourceSet)
		val resource = resourceSet.createResource(URI.createURI(fileName))

		resource.load(#{})

		validate(injector, resource)

		return resource.contents.get(0) as Juego
	}

	def static validate(Injector injector, Resource resource) {
		val validator = injector.getInstance(IResourceValidator)
		val issues = validator.validate(resource, CheckMode.ALL, null)
		if (!issues.isEmpty) {
			issues.forEach[println(it.toString)]
			System.exit(-1)
		}
	}

	def interpret(Juego juego) {
		juego.objetos.forEach[ o | o.almacenarEstado ]
		
		juego.posicion.mostrar

		juego.comandos.forEach[ c | c.mostrar ]
	}
	
	def almacenarEstado(Objeto o){
		if(o.estado != null){
			estados.put(o.estado.name, o.estado.valor)
		}
	}
	
	def dispatch mostrar(Comando c)  {
		println(c.findActualNodeFor.tokenText + "\n" + c.ejecutarComando)
	}

	def dispatch mostrar(Posicion c){
		println(c.habitacion.descripcion)
	}	
	
	def dispatch ejecutarComando(MostrarObjetos c){
		'''Hay: «c.getContainer.posicion.habitacion.objetos.map[ o | 
			if(inventario.contains(o)){
				''
			}else{
				o.name
			}
		]»'''
	}
	
	def dispatch ejecutarComando(DescribirObjeto c){
		'''«if(c.objeto.descripcion.nullOrEmpty){
				"No puedo decir nada sobre " + c.objeto.name
			} else {
				c.objeto.descripcion
			}»'''
	}
	
	def dispatch ejecutarComando(RecogerObjeto c){
		'''«if(c.objeto.isRecogible){
				if(inventario.contains(c.objeto)){
					c.objeto.name + " ya está en el inventario"
				}else{
					inventario += c.objeto
					c.objeto.name + " guardado en el inventario"
				}
			}else{
				c.objeto.name + " no se puede recoger"
			}
			»'''
	}
	
	def dispatch ejecutarComando(MostrarInventario c){
		'''Inventario: «inventario.map[ o | o.name ]»'''
	}
	
	private def name(Object o){
		(o as Objeto).name
	}
	
	def dispatch ejecutarComando(Acciones c){
		val estado = c.objeto.estado
		var res = newArrayList
		if(estado != null) {
			res += c.objeto.acciones.map[ a | mostrarSegunEstado(a, estado) ]
		}else{
			res += c.objeto.acciones.map[ a | a.name ]
		}
		if(c.objeto.isRecogible && !inventario.contains(c.objeto)){
			res += "recoger"
		}
		'''Se puede: «res.map[ accion | accion ]»'''
	}
	
	def dispatch mostrarSegunEstado(IrA accion, EstadoDeObjeto estado) {
		if(accion.valor == estado.valor) {
			accion.name
		}else{
			''
		}
	}
	
	def dispatch mostrarSegunEstado(CambiarEstado accion, EstadoDeObjeto estado) {
		if(accion.valorCondicional == estado.valor) {
			accion.name
		}else{
			''
		}
	}
	
	def dispatch ejecutarComando(EjecutarAccion c){
		c.accion.ejecutarAccion()
	}
	
	def dispatch ejecutarAccion(IrA accion) {
		if(accion.variable != null && accion.variable.valor == accion.valor){
			var res = cambiarEstadoObjeto(accion)
			accion.getContainer.posicion.habitacion = accion.habitacion
			'''
			«accion.habitacion.descripcion»
			«res»'''			
		}else{
			'''Acción no disponible - «accion.variable.name» es «accion.variable.valor» y debería ser «accion.valor»'''
		}
	}
	
	def cambiarEstadoObjeto(IrA accion) {
		var objeto = accion.habitacion.objetos.findFirst[ o | o.name == accion.habitacion.objetoACambiar.name ]
		if(objeto != null) objeto.estado.valor = accion.habitacion.valorNuevo
		objeto.estado.name + " de " + objeto.name + " cambiado a " + accion.habitacion.valorNuevo
	}
	
	def dispatch ejecutarAccion(CambiarEstado accion) {
		if(estados.get(accion.variableCondicion.name).equals(accion.valorCondicional)){
			accion.variableACambiar.valor = accion.valorNuevo
			estados.put(estados.get(accion.variableACambiar.name), accion.valorNuevo)
		}
		'''«accion.variableACambiar.name» cambiado a «accion.valorNuevo»'''
	}
	
	private def getContainer(Accion accion){
		accion.eContainer.eContainer as Juego
	}
	
	private def getContainer(Comando comando){
		comando.eContainer as Juego
	}
}