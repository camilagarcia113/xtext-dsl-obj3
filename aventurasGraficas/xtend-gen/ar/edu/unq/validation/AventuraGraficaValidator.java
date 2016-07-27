/**
 * generated by Xtext
 */
package ar.edu.unq.validation;

import ar.edu.unq.aventuraGrafica.Accion;
import ar.edu.unq.aventuraGrafica.AventuraGraficaPackage;
import ar.edu.unq.aventuraGrafica.Habitacion;
import ar.edu.unq.aventuraGrafica.IrA;
import ar.edu.unq.aventuraGrafica.Juego;
import ar.edu.unq.aventuraGrafica.Objeto;
import ar.edu.unq.validation.AbstractAventuraGraficaValidator;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class AventuraGraficaValidator extends AbstractAventuraGraficaValidator {
  @Check
  public void checkNombreObjetoNoRepetido(final Juego juego) {
    Iterable<Objeto> _objetosRepetidos = this.objetosRepetidos(juego);
    final Procedure1<Objeto> _function = new Procedure1<Objeto>() {
      @Override
      public void apply(final Objeto it) {
        AventuraGraficaValidator.this.error("El nombre esta repetido", it, AventuraGraficaPackage.Literals.OBJETO__NAME);
      }
    };
    IterableExtensions.<Objeto>forEach(_objetosRepetidos, _function);
  }
  
  public Iterable<Objeto> objetosRepetidos(final Juego juego) {
    EList<Objeto> _objetos = juego.getObjetos();
    final Function1<Objeto, Boolean> _function = new Function1<Objeto, Boolean>() {
      @Override
      public Boolean apply(final Objeto it) {
        String _name = it.getName();
        int _objetosConNombre = AventuraGraficaValidator.this.objetosConNombre(juego, _name);
        return Boolean.valueOf((_objetosConNombre > 1));
      }
    };
    return IterableExtensions.<Objeto>filter(_objetos, _function);
  }
  
  public int objetosConNombre(final Juego it, final String nombre) {
    EList<Objeto> _objetos = it.getObjetos();
    final Function1<Objeto, Boolean> _function = new Function1<Objeto, Boolean>() {
      @Override
      public Boolean apply(final Objeto it) {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, nombre));
      }
    };
    Iterable<Objeto> _filter = IterableExtensions.<Objeto>filter(_objetos, _function);
    return IterableExtensions.size(_filter);
  }
  
  @Check
  public void checkNombreHabitacionNoRepetido(final Juego juego) {
    final List<String> nombres = CollectionLiterals.<String>newArrayList();
    EList<Habitacion> _habitaciones = juego.getHabitaciones();
    final Procedure1<Habitacion> _function = new Procedure1<Habitacion>() {
      @Override
      public void apply(final Habitacion habitacion) {
        String _name = habitacion.getName();
        boolean _contains = nombres.contains(_name);
        if (_contains) {
          EClass _eClass = habitacion.eClass();
          EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(AventuraGraficaPackage.HABITACION__NAME);
          AventuraGraficaValidator.this.error(
            "El nombre esta repetido", habitacion, _eStructuralFeature);
        } else {
          String _name_1 = habitacion.getName();
          nombres.add(_name_1);
        }
      }
    };
    IterableExtensions.<Habitacion>forEach(_habitaciones, _function);
  }
  
  @Check
  public void checkHabitacionContieneUnObjetoConAccionDeSalida(final Juego juego) {
    EList<Habitacion> _habitaciones = juego.getHabitaciones();
    final Procedure1<Habitacion> _function = new Procedure1<Habitacion>() {
      @Override
      public void apply(final Habitacion h) {
        EList<Objeto> _objetos = h.getObjetos();
        final Function1<Objeto, Boolean> _function = new Function1<Objeto, Boolean>() {
          @Override
          public Boolean apply(final Objeto o) {
            EList<Accion> _acciones = o.getAcciones();
            final Function1<Accion, Boolean> _function = new Function1<Accion, Boolean>() {
              @Override
              public Boolean apply(final Accion it) {
                return Boolean.valueOf(AventuraGraficaValidator.this.isIra(it));
              }
            };
            return Boolean.valueOf(IterableExtensions.<Accion>exists(_acciones, _function));
          }
        };
        Objeto objeto = IterableExtensions.<Objeto>findFirst(_objetos, _function);
        boolean _and = false;
        boolean _equals = Objects.equal(objeto, null);
        if (!_equals) {
          _and = false;
        } else {
          boolean _isFinal = h.isFinal();
          boolean _not = (!_isFinal);
          _and = _not;
        }
        if (_and) {
          EClass _eClass = h.eClass();
          EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(AventuraGraficaPackage.HABITACION__NAME);
          AventuraGraficaValidator.this.error(
            "La habitación no contiene un objeto con acción de salida", h, _eStructuralFeature);
        }
      }
    };
    IterableExtensions.<Habitacion>forEach(_habitaciones, _function);
  }
  
  protected boolean _isIra(final IrA it) {
    return true;
  }
  
  protected boolean _isIra(final Accion it) {
    return false;
  }
  
  @Check
  public void checkHabitacionConObjetoACambiarIncluidoEnSuListaDeObjetos(final Juego juego) {
    EList<Habitacion> _habitaciones = juego.getHabitaciones();
    final Procedure1<Habitacion> _function = new Procedure1<Habitacion>() {
      @Override
      public void apply(final Habitacion h) {
        EList<Objeto> _objetos = h.getObjetos();
        Objeto _objetoACambiar = h.getObjetoACambiar();
        boolean _contains = _objetos.contains(_objetoACambiar);
        boolean _not = (!_contains);
        if (_not) {
          EClass _eClass = h.eClass();
          EStructuralFeature _eStructuralFeature = _eClass.getEStructuralFeature(AventuraGraficaPackage.HABITACION__NAME);
          AventuraGraficaValidator.this.error(
            "La habitación no contiene el objeto a cambiar en su lista de objetos", h, _eStructuralFeature);
        }
      }
    };
    IterableExtensions.<Habitacion>forEach(_habitaciones, _function);
  }
  
  public boolean isIra(final Accion it) {
    if (it instanceof IrA) {
      return _isIra((IrA)it);
    } else if (it != null) {
      return _isIra(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
