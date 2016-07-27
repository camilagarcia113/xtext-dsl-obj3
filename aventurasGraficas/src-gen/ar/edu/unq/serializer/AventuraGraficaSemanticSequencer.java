/*
 * generated by Xtext
 */
package ar.edu.unq.serializer;

import ar.edu.unq.aventuraGrafica.Acciones;
import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.CambiarEstado;
import ar.edu.unq.aventuraGrafica.DescribirObjeto;
import ar.edu.unq.aventuraGrafica.EjecutarAccion;
import ar.edu.unq.aventuraGrafica.EstadoDeObjeto;
import ar.edu.unq.aventuraGrafica.Habitacion;
import ar.edu.unq.aventuraGrafica.IrA;
import ar.edu.unq.aventuraGrafica.Juego;
import ar.edu.unq.aventuraGrafica.MostrarInventario;
import ar.edu.unq.aventuraGrafica.MostrarObjetos;
import ar.edu.unq.aventuraGrafica.Objeto;
import ar.edu.unq.aventuraGrafica.Posicion;
import ar.edu.unq.aventuraGrafica.RecogerObjeto;
import ar.edu.unq.services.AventuraGraficaGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AventuraGraficaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AventuraGraficaGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AventuraGraficaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AventuraGraficaPackage.ACCIONES:
				sequence_Acciones(context, (Acciones) semanticObject); 
				return; 
			case AventuraGraficaPackage.CAMBIAR_ESTADO:
				sequence_CambiarEstado(context, (CambiarEstado) semanticObject); 
				return; 
			case AventuraGraficaPackage.DESCRIBIR_OBJETO:
				sequence_DescribirObjeto(context, (DescribirObjeto) semanticObject); 
				return; 
			case AventuraGraficaPackage.EJECUTAR_ACCION:
				sequence_EjecutarAccion(context, (EjecutarAccion) semanticObject); 
				return; 
			case AventuraGraficaPackage.ESTADO_DE_OBJETO:
				sequence_EstadoDeObjeto(context, (EstadoDeObjeto) semanticObject); 
				return; 
			case AventuraGraficaPackage.HABITACION:
				sequence_Habitacion(context, (Habitacion) semanticObject); 
				return; 
			case AventuraGraficaPackage.IR_A:
				sequence_IrA(context, (IrA) semanticObject); 
				return; 
			case AventuraGraficaPackage.JUEGO:
				sequence_Juego(context, (Juego) semanticObject); 
				return; 
			case AventuraGraficaPackage.MOSTRAR_INVENTARIO:
				sequence_MostrarInventario(context, (MostrarInventario) semanticObject); 
				return; 
			case AventuraGraficaPackage.MOSTRAR_OBJETOS:
				sequence_MostrarObjetos(context, (MostrarObjetos) semanticObject); 
				return; 
			case AventuraGraficaPackage.OBJETO:
				sequence_Objeto(context, (Objeto) semanticObject); 
				return; 
			case AventuraGraficaPackage.POSICION:
				sequence_Posicion(context, (Posicion) semanticObject); 
				return; 
			case AventuraGraficaPackage.RECOGER_OBJETO:
				sequence_RecogerObjeto(context, (RecogerObjeto) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     objeto=[Objeto|ID]
	 */
	protected void sequence_Acciones(EObject context, Acciones semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.ACCIONES__OBJETO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.ACCIONES__OBJETO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccionesAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1(), semanticObject.getObjeto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID variableACambiar=[EstadoDeObjeto|ID] valorNuevo=STRING variableCondicion=[EstadoDeObjeto|ID] valorCondicional=STRING)
	 */
	protected void sequence_CambiarEstado(EObject context, CambiarEstado semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.ACCION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.ACCION__NAME));
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VARIABLE_ACAMBIAR));
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VALOR_NUEVO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VALOR_NUEVO));
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VARIABLE_CONDICION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VARIABLE_CONDICION));
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VALOR_CONDICIONAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.CAMBIAR_ESTADO__VALOR_CONDICIONAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCambiarEstadoAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCambiarEstadoAccess().getVariableACambiarEstadoDeObjetoIDTerminalRuleCall_3_0_1(), semanticObject.getVariableACambiar());
		feeder.accept(grammarAccess.getCambiarEstadoAccess().getValorNuevoSTRINGTerminalRuleCall_5_0(), semanticObject.getValorNuevo());
		feeder.accept(grammarAccess.getCambiarEstadoAccess().getVariableCondicionEstadoDeObjetoIDTerminalRuleCall_7_0_1(), semanticObject.getVariableCondicion());
		feeder.accept(grammarAccess.getCambiarEstadoAccess().getValorCondicionalSTRINGTerminalRuleCall_9_0(), semanticObject.getValorCondicional());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     objeto=[Objeto|ID]
	 */
	protected void sequence_DescribirObjeto(EObject context, DescribirObjeto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.DESCRIBIR_OBJETO__OBJETO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.DESCRIBIR_OBJETO__OBJETO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDescribirObjetoAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1(), semanticObject.getObjeto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((accion=[IrA|ID] objeto=[Objeto|ID]) | (accion=[Accion|ID] objeto=[Objeto|ID]))
	 */
	protected void sequence_EjecutarAccion(EObject context, EjecutarAccion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID valor=STRING?)
	 */
	protected void sequence_EstadoDeObjeto(EObject context, EstadoDeObjeto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (final?='final'? name=ID descripcion=STRING (estadoACambiar=STRING objetoACambiar=[Objeto|ID] valorNuevo=STRING)? objetos+=[Objeto|ID]*)
	 */
	protected void sequence_Habitacion(EObject context, Habitacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID habitacion=[Habitacion|ID] (variable=[EstadoDeObjeto|ID] valor=STRING)?)
	 */
	protected void sequence_IrA(EObject context, IrA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (objetos+=Objeto* posicion=Posicion habitaciones+=Habitacion* comandos+=Comando*)
	 */
	protected void sequence_Juego(EObject context, Juego semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MostrarInventario}
	 */
	protected void sequence_MostrarInventario(EObject context, MostrarInventario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MostrarObjetos}
	 */
	protected void sequence_MostrarObjetos(EObject context, MostrarObjetos semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (recogible?='recogible'? name=ID descripcion=STRING? estado=EstadoDeObjeto? acciones+=Accion*)
	 */
	protected void sequence_Objeto(EObject context, Objeto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     habitacion=[Habitacion|ID]
	 */
	protected void sequence_Posicion(EObject context, Posicion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.POSICION__HABITACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.POSICION__HABITACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPosicionAccess().getHabitacionHabitacionIDTerminalRuleCall_1_0_1(), semanticObject.getHabitacion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     objeto=[Objeto|ID]
	 */
	protected void sequence_RecogerObjeto(EObject context, RecogerObjeto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AventuraGraficaPackage.Literals.RECOGER_OBJETO__OBJETO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AventuraGraficaPackage.Literals.RECOGER_OBJETO__OBJETO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecogerObjetoAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1(), semanticObject.getObjeto());
		feeder.finish();
	}
}