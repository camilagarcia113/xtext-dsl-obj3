package ar.edu.unq;

import ar.edu.unq.AventuraGraficaStandaloneSetup;
import ar.edu.unq.aventuraGrafica.Accion;
import ar.edu.unq.aventuraGrafica.Acciones;
import ar.edu.unq.aventuraGrafica.CambiarEstado;
import ar.edu.unq.aventuraGrafica.Comando;
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
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class AventuraGraficaInterpreter {
  private HashMap<Object, Object> estados = CollectionLiterals.<Object, Object>newHashMap();
  
  private final ArrayList<Object> inventario = CollectionLiterals.<Object>newArrayList();
  
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      throw new RuntimeException(
        "Debe invocar este interprete con la ruta completa a un archivo .ag como argumento!");
    }
    final String fileName = args[0];
    final Juego juego = AventuraGraficaInterpreter.parsear(fileName);
    AventuraGraficaInterpreter _aventuraGraficaInterpreter = new AventuraGraficaInterpreter();
    _aventuraGraficaInterpreter.interpret(juego);
  }
  
  public static Juego parsear(final String fileName) {
    try {
      AventuraGraficaStandaloneSetup _aventuraGraficaStandaloneSetup = new AventuraGraficaStandaloneSetup();
      final Injector injector = _aventuraGraficaStandaloneSetup.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      URI _createURI = URI.createURI(fileName);
      final Resource resource = resourceSet.createResource(_createURI);
      resource.load(Collections.<Object, Object>unmodifiableMap(CollectionLiterals.<Object, Object>newHashMap()));
      AventuraGraficaInterpreter.validate(injector, resource);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      return ((Juego) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void validate(final Injector injector, final Resource resource) {
    try {
      final IResourceValidator validator = injector.<IResourceValidator>getInstance(IResourceValidator.class);
      final List<Issue> issues = validator.validate(resource, CheckMode.ALL, null);
      boolean _isEmpty = issues.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final Procedure1<Issue> _function = new Procedure1<Issue>() {
          @Override
          public void apply(final Issue it) {
            String _string = it.toString();
            InputOutput.<String>println(_string);
          }
        };
        IterableExtensions.<Issue>forEach(issues, _function);
        System.exit((-1));
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void interpret(final Juego juego) {
    EList<Objeto> _objetos = juego.getObjetos();
    final Procedure1<Objeto> _function = new Procedure1<Objeto>() {
      @Override
      public void apply(final Objeto o) {
        AventuraGraficaInterpreter.this.almacenarEstado(o);
      }
    };
    IterableExtensions.<Objeto>forEach(_objetos, _function);
    Posicion _posicion = juego.getPosicion();
    this.mostrar(_posicion);
    EList<Comando> _comandos = juego.getComandos();
    final Procedure1<Comando> _function_1 = new Procedure1<Comando>() {
      @Override
      public void apply(final Comando c) {
        AventuraGraficaInterpreter.this.mostrar(c);
      }
    };
    IterableExtensions.<Comando>forEach(_comandos, _function_1);
  }
  
  public Object almacenarEstado(final Objeto o) {
    Object _xifexpression = null;
    EstadoDeObjeto _estado = o.getEstado();
    boolean _notEquals = (!Objects.equal(_estado, null));
    if (_notEquals) {
      EstadoDeObjeto _estado_1 = o.getEstado();
      String _name = _estado_1.getName();
      EstadoDeObjeto _estado_2 = o.getEstado();
      String _valor = _estado_2.getValor();
      _xifexpression = this.estados.put(_name, _valor);
    }
    return _xifexpression;
  }
  
  protected String _mostrar(final Comando c) {
    ICompositeNode _findActualNodeFor = NodeModelUtils.findActualNodeFor(c);
    String _tokenText = NodeModelUtils.getTokenText(_findActualNodeFor);
    String _plus = (_tokenText + "\n");
    CharSequence _ejecutarComando = this.ejecutarComando(c);
    String _plus_1 = (_plus + _ejecutarComando);
    return InputOutput.<String>println(_plus_1);
  }
  
  protected String _mostrar(final Posicion c) {
    Habitacion _habitacion = c.getHabitacion();
    String _descripcion = _habitacion.getDescripcion();
    return InputOutput.<String>println(_descripcion);
  }
  
  protected CharSequence _ejecutarComando(final MostrarObjetos c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hay: ");
    Juego _container = this.getContainer(c);
    Posicion _posicion = _container.getPosicion();
    Habitacion _habitacion = _posicion.getHabitacion();
    EList<Objeto> _objetos = _habitacion.getObjetos();
    final Function1<Objeto, String> _function = new Function1<Objeto, String>() {
      @Override
      public String apply(final Objeto o) {
        String _xifexpression = null;
        boolean _contains = AventuraGraficaInterpreter.this.inventario.contains(o);
        if (_contains) {
          _xifexpression = "";
        } else {
          _xifexpression = o.getName();
        }
        return _xifexpression;
      }
    };
    List<String> _map = ListExtensions.<Objeto, String>map(_objetos, _function);
    _builder.append(_map, "");
    return _builder;
  }
  
  protected CharSequence _ejecutarComando(final DescribirObjeto c) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    Objeto _objeto = c.getObjeto();
    String _descripcion = _objeto.getDescripcion();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_descripcion);
    if (_isNullOrEmpty) {
      Objeto _objeto_1 = c.getObjeto();
      String _name = _objeto_1.getName();
      _xifexpression = ("No puedo decir nada sobre " + _name);
    } else {
      Objeto _objeto_2 = c.getObjeto();
      _xifexpression = _objeto_2.getDescripcion();
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  protected CharSequence _ejecutarComando(final RecogerObjeto c) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    Objeto _objeto = c.getObjeto();
    boolean _isRecogible = _objeto.isRecogible();
    if (_isRecogible) {
      String _xifexpression_1 = null;
      Objeto _objeto_1 = c.getObjeto();
      boolean _contains = this.inventario.contains(_objeto_1);
      if (_contains) {
        Objeto _objeto_2 = c.getObjeto();
        String _name = _objeto_2.getName();
        _xifexpression_1 = (_name + " ya está en el inventario");
      } else {
        String _xblockexpression = null;
        {
          Objeto _objeto_3 = c.getObjeto();
          this.inventario.add(_objeto_3);
          Objeto _objeto_4 = c.getObjeto();
          String _name_1 = _objeto_4.getName();
          _xblockexpression = (_name_1 + " guardado en el inventario");
        }
        _xifexpression_1 = _xblockexpression;
      }
      _xifexpression = _xifexpression_1;
    } else {
      Objeto _objeto_3 = c.getObjeto();
      String _name_1 = _objeto_3.getName();
      _xifexpression = (_name_1 + " no se puede recoger");
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  protected CharSequence _ejecutarComando(final MostrarInventario c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Inventario: ");
    final Function1<Object, String> _function = new Function1<Object, String>() {
      @Override
      public String apply(final Object o) {
        return AventuraGraficaInterpreter.this.name(o);
      }
    };
    List<String> _map = ListExtensions.<Object, String>map(this.inventario, _function);
    _builder.append(_map, "");
    return _builder;
  }
  
  private String name(final Object o) {
    return ((Objeto) o).getName();
  }
  
  protected CharSequence _ejecutarComando(final Acciones c) {
    CharSequence _xblockexpression = null;
    {
      Objeto _objeto = c.getObjeto();
      final EstadoDeObjeto estado = _objeto.getEstado();
      ArrayList<String> res = CollectionLiterals.<String>newArrayList();
      boolean _notEquals = (!Objects.equal(estado, null));
      if (_notEquals) {
        Objeto _objeto_1 = c.getObjeto();
        EList<Accion> _acciones = _objeto_1.getAcciones();
        final Function1<Accion, String> _function = new Function1<Accion, String>() {
          @Override
          public String apply(final Accion a) {
            return AventuraGraficaInterpreter.this.mostrarSegunEstado(a, estado);
          }
        };
        List<String> _map = ListExtensions.<Accion, String>map(_acciones, _function);
        Iterables.<String>addAll(res, _map);
      } else {
        Objeto _objeto_2 = c.getObjeto();
        EList<Accion> _acciones_1 = _objeto_2.getAcciones();
        final Function1<Accion, String> _function_1 = new Function1<Accion, String>() {
          @Override
          public String apply(final Accion a) {
            return a.getName();
          }
        };
        List<String> _map_1 = ListExtensions.<Accion, String>map(_acciones_1, _function_1);
        Iterables.<String>addAll(res, _map_1);
      }
      boolean _and = false;
      Objeto _objeto_3 = c.getObjeto();
      boolean _isRecogible = _objeto_3.isRecogible();
      if (!_isRecogible) {
        _and = false;
      } else {
        Objeto _objeto_4 = c.getObjeto();
        boolean _contains = this.inventario.contains(_objeto_4);
        boolean _not = (!_contains);
        _and = _not;
      }
      if (_and) {
        res.add("recoger");
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Se puede: ");
      final Function1<String, String> _function_2 = new Function1<String, String>() {
        @Override
        public String apply(final String accion) {
          return accion;
        }
      };
      List<String> _map_2 = ListExtensions.<String, String>map(res, _function_2);
      _builder.append(_map_2, "");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected String _mostrarSegunEstado(final IrA accion, final EstadoDeObjeto estado) {
    String _xifexpression = null;
    String _valor = accion.getValor();
    String _valor_1 = estado.getValor();
    boolean _equals = Objects.equal(_valor, _valor_1);
    if (_equals) {
      _xifexpression = accion.getName();
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  protected String _mostrarSegunEstado(final CambiarEstado accion, final EstadoDeObjeto estado) {
    String _xifexpression = null;
    String _valorCondicional = accion.getValorCondicional();
    String _valor = estado.getValor();
    boolean _equals = Objects.equal(_valorCondicional, _valor);
    if (_equals) {
      _xifexpression = accion.getName();
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  protected CharSequence _ejecutarComando(final EjecutarAccion c) {
    Accion _accion = c.getAccion();
    return this.ejecutarAccion(_accion);
  }
  
  protected CharSequence _ejecutarAccion(final IrA accion) {
    CharSequence _xifexpression = null;
    boolean _and = false;
    EstadoDeObjeto _variable = accion.getVariable();
    boolean _notEquals = (!Objects.equal(_variable, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EstadoDeObjeto _variable_1 = accion.getVariable();
      String _valor = _variable_1.getValor();
      String _valor_1 = accion.getValor();
      boolean _equals = Objects.equal(_valor, _valor_1);
      _and = _equals;
    }
    if (_and) {
      CharSequence _xblockexpression = null;
      {
        String res = this.cambiarEstadoObjeto(accion);
        Juego _container = this.getContainer(accion);
        Posicion _posicion = _container.getPosicion();
        Habitacion _habitacion = accion.getHabitacion();
        _posicion.setHabitacion(_habitacion);
        StringConcatenation _builder = new StringConcatenation();
        Habitacion _habitacion_1 = accion.getHabitacion();
        String _descripcion = _habitacion_1.getDescripcion();
        _builder.append(_descripcion, "");
        _builder.newLineIfNotEmpty();
        _builder.append(res, "");
        _xblockexpression = _builder;
      }
      _xifexpression = _xblockexpression;
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Acción no disponible - ");
      EstadoDeObjeto _variable_2 = accion.getVariable();
      String _name = _variable_2.getName();
      _builder.append(_name, "");
      _builder.append(" es ");
      EstadoDeObjeto _variable_3 = accion.getVariable();
      String _valor_2 = _variable_3.getValor();
      _builder.append(_valor_2, "");
      _builder.append(" y debería ser ");
      String _valor_3 = accion.getValor();
      _builder.append(_valor_3, "");
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public String cambiarEstadoObjeto(final IrA accion) {
    String _xblockexpression = null;
    {
      Habitacion _habitacion = accion.getHabitacion();
      EList<Objeto> _objetos = _habitacion.getObjetos();
      final Function1<Objeto, Boolean> _function = new Function1<Objeto, Boolean>() {
        @Override
        public Boolean apply(final Objeto o) {
          String _name = o.getName();
          Habitacion _habitacion = accion.getHabitacion();
          Objeto _objetoACambiar = _habitacion.getObjetoACambiar();
          String _name_1 = _objetoACambiar.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        }
      };
      Objeto objeto = IterableExtensions.<Objeto>findFirst(_objetos, _function);
      boolean _notEquals = (!Objects.equal(objeto, null));
      if (_notEquals) {
        EstadoDeObjeto _estado = objeto.getEstado();
        Habitacion _habitacion_1 = accion.getHabitacion();
        String _valorNuevo = _habitacion_1.getValorNuevo();
        _estado.setValor(_valorNuevo);
      }
      EstadoDeObjeto _estado_1 = objeto.getEstado();
      String _name = _estado_1.getName();
      String _plus = (_name + " de ");
      String _name_1 = objeto.getName();
      String _plus_1 = (_plus + _name_1);
      String _plus_2 = (_plus_1 + " cambiado a ");
      Habitacion _habitacion_2 = accion.getHabitacion();
      String _valorNuevo_1 = _habitacion_2.getValorNuevo();
      _xblockexpression = (_plus_2 + _valorNuevo_1);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _ejecutarAccion(final CambiarEstado accion) {
    CharSequence _xblockexpression = null;
    {
      EstadoDeObjeto _variableCondicion = accion.getVariableCondicion();
      String _name = _variableCondicion.getName();
      Object _get = this.estados.get(_name);
      String _valorCondicional = accion.getValorCondicional();
      boolean _equals = _get.equals(_valorCondicional);
      if (_equals) {
        EstadoDeObjeto _variableACambiar = accion.getVariableACambiar();
        String _valorNuevo = accion.getValorNuevo();
        _variableACambiar.setValor(_valorNuevo);
        EstadoDeObjeto _variableACambiar_1 = accion.getVariableACambiar();
        String _name_1 = _variableACambiar_1.getName();
        Object _get_1 = this.estados.get(_name_1);
        String _valorNuevo_1 = accion.getValorNuevo();
        this.estados.put(_get_1, _valorNuevo_1);
      }
      StringConcatenation _builder = new StringConcatenation();
      EstadoDeObjeto _variableACambiar_2 = accion.getVariableACambiar();
      String _name_2 = _variableACambiar_2.getName();
      _builder.append(_name_2, "");
      _builder.append(" cambiado a ");
      String _valorNuevo_2 = accion.getValorNuevo();
      _builder.append(_valorNuevo_2, "");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  private Juego getContainer(final Accion accion) {
    EObject _eContainer = accion.eContainer();
    EObject _eContainer_1 = _eContainer.eContainer();
    return ((Juego) _eContainer_1);
  }
  
  private Juego getContainer(final Comando comando) {
    EObject _eContainer = comando.eContainer();
    return ((Juego) _eContainer);
  }
  
  public String mostrar(final EObject c) {
    if (c instanceof Comando) {
      return _mostrar((Comando)c);
    } else if (c instanceof Posicion) {
      return _mostrar((Posicion)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
  
  public CharSequence ejecutarComando(final Comando c) {
    if (c instanceof Acciones) {
      return _ejecutarComando((Acciones)c);
    } else if (c instanceof DescribirObjeto) {
      return _ejecutarComando((DescribirObjeto)c);
    } else if (c instanceof EjecutarAccion) {
      return _ejecutarComando((EjecutarAccion)c);
    } else if (c instanceof MostrarInventario) {
      return _ejecutarComando((MostrarInventario)c);
    } else if (c instanceof MostrarObjetos) {
      return _ejecutarComando((MostrarObjetos)c);
    } else if (c instanceof RecogerObjeto) {
      return _ejecutarComando((RecogerObjeto)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
  
  public String mostrarSegunEstado(final Accion accion, final EstadoDeObjeto estado) {
    if (accion instanceof CambiarEstado) {
      return _mostrarSegunEstado((CambiarEstado)accion, estado);
    } else if (accion instanceof IrA) {
      return _mostrarSegunEstado((IrA)accion, estado);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(accion, estado).toString());
    }
  }
  
  public CharSequence ejecutarAccion(final Accion accion) {
    if (accion instanceof CambiarEstado) {
      return _ejecutarAccion((CambiarEstado)accion);
    } else if (accion instanceof IrA) {
      return _ejecutarAccion((IrA)accion);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(accion).toString());
    }
  }
}
