/**
 * generated by Xtext
 */
package ar.edu.unq.scoping;

import ar.edu.unq.aventuraGrafica.Accion;
import ar.edu.unq.aventuraGrafica.EjecutarAccion;
import ar.edu.unq.aventuraGrafica.Objeto;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class AventuraGraficaScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_Accion(final EjecutarAccion ctx, final EReference ref) {
    Objeto _objeto = ctx.getObjeto();
    final EList<Accion> accionesVisibles = _objeto.getAcciones();
    return this.crearScope(accionesVisibles);
  }
  
  public SimpleScope crearScope(final List<Accion> acciones) {
    final Function1<Accion, IEObjectDescription> _function = new Function1<Accion, IEObjectDescription>() {
      @Override
      public IEObjectDescription apply(final Accion it) {
        String _name = it.getName();
        QualifiedName _create = QualifiedName.create(_name);
        return EObjectDescription.create(_create, it);
      }
    };
    List<IEObjectDescription> _map = ListExtensions.<Accion, IEObjectDescription>map(acciones, _function);
    return new SimpleScope(_map);
  }
}
