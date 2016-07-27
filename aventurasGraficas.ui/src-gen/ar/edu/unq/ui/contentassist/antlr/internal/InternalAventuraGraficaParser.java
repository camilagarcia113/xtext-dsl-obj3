package ar.edu.unq.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ar.edu.unq.services.AventuraGraficaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAventuraGraficaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'al'", "'a la'", "'objeto'", "'descripcion'", "'tiene'", "'habitacion'", "'al ingresar'", "'-'", "'mostrar'", "'cambiar el'", "'de'", "'al valor'", "'objetos'", "'iniciar en'", "'objetos ?'", "'describir'", "'recoger'", "'inventario ?'", "'acciones'", "'?'", "'accion'", "'hace ir a'", "'cuando'", "'es'", "'hace cambiar el'", "'con valor'", "'recogible'", "'final'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAventuraGraficaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAventuraGraficaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAventuraGraficaParser.tokenNames; }
    public String getGrammarFileName() { return "../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g"; }


     
     	private AventuraGraficaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AventuraGraficaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleJuego"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:60:1: entryRuleJuego : ruleJuego EOF ;
    public final void entryRuleJuego() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:61:1: ( ruleJuego EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:62:1: ruleJuego EOF
            {
             before(grammarAccess.getJuegoRule()); 
            pushFollow(FOLLOW_ruleJuego_in_entryRuleJuego61);
            ruleJuego();

            state._fsp--;

             after(grammarAccess.getJuegoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJuego68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJuego"


    // $ANTLR start "ruleJuego"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:69:1: ruleJuego : ( ( rule__Juego__Group__0 ) ) ;
    public final void ruleJuego() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:73:2: ( ( ( rule__Juego__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:74:1: ( ( rule__Juego__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:74:1: ( ( rule__Juego__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:75:1: ( rule__Juego__Group__0 )
            {
             before(grammarAccess.getJuegoAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:76:1: ( rule__Juego__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:76:2: rule__Juego__Group__0
            {
            pushFollow(FOLLOW_rule__Juego__Group__0_in_ruleJuego94);
            rule__Juego__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJuegoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJuego"


    // $ANTLR start "entryRuleObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:88:1: entryRuleObjeto : ruleObjeto EOF ;
    public final void entryRuleObjeto() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:89:1: ( ruleObjeto EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:90:1: ruleObjeto EOF
            {
             before(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_ruleObjeto_in_entryRuleObjeto121);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjeto128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObjeto"


    // $ANTLR start "ruleObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:97:1: ruleObjeto : ( ( rule__Objeto__Group__0 ) ) ;
    public final void ruleObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:101:2: ( ( ( rule__Objeto__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:102:1: ( ( rule__Objeto__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:102:1: ( ( rule__Objeto__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:103:1: ( rule__Objeto__Group__0 )
            {
             before(grammarAccess.getObjetoAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:104:1: ( rule__Objeto__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:104:2: rule__Objeto__Group__0
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0_in_ruleObjeto154);
            rule__Objeto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjeto"


    // $ANTLR start "entryRuleHabitacion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:116:1: entryRuleHabitacion : ruleHabitacion EOF ;
    public final void entryRuleHabitacion() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:117:1: ( ruleHabitacion EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:118:1: ruleHabitacion EOF
            {
             before(grammarAccess.getHabitacionRule()); 
            pushFollow(FOLLOW_ruleHabitacion_in_entryRuleHabitacion181);
            ruleHabitacion();

            state._fsp--;

             after(grammarAccess.getHabitacionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHabitacion188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHabitacion"


    // $ANTLR start "ruleHabitacion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:125:1: ruleHabitacion : ( ( rule__Habitacion__Group__0 ) ) ;
    public final void ruleHabitacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:129:2: ( ( ( rule__Habitacion__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:130:1: ( ( rule__Habitacion__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:130:1: ( ( rule__Habitacion__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:131:1: ( rule__Habitacion__Group__0 )
            {
             before(grammarAccess.getHabitacionAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:132:1: ( rule__Habitacion__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:132:2: rule__Habitacion__Group__0
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__0_in_ruleHabitacion214);
            rule__Habitacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHabitacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHabitacion"


    // $ANTLR start "entryRulePosicion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:144:1: entryRulePosicion : rulePosicion EOF ;
    public final void entryRulePosicion() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:145:1: ( rulePosicion EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:146:1: rulePosicion EOF
            {
             before(grammarAccess.getPosicionRule()); 
            pushFollow(FOLLOW_rulePosicion_in_entryRulePosicion241);
            rulePosicion();

            state._fsp--;

             after(grammarAccess.getPosicionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosicion248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosicion"


    // $ANTLR start "rulePosicion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:153:1: rulePosicion : ( ( rule__Posicion__Group__0 ) ) ;
    public final void rulePosicion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:157:2: ( ( ( rule__Posicion__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:158:1: ( ( rule__Posicion__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:158:1: ( ( rule__Posicion__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:159:1: ( rule__Posicion__Group__0 )
            {
             before(grammarAccess.getPosicionAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:160:1: ( rule__Posicion__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:160:2: rule__Posicion__Group__0
            {
            pushFollow(FOLLOW_rule__Posicion__Group__0_in_rulePosicion274);
            rule__Posicion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosicionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosicion"


    // $ANTLR start "entryRuleComando"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:172:1: entryRuleComando : ruleComando EOF ;
    public final void entryRuleComando() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:173:1: ( ruleComando EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:174:1: ruleComando EOF
            {
             before(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_ruleComando_in_entryRuleComando301);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComando308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:181:1: ruleComando : ( ( rule__Comando__Alternatives ) ) ;
    public final void ruleComando() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:185:2: ( ( ( rule__Comando__Alternatives ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:186:1: ( ( rule__Comando__Alternatives ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:186:1: ( ( rule__Comando__Alternatives ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:187:1: ( rule__Comando__Alternatives )
            {
             before(grammarAccess.getComandoAccess().getAlternatives()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:188:1: ( rule__Comando__Alternatives )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:188:2: rule__Comando__Alternatives
            {
            pushFollow(FOLLOW_rule__Comando__Alternatives_in_ruleComando334);
            rule__Comando__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComandoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleMostrarObjetos"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:200:1: entryRuleMostrarObjetos : ruleMostrarObjetos EOF ;
    public final void entryRuleMostrarObjetos() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:201:1: ( ruleMostrarObjetos EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:202:1: ruleMostrarObjetos EOF
            {
             before(grammarAccess.getMostrarObjetosRule()); 
            pushFollow(FOLLOW_ruleMostrarObjetos_in_entryRuleMostrarObjetos361);
            ruleMostrarObjetos();

            state._fsp--;

             after(grammarAccess.getMostrarObjetosRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMostrarObjetos368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMostrarObjetos"


    // $ANTLR start "ruleMostrarObjetos"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:209:1: ruleMostrarObjetos : ( ( rule__MostrarObjetos__Group__0 ) ) ;
    public final void ruleMostrarObjetos() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:213:2: ( ( ( rule__MostrarObjetos__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:214:1: ( ( rule__MostrarObjetos__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:214:1: ( ( rule__MostrarObjetos__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:215:1: ( rule__MostrarObjetos__Group__0 )
            {
             before(grammarAccess.getMostrarObjetosAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:216:1: ( rule__MostrarObjetos__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:216:2: rule__MostrarObjetos__Group__0
            {
            pushFollow(FOLLOW_rule__MostrarObjetos__Group__0_in_ruleMostrarObjetos394);
            rule__MostrarObjetos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMostrarObjetosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMostrarObjetos"


    // $ANTLR start "entryRuleDescribirObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:228:1: entryRuleDescribirObjeto : ruleDescribirObjeto EOF ;
    public final void entryRuleDescribirObjeto() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:229:1: ( ruleDescribirObjeto EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:230:1: ruleDescribirObjeto EOF
            {
             before(grammarAccess.getDescribirObjetoRule()); 
            pushFollow(FOLLOW_ruleDescribirObjeto_in_entryRuleDescribirObjeto421);
            ruleDescribirObjeto();

            state._fsp--;

             after(grammarAccess.getDescribirObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescribirObjeto428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescribirObjeto"


    // $ANTLR start "ruleDescribirObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:237:1: ruleDescribirObjeto : ( ( rule__DescribirObjeto__Group__0 ) ) ;
    public final void ruleDescribirObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:241:2: ( ( ( rule__DescribirObjeto__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:242:1: ( ( rule__DescribirObjeto__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:242:1: ( ( rule__DescribirObjeto__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:243:1: ( rule__DescribirObjeto__Group__0 )
            {
             before(grammarAccess.getDescribirObjetoAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:244:1: ( rule__DescribirObjeto__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:244:2: rule__DescribirObjeto__Group__0
            {
            pushFollow(FOLLOW_rule__DescribirObjeto__Group__0_in_ruleDescribirObjeto454);
            rule__DescribirObjeto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescribirObjetoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescribirObjeto"


    // $ANTLR start "entryRuleRecogerObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:256:1: entryRuleRecogerObjeto : ruleRecogerObjeto EOF ;
    public final void entryRuleRecogerObjeto() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:257:1: ( ruleRecogerObjeto EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:258:1: ruleRecogerObjeto EOF
            {
             before(grammarAccess.getRecogerObjetoRule()); 
            pushFollow(FOLLOW_ruleRecogerObjeto_in_entryRuleRecogerObjeto481);
            ruleRecogerObjeto();

            state._fsp--;

             after(grammarAccess.getRecogerObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecogerObjeto488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecogerObjeto"


    // $ANTLR start "ruleRecogerObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:265:1: ruleRecogerObjeto : ( ( rule__RecogerObjeto__Group__0 ) ) ;
    public final void ruleRecogerObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:269:2: ( ( ( rule__RecogerObjeto__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:270:1: ( ( rule__RecogerObjeto__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:270:1: ( ( rule__RecogerObjeto__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:271:1: ( rule__RecogerObjeto__Group__0 )
            {
             before(grammarAccess.getRecogerObjetoAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:272:1: ( rule__RecogerObjeto__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:272:2: rule__RecogerObjeto__Group__0
            {
            pushFollow(FOLLOW_rule__RecogerObjeto__Group__0_in_ruleRecogerObjeto514);
            rule__RecogerObjeto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecogerObjetoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecogerObjeto"


    // $ANTLR start "entryRuleMostrarInventario"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:284:1: entryRuleMostrarInventario : ruleMostrarInventario EOF ;
    public final void entryRuleMostrarInventario() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:285:1: ( ruleMostrarInventario EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:286:1: ruleMostrarInventario EOF
            {
             before(grammarAccess.getMostrarInventarioRule()); 
            pushFollow(FOLLOW_ruleMostrarInventario_in_entryRuleMostrarInventario541);
            ruleMostrarInventario();

            state._fsp--;

             after(grammarAccess.getMostrarInventarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMostrarInventario548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMostrarInventario"


    // $ANTLR start "ruleMostrarInventario"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:293:1: ruleMostrarInventario : ( ( rule__MostrarInventario__Group__0 ) ) ;
    public final void ruleMostrarInventario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:297:2: ( ( ( rule__MostrarInventario__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:298:1: ( ( rule__MostrarInventario__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:298:1: ( ( rule__MostrarInventario__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:299:1: ( rule__MostrarInventario__Group__0 )
            {
             before(grammarAccess.getMostrarInventarioAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:300:1: ( rule__MostrarInventario__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:300:2: rule__MostrarInventario__Group__0
            {
            pushFollow(FOLLOW_rule__MostrarInventario__Group__0_in_ruleMostrarInventario574);
            rule__MostrarInventario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMostrarInventarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMostrarInventario"


    // $ANTLR start "entryRuleAcciones"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:312:1: entryRuleAcciones : ruleAcciones EOF ;
    public final void entryRuleAcciones() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:313:1: ( ruleAcciones EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:314:1: ruleAcciones EOF
            {
             before(grammarAccess.getAccionesRule()); 
            pushFollow(FOLLOW_ruleAcciones_in_entryRuleAcciones601);
            ruleAcciones();

            state._fsp--;

             after(grammarAccess.getAccionesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcciones608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAcciones"


    // $ANTLR start "ruleAcciones"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:321:1: ruleAcciones : ( ( rule__Acciones__Group__0 ) ) ;
    public final void ruleAcciones() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:325:2: ( ( ( rule__Acciones__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:326:1: ( ( rule__Acciones__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:326:1: ( ( rule__Acciones__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:327:1: ( rule__Acciones__Group__0 )
            {
             before(grammarAccess.getAccionesAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:328:1: ( rule__Acciones__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:328:2: rule__Acciones__Group__0
            {
            pushFollow(FOLLOW_rule__Acciones__Group__0_in_ruleAcciones634);
            rule__Acciones__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccionesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAcciones"


    // $ANTLR start "entryRuleEjecutarAccion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:340:1: entryRuleEjecutarAccion : ruleEjecutarAccion EOF ;
    public final void entryRuleEjecutarAccion() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:341:1: ( ruleEjecutarAccion EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:342:1: ruleEjecutarAccion EOF
            {
             before(grammarAccess.getEjecutarAccionRule()); 
            pushFollow(FOLLOW_ruleEjecutarAccion_in_entryRuleEjecutarAccion661);
            ruleEjecutarAccion();

            state._fsp--;

             after(grammarAccess.getEjecutarAccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEjecutarAccion668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEjecutarAccion"


    // $ANTLR start "ruleEjecutarAccion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:349:1: ruleEjecutarAccion : ( ( rule__EjecutarAccion__Alternatives ) ) ;
    public final void ruleEjecutarAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:353:2: ( ( ( rule__EjecutarAccion__Alternatives ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:354:1: ( ( rule__EjecutarAccion__Alternatives ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:354:1: ( ( rule__EjecutarAccion__Alternatives ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:355:1: ( rule__EjecutarAccion__Alternatives )
            {
             before(grammarAccess.getEjecutarAccionAccess().getAlternatives()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:356:1: ( rule__EjecutarAccion__Alternatives )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:356:2: rule__EjecutarAccion__Alternatives
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Alternatives_in_ruleEjecutarAccion694);
            rule__EjecutarAccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEjecutarAccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEjecutarAccion"


    // $ANTLR start "entryRuleAccion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:368:1: entryRuleAccion : ruleAccion EOF ;
    public final void entryRuleAccion() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:369:1: ( ruleAccion EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:370:1: ruleAccion EOF
            {
             before(grammarAccess.getAccionRule()); 
            pushFollow(FOLLOW_ruleAccion_in_entryRuleAccion721);
            ruleAccion();

            state._fsp--;

             after(grammarAccess.getAccionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccion728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccion"


    // $ANTLR start "ruleAccion"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:377:1: ruleAccion : ( ( rule__Accion__Alternatives ) ) ;
    public final void ruleAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:381:2: ( ( ( rule__Accion__Alternatives ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:382:1: ( ( rule__Accion__Alternatives ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:382:1: ( ( rule__Accion__Alternatives ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:383:1: ( rule__Accion__Alternatives )
            {
             before(grammarAccess.getAccionAccess().getAlternatives()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:384:1: ( rule__Accion__Alternatives )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:384:2: rule__Accion__Alternatives
            {
            pushFollow(FOLLOW_rule__Accion__Alternatives_in_ruleAccion754);
            rule__Accion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccion"


    // $ANTLR start "entryRuleIrA"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:396:1: entryRuleIrA : ruleIrA EOF ;
    public final void entryRuleIrA() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:397:1: ( ruleIrA EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:398:1: ruleIrA EOF
            {
             before(grammarAccess.getIrARule()); 
            pushFollow(FOLLOW_ruleIrA_in_entryRuleIrA781);
            ruleIrA();

            state._fsp--;

             after(grammarAccess.getIrARule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIrA788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIrA"


    // $ANTLR start "ruleIrA"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:405:1: ruleIrA : ( ( rule__IrA__Group__0 ) ) ;
    public final void ruleIrA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:409:2: ( ( ( rule__IrA__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:410:1: ( ( rule__IrA__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:410:1: ( ( rule__IrA__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:411:1: ( rule__IrA__Group__0 )
            {
             before(grammarAccess.getIrAAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:412:1: ( rule__IrA__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:412:2: rule__IrA__Group__0
            {
            pushFollow(FOLLOW_rule__IrA__Group__0_in_ruleIrA814);
            rule__IrA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIrAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIrA"


    // $ANTLR start "entryRuleCambiarEstado"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:424:1: entryRuleCambiarEstado : ruleCambiarEstado EOF ;
    public final void entryRuleCambiarEstado() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:425:1: ( ruleCambiarEstado EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:426:1: ruleCambiarEstado EOF
            {
             before(grammarAccess.getCambiarEstadoRule()); 
            pushFollow(FOLLOW_ruleCambiarEstado_in_entryRuleCambiarEstado841);
            ruleCambiarEstado();

            state._fsp--;

             after(grammarAccess.getCambiarEstadoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCambiarEstado848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCambiarEstado"


    // $ANTLR start "ruleCambiarEstado"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:433:1: ruleCambiarEstado : ( ( rule__CambiarEstado__Group__0 ) ) ;
    public final void ruleCambiarEstado() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:437:2: ( ( ( rule__CambiarEstado__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:438:1: ( ( rule__CambiarEstado__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:438:1: ( ( rule__CambiarEstado__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:439:1: ( rule__CambiarEstado__Group__0 )
            {
             before(grammarAccess.getCambiarEstadoAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:440:1: ( rule__CambiarEstado__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:440:2: rule__CambiarEstado__Group__0
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__0_in_ruleCambiarEstado874);
            rule__CambiarEstado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCambiarEstadoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCambiarEstado"


    // $ANTLR start "entryRuleEstadoDeObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:452:1: entryRuleEstadoDeObjeto : ruleEstadoDeObjeto EOF ;
    public final void entryRuleEstadoDeObjeto() throws RecognitionException {
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:453:1: ( ruleEstadoDeObjeto EOF )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:454:1: ruleEstadoDeObjeto EOF
            {
             before(grammarAccess.getEstadoDeObjetoRule()); 
            pushFollow(FOLLOW_ruleEstadoDeObjeto_in_entryRuleEstadoDeObjeto901);
            ruleEstadoDeObjeto();

            state._fsp--;

             after(grammarAccess.getEstadoDeObjetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEstadoDeObjeto908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEstadoDeObjeto"


    // $ANTLR start "ruleEstadoDeObjeto"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:461:1: ruleEstadoDeObjeto : ( ( rule__EstadoDeObjeto__Group__0 ) ) ;
    public final void ruleEstadoDeObjeto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:465:2: ( ( ( rule__EstadoDeObjeto__Group__0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:466:1: ( ( rule__EstadoDeObjeto__Group__0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:466:1: ( ( rule__EstadoDeObjeto__Group__0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:467:1: ( rule__EstadoDeObjeto__Group__0 )
            {
             before(grammarAccess.getEstadoDeObjetoAccess().getGroup()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:468:1: ( rule__EstadoDeObjeto__Group__0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:468:2: rule__EstadoDeObjeto__Group__0
            {
            pushFollow(FOLLOW_rule__EstadoDeObjeto__Group__0_in_ruleEstadoDeObjeto934);
            rule__EstadoDeObjeto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstadoDeObjetoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEstadoDeObjeto"


    // $ANTLR start "rule__Comando__Alternatives"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:480:1: rule__Comando__Alternatives : ( ( ruleMostrarObjetos ) | ( ruleDescribirObjeto ) | ( ruleRecogerObjeto ) | ( ruleMostrarInventario ) | ( ruleAcciones ) | ( ruleEjecutarAccion ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:484:1: ( ( ruleMostrarObjetos ) | ( ruleDescribirObjeto ) | ( ruleRecogerObjeto ) | ( ruleMostrarInventario ) | ( ruleAcciones ) | ( ruleEjecutarAccion ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:485:1: ( ruleMostrarObjetos )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:485:1: ( ruleMostrarObjetos )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:486:1: ruleMostrarObjetos
                    {
                     before(grammarAccess.getComandoAccess().getMostrarObjetosParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMostrarObjetos_in_rule__Comando__Alternatives970);
                    ruleMostrarObjetos();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getMostrarObjetosParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:491:6: ( ruleDescribirObjeto )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:491:6: ( ruleDescribirObjeto )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:492:1: ruleDescribirObjeto
                    {
                     before(grammarAccess.getComandoAccess().getDescribirObjetoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDescribirObjeto_in_rule__Comando__Alternatives987);
                    ruleDescribirObjeto();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getDescribirObjetoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:497:6: ( ruleRecogerObjeto )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:497:6: ( ruleRecogerObjeto )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:498:1: ruleRecogerObjeto
                    {
                     before(grammarAccess.getComandoAccess().getRecogerObjetoParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRecogerObjeto_in_rule__Comando__Alternatives1004);
                    ruleRecogerObjeto();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getRecogerObjetoParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:503:6: ( ruleMostrarInventario )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:503:6: ( ruleMostrarInventario )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:504:1: ruleMostrarInventario
                    {
                     before(grammarAccess.getComandoAccess().getMostrarInventarioParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMostrarInventario_in_rule__Comando__Alternatives1021);
                    ruleMostrarInventario();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getMostrarInventarioParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:509:6: ( ruleAcciones )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:509:6: ( ruleAcciones )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:510:1: ruleAcciones
                    {
                     before(grammarAccess.getComandoAccess().getAccionesParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAcciones_in_rule__Comando__Alternatives1038);
                    ruleAcciones();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getAccionesParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:515:6: ( ruleEjecutarAccion )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:515:6: ( ruleEjecutarAccion )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:516:1: ruleEjecutarAccion
                    {
                     before(grammarAccess.getComandoAccess().getEjecutarAccionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEjecutarAccion_in_rule__Comando__Alternatives1055);
                    ruleEjecutarAccion();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getEjecutarAccionParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comando__Alternatives"


    // $ANTLR start "rule__EjecutarAccion__Alternatives"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:526:1: rule__EjecutarAccion__Alternatives : ( ( ( rule__EjecutarAccion__Group_0__0 ) ) | ( ( rule__EjecutarAccion__Group_1__0 ) ) );
    public final void rule__EjecutarAccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:530:1: ( ( ( rule__EjecutarAccion__Group_0__0 ) ) | ( ( rule__EjecutarAccion__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( ((LA2_2>=11 && LA2_2<=13)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==RULE_ID) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:531:1: ( ( rule__EjecutarAccion__Group_0__0 ) )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:531:1: ( ( rule__EjecutarAccion__Group_0__0 ) )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:532:1: ( rule__EjecutarAccion__Group_0__0 )
                    {
                     before(grammarAccess.getEjecutarAccionAccess().getGroup_0()); 
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:533:1: ( rule__EjecutarAccion__Group_0__0 )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:533:2: rule__EjecutarAccion__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__0_in_rule__EjecutarAccion__Alternatives1087);
                    rule__EjecutarAccion__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEjecutarAccionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:537:6: ( ( rule__EjecutarAccion__Group_1__0 ) )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:537:6: ( ( rule__EjecutarAccion__Group_1__0 ) )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:538:1: ( rule__EjecutarAccion__Group_1__0 )
                    {
                     before(grammarAccess.getEjecutarAccionAccess().getGroup_1()); 
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:539:1: ( rule__EjecutarAccion__Group_1__0 )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:539:2: rule__EjecutarAccion__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EjecutarAccion__Group_1__0_in_rule__EjecutarAccion__Alternatives1105);
                    rule__EjecutarAccion__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEjecutarAccionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Alternatives"


    // $ANTLR start "rule__EjecutarAccion__Alternatives_0_2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:548:1: rule__EjecutarAccion__Alternatives_0_2 : ( ( 'a' ) | ( 'al' ) | ( 'a la' ) );
    public final void rule__EjecutarAccion__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:552:1: ( ( 'a' ) | ( 'al' ) | ( 'a la' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:553:1: ( 'a' )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:553:1: ( 'a' )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:554:1: 'a'
                    {
                     before(grammarAccess.getEjecutarAccionAccess().getAKeyword_0_2_0()); 
                    match(input,11,FOLLOW_11_in_rule__EjecutarAccion__Alternatives_0_21139); 
                     after(grammarAccess.getEjecutarAccionAccess().getAKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:561:6: ( 'al' )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:561:6: ( 'al' )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:562:1: 'al'
                    {
                     before(grammarAccess.getEjecutarAccionAccess().getAlKeyword_0_2_1()); 
                    match(input,12,FOLLOW_12_in_rule__EjecutarAccion__Alternatives_0_21159); 
                     after(grammarAccess.getEjecutarAccionAccess().getAlKeyword_0_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:569:6: ( 'a la' )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:569:6: ( 'a la' )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:570:1: 'a la'
                    {
                     before(grammarAccess.getEjecutarAccionAccess().getALaKeyword_0_2_2()); 
                    match(input,13,FOLLOW_13_in_rule__EjecutarAccion__Alternatives_0_21179); 
                     after(grammarAccess.getEjecutarAccionAccess().getALaKeyword_0_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Alternatives_0_2"


    // $ANTLR start "rule__Accion__Alternatives"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:582:1: rule__Accion__Alternatives : ( ( ruleIrA ) | ( ruleCambiarEstado ) );
    public final void rule__Accion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:586:1: ( ( ruleIrA ) | ( ruleCambiarEstado ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==36) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==33) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:587:1: ( ruleIrA )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:587:1: ( ruleIrA )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:588:1: ruleIrA
                    {
                     before(grammarAccess.getAccionAccess().getIrAParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIrA_in_rule__Accion__Alternatives1213);
                    ruleIrA();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getIrAParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:593:6: ( ruleCambiarEstado )
                    {
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:593:6: ( ruleCambiarEstado )
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:594:1: ruleCambiarEstado
                    {
                     before(grammarAccess.getAccionAccess().getCambiarEstadoParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCambiarEstado_in_rule__Accion__Alternatives1230);
                    ruleCambiarEstado();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getCambiarEstadoParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accion__Alternatives"


    // $ANTLR start "rule__Juego__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:606:1: rule__Juego__Group__0 : rule__Juego__Group__0__Impl rule__Juego__Group__1 ;
    public final void rule__Juego__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:610:1: ( rule__Juego__Group__0__Impl rule__Juego__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:611:2: rule__Juego__Group__0__Impl rule__Juego__Group__1
            {
            pushFollow(FOLLOW_rule__Juego__Group__0__Impl_in_rule__Juego__Group__01260);
            rule__Juego__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Juego__Group__1_in_rule__Juego__Group__01263);
            rule__Juego__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__0"


    // $ANTLR start "rule__Juego__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:618:1: rule__Juego__Group__0__Impl : ( ( rule__Juego__ObjetosAssignment_0 )* ) ;
    public final void rule__Juego__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:622:1: ( ( ( rule__Juego__ObjetosAssignment_0 )* ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:623:1: ( ( rule__Juego__ObjetosAssignment_0 )* )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:623:1: ( ( rule__Juego__ObjetosAssignment_0 )* )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:624:1: ( rule__Juego__ObjetosAssignment_0 )*
            {
             before(grammarAccess.getJuegoAccess().getObjetosAssignment_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:625:1: ( rule__Juego__ObjetosAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:625:2: rule__Juego__ObjetosAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Juego__ObjetosAssignment_0_in_rule__Juego__Group__0__Impl1290);
            	    rule__Juego__ObjetosAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getJuegoAccess().getObjetosAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__0__Impl"


    // $ANTLR start "rule__Juego__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:635:1: rule__Juego__Group__1 : rule__Juego__Group__1__Impl rule__Juego__Group__2 ;
    public final void rule__Juego__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:639:1: ( rule__Juego__Group__1__Impl rule__Juego__Group__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:640:2: rule__Juego__Group__1__Impl rule__Juego__Group__2
            {
            pushFollow(FOLLOW_rule__Juego__Group__1__Impl_in_rule__Juego__Group__11321);
            rule__Juego__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Juego__Group__2_in_rule__Juego__Group__11324);
            rule__Juego__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__1"


    // $ANTLR start "rule__Juego__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:647:1: rule__Juego__Group__1__Impl : ( ( rule__Juego__PosicionAssignment_1 ) ) ;
    public final void rule__Juego__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:651:1: ( ( ( rule__Juego__PosicionAssignment_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:652:1: ( ( rule__Juego__PosicionAssignment_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:652:1: ( ( rule__Juego__PosicionAssignment_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:653:1: ( rule__Juego__PosicionAssignment_1 )
            {
             before(grammarAccess.getJuegoAccess().getPosicionAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:654:1: ( rule__Juego__PosicionAssignment_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:654:2: rule__Juego__PosicionAssignment_1
            {
            pushFollow(FOLLOW_rule__Juego__PosicionAssignment_1_in_rule__Juego__Group__1__Impl1351);
            rule__Juego__PosicionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJuegoAccess().getPosicionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__1__Impl"


    // $ANTLR start "rule__Juego__Group__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:664:1: rule__Juego__Group__2 : rule__Juego__Group__2__Impl rule__Juego__Group__3 ;
    public final void rule__Juego__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:668:1: ( rule__Juego__Group__2__Impl rule__Juego__Group__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:669:2: rule__Juego__Group__2__Impl rule__Juego__Group__3
            {
            pushFollow(FOLLOW_rule__Juego__Group__2__Impl_in_rule__Juego__Group__21381);
            rule__Juego__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Juego__Group__3_in_rule__Juego__Group__21384);
            rule__Juego__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__2"


    // $ANTLR start "rule__Juego__Group__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:676:1: rule__Juego__Group__2__Impl : ( ( rule__Juego__HabitacionesAssignment_2 )* ) ;
    public final void rule__Juego__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:680:1: ( ( ( rule__Juego__HabitacionesAssignment_2 )* ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:681:1: ( ( rule__Juego__HabitacionesAssignment_2 )* )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:681:1: ( ( rule__Juego__HabitacionesAssignment_2 )* )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:682:1: ( rule__Juego__HabitacionesAssignment_2 )*
            {
             before(grammarAccess.getJuegoAccess().getHabitacionesAssignment_2()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:683:1: ( rule__Juego__HabitacionesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:683:2: rule__Juego__HabitacionesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Juego__HabitacionesAssignment_2_in_rule__Juego__Group__2__Impl1411);
            	    rule__Juego__HabitacionesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJuegoAccess().getHabitacionesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__2__Impl"


    // $ANTLR start "rule__Juego__Group__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:693:1: rule__Juego__Group__3 : rule__Juego__Group__3__Impl ;
    public final void rule__Juego__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:697:1: ( rule__Juego__Group__3__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:698:2: rule__Juego__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Juego__Group__3__Impl_in_rule__Juego__Group__31442);
            rule__Juego__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__3"


    // $ANTLR start "rule__Juego__Group__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:704:1: rule__Juego__Group__3__Impl : ( ( rule__Juego__ComandosAssignment_3 )* ) ;
    public final void rule__Juego__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:708:1: ( ( ( rule__Juego__ComandosAssignment_3 )* ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:709:1: ( ( rule__Juego__ComandosAssignment_3 )* )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:709:1: ( ( rule__Juego__ComandosAssignment_3 )* )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:710:1: ( rule__Juego__ComandosAssignment_3 )*
            {
             before(grammarAccess.getJuegoAccess().getComandosAssignment_3()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:711:1: ( rule__Juego__ComandosAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=26 && LA7_0<=30)||LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:711:2: rule__Juego__ComandosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Juego__ComandosAssignment_3_in_rule__Juego__Group__3__Impl1469);
            	    rule__Juego__ComandosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getJuegoAccess().getComandosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__Group__3__Impl"


    // $ANTLR start "rule__Objeto__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:729:1: rule__Objeto__Group__0 : rule__Objeto__Group__0__Impl rule__Objeto__Group__1 ;
    public final void rule__Objeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:733:1: ( rule__Objeto__Group__0__Impl rule__Objeto__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:734:2: rule__Objeto__Group__0__Impl rule__Objeto__Group__1
            {
            pushFollow(FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__01508);
            rule__Objeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__01511);
            rule__Objeto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__0"


    // $ANTLR start "rule__Objeto__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:741:1: rule__Objeto__Group__0__Impl : ( 'objeto' ) ;
    public final void rule__Objeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:745:1: ( ( 'objeto' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:746:1: ( 'objeto' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:746:1: ( 'objeto' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:747:1: 'objeto'
            {
             before(grammarAccess.getObjetoAccess().getObjetoKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Objeto__Group__0__Impl1539); 
             after(grammarAccess.getObjetoAccess().getObjetoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__0__Impl"


    // $ANTLR start "rule__Objeto__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:760:1: rule__Objeto__Group__1 : rule__Objeto__Group__1__Impl rule__Objeto__Group__2 ;
    public final void rule__Objeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:764:1: ( rule__Objeto__Group__1__Impl rule__Objeto__Group__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:765:2: rule__Objeto__Group__1__Impl rule__Objeto__Group__2
            {
            pushFollow(FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__11570);
            rule__Objeto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__11573);
            rule__Objeto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__1"


    // $ANTLR start "rule__Objeto__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:772:1: rule__Objeto__Group__1__Impl : ( ( rule__Objeto__RecogibleAssignment_1 )? ) ;
    public final void rule__Objeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:776:1: ( ( ( rule__Objeto__RecogibleAssignment_1 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:777:1: ( ( rule__Objeto__RecogibleAssignment_1 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:777:1: ( ( rule__Objeto__RecogibleAssignment_1 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:778:1: ( rule__Objeto__RecogibleAssignment_1 )?
            {
             before(grammarAccess.getObjetoAccess().getRecogibleAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:779:1: ( rule__Objeto__RecogibleAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:779:2: rule__Objeto__RecogibleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Objeto__RecogibleAssignment_1_in_rule__Objeto__Group__1__Impl1600);
                    rule__Objeto__RecogibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetoAccess().getRecogibleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__1__Impl"


    // $ANTLR start "rule__Objeto__Group__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:789:1: rule__Objeto__Group__2 : rule__Objeto__Group__2__Impl rule__Objeto__Group__3 ;
    public final void rule__Objeto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:793:1: ( rule__Objeto__Group__2__Impl rule__Objeto__Group__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:794:2: rule__Objeto__Group__2__Impl rule__Objeto__Group__3
            {
            pushFollow(FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__21631);
            rule__Objeto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__21634);
            rule__Objeto__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__2"


    // $ANTLR start "rule__Objeto__Group__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:801:1: rule__Objeto__Group__2__Impl : ( ( rule__Objeto__NameAssignment_2 ) ) ;
    public final void rule__Objeto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:805:1: ( ( ( rule__Objeto__NameAssignment_2 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:806:1: ( ( rule__Objeto__NameAssignment_2 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:806:1: ( ( rule__Objeto__NameAssignment_2 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:807:1: ( rule__Objeto__NameAssignment_2 )
            {
             before(grammarAccess.getObjetoAccess().getNameAssignment_2()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:808:1: ( rule__Objeto__NameAssignment_2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:808:2: rule__Objeto__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Objeto__NameAssignment_2_in_rule__Objeto__Group__2__Impl1661);
            rule__Objeto__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjetoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__2__Impl"


    // $ANTLR start "rule__Objeto__Group__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:818:1: rule__Objeto__Group__3 : rule__Objeto__Group__3__Impl rule__Objeto__Group__4 ;
    public final void rule__Objeto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:822:1: ( rule__Objeto__Group__3__Impl rule__Objeto__Group__4 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:823:2: rule__Objeto__Group__3__Impl rule__Objeto__Group__4
            {
            pushFollow(FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__31691);
            rule__Objeto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__31694);
            rule__Objeto__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__3"


    // $ANTLR start "rule__Objeto__Group__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:830:1: rule__Objeto__Group__3__Impl : ( ( rule__Objeto__Group_3__0 )? ) ;
    public final void rule__Objeto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:834:1: ( ( ( rule__Objeto__Group_3__0 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:835:1: ( ( rule__Objeto__Group_3__0 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:835:1: ( ( rule__Objeto__Group_3__0 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:836:1: ( rule__Objeto__Group_3__0 )?
            {
             before(grammarAccess.getObjetoAccess().getGroup_3()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:837:1: ( rule__Objeto__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:837:2: rule__Objeto__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Objeto__Group_3__0_in_rule__Objeto__Group__3__Impl1721);
                    rule__Objeto__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__3__Impl"


    // $ANTLR start "rule__Objeto__Group__4"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:847:1: rule__Objeto__Group__4 : rule__Objeto__Group__4__Impl rule__Objeto__Group__5 ;
    public final void rule__Objeto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:851:1: ( rule__Objeto__Group__4__Impl rule__Objeto__Group__5 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:852:2: rule__Objeto__Group__4__Impl rule__Objeto__Group__5
            {
            pushFollow(FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__41752);
            rule__Objeto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group__5_in_rule__Objeto__Group__41755);
            rule__Objeto__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__4"


    // $ANTLR start "rule__Objeto__Group__4__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:859:1: rule__Objeto__Group__4__Impl : ( ( rule__Objeto__Group_4__0 )? ) ;
    public final void rule__Objeto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:863:1: ( ( ( rule__Objeto__Group_4__0 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:864:1: ( ( rule__Objeto__Group_4__0 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:864:1: ( ( rule__Objeto__Group_4__0 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:865:1: ( rule__Objeto__Group_4__0 )?
            {
             before(grammarAccess.getObjetoAccess().getGroup_4()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:866:1: ( rule__Objeto__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:866:2: rule__Objeto__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Objeto__Group_4__0_in_rule__Objeto__Group__4__Impl1782);
                    rule__Objeto__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjetoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__4__Impl"


    // $ANTLR start "rule__Objeto__Group__5"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:876:1: rule__Objeto__Group__5 : rule__Objeto__Group__5__Impl ;
    public final void rule__Objeto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:880:1: ( rule__Objeto__Group__5__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:881:2: rule__Objeto__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Objeto__Group__5__Impl_in_rule__Objeto__Group__51813);
            rule__Objeto__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__5"


    // $ANTLR start "rule__Objeto__Group__5__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:887:1: rule__Objeto__Group__5__Impl : ( ( rule__Objeto__AccionesAssignment_5 )* ) ;
    public final void rule__Objeto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:891:1: ( ( ( rule__Objeto__AccionesAssignment_5 )* ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:892:1: ( ( rule__Objeto__AccionesAssignment_5 )* )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:892:1: ( ( rule__Objeto__AccionesAssignment_5 )* )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:893:1: ( rule__Objeto__AccionesAssignment_5 )*
            {
             before(grammarAccess.getObjetoAccess().getAccionesAssignment_5()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:894:1: ( rule__Objeto__AccionesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:894:2: rule__Objeto__AccionesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Objeto__AccionesAssignment_5_in_rule__Objeto__Group__5__Impl1840);
            	    rule__Objeto__AccionesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getObjetoAccess().getAccionesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group__5__Impl"


    // $ANTLR start "rule__Objeto__Group_3__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:916:1: rule__Objeto__Group_3__0 : rule__Objeto__Group_3__0__Impl rule__Objeto__Group_3__1 ;
    public final void rule__Objeto__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:920:1: ( rule__Objeto__Group_3__0__Impl rule__Objeto__Group_3__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:921:2: rule__Objeto__Group_3__0__Impl rule__Objeto__Group_3__1
            {
            pushFollow(FOLLOW_rule__Objeto__Group_3__0__Impl_in_rule__Objeto__Group_3__01883);
            rule__Objeto__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group_3__1_in_rule__Objeto__Group_3__01886);
            rule__Objeto__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_3__0"


    // $ANTLR start "rule__Objeto__Group_3__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:928:1: rule__Objeto__Group_3__0__Impl : ( 'descripcion' ) ;
    public final void rule__Objeto__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:932:1: ( ( 'descripcion' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:933:1: ( 'descripcion' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:933:1: ( 'descripcion' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:934:1: 'descripcion'
            {
             before(grammarAccess.getObjetoAccess().getDescripcionKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Objeto__Group_3__0__Impl1914); 
             after(grammarAccess.getObjetoAccess().getDescripcionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_3__0__Impl"


    // $ANTLR start "rule__Objeto__Group_3__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:947:1: rule__Objeto__Group_3__1 : rule__Objeto__Group_3__1__Impl ;
    public final void rule__Objeto__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:951:1: ( rule__Objeto__Group_3__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:952:2: rule__Objeto__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Objeto__Group_3__1__Impl_in_rule__Objeto__Group_3__11945);
            rule__Objeto__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_3__1"


    // $ANTLR start "rule__Objeto__Group_3__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:958:1: rule__Objeto__Group_3__1__Impl : ( ( rule__Objeto__DescripcionAssignment_3_1 ) ) ;
    public final void rule__Objeto__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:962:1: ( ( ( rule__Objeto__DescripcionAssignment_3_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:963:1: ( ( rule__Objeto__DescripcionAssignment_3_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:963:1: ( ( rule__Objeto__DescripcionAssignment_3_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:964:1: ( rule__Objeto__DescripcionAssignment_3_1 )
            {
             before(grammarAccess.getObjetoAccess().getDescripcionAssignment_3_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:965:1: ( rule__Objeto__DescripcionAssignment_3_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:965:2: rule__Objeto__DescripcionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Objeto__DescripcionAssignment_3_1_in_rule__Objeto__Group_3__1__Impl1972);
            rule__Objeto__DescripcionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetoAccess().getDescripcionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_3__1__Impl"


    // $ANTLR start "rule__Objeto__Group_4__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:979:1: rule__Objeto__Group_4__0 : rule__Objeto__Group_4__0__Impl rule__Objeto__Group_4__1 ;
    public final void rule__Objeto__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:983:1: ( rule__Objeto__Group_4__0__Impl rule__Objeto__Group_4__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:984:2: rule__Objeto__Group_4__0__Impl rule__Objeto__Group_4__1
            {
            pushFollow(FOLLOW_rule__Objeto__Group_4__0__Impl_in_rule__Objeto__Group_4__02006);
            rule__Objeto__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Objeto__Group_4__1_in_rule__Objeto__Group_4__02009);
            rule__Objeto__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_4__0"


    // $ANTLR start "rule__Objeto__Group_4__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:991:1: rule__Objeto__Group_4__0__Impl : ( 'tiene' ) ;
    public final void rule__Objeto__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:995:1: ( ( 'tiene' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:996:1: ( 'tiene' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:996:1: ( 'tiene' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:997:1: 'tiene'
            {
             before(grammarAccess.getObjetoAccess().getTieneKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__Objeto__Group_4__0__Impl2037); 
             after(grammarAccess.getObjetoAccess().getTieneKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_4__0__Impl"


    // $ANTLR start "rule__Objeto__Group_4__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1010:1: rule__Objeto__Group_4__1 : rule__Objeto__Group_4__1__Impl ;
    public final void rule__Objeto__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1014:1: ( rule__Objeto__Group_4__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1015:2: rule__Objeto__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Objeto__Group_4__1__Impl_in_rule__Objeto__Group_4__12068);
            rule__Objeto__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_4__1"


    // $ANTLR start "rule__Objeto__Group_4__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1021:1: rule__Objeto__Group_4__1__Impl : ( ( rule__Objeto__EstadoAssignment_4_1 ) ) ;
    public final void rule__Objeto__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1025:1: ( ( ( rule__Objeto__EstadoAssignment_4_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1026:1: ( ( rule__Objeto__EstadoAssignment_4_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1026:1: ( ( rule__Objeto__EstadoAssignment_4_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1027:1: ( rule__Objeto__EstadoAssignment_4_1 )
            {
             before(grammarAccess.getObjetoAccess().getEstadoAssignment_4_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1028:1: ( rule__Objeto__EstadoAssignment_4_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1028:2: rule__Objeto__EstadoAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Objeto__EstadoAssignment_4_1_in_rule__Objeto__Group_4__1__Impl2095);
            rule__Objeto__EstadoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetoAccess().getEstadoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__Group_4__1__Impl"


    // $ANTLR start "rule__Habitacion__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1042:1: rule__Habitacion__Group__0 : rule__Habitacion__Group__0__Impl rule__Habitacion__Group__1 ;
    public final void rule__Habitacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1046:1: ( rule__Habitacion__Group__0__Impl rule__Habitacion__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1047:2: rule__Habitacion__Group__0__Impl rule__Habitacion__Group__1
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__0__Impl_in_rule__Habitacion__Group__02129);
            rule__Habitacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__1_in_rule__Habitacion__Group__02132);
            rule__Habitacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__0"


    // $ANTLR start "rule__Habitacion__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1054:1: rule__Habitacion__Group__0__Impl : ( 'habitacion' ) ;
    public final void rule__Habitacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1058:1: ( ( 'habitacion' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1059:1: ( 'habitacion' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1059:1: ( 'habitacion' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1060:1: 'habitacion'
            {
             before(grammarAccess.getHabitacionAccess().getHabitacionKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Habitacion__Group__0__Impl2160); 
             after(grammarAccess.getHabitacionAccess().getHabitacionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__0__Impl"


    // $ANTLR start "rule__Habitacion__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1073:1: rule__Habitacion__Group__1 : rule__Habitacion__Group__1__Impl rule__Habitacion__Group__2 ;
    public final void rule__Habitacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1077:1: ( rule__Habitacion__Group__1__Impl rule__Habitacion__Group__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1078:2: rule__Habitacion__Group__1__Impl rule__Habitacion__Group__2
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__1__Impl_in_rule__Habitacion__Group__12191);
            rule__Habitacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__2_in_rule__Habitacion__Group__12194);
            rule__Habitacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__1"


    // $ANTLR start "rule__Habitacion__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1085:1: rule__Habitacion__Group__1__Impl : ( ( rule__Habitacion__FinalAssignment_1 )? ) ;
    public final void rule__Habitacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1089:1: ( ( ( rule__Habitacion__FinalAssignment_1 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1090:1: ( ( rule__Habitacion__FinalAssignment_1 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1090:1: ( ( rule__Habitacion__FinalAssignment_1 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1091:1: ( rule__Habitacion__FinalAssignment_1 )?
            {
             before(grammarAccess.getHabitacionAccess().getFinalAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1092:1: ( rule__Habitacion__FinalAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1092:2: rule__Habitacion__FinalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Habitacion__FinalAssignment_1_in_rule__Habitacion__Group__1__Impl2221);
                    rule__Habitacion__FinalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHabitacionAccess().getFinalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__1__Impl"


    // $ANTLR start "rule__Habitacion__Group__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1102:1: rule__Habitacion__Group__2 : rule__Habitacion__Group__2__Impl rule__Habitacion__Group__3 ;
    public final void rule__Habitacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1106:1: ( rule__Habitacion__Group__2__Impl rule__Habitacion__Group__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1107:2: rule__Habitacion__Group__2__Impl rule__Habitacion__Group__3
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__2__Impl_in_rule__Habitacion__Group__22252);
            rule__Habitacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__3_in_rule__Habitacion__Group__22255);
            rule__Habitacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__2"


    // $ANTLR start "rule__Habitacion__Group__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1114:1: rule__Habitacion__Group__2__Impl : ( ( rule__Habitacion__NameAssignment_2 ) ) ;
    public final void rule__Habitacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1118:1: ( ( ( rule__Habitacion__NameAssignment_2 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1119:1: ( ( rule__Habitacion__NameAssignment_2 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1119:1: ( ( rule__Habitacion__NameAssignment_2 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1120:1: ( rule__Habitacion__NameAssignment_2 )
            {
             before(grammarAccess.getHabitacionAccess().getNameAssignment_2()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1121:1: ( rule__Habitacion__NameAssignment_2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1121:2: rule__Habitacion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Habitacion__NameAssignment_2_in_rule__Habitacion__Group__2__Impl2282);
            rule__Habitacion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHabitacionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__2__Impl"


    // $ANTLR start "rule__Habitacion__Group__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1131:1: rule__Habitacion__Group__3 : rule__Habitacion__Group__3__Impl rule__Habitacion__Group__4 ;
    public final void rule__Habitacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1135:1: ( rule__Habitacion__Group__3__Impl rule__Habitacion__Group__4 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1136:2: rule__Habitacion__Group__3__Impl rule__Habitacion__Group__4
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__3__Impl_in_rule__Habitacion__Group__32312);
            rule__Habitacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__4_in_rule__Habitacion__Group__32315);
            rule__Habitacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__3"


    // $ANTLR start "rule__Habitacion__Group__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1143:1: rule__Habitacion__Group__3__Impl : ( 'al ingresar' ) ;
    public final void rule__Habitacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1147:1: ( ( 'al ingresar' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1148:1: ( 'al ingresar' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1148:1: ( 'al ingresar' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1149:1: 'al ingresar'
            {
             before(grammarAccess.getHabitacionAccess().getAlIngresarKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__Habitacion__Group__3__Impl2343); 
             after(grammarAccess.getHabitacionAccess().getAlIngresarKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__3__Impl"


    // $ANTLR start "rule__Habitacion__Group__4"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1162:1: rule__Habitacion__Group__4 : rule__Habitacion__Group__4__Impl rule__Habitacion__Group__5 ;
    public final void rule__Habitacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1166:1: ( rule__Habitacion__Group__4__Impl rule__Habitacion__Group__5 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1167:2: rule__Habitacion__Group__4__Impl rule__Habitacion__Group__5
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__4__Impl_in_rule__Habitacion__Group__42374);
            rule__Habitacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__5_in_rule__Habitacion__Group__42377);
            rule__Habitacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__4"


    // $ANTLR start "rule__Habitacion__Group__4__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1174:1: rule__Habitacion__Group__4__Impl : ( '-' ) ;
    public final void rule__Habitacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1178:1: ( ( '-' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1179:1: ( '-' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1179:1: ( '-' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1180:1: '-'
            {
             before(grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Habitacion__Group__4__Impl2405); 
             after(grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__4__Impl"


    // $ANTLR start "rule__Habitacion__Group__5"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1193:1: rule__Habitacion__Group__5 : rule__Habitacion__Group__5__Impl rule__Habitacion__Group__6 ;
    public final void rule__Habitacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1197:1: ( rule__Habitacion__Group__5__Impl rule__Habitacion__Group__6 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1198:2: rule__Habitacion__Group__5__Impl rule__Habitacion__Group__6
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__5__Impl_in_rule__Habitacion__Group__52436);
            rule__Habitacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__6_in_rule__Habitacion__Group__52439);
            rule__Habitacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__5"


    // $ANTLR start "rule__Habitacion__Group__5__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1205:1: rule__Habitacion__Group__5__Impl : ( 'mostrar' ) ;
    public final void rule__Habitacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1209:1: ( ( 'mostrar' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1210:1: ( 'mostrar' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1210:1: ( 'mostrar' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1211:1: 'mostrar'
            {
             before(grammarAccess.getHabitacionAccess().getMostrarKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Habitacion__Group__5__Impl2467); 
             after(grammarAccess.getHabitacionAccess().getMostrarKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__5__Impl"


    // $ANTLR start "rule__Habitacion__Group__6"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1224:1: rule__Habitacion__Group__6 : rule__Habitacion__Group__6__Impl rule__Habitacion__Group__7 ;
    public final void rule__Habitacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1228:1: ( rule__Habitacion__Group__6__Impl rule__Habitacion__Group__7 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1229:2: rule__Habitacion__Group__6__Impl rule__Habitacion__Group__7
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__6__Impl_in_rule__Habitacion__Group__62498);
            rule__Habitacion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__7_in_rule__Habitacion__Group__62501);
            rule__Habitacion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__6"


    // $ANTLR start "rule__Habitacion__Group__6__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1236:1: rule__Habitacion__Group__6__Impl : ( ( rule__Habitacion__DescripcionAssignment_6 ) ) ;
    public final void rule__Habitacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1240:1: ( ( ( rule__Habitacion__DescripcionAssignment_6 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1241:1: ( ( rule__Habitacion__DescripcionAssignment_6 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1241:1: ( ( rule__Habitacion__DescripcionAssignment_6 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1242:1: ( rule__Habitacion__DescripcionAssignment_6 )
            {
             before(grammarAccess.getHabitacionAccess().getDescripcionAssignment_6()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1243:1: ( rule__Habitacion__DescripcionAssignment_6 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1243:2: rule__Habitacion__DescripcionAssignment_6
            {
            pushFollow(FOLLOW_rule__Habitacion__DescripcionAssignment_6_in_rule__Habitacion__Group__6__Impl2528);
            rule__Habitacion__DescripcionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getHabitacionAccess().getDescripcionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__6__Impl"


    // $ANTLR start "rule__Habitacion__Group__7"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1253:1: rule__Habitacion__Group__7 : rule__Habitacion__Group__7__Impl rule__Habitacion__Group__8 ;
    public final void rule__Habitacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1257:1: ( rule__Habitacion__Group__7__Impl rule__Habitacion__Group__8 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1258:2: rule__Habitacion__Group__7__Impl rule__Habitacion__Group__8
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__7__Impl_in_rule__Habitacion__Group__72558);
            rule__Habitacion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group__8_in_rule__Habitacion__Group__72561);
            rule__Habitacion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__7"


    // $ANTLR start "rule__Habitacion__Group__7__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1265:1: rule__Habitacion__Group__7__Impl : ( ( rule__Habitacion__Group_7__0 )? ) ;
    public final void rule__Habitacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1269:1: ( ( ( rule__Habitacion__Group_7__0 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1270:1: ( ( rule__Habitacion__Group_7__0 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1270:1: ( ( rule__Habitacion__Group_7__0 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1271:1: ( rule__Habitacion__Group_7__0 )?
            {
             before(grammarAccess.getHabitacionAccess().getGroup_7()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1272:1: ( rule__Habitacion__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1272:2: rule__Habitacion__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Habitacion__Group_7__0_in_rule__Habitacion__Group__7__Impl2588);
                    rule__Habitacion__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHabitacionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__7__Impl"


    // $ANTLR start "rule__Habitacion__Group__8"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1282:1: rule__Habitacion__Group__8 : rule__Habitacion__Group__8__Impl ;
    public final void rule__Habitacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1286:1: ( rule__Habitacion__Group__8__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1287:2: rule__Habitacion__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Habitacion__Group__8__Impl_in_rule__Habitacion__Group__82619);
            rule__Habitacion__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__8"


    // $ANTLR start "rule__Habitacion__Group__8__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1293:1: rule__Habitacion__Group__8__Impl : ( ( rule__Habitacion__Group_8__0 )? ) ;
    public final void rule__Habitacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1297:1: ( ( ( rule__Habitacion__Group_8__0 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1298:1: ( ( rule__Habitacion__Group_8__0 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1298:1: ( ( rule__Habitacion__Group_8__0 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1299:1: ( rule__Habitacion__Group_8__0 )?
            {
             before(grammarAccess.getHabitacionAccess().getGroup_8()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1300:1: ( rule__Habitacion__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1300:2: rule__Habitacion__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Habitacion__Group_8__0_in_rule__Habitacion__Group__8__Impl2646);
                    rule__Habitacion__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHabitacionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group__8__Impl"


    // $ANTLR start "rule__Habitacion__Group_7__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1328:1: rule__Habitacion__Group_7__0 : rule__Habitacion__Group_7__0__Impl rule__Habitacion__Group_7__1 ;
    public final void rule__Habitacion__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1332:1: ( rule__Habitacion__Group_7__0__Impl rule__Habitacion__Group_7__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1333:2: rule__Habitacion__Group_7__0__Impl rule__Habitacion__Group_7__1
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_7__0__Impl_in_rule__Habitacion__Group_7__02695);
            rule__Habitacion__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_7__1_in_rule__Habitacion__Group_7__02698);
            rule__Habitacion__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__0"


    // $ANTLR start "rule__Habitacion__Group_7__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1340:1: rule__Habitacion__Group_7__0__Impl : ( '-' ) ;
    public final void rule__Habitacion__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1344:1: ( ( '-' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1345:1: ( '-' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1345:1: ( '-' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1346:1: '-'
            {
             before(grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_7_0()); 
            match(input,19,FOLLOW_19_in_rule__Habitacion__Group_7__0__Impl2726); 
             after(grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__0__Impl"


    // $ANTLR start "rule__Habitacion__Group_7__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1359:1: rule__Habitacion__Group_7__1 : rule__Habitacion__Group_7__1__Impl rule__Habitacion__Group_7__2 ;
    public final void rule__Habitacion__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1363:1: ( rule__Habitacion__Group_7__1__Impl rule__Habitacion__Group_7__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1364:2: rule__Habitacion__Group_7__1__Impl rule__Habitacion__Group_7__2
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_7__1__Impl_in_rule__Habitacion__Group_7__12757);
            rule__Habitacion__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_7__2_in_rule__Habitacion__Group_7__12760);
            rule__Habitacion__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__1"


    // $ANTLR start "rule__Habitacion__Group_7__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1371:1: rule__Habitacion__Group_7__1__Impl : ( 'cambiar el' ) ;
    public final void rule__Habitacion__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1375:1: ( ( 'cambiar el' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1376:1: ( 'cambiar el' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1376:1: ( 'cambiar el' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1377:1: 'cambiar el'
            {
             before(grammarAccess.getHabitacionAccess().getCambiarElKeyword_7_1()); 
            match(input,21,FOLLOW_21_in_rule__Habitacion__Group_7__1__Impl2788); 
             after(grammarAccess.getHabitacionAccess().getCambiarElKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__1__Impl"


    // $ANTLR start "rule__Habitacion__Group_7__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1390:1: rule__Habitacion__Group_7__2 : rule__Habitacion__Group_7__2__Impl rule__Habitacion__Group_7__3 ;
    public final void rule__Habitacion__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1394:1: ( rule__Habitacion__Group_7__2__Impl rule__Habitacion__Group_7__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1395:2: rule__Habitacion__Group_7__2__Impl rule__Habitacion__Group_7__3
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_7__2__Impl_in_rule__Habitacion__Group_7__22819);
            rule__Habitacion__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_7__3_in_rule__Habitacion__Group_7__22822);
            rule__Habitacion__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__2"


    // $ANTLR start "rule__Habitacion__Group_7__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1402:1: rule__Habitacion__Group_7__2__Impl : ( ( rule__Habitacion__EstadoACambiarAssignment_7_2 ) ) ;
    public final void rule__Habitacion__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1406:1: ( ( ( rule__Habitacion__EstadoACambiarAssignment_7_2 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1407:1: ( ( rule__Habitacion__EstadoACambiarAssignment_7_2 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1407:1: ( ( rule__Habitacion__EstadoACambiarAssignment_7_2 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1408:1: ( rule__Habitacion__EstadoACambiarAssignment_7_2 )
            {
             before(grammarAccess.getHabitacionAccess().getEstadoACambiarAssignment_7_2()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1409:1: ( rule__Habitacion__EstadoACambiarAssignment_7_2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1409:2: rule__Habitacion__EstadoACambiarAssignment_7_2
            {
            pushFollow(FOLLOW_rule__Habitacion__EstadoACambiarAssignment_7_2_in_rule__Habitacion__Group_7__2__Impl2849);
            rule__Habitacion__EstadoACambiarAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getHabitacionAccess().getEstadoACambiarAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__2__Impl"


    // $ANTLR start "rule__Habitacion__Group_7__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1419:1: rule__Habitacion__Group_7__3 : rule__Habitacion__Group_7__3__Impl rule__Habitacion__Group_7__4 ;
    public final void rule__Habitacion__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1423:1: ( rule__Habitacion__Group_7__3__Impl rule__Habitacion__Group_7__4 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1424:2: rule__Habitacion__Group_7__3__Impl rule__Habitacion__Group_7__4
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_7__3__Impl_in_rule__Habitacion__Group_7__32879);
            rule__Habitacion__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_7__4_in_rule__Habitacion__Group_7__32882);
            rule__Habitacion__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__3"


    // $ANTLR start "rule__Habitacion__Group_7__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1431:1: rule__Habitacion__Group_7__3__Impl : ( 'de' ) ;
    public final void rule__Habitacion__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1435:1: ( ( 'de' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1436:1: ( 'de' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1436:1: ( 'de' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1437:1: 'de'
            {
             before(grammarAccess.getHabitacionAccess().getDeKeyword_7_3()); 
            match(input,22,FOLLOW_22_in_rule__Habitacion__Group_7__3__Impl2910); 
             after(grammarAccess.getHabitacionAccess().getDeKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__3__Impl"


    // $ANTLR start "rule__Habitacion__Group_7__4"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1450:1: rule__Habitacion__Group_7__4 : rule__Habitacion__Group_7__4__Impl rule__Habitacion__Group_7__5 ;
    public final void rule__Habitacion__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1454:1: ( rule__Habitacion__Group_7__4__Impl rule__Habitacion__Group_7__5 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1455:2: rule__Habitacion__Group_7__4__Impl rule__Habitacion__Group_7__5
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_7__4__Impl_in_rule__Habitacion__Group_7__42941);
            rule__Habitacion__Group_7__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_7__5_in_rule__Habitacion__Group_7__42944);
            rule__Habitacion__Group_7__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__4"


    // $ANTLR start "rule__Habitacion__Group_7__4__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1462:1: rule__Habitacion__Group_7__4__Impl : ( ( rule__Habitacion__ObjetoACambiarAssignment_7_4 ) ) ;
    public final void rule__Habitacion__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1466:1: ( ( ( rule__Habitacion__ObjetoACambiarAssignment_7_4 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1467:1: ( ( rule__Habitacion__ObjetoACambiarAssignment_7_4 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1467:1: ( ( rule__Habitacion__ObjetoACambiarAssignment_7_4 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1468:1: ( rule__Habitacion__ObjetoACambiarAssignment_7_4 )
            {
             before(grammarAccess.getHabitacionAccess().getObjetoACambiarAssignment_7_4()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1469:1: ( rule__Habitacion__ObjetoACambiarAssignment_7_4 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1469:2: rule__Habitacion__ObjetoACambiarAssignment_7_4
            {
            pushFollow(FOLLOW_rule__Habitacion__ObjetoACambiarAssignment_7_4_in_rule__Habitacion__Group_7__4__Impl2971);
            rule__Habitacion__ObjetoACambiarAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getHabitacionAccess().getObjetoACambiarAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__4__Impl"


    // $ANTLR start "rule__Habitacion__Group_7__5"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1479:1: rule__Habitacion__Group_7__5 : rule__Habitacion__Group_7__5__Impl rule__Habitacion__Group_7__6 ;
    public final void rule__Habitacion__Group_7__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1483:1: ( rule__Habitacion__Group_7__5__Impl rule__Habitacion__Group_7__6 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1484:2: rule__Habitacion__Group_7__5__Impl rule__Habitacion__Group_7__6
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_7__5__Impl_in_rule__Habitacion__Group_7__53001);
            rule__Habitacion__Group_7__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_7__6_in_rule__Habitacion__Group_7__53004);
            rule__Habitacion__Group_7__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__5"


    // $ANTLR start "rule__Habitacion__Group_7__5__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1491:1: rule__Habitacion__Group_7__5__Impl : ( 'al valor' ) ;
    public final void rule__Habitacion__Group_7__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1495:1: ( ( 'al valor' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1496:1: ( 'al valor' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1496:1: ( 'al valor' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1497:1: 'al valor'
            {
             before(grammarAccess.getHabitacionAccess().getAlValorKeyword_7_5()); 
            match(input,23,FOLLOW_23_in_rule__Habitacion__Group_7__5__Impl3032); 
             after(grammarAccess.getHabitacionAccess().getAlValorKeyword_7_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__5__Impl"


    // $ANTLR start "rule__Habitacion__Group_7__6"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1510:1: rule__Habitacion__Group_7__6 : rule__Habitacion__Group_7__6__Impl ;
    public final void rule__Habitacion__Group_7__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1514:1: ( rule__Habitacion__Group_7__6__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1515:2: rule__Habitacion__Group_7__6__Impl
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_7__6__Impl_in_rule__Habitacion__Group_7__63063);
            rule__Habitacion__Group_7__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__6"


    // $ANTLR start "rule__Habitacion__Group_7__6__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1521:1: rule__Habitacion__Group_7__6__Impl : ( ( rule__Habitacion__ValorNuevoAssignment_7_6 ) ) ;
    public final void rule__Habitacion__Group_7__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1525:1: ( ( ( rule__Habitacion__ValorNuevoAssignment_7_6 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1526:1: ( ( rule__Habitacion__ValorNuevoAssignment_7_6 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1526:1: ( ( rule__Habitacion__ValorNuevoAssignment_7_6 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1527:1: ( rule__Habitacion__ValorNuevoAssignment_7_6 )
            {
             before(grammarAccess.getHabitacionAccess().getValorNuevoAssignment_7_6()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1528:1: ( rule__Habitacion__ValorNuevoAssignment_7_6 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1528:2: rule__Habitacion__ValorNuevoAssignment_7_6
            {
            pushFollow(FOLLOW_rule__Habitacion__ValorNuevoAssignment_7_6_in_rule__Habitacion__Group_7__6__Impl3090);
            rule__Habitacion__ValorNuevoAssignment_7_6();

            state._fsp--;


            }

             after(grammarAccess.getHabitacionAccess().getValorNuevoAssignment_7_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_7__6__Impl"


    // $ANTLR start "rule__Habitacion__Group_8__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1552:1: rule__Habitacion__Group_8__0 : rule__Habitacion__Group_8__0__Impl rule__Habitacion__Group_8__1 ;
    public final void rule__Habitacion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1556:1: ( rule__Habitacion__Group_8__0__Impl rule__Habitacion__Group_8__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1557:2: rule__Habitacion__Group_8__0__Impl rule__Habitacion__Group_8__1
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_8__0__Impl_in_rule__Habitacion__Group_8__03134);
            rule__Habitacion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_8__1_in_rule__Habitacion__Group_8__03137);
            rule__Habitacion__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8__0"


    // $ANTLR start "rule__Habitacion__Group_8__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1564:1: rule__Habitacion__Group_8__0__Impl : ( 'objetos' ) ;
    public final void rule__Habitacion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1568:1: ( ( 'objetos' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1569:1: ( 'objetos' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1569:1: ( 'objetos' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1570:1: 'objetos'
            {
             before(grammarAccess.getHabitacionAccess().getObjetosKeyword_8_0()); 
            match(input,24,FOLLOW_24_in_rule__Habitacion__Group_8__0__Impl3165); 
             after(grammarAccess.getHabitacionAccess().getObjetosKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8__0__Impl"


    // $ANTLR start "rule__Habitacion__Group_8__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1583:1: rule__Habitacion__Group_8__1 : rule__Habitacion__Group_8__1__Impl ;
    public final void rule__Habitacion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1587:1: ( rule__Habitacion__Group_8__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1588:2: rule__Habitacion__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_8__1__Impl_in_rule__Habitacion__Group_8__13196);
            rule__Habitacion__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8__1"


    // $ANTLR start "rule__Habitacion__Group_8__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1594:1: rule__Habitacion__Group_8__1__Impl : ( ( rule__Habitacion__Group_8_1__0 )* ) ;
    public final void rule__Habitacion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1598:1: ( ( ( rule__Habitacion__Group_8_1__0 )* ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1599:1: ( ( rule__Habitacion__Group_8_1__0 )* )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1599:1: ( ( rule__Habitacion__Group_8_1__0 )* )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1600:1: ( rule__Habitacion__Group_8_1__0 )*
            {
             before(grammarAccess.getHabitacionAccess().getGroup_8_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1601:1: ( rule__Habitacion__Group_8_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1601:2: rule__Habitacion__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Habitacion__Group_8_1__0_in_rule__Habitacion__Group_8__1__Impl3223);
            	    rule__Habitacion__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getHabitacionAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8__1__Impl"


    // $ANTLR start "rule__Habitacion__Group_8_1__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1615:1: rule__Habitacion__Group_8_1__0 : rule__Habitacion__Group_8_1__0__Impl rule__Habitacion__Group_8_1__1 ;
    public final void rule__Habitacion__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1619:1: ( rule__Habitacion__Group_8_1__0__Impl rule__Habitacion__Group_8_1__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1620:2: rule__Habitacion__Group_8_1__0__Impl rule__Habitacion__Group_8_1__1
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_8_1__0__Impl_in_rule__Habitacion__Group_8_1__03258);
            rule__Habitacion__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Habitacion__Group_8_1__1_in_rule__Habitacion__Group_8_1__03261);
            rule__Habitacion__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8_1__0"


    // $ANTLR start "rule__Habitacion__Group_8_1__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1627:1: rule__Habitacion__Group_8_1__0__Impl : ( '-' ) ;
    public final void rule__Habitacion__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1631:1: ( ( '-' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1632:1: ( '-' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1632:1: ( '-' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1633:1: '-'
            {
             before(grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_8_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Habitacion__Group_8_1__0__Impl3289); 
             after(grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8_1__0__Impl"


    // $ANTLR start "rule__Habitacion__Group_8_1__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1646:1: rule__Habitacion__Group_8_1__1 : rule__Habitacion__Group_8_1__1__Impl ;
    public final void rule__Habitacion__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1650:1: ( rule__Habitacion__Group_8_1__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1651:2: rule__Habitacion__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Habitacion__Group_8_1__1__Impl_in_rule__Habitacion__Group_8_1__13320);
            rule__Habitacion__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8_1__1"


    // $ANTLR start "rule__Habitacion__Group_8_1__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1657:1: rule__Habitacion__Group_8_1__1__Impl : ( ( rule__Habitacion__ObjetosAssignment_8_1_1 ) ) ;
    public final void rule__Habitacion__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1661:1: ( ( ( rule__Habitacion__ObjetosAssignment_8_1_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1662:1: ( ( rule__Habitacion__ObjetosAssignment_8_1_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1662:1: ( ( rule__Habitacion__ObjetosAssignment_8_1_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1663:1: ( rule__Habitacion__ObjetosAssignment_8_1_1 )
            {
             before(grammarAccess.getHabitacionAccess().getObjetosAssignment_8_1_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1664:1: ( rule__Habitacion__ObjetosAssignment_8_1_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1664:2: rule__Habitacion__ObjetosAssignment_8_1_1
            {
            pushFollow(FOLLOW_rule__Habitacion__ObjetosAssignment_8_1_1_in_rule__Habitacion__Group_8_1__1__Impl3347);
            rule__Habitacion__ObjetosAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHabitacionAccess().getObjetosAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__Group_8_1__1__Impl"


    // $ANTLR start "rule__Posicion__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1678:1: rule__Posicion__Group__0 : rule__Posicion__Group__0__Impl rule__Posicion__Group__1 ;
    public final void rule__Posicion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1682:1: ( rule__Posicion__Group__0__Impl rule__Posicion__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1683:2: rule__Posicion__Group__0__Impl rule__Posicion__Group__1
            {
            pushFollow(FOLLOW_rule__Posicion__Group__0__Impl_in_rule__Posicion__Group__03381);
            rule__Posicion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Posicion__Group__1_in_rule__Posicion__Group__03384);
            rule__Posicion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Posicion__Group__0"


    // $ANTLR start "rule__Posicion__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1690:1: rule__Posicion__Group__0__Impl : ( 'iniciar en' ) ;
    public final void rule__Posicion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1694:1: ( ( 'iniciar en' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1695:1: ( 'iniciar en' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1695:1: ( 'iniciar en' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1696:1: 'iniciar en'
            {
             before(grammarAccess.getPosicionAccess().getIniciarEnKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Posicion__Group__0__Impl3412); 
             after(grammarAccess.getPosicionAccess().getIniciarEnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Posicion__Group__0__Impl"


    // $ANTLR start "rule__Posicion__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1709:1: rule__Posicion__Group__1 : rule__Posicion__Group__1__Impl ;
    public final void rule__Posicion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1713:1: ( rule__Posicion__Group__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1714:2: rule__Posicion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Posicion__Group__1__Impl_in_rule__Posicion__Group__13443);
            rule__Posicion__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Posicion__Group__1"


    // $ANTLR start "rule__Posicion__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1720:1: rule__Posicion__Group__1__Impl : ( ( rule__Posicion__HabitacionAssignment_1 ) ) ;
    public final void rule__Posicion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1724:1: ( ( ( rule__Posicion__HabitacionAssignment_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1725:1: ( ( rule__Posicion__HabitacionAssignment_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1725:1: ( ( rule__Posicion__HabitacionAssignment_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1726:1: ( rule__Posicion__HabitacionAssignment_1 )
            {
             before(grammarAccess.getPosicionAccess().getHabitacionAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1727:1: ( rule__Posicion__HabitacionAssignment_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1727:2: rule__Posicion__HabitacionAssignment_1
            {
            pushFollow(FOLLOW_rule__Posicion__HabitacionAssignment_1_in_rule__Posicion__Group__1__Impl3470);
            rule__Posicion__HabitacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPosicionAccess().getHabitacionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Posicion__Group__1__Impl"


    // $ANTLR start "rule__MostrarObjetos__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1741:1: rule__MostrarObjetos__Group__0 : rule__MostrarObjetos__Group__0__Impl rule__MostrarObjetos__Group__1 ;
    public final void rule__MostrarObjetos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1745:1: ( rule__MostrarObjetos__Group__0__Impl rule__MostrarObjetos__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1746:2: rule__MostrarObjetos__Group__0__Impl rule__MostrarObjetos__Group__1
            {
            pushFollow(FOLLOW_rule__MostrarObjetos__Group__0__Impl_in_rule__MostrarObjetos__Group__03504);
            rule__MostrarObjetos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MostrarObjetos__Group__1_in_rule__MostrarObjetos__Group__03507);
            rule__MostrarObjetos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarObjetos__Group__0"


    // $ANTLR start "rule__MostrarObjetos__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1753:1: rule__MostrarObjetos__Group__0__Impl : ( 'objetos ?' ) ;
    public final void rule__MostrarObjetos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1757:1: ( ( 'objetos ?' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1758:1: ( 'objetos ?' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1758:1: ( 'objetos ?' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1759:1: 'objetos ?'
            {
             before(grammarAccess.getMostrarObjetosAccess().getObjetosKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__MostrarObjetos__Group__0__Impl3535); 
             after(grammarAccess.getMostrarObjetosAccess().getObjetosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarObjetos__Group__0__Impl"


    // $ANTLR start "rule__MostrarObjetos__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1772:1: rule__MostrarObjetos__Group__1 : rule__MostrarObjetos__Group__1__Impl ;
    public final void rule__MostrarObjetos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1776:1: ( rule__MostrarObjetos__Group__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1777:2: rule__MostrarObjetos__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MostrarObjetos__Group__1__Impl_in_rule__MostrarObjetos__Group__13566);
            rule__MostrarObjetos__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarObjetos__Group__1"


    // $ANTLR start "rule__MostrarObjetos__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1783:1: rule__MostrarObjetos__Group__1__Impl : ( () ) ;
    public final void rule__MostrarObjetos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1787:1: ( ( () ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1788:1: ( () )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1788:1: ( () )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1789:1: ()
            {
             before(grammarAccess.getMostrarObjetosAccess().getMostrarObjetosAction_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1790:1: ()
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1792:1: 
            {
            }

             after(grammarAccess.getMostrarObjetosAccess().getMostrarObjetosAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarObjetos__Group__1__Impl"


    // $ANTLR start "rule__DescribirObjeto__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1806:1: rule__DescribirObjeto__Group__0 : rule__DescribirObjeto__Group__0__Impl rule__DescribirObjeto__Group__1 ;
    public final void rule__DescribirObjeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1810:1: ( rule__DescribirObjeto__Group__0__Impl rule__DescribirObjeto__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1811:2: rule__DescribirObjeto__Group__0__Impl rule__DescribirObjeto__Group__1
            {
            pushFollow(FOLLOW_rule__DescribirObjeto__Group__0__Impl_in_rule__DescribirObjeto__Group__03628);
            rule__DescribirObjeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DescribirObjeto__Group__1_in_rule__DescribirObjeto__Group__03631);
            rule__DescribirObjeto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescribirObjeto__Group__0"


    // $ANTLR start "rule__DescribirObjeto__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1818:1: rule__DescribirObjeto__Group__0__Impl : ( 'describir' ) ;
    public final void rule__DescribirObjeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1822:1: ( ( 'describir' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1823:1: ( 'describir' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1823:1: ( 'describir' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1824:1: 'describir'
            {
             before(grammarAccess.getDescribirObjetoAccess().getDescribirKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__DescribirObjeto__Group__0__Impl3659); 
             after(grammarAccess.getDescribirObjetoAccess().getDescribirKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescribirObjeto__Group__0__Impl"


    // $ANTLR start "rule__DescribirObjeto__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1837:1: rule__DescribirObjeto__Group__1 : rule__DescribirObjeto__Group__1__Impl ;
    public final void rule__DescribirObjeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1841:1: ( rule__DescribirObjeto__Group__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1842:2: rule__DescribirObjeto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DescribirObjeto__Group__1__Impl_in_rule__DescribirObjeto__Group__13690);
            rule__DescribirObjeto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescribirObjeto__Group__1"


    // $ANTLR start "rule__DescribirObjeto__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1848:1: rule__DescribirObjeto__Group__1__Impl : ( ( rule__DescribirObjeto__ObjetoAssignment_1 ) ) ;
    public final void rule__DescribirObjeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1852:1: ( ( ( rule__DescribirObjeto__ObjetoAssignment_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1853:1: ( ( rule__DescribirObjeto__ObjetoAssignment_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1853:1: ( ( rule__DescribirObjeto__ObjetoAssignment_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1854:1: ( rule__DescribirObjeto__ObjetoAssignment_1 )
            {
             before(grammarAccess.getDescribirObjetoAccess().getObjetoAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1855:1: ( rule__DescribirObjeto__ObjetoAssignment_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1855:2: rule__DescribirObjeto__ObjetoAssignment_1
            {
            pushFollow(FOLLOW_rule__DescribirObjeto__ObjetoAssignment_1_in_rule__DescribirObjeto__Group__1__Impl3717);
            rule__DescribirObjeto__ObjetoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescribirObjetoAccess().getObjetoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescribirObjeto__Group__1__Impl"


    // $ANTLR start "rule__RecogerObjeto__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1869:1: rule__RecogerObjeto__Group__0 : rule__RecogerObjeto__Group__0__Impl rule__RecogerObjeto__Group__1 ;
    public final void rule__RecogerObjeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1873:1: ( rule__RecogerObjeto__Group__0__Impl rule__RecogerObjeto__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1874:2: rule__RecogerObjeto__Group__0__Impl rule__RecogerObjeto__Group__1
            {
            pushFollow(FOLLOW_rule__RecogerObjeto__Group__0__Impl_in_rule__RecogerObjeto__Group__03751);
            rule__RecogerObjeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecogerObjeto__Group__1_in_rule__RecogerObjeto__Group__03754);
            rule__RecogerObjeto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecogerObjeto__Group__0"


    // $ANTLR start "rule__RecogerObjeto__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1881:1: rule__RecogerObjeto__Group__0__Impl : ( 'recoger' ) ;
    public final void rule__RecogerObjeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1885:1: ( ( 'recoger' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1886:1: ( 'recoger' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1886:1: ( 'recoger' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1887:1: 'recoger'
            {
             before(grammarAccess.getRecogerObjetoAccess().getRecogerKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__RecogerObjeto__Group__0__Impl3782); 
             after(grammarAccess.getRecogerObjetoAccess().getRecogerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecogerObjeto__Group__0__Impl"


    // $ANTLR start "rule__RecogerObjeto__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1900:1: rule__RecogerObjeto__Group__1 : rule__RecogerObjeto__Group__1__Impl ;
    public final void rule__RecogerObjeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1904:1: ( rule__RecogerObjeto__Group__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1905:2: rule__RecogerObjeto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RecogerObjeto__Group__1__Impl_in_rule__RecogerObjeto__Group__13813);
            rule__RecogerObjeto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecogerObjeto__Group__1"


    // $ANTLR start "rule__RecogerObjeto__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1911:1: rule__RecogerObjeto__Group__1__Impl : ( ( rule__RecogerObjeto__ObjetoAssignment_1 ) ) ;
    public final void rule__RecogerObjeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1915:1: ( ( ( rule__RecogerObjeto__ObjetoAssignment_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1916:1: ( ( rule__RecogerObjeto__ObjetoAssignment_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1916:1: ( ( rule__RecogerObjeto__ObjetoAssignment_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1917:1: ( rule__RecogerObjeto__ObjetoAssignment_1 )
            {
             before(grammarAccess.getRecogerObjetoAccess().getObjetoAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1918:1: ( rule__RecogerObjeto__ObjetoAssignment_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1918:2: rule__RecogerObjeto__ObjetoAssignment_1
            {
            pushFollow(FOLLOW_rule__RecogerObjeto__ObjetoAssignment_1_in_rule__RecogerObjeto__Group__1__Impl3840);
            rule__RecogerObjeto__ObjetoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecogerObjetoAccess().getObjetoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecogerObjeto__Group__1__Impl"


    // $ANTLR start "rule__MostrarInventario__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1932:1: rule__MostrarInventario__Group__0 : rule__MostrarInventario__Group__0__Impl rule__MostrarInventario__Group__1 ;
    public final void rule__MostrarInventario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1936:1: ( rule__MostrarInventario__Group__0__Impl rule__MostrarInventario__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1937:2: rule__MostrarInventario__Group__0__Impl rule__MostrarInventario__Group__1
            {
            pushFollow(FOLLOW_rule__MostrarInventario__Group__0__Impl_in_rule__MostrarInventario__Group__03874);
            rule__MostrarInventario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MostrarInventario__Group__1_in_rule__MostrarInventario__Group__03877);
            rule__MostrarInventario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarInventario__Group__0"


    // $ANTLR start "rule__MostrarInventario__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1944:1: rule__MostrarInventario__Group__0__Impl : ( 'inventario ?' ) ;
    public final void rule__MostrarInventario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1948:1: ( ( 'inventario ?' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1949:1: ( 'inventario ?' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1949:1: ( 'inventario ?' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1950:1: 'inventario ?'
            {
             before(grammarAccess.getMostrarInventarioAccess().getInventarioKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__MostrarInventario__Group__0__Impl3905); 
             after(grammarAccess.getMostrarInventarioAccess().getInventarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarInventario__Group__0__Impl"


    // $ANTLR start "rule__MostrarInventario__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1963:1: rule__MostrarInventario__Group__1 : rule__MostrarInventario__Group__1__Impl ;
    public final void rule__MostrarInventario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1967:1: ( rule__MostrarInventario__Group__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1968:2: rule__MostrarInventario__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MostrarInventario__Group__1__Impl_in_rule__MostrarInventario__Group__13936);
            rule__MostrarInventario__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarInventario__Group__1"


    // $ANTLR start "rule__MostrarInventario__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1974:1: rule__MostrarInventario__Group__1__Impl : ( () ) ;
    public final void rule__MostrarInventario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1978:1: ( ( () ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1979:1: ( () )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1979:1: ( () )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1980:1: ()
            {
             before(grammarAccess.getMostrarInventarioAccess().getMostrarInventarioAction_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1981:1: ()
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1983:1: 
            {
            }

             after(grammarAccess.getMostrarInventarioAccess().getMostrarInventarioAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MostrarInventario__Group__1__Impl"


    // $ANTLR start "rule__Acciones__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:1997:1: rule__Acciones__Group__0 : rule__Acciones__Group__0__Impl rule__Acciones__Group__1 ;
    public final void rule__Acciones__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2001:1: ( rule__Acciones__Group__0__Impl rule__Acciones__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2002:2: rule__Acciones__Group__0__Impl rule__Acciones__Group__1
            {
            pushFollow(FOLLOW_rule__Acciones__Group__0__Impl_in_rule__Acciones__Group__03998);
            rule__Acciones__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Acciones__Group__1_in_rule__Acciones__Group__04001);
            rule__Acciones__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acciones__Group__0"


    // $ANTLR start "rule__Acciones__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2009:1: rule__Acciones__Group__0__Impl : ( 'acciones' ) ;
    public final void rule__Acciones__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2013:1: ( ( 'acciones' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2014:1: ( 'acciones' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2014:1: ( 'acciones' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2015:1: 'acciones'
            {
             before(grammarAccess.getAccionesAccess().getAccionesKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Acciones__Group__0__Impl4029); 
             after(grammarAccess.getAccionesAccess().getAccionesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acciones__Group__0__Impl"


    // $ANTLR start "rule__Acciones__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2028:1: rule__Acciones__Group__1 : rule__Acciones__Group__1__Impl rule__Acciones__Group__2 ;
    public final void rule__Acciones__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2032:1: ( rule__Acciones__Group__1__Impl rule__Acciones__Group__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2033:2: rule__Acciones__Group__1__Impl rule__Acciones__Group__2
            {
            pushFollow(FOLLOW_rule__Acciones__Group__1__Impl_in_rule__Acciones__Group__14060);
            rule__Acciones__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Acciones__Group__2_in_rule__Acciones__Group__14063);
            rule__Acciones__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acciones__Group__1"


    // $ANTLR start "rule__Acciones__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2040:1: rule__Acciones__Group__1__Impl : ( ( rule__Acciones__ObjetoAssignment_1 ) ) ;
    public final void rule__Acciones__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2044:1: ( ( ( rule__Acciones__ObjetoAssignment_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2045:1: ( ( rule__Acciones__ObjetoAssignment_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2045:1: ( ( rule__Acciones__ObjetoAssignment_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2046:1: ( rule__Acciones__ObjetoAssignment_1 )
            {
             before(grammarAccess.getAccionesAccess().getObjetoAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2047:1: ( rule__Acciones__ObjetoAssignment_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2047:2: rule__Acciones__ObjetoAssignment_1
            {
            pushFollow(FOLLOW_rule__Acciones__ObjetoAssignment_1_in_rule__Acciones__Group__1__Impl4090);
            rule__Acciones__ObjetoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccionesAccess().getObjetoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acciones__Group__1__Impl"


    // $ANTLR start "rule__Acciones__Group__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2057:1: rule__Acciones__Group__2 : rule__Acciones__Group__2__Impl ;
    public final void rule__Acciones__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2061:1: ( rule__Acciones__Group__2__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2062:2: rule__Acciones__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Acciones__Group__2__Impl_in_rule__Acciones__Group__24120);
            rule__Acciones__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acciones__Group__2"


    // $ANTLR start "rule__Acciones__Group__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2068:1: rule__Acciones__Group__2__Impl : ( '?' ) ;
    public final void rule__Acciones__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2072:1: ( ( '?' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2073:1: ( '?' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2073:1: ( '?' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2074:1: '?'
            {
             before(grammarAccess.getAccionesAccess().getQuestionMarkKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Acciones__Group__2__Impl4148); 
             after(grammarAccess.getAccionesAccess().getQuestionMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acciones__Group__2__Impl"


    // $ANTLR start "rule__EjecutarAccion__Group_0__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2093:1: rule__EjecutarAccion__Group_0__0 : rule__EjecutarAccion__Group_0__0__Impl rule__EjecutarAccion__Group_0__1 ;
    public final void rule__EjecutarAccion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2097:1: ( rule__EjecutarAccion__Group_0__0__Impl rule__EjecutarAccion__Group_0__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2098:2: rule__EjecutarAccion__Group_0__0__Impl rule__EjecutarAccion__Group_0__1
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__0__Impl_in_rule__EjecutarAccion__Group_0__04185);
            rule__EjecutarAccion__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__1_in_rule__EjecutarAccion__Group_0__04188);
            rule__EjecutarAccion__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__0"


    // $ANTLR start "rule__EjecutarAccion__Group_0__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2105:1: rule__EjecutarAccion__Group_0__0__Impl : ( 'accion' ) ;
    public final void rule__EjecutarAccion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2109:1: ( ( 'accion' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2110:1: ( 'accion' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2110:1: ( 'accion' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2111:1: 'accion'
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__EjecutarAccion__Group_0__0__Impl4216); 
             after(grammarAccess.getEjecutarAccionAccess().getAccionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__0__Impl"


    // $ANTLR start "rule__EjecutarAccion__Group_0__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2124:1: rule__EjecutarAccion__Group_0__1 : rule__EjecutarAccion__Group_0__1__Impl rule__EjecutarAccion__Group_0__2 ;
    public final void rule__EjecutarAccion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2128:1: ( rule__EjecutarAccion__Group_0__1__Impl rule__EjecutarAccion__Group_0__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2129:2: rule__EjecutarAccion__Group_0__1__Impl rule__EjecutarAccion__Group_0__2
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__1__Impl_in_rule__EjecutarAccion__Group_0__14247);
            rule__EjecutarAccion__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__2_in_rule__EjecutarAccion__Group_0__14250);
            rule__EjecutarAccion__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__1"


    // $ANTLR start "rule__EjecutarAccion__Group_0__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2136:1: rule__EjecutarAccion__Group_0__1__Impl : ( ( rule__EjecutarAccion__AccionAssignment_0_1 ) ) ;
    public final void rule__EjecutarAccion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2140:1: ( ( ( rule__EjecutarAccion__AccionAssignment_0_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2141:1: ( ( rule__EjecutarAccion__AccionAssignment_0_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2141:1: ( ( rule__EjecutarAccion__AccionAssignment_0_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2142:1: ( rule__EjecutarAccion__AccionAssignment_0_1 )
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionAssignment_0_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2143:1: ( rule__EjecutarAccion__AccionAssignment_0_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2143:2: rule__EjecutarAccion__AccionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__AccionAssignment_0_1_in_rule__EjecutarAccion__Group_0__1__Impl4277);
            rule__EjecutarAccion__AccionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEjecutarAccionAccess().getAccionAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__1__Impl"


    // $ANTLR start "rule__EjecutarAccion__Group_0__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2153:1: rule__EjecutarAccion__Group_0__2 : rule__EjecutarAccion__Group_0__2__Impl rule__EjecutarAccion__Group_0__3 ;
    public final void rule__EjecutarAccion__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2157:1: ( rule__EjecutarAccion__Group_0__2__Impl rule__EjecutarAccion__Group_0__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2158:2: rule__EjecutarAccion__Group_0__2__Impl rule__EjecutarAccion__Group_0__3
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__2__Impl_in_rule__EjecutarAccion__Group_0__24307);
            rule__EjecutarAccion__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__3_in_rule__EjecutarAccion__Group_0__24310);
            rule__EjecutarAccion__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__2"


    // $ANTLR start "rule__EjecutarAccion__Group_0__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2165:1: rule__EjecutarAccion__Group_0__2__Impl : ( ( rule__EjecutarAccion__Alternatives_0_2 ) ) ;
    public final void rule__EjecutarAccion__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2169:1: ( ( ( rule__EjecutarAccion__Alternatives_0_2 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2170:1: ( ( rule__EjecutarAccion__Alternatives_0_2 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2170:1: ( ( rule__EjecutarAccion__Alternatives_0_2 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2171:1: ( rule__EjecutarAccion__Alternatives_0_2 )
            {
             before(grammarAccess.getEjecutarAccionAccess().getAlternatives_0_2()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2172:1: ( rule__EjecutarAccion__Alternatives_0_2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2172:2: rule__EjecutarAccion__Alternatives_0_2
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Alternatives_0_2_in_rule__EjecutarAccion__Group_0__2__Impl4337);
            rule__EjecutarAccion__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEjecutarAccionAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__2__Impl"


    // $ANTLR start "rule__EjecutarAccion__Group_0__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2182:1: rule__EjecutarAccion__Group_0__3 : rule__EjecutarAccion__Group_0__3__Impl ;
    public final void rule__EjecutarAccion__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2186:1: ( rule__EjecutarAccion__Group_0__3__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2187:2: rule__EjecutarAccion__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Group_0__3__Impl_in_rule__EjecutarAccion__Group_0__34367);
            rule__EjecutarAccion__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__3"


    // $ANTLR start "rule__EjecutarAccion__Group_0__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2193:1: rule__EjecutarAccion__Group_0__3__Impl : ( ( rule__EjecutarAccion__ObjetoAssignment_0_3 ) ) ;
    public final void rule__EjecutarAccion__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2197:1: ( ( ( rule__EjecutarAccion__ObjetoAssignment_0_3 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2198:1: ( ( rule__EjecutarAccion__ObjetoAssignment_0_3 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2198:1: ( ( rule__EjecutarAccion__ObjetoAssignment_0_3 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2199:1: ( rule__EjecutarAccion__ObjetoAssignment_0_3 )
            {
             before(grammarAccess.getEjecutarAccionAccess().getObjetoAssignment_0_3()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2200:1: ( rule__EjecutarAccion__ObjetoAssignment_0_3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2200:2: rule__EjecutarAccion__ObjetoAssignment_0_3
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__ObjetoAssignment_0_3_in_rule__EjecutarAccion__Group_0__3__Impl4394);
            rule__EjecutarAccion__ObjetoAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getEjecutarAccionAccess().getObjetoAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_0__3__Impl"


    // $ANTLR start "rule__EjecutarAccion__Group_1__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2218:1: rule__EjecutarAccion__Group_1__0 : rule__EjecutarAccion__Group_1__0__Impl rule__EjecutarAccion__Group_1__1 ;
    public final void rule__EjecutarAccion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2222:1: ( rule__EjecutarAccion__Group_1__0__Impl rule__EjecutarAccion__Group_1__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2223:2: rule__EjecutarAccion__Group_1__0__Impl rule__EjecutarAccion__Group_1__1
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Group_1__0__Impl_in_rule__EjecutarAccion__Group_1__04432);
            rule__EjecutarAccion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EjecutarAccion__Group_1__1_in_rule__EjecutarAccion__Group_1__04435);
            rule__EjecutarAccion__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_1__0"


    // $ANTLR start "rule__EjecutarAccion__Group_1__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2230:1: rule__EjecutarAccion__Group_1__0__Impl : ( 'accion' ) ;
    public final void rule__EjecutarAccion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2234:1: ( ( 'accion' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2235:1: ( 'accion' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2235:1: ( 'accion' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2236:1: 'accion'
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__EjecutarAccion__Group_1__0__Impl4463); 
             after(grammarAccess.getEjecutarAccionAccess().getAccionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_1__0__Impl"


    // $ANTLR start "rule__EjecutarAccion__Group_1__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2249:1: rule__EjecutarAccion__Group_1__1 : rule__EjecutarAccion__Group_1__1__Impl rule__EjecutarAccion__Group_1__2 ;
    public final void rule__EjecutarAccion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2253:1: ( rule__EjecutarAccion__Group_1__1__Impl rule__EjecutarAccion__Group_1__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2254:2: rule__EjecutarAccion__Group_1__1__Impl rule__EjecutarAccion__Group_1__2
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Group_1__1__Impl_in_rule__EjecutarAccion__Group_1__14494);
            rule__EjecutarAccion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EjecutarAccion__Group_1__2_in_rule__EjecutarAccion__Group_1__14497);
            rule__EjecutarAccion__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_1__1"


    // $ANTLR start "rule__EjecutarAccion__Group_1__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2261:1: rule__EjecutarAccion__Group_1__1__Impl : ( ( rule__EjecutarAccion__AccionAssignment_1_1 ) ) ;
    public final void rule__EjecutarAccion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2265:1: ( ( ( rule__EjecutarAccion__AccionAssignment_1_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2266:1: ( ( rule__EjecutarAccion__AccionAssignment_1_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2266:1: ( ( rule__EjecutarAccion__AccionAssignment_1_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2267:1: ( rule__EjecutarAccion__AccionAssignment_1_1 )
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionAssignment_1_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2268:1: ( rule__EjecutarAccion__AccionAssignment_1_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2268:2: rule__EjecutarAccion__AccionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__AccionAssignment_1_1_in_rule__EjecutarAccion__Group_1__1__Impl4524);
            rule__EjecutarAccion__AccionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEjecutarAccionAccess().getAccionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_1__1__Impl"


    // $ANTLR start "rule__EjecutarAccion__Group_1__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2278:1: rule__EjecutarAccion__Group_1__2 : rule__EjecutarAccion__Group_1__2__Impl ;
    public final void rule__EjecutarAccion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2282:1: ( rule__EjecutarAccion__Group_1__2__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2283:2: rule__EjecutarAccion__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__Group_1__2__Impl_in_rule__EjecutarAccion__Group_1__24554);
            rule__EjecutarAccion__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_1__2"


    // $ANTLR start "rule__EjecutarAccion__Group_1__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2289:1: rule__EjecutarAccion__Group_1__2__Impl : ( ( rule__EjecutarAccion__ObjetoAssignment_1_2 ) ) ;
    public final void rule__EjecutarAccion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2293:1: ( ( ( rule__EjecutarAccion__ObjetoAssignment_1_2 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2294:1: ( ( rule__EjecutarAccion__ObjetoAssignment_1_2 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2294:1: ( ( rule__EjecutarAccion__ObjetoAssignment_1_2 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2295:1: ( rule__EjecutarAccion__ObjetoAssignment_1_2 )
            {
             before(grammarAccess.getEjecutarAccionAccess().getObjetoAssignment_1_2()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2296:1: ( rule__EjecutarAccion__ObjetoAssignment_1_2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2296:2: rule__EjecutarAccion__ObjetoAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EjecutarAccion__ObjetoAssignment_1_2_in_rule__EjecutarAccion__Group_1__2__Impl4581);
            rule__EjecutarAccion__ObjetoAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEjecutarAccionAccess().getObjetoAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__Group_1__2__Impl"


    // $ANTLR start "rule__IrA__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2312:1: rule__IrA__Group__0 : rule__IrA__Group__0__Impl rule__IrA__Group__1 ;
    public final void rule__IrA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2316:1: ( rule__IrA__Group__0__Impl rule__IrA__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2317:2: rule__IrA__Group__0__Impl rule__IrA__Group__1
            {
            pushFollow(FOLLOW_rule__IrA__Group__0__Impl_in_rule__IrA__Group__04617);
            rule__IrA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IrA__Group__1_in_rule__IrA__Group__04620);
            rule__IrA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__0"


    // $ANTLR start "rule__IrA__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2324:1: rule__IrA__Group__0__Impl : ( 'accion' ) ;
    public final void rule__IrA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2328:1: ( ( 'accion' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2329:1: ( 'accion' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2329:1: ( 'accion' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2330:1: 'accion'
            {
             before(grammarAccess.getIrAAccess().getAccionKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__IrA__Group__0__Impl4648); 
             after(grammarAccess.getIrAAccess().getAccionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__0__Impl"


    // $ANTLR start "rule__IrA__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2343:1: rule__IrA__Group__1 : rule__IrA__Group__1__Impl rule__IrA__Group__2 ;
    public final void rule__IrA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2347:1: ( rule__IrA__Group__1__Impl rule__IrA__Group__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2348:2: rule__IrA__Group__1__Impl rule__IrA__Group__2
            {
            pushFollow(FOLLOW_rule__IrA__Group__1__Impl_in_rule__IrA__Group__14679);
            rule__IrA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IrA__Group__2_in_rule__IrA__Group__14682);
            rule__IrA__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__1"


    // $ANTLR start "rule__IrA__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2355:1: rule__IrA__Group__1__Impl : ( ( rule__IrA__NameAssignment_1 ) ) ;
    public final void rule__IrA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2359:1: ( ( ( rule__IrA__NameAssignment_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2360:1: ( ( rule__IrA__NameAssignment_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2360:1: ( ( rule__IrA__NameAssignment_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2361:1: ( rule__IrA__NameAssignment_1 )
            {
             before(grammarAccess.getIrAAccess().getNameAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2362:1: ( rule__IrA__NameAssignment_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2362:2: rule__IrA__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__IrA__NameAssignment_1_in_rule__IrA__Group__1__Impl4709);
            rule__IrA__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIrAAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__1__Impl"


    // $ANTLR start "rule__IrA__Group__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2372:1: rule__IrA__Group__2 : rule__IrA__Group__2__Impl rule__IrA__Group__3 ;
    public final void rule__IrA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2376:1: ( rule__IrA__Group__2__Impl rule__IrA__Group__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2377:2: rule__IrA__Group__2__Impl rule__IrA__Group__3
            {
            pushFollow(FOLLOW_rule__IrA__Group__2__Impl_in_rule__IrA__Group__24739);
            rule__IrA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IrA__Group__3_in_rule__IrA__Group__24742);
            rule__IrA__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__2"


    // $ANTLR start "rule__IrA__Group__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2384:1: rule__IrA__Group__2__Impl : ( 'hace ir a' ) ;
    public final void rule__IrA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2388:1: ( ( 'hace ir a' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2389:1: ( 'hace ir a' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2389:1: ( 'hace ir a' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2390:1: 'hace ir a'
            {
             before(grammarAccess.getIrAAccess().getHaceIrAKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__IrA__Group__2__Impl4770); 
             after(grammarAccess.getIrAAccess().getHaceIrAKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__2__Impl"


    // $ANTLR start "rule__IrA__Group__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2403:1: rule__IrA__Group__3 : rule__IrA__Group__3__Impl rule__IrA__Group__4 ;
    public final void rule__IrA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2407:1: ( rule__IrA__Group__3__Impl rule__IrA__Group__4 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2408:2: rule__IrA__Group__3__Impl rule__IrA__Group__4
            {
            pushFollow(FOLLOW_rule__IrA__Group__3__Impl_in_rule__IrA__Group__34801);
            rule__IrA__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IrA__Group__4_in_rule__IrA__Group__34804);
            rule__IrA__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__3"


    // $ANTLR start "rule__IrA__Group__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2415:1: rule__IrA__Group__3__Impl : ( ( rule__IrA__HabitacionAssignment_3 ) ) ;
    public final void rule__IrA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2419:1: ( ( ( rule__IrA__HabitacionAssignment_3 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2420:1: ( ( rule__IrA__HabitacionAssignment_3 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2420:1: ( ( rule__IrA__HabitacionAssignment_3 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2421:1: ( rule__IrA__HabitacionAssignment_3 )
            {
             before(grammarAccess.getIrAAccess().getHabitacionAssignment_3()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2422:1: ( rule__IrA__HabitacionAssignment_3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2422:2: rule__IrA__HabitacionAssignment_3
            {
            pushFollow(FOLLOW_rule__IrA__HabitacionAssignment_3_in_rule__IrA__Group__3__Impl4831);
            rule__IrA__HabitacionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIrAAccess().getHabitacionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__3__Impl"


    // $ANTLR start "rule__IrA__Group__4"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2432:1: rule__IrA__Group__4 : rule__IrA__Group__4__Impl ;
    public final void rule__IrA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2436:1: ( rule__IrA__Group__4__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2437:2: rule__IrA__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__IrA__Group__4__Impl_in_rule__IrA__Group__44861);
            rule__IrA__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__4"


    // $ANTLR start "rule__IrA__Group__4__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2443:1: rule__IrA__Group__4__Impl : ( ( rule__IrA__Group_4__0 )? ) ;
    public final void rule__IrA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2447:1: ( ( ( rule__IrA__Group_4__0 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2448:1: ( ( rule__IrA__Group_4__0 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2448:1: ( ( rule__IrA__Group_4__0 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2449:1: ( rule__IrA__Group_4__0 )?
            {
             before(grammarAccess.getIrAAccess().getGroup_4()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2450:1: ( rule__IrA__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2450:2: rule__IrA__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IrA__Group_4__0_in_rule__IrA__Group__4__Impl4888);
                    rule__IrA__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIrAAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group__4__Impl"


    // $ANTLR start "rule__IrA__Group_4__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2470:1: rule__IrA__Group_4__0 : rule__IrA__Group_4__0__Impl rule__IrA__Group_4__1 ;
    public final void rule__IrA__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2474:1: ( rule__IrA__Group_4__0__Impl rule__IrA__Group_4__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2475:2: rule__IrA__Group_4__0__Impl rule__IrA__Group_4__1
            {
            pushFollow(FOLLOW_rule__IrA__Group_4__0__Impl_in_rule__IrA__Group_4__04929);
            rule__IrA__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IrA__Group_4__1_in_rule__IrA__Group_4__04932);
            rule__IrA__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__0"


    // $ANTLR start "rule__IrA__Group_4__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2482:1: rule__IrA__Group_4__0__Impl : ( 'cuando' ) ;
    public final void rule__IrA__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2486:1: ( ( 'cuando' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2487:1: ( 'cuando' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2487:1: ( 'cuando' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2488:1: 'cuando'
            {
             before(grammarAccess.getIrAAccess().getCuandoKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__IrA__Group_4__0__Impl4960); 
             after(grammarAccess.getIrAAccess().getCuandoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__0__Impl"


    // $ANTLR start "rule__IrA__Group_4__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2501:1: rule__IrA__Group_4__1 : rule__IrA__Group_4__1__Impl rule__IrA__Group_4__2 ;
    public final void rule__IrA__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2505:1: ( rule__IrA__Group_4__1__Impl rule__IrA__Group_4__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2506:2: rule__IrA__Group_4__1__Impl rule__IrA__Group_4__2
            {
            pushFollow(FOLLOW_rule__IrA__Group_4__1__Impl_in_rule__IrA__Group_4__14991);
            rule__IrA__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IrA__Group_4__2_in_rule__IrA__Group_4__14994);
            rule__IrA__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__1"


    // $ANTLR start "rule__IrA__Group_4__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2513:1: rule__IrA__Group_4__1__Impl : ( ( rule__IrA__VariableAssignment_4_1 ) ) ;
    public final void rule__IrA__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2517:1: ( ( ( rule__IrA__VariableAssignment_4_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2518:1: ( ( rule__IrA__VariableAssignment_4_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2518:1: ( ( rule__IrA__VariableAssignment_4_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2519:1: ( rule__IrA__VariableAssignment_4_1 )
            {
             before(grammarAccess.getIrAAccess().getVariableAssignment_4_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2520:1: ( rule__IrA__VariableAssignment_4_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2520:2: rule__IrA__VariableAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IrA__VariableAssignment_4_1_in_rule__IrA__Group_4__1__Impl5021);
            rule__IrA__VariableAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIrAAccess().getVariableAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__1__Impl"


    // $ANTLR start "rule__IrA__Group_4__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2530:1: rule__IrA__Group_4__2 : rule__IrA__Group_4__2__Impl rule__IrA__Group_4__3 ;
    public final void rule__IrA__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2534:1: ( rule__IrA__Group_4__2__Impl rule__IrA__Group_4__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2535:2: rule__IrA__Group_4__2__Impl rule__IrA__Group_4__3
            {
            pushFollow(FOLLOW_rule__IrA__Group_4__2__Impl_in_rule__IrA__Group_4__25051);
            rule__IrA__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IrA__Group_4__3_in_rule__IrA__Group_4__25054);
            rule__IrA__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__2"


    // $ANTLR start "rule__IrA__Group_4__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2542:1: rule__IrA__Group_4__2__Impl : ( 'es' ) ;
    public final void rule__IrA__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2546:1: ( ( 'es' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2547:1: ( 'es' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2547:1: ( 'es' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2548:1: 'es'
            {
             before(grammarAccess.getIrAAccess().getEsKeyword_4_2()); 
            match(input,35,FOLLOW_35_in_rule__IrA__Group_4__2__Impl5082); 
             after(grammarAccess.getIrAAccess().getEsKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__2__Impl"


    // $ANTLR start "rule__IrA__Group_4__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2561:1: rule__IrA__Group_4__3 : rule__IrA__Group_4__3__Impl ;
    public final void rule__IrA__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2565:1: ( rule__IrA__Group_4__3__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2566:2: rule__IrA__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__IrA__Group_4__3__Impl_in_rule__IrA__Group_4__35113);
            rule__IrA__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__3"


    // $ANTLR start "rule__IrA__Group_4__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2572:1: rule__IrA__Group_4__3__Impl : ( ( rule__IrA__ValorAssignment_4_3 ) ) ;
    public final void rule__IrA__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2576:1: ( ( ( rule__IrA__ValorAssignment_4_3 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2577:1: ( ( rule__IrA__ValorAssignment_4_3 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2577:1: ( ( rule__IrA__ValorAssignment_4_3 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2578:1: ( rule__IrA__ValorAssignment_4_3 )
            {
             before(grammarAccess.getIrAAccess().getValorAssignment_4_3()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2579:1: ( rule__IrA__ValorAssignment_4_3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2579:2: rule__IrA__ValorAssignment_4_3
            {
            pushFollow(FOLLOW_rule__IrA__ValorAssignment_4_3_in_rule__IrA__Group_4__3__Impl5140);
            rule__IrA__ValorAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getIrAAccess().getValorAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__Group_4__3__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2597:1: rule__CambiarEstado__Group__0 : rule__CambiarEstado__Group__0__Impl rule__CambiarEstado__Group__1 ;
    public final void rule__CambiarEstado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2601:1: ( rule__CambiarEstado__Group__0__Impl rule__CambiarEstado__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2602:2: rule__CambiarEstado__Group__0__Impl rule__CambiarEstado__Group__1
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__0__Impl_in_rule__CambiarEstado__Group__05178);
            rule__CambiarEstado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__1_in_rule__CambiarEstado__Group__05181);
            rule__CambiarEstado__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__0"


    // $ANTLR start "rule__CambiarEstado__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2609:1: rule__CambiarEstado__Group__0__Impl : ( 'accion' ) ;
    public final void rule__CambiarEstado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2613:1: ( ( 'accion' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2614:1: ( 'accion' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2614:1: ( 'accion' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2615:1: 'accion'
            {
             before(grammarAccess.getCambiarEstadoAccess().getAccionKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__CambiarEstado__Group__0__Impl5209); 
             after(grammarAccess.getCambiarEstadoAccess().getAccionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__0__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2628:1: rule__CambiarEstado__Group__1 : rule__CambiarEstado__Group__1__Impl rule__CambiarEstado__Group__2 ;
    public final void rule__CambiarEstado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2632:1: ( rule__CambiarEstado__Group__1__Impl rule__CambiarEstado__Group__2 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2633:2: rule__CambiarEstado__Group__1__Impl rule__CambiarEstado__Group__2
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__1__Impl_in_rule__CambiarEstado__Group__15240);
            rule__CambiarEstado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__2_in_rule__CambiarEstado__Group__15243);
            rule__CambiarEstado__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__1"


    // $ANTLR start "rule__CambiarEstado__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2640:1: rule__CambiarEstado__Group__1__Impl : ( ( rule__CambiarEstado__NameAssignment_1 ) ) ;
    public final void rule__CambiarEstado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2644:1: ( ( ( rule__CambiarEstado__NameAssignment_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2645:1: ( ( rule__CambiarEstado__NameAssignment_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2645:1: ( ( rule__CambiarEstado__NameAssignment_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2646:1: ( rule__CambiarEstado__NameAssignment_1 )
            {
             before(grammarAccess.getCambiarEstadoAccess().getNameAssignment_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2647:1: ( rule__CambiarEstado__NameAssignment_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2647:2: rule__CambiarEstado__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CambiarEstado__NameAssignment_1_in_rule__CambiarEstado__Group__1__Impl5270);
            rule__CambiarEstado__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCambiarEstadoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__1__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2657:1: rule__CambiarEstado__Group__2 : rule__CambiarEstado__Group__2__Impl rule__CambiarEstado__Group__3 ;
    public final void rule__CambiarEstado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2661:1: ( rule__CambiarEstado__Group__2__Impl rule__CambiarEstado__Group__3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2662:2: rule__CambiarEstado__Group__2__Impl rule__CambiarEstado__Group__3
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__2__Impl_in_rule__CambiarEstado__Group__25300);
            rule__CambiarEstado__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__3_in_rule__CambiarEstado__Group__25303);
            rule__CambiarEstado__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__2"


    // $ANTLR start "rule__CambiarEstado__Group__2__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2669:1: rule__CambiarEstado__Group__2__Impl : ( 'hace cambiar el' ) ;
    public final void rule__CambiarEstado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2673:1: ( ( 'hace cambiar el' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2674:1: ( 'hace cambiar el' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2674:1: ( 'hace cambiar el' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2675:1: 'hace cambiar el'
            {
             before(grammarAccess.getCambiarEstadoAccess().getHaceCambiarElKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__CambiarEstado__Group__2__Impl5331); 
             after(grammarAccess.getCambiarEstadoAccess().getHaceCambiarElKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__2__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2688:1: rule__CambiarEstado__Group__3 : rule__CambiarEstado__Group__3__Impl rule__CambiarEstado__Group__4 ;
    public final void rule__CambiarEstado__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2692:1: ( rule__CambiarEstado__Group__3__Impl rule__CambiarEstado__Group__4 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2693:2: rule__CambiarEstado__Group__3__Impl rule__CambiarEstado__Group__4
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__3__Impl_in_rule__CambiarEstado__Group__35362);
            rule__CambiarEstado__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__4_in_rule__CambiarEstado__Group__35365);
            rule__CambiarEstado__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__3"


    // $ANTLR start "rule__CambiarEstado__Group__3__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2700:1: rule__CambiarEstado__Group__3__Impl : ( ( rule__CambiarEstado__VariableACambiarAssignment_3 ) ) ;
    public final void rule__CambiarEstado__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2704:1: ( ( ( rule__CambiarEstado__VariableACambiarAssignment_3 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2705:1: ( ( rule__CambiarEstado__VariableACambiarAssignment_3 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2705:1: ( ( rule__CambiarEstado__VariableACambiarAssignment_3 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2706:1: ( rule__CambiarEstado__VariableACambiarAssignment_3 )
            {
             before(grammarAccess.getCambiarEstadoAccess().getVariableACambiarAssignment_3()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2707:1: ( rule__CambiarEstado__VariableACambiarAssignment_3 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2707:2: rule__CambiarEstado__VariableACambiarAssignment_3
            {
            pushFollow(FOLLOW_rule__CambiarEstado__VariableACambiarAssignment_3_in_rule__CambiarEstado__Group__3__Impl5392);
            rule__CambiarEstado__VariableACambiarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCambiarEstadoAccess().getVariableACambiarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__3__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__4"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2717:1: rule__CambiarEstado__Group__4 : rule__CambiarEstado__Group__4__Impl rule__CambiarEstado__Group__5 ;
    public final void rule__CambiarEstado__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2721:1: ( rule__CambiarEstado__Group__4__Impl rule__CambiarEstado__Group__5 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2722:2: rule__CambiarEstado__Group__4__Impl rule__CambiarEstado__Group__5
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__4__Impl_in_rule__CambiarEstado__Group__45422);
            rule__CambiarEstado__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__5_in_rule__CambiarEstado__Group__45425);
            rule__CambiarEstado__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__4"


    // $ANTLR start "rule__CambiarEstado__Group__4__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2729:1: rule__CambiarEstado__Group__4__Impl : ( 'al valor' ) ;
    public final void rule__CambiarEstado__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2733:1: ( ( 'al valor' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2734:1: ( 'al valor' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2734:1: ( 'al valor' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2735:1: 'al valor'
            {
             before(grammarAccess.getCambiarEstadoAccess().getAlValorKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__CambiarEstado__Group__4__Impl5453); 
             after(grammarAccess.getCambiarEstadoAccess().getAlValorKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__4__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__5"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2748:1: rule__CambiarEstado__Group__5 : rule__CambiarEstado__Group__5__Impl rule__CambiarEstado__Group__6 ;
    public final void rule__CambiarEstado__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2752:1: ( rule__CambiarEstado__Group__5__Impl rule__CambiarEstado__Group__6 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2753:2: rule__CambiarEstado__Group__5__Impl rule__CambiarEstado__Group__6
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__5__Impl_in_rule__CambiarEstado__Group__55484);
            rule__CambiarEstado__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__6_in_rule__CambiarEstado__Group__55487);
            rule__CambiarEstado__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__5"


    // $ANTLR start "rule__CambiarEstado__Group__5__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2760:1: rule__CambiarEstado__Group__5__Impl : ( ( rule__CambiarEstado__ValorNuevoAssignment_5 ) ) ;
    public final void rule__CambiarEstado__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2764:1: ( ( ( rule__CambiarEstado__ValorNuevoAssignment_5 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2765:1: ( ( rule__CambiarEstado__ValorNuevoAssignment_5 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2765:1: ( ( rule__CambiarEstado__ValorNuevoAssignment_5 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2766:1: ( rule__CambiarEstado__ValorNuevoAssignment_5 )
            {
             before(grammarAccess.getCambiarEstadoAccess().getValorNuevoAssignment_5()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2767:1: ( rule__CambiarEstado__ValorNuevoAssignment_5 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2767:2: rule__CambiarEstado__ValorNuevoAssignment_5
            {
            pushFollow(FOLLOW_rule__CambiarEstado__ValorNuevoAssignment_5_in_rule__CambiarEstado__Group__5__Impl5514);
            rule__CambiarEstado__ValorNuevoAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCambiarEstadoAccess().getValorNuevoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__5__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__6"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2777:1: rule__CambiarEstado__Group__6 : rule__CambiarEstado__Group__6__Impl rule__CambiarEstado__Group__7 ;
    public final void rule__CambiarEstado__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2781:1: ( rule__CambiarEstado__Group__6__Impl rule__CambiarEstado__Group__7 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2782:2: rule__CambiarEstado__Group__6__Impl rule__CambiarEstado__Group__7
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__6__Impl_in_rule__CambiarEstado__Group__65544);
            rule__CambiarEstado__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__7_in_rule__CambiarEstado__Group__65547);
            rule__CambiarEstado__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__6"


    // $ANTLR start "rule__CambiarEstado__Group__6__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2789:1: rule__CambiarEstado__Group__6__Impl : ( 'cuando' ) ;
    public final void rule__CambiarEstado__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2793:1: ( ( 'cuando' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2794:1: ( 'cuando' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2794:1: ( 'cuando' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2795:1: 'cuando'
            {
             before(grammarAccess.getCambiarEstadoAccess().getCuandoKeyword_6()); 
            match(input,34,FOLLOW_34_in_rule__CambiarEstado__Group__6__Impl5575); 
             after(grammarAccess.getCambiarEstadoAccess().getCuandoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__6__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__7"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2808:1: rule__CambiarEstado__Group__7 : rule__CambiarEstado__Group__7__Impl rule__CambiarEstado__Group__8 ;
    public final void rule__CambiarEstado__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2812:1: ( rule__CambiarEstado__Group__7__Impl rule__CambiarEstado__Group__8 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2813:2: rule__CambiarEstado__Group__7__Impl rule__CambiarEstado__Group__8
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__7__Impl_in_rule__CambiarEstado__Group__75606);
            rule__CambiarEstado__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__8_in_rule__CambiarEstado__Group__75609);
            rule__CambiarEstado__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__7"


    // $ANTLR start "rule__CambiarEstado__Group__7__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2820:1: rule__CambiarEstado__Group__7__Impl : ( ( rule__CambiarEstado__VariableCondicionAssignment_7 ) ) ;
    public final void rule__CambiarEstado__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2824:1: ( ( ( rule__CambiarEstado__VariableCondicionAssignment_7 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2825:1: ( ( rule__CambiarEstado__VariableCondicionAssignment_7 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2825:1: ( ( rule__CambiarEstado__VariableCondicionAssignment_7 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2826:1: ( rule__CambiarEstado__VariableCondicionAssignment_7 )
            {
             before(grammarAccess.getCambiarEstadoAccess().getVariableCondicionAssignment_7()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2827:1: ( rule__CambiarEstado__VariableCondicionAssignment_7 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2827:2: rule__CambiarEstado__VariableCondicionAssignment_7
            {
            pushFollow(FOLLOW_rule__CambiarEstado__VariableCondicionAssignment_7_in_rule__CambiarEstado__Group__7__Impl5636);
            rule__CambiarEstado__VariableCondicionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCambiarEstadoAccess().getVariableCondicionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__7__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__8"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2837:1: rule__CambiarEstado__Group__8 : rule__CambiarEstado__Group__8__Impl rule__CambiarEstado__Group__9 ;
    public final void rule__CambiarEstado__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2841:1: ( rule__CambiarEstado__Group__8__Impl rule__CambiarEstado__Group__9 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2842:2: rule__CambiarEstado__Group__8__Impl rule__CambiarEstado__Group__9
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__8__Impl_in_rule__CambiarEstado__Group__85666);
            rule__CambiarEstado__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CambiarEstado__Group__9_in_rule__CambiarEstado__Group__85669);
            rule__CambiarEstado__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__8"


    // $ANTLR start "rule__CambiarEstado__Group__8__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2849:1: rule__CambiarEstado__Group__8__Impl : ( 'es' ) ;
    public final void rule__CambiarEstado__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2853:1: ( ( 'es' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2854:1: ( 'es' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2854:1: ( 'es' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2855:1: 'es'
            {
             before(grammarAccess.getCambiarEstadoAccess().getEsKeyword_8()); 
            match(input,35,FOLLOW_35_in_rule__CambiarEstado__Group__8__Impl5697); 
             after(grammarAccess.getCambiarEstadoAccess().getEsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__8__Impl"


    // $ANTLR start "rule__CambiarEstado__Group__9"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2868:1: rule__CambiarEstado__Group__9 : rule__CambiarEstado__Group__9__Impl ;
    public final void rule__CambiarEstado__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2872:1: ( rule__CambiarEstado__Group__9__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2873:2: rule__CambiarEstado__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__CambiarEstado__Group__9__Impl_in_rule__CambiarEstado__Group__95728);
            rule__CambiarEstado__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__9"


    // $ANTLR start "rule__CambiarEstado__Group__9__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2879:1: rule__CambiarEstado__Group__9__Impl : ( ( rule__CambiarEstado__ValorCondicionalAssignment_9 ) ) ;
    public final void rule__CambiarEstado__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2883:1: ( ( ( rule__CambiarEstado__ValorCondicionalAssignment_9 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2884:1: ( ( rule__CambiarEstado__ValorCondicionalAssignment_9 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2884:1: ( ( rule__CambiarEstado__ValorCondicionalAssignment_9 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2885:1: ( rule__CambiarEstado__ValorCondicionalAssignment_9 )
            {
             before(grammarAccess.getCambiarEstadoAccess().getValorCondicionalAssignment_9()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2886:1: ( rule__CambiarEstado__ValorCondicionalAssignment_9 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2886:2: rule__CambiarEstado__ValorCondicionalAssignment_9
            {
            pushFollow(FOLLOW_rule__CambiarEstado__ValorCondicionalAssignment_9_in_rule__CambiarEstado__Group__9__Impl5755);
            rule__CambiarEstado__ValorCondicionalAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCambiarEstadoAccess().getValorCondicionalAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__Group__9__Impl"


    // $ANTLR start "rule__EstadoDeObjeto__Group__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2916:1: rule__EstadoDeObjeto__Group__0 : rule__EstadoDeObjeto__Group__0__Impl rule__EstadoDeObjeto__Group__1 ;
    public final void rule__EstadoDeObjeto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2920:1: ( rule__EstadoDeObjeto__Group__0__Impl rule__EstadoDeObjeto__Group__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2921:2: rule__EstadoDeObjeto__Group__0__Impl rule__EstadoDeObjeto__Group__1
            {
            pushFollow(FOLLOW_rule__EstadoDeObjeto__Group__0__Impl_in_rule__EstadoDeObjeto__Group__05805);
            rule__EstadoDeObjeto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EstadoDeObjeto__Group__1_in_rule__EstadoDeObjeto__Group__05808);
            rule__EstadoDeObjeto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group__0"


    // $ANTLR start "rule__EstadoDeObjeto__Group__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2928:1: rule__EstadoDeObjeto__Group__0__Impl : ( ( rule__EstadoDeObjeto__NameAssignment_0 ) ) ;
    public final void rule__EstadoDeObjeto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2932:1: ( ( ( rule__EstadoDeObjeto__NameAssignment_0 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2933:1: ( ( rule__EstadoDeObjeto__NameAssignment_0 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2933:1: ( ( rule__EstadoDeObjeto__NameAssignment_0 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2934:1: ( rule__EstadoDeObjeto__NameAssignment_0 )
            {
             before(grammarAccess.getEstadoDeObjetoAccess().getNameAssignment_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2935:1: ( rule__EstadoDeObjeto__NameAssignment_0 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2935:2: rule__EstadoDeObjeto__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EstadoDeObjeto__NameAssignment_0_in_rule__EstadoDeObjeto__Group__0__Impl5835);
            rule__EstadoDeObjeto__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEstadoDeObjetoAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group__0__Impl"


    // $ANTLR start "rule__EstadoDeObjeto__Group__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2945:1: rule__EstadoDeObjeto__Group__1 : rule__EstadoDeObjeto__Group__1__Impl ;
    public final void rule__EstadoDeObjeto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2949:1: ( rule__EstadoDeObjeto__Group__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2950:2: rule__EstadoDeObjeto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EstadoDeObjeto__Group__1__Impl_in_rule__EstadoDeObjeto__Group__15865);
            rule__EstadoDeObjeto__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group__1"


    // $ANTLR start "rule__EstadoDeObjeto__Group__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2956:1: rule__EstadoDeObjeto__Group__1__Impl : ( ( rule__EstadoDeObjeto__Group_1__0 )? ) ;
    public final void rule__EstadoDeObjeto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2960:1: ( ( ( rule__EstadoDeObjeto__Group_1__0 )? ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2961:1: ( ( rule__EstadoDeObjeto__Group_1__0 )? )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2961:1: ( ( rule__EstadoDeObjeto__Group_1__0 )? )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2962:1: ( rule__EstadoDeObjeto__Group_1__0 )?
            {
             before(grammarAccess.getEstadoDeObjetoAccess().getGroup_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2963:1: ( rule__EstadoDeObjeto__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2963:2: rule__EstadoDeObjeto__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EstadoDeObjeto__Group_1__0_in_rule__EstadoDeObjeto__Group__1__Impl5892);
                    rule__EstadoDeObjeto__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEstadoDeObjetoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group__1__Impl"


    // $ANTLR start "rule__EstadoDeObjeto__Group_1__0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2977:1: rule__EstadoDeObjeto__Group_1__0 : rule__EstadoDeObjeto__Group_1__0__Impl rule__EstadoDeObjeto__Group_1__1 ;
    public final void rule__EstadoDeObjeto__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2981:1: ( rule__EstadoDeObjeto__Group_1__0__Impl rule__EstadoDeObjeto__Group_1__1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2982:2: rule__EstadoDeObjeto__Group_1__0__Impl rule__EstadoDeObjeto__Group_1__1
            {
            pushFollow(FOLLOW_rule__EstadoDeObjeto__Group_1__0__Impl_in_rule__EstadoDeObjeto__Group_1__05927);
            rule__EstadoDeObjeto__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EstadoDeObjeto__Group_1__1_in_rule__EstadoDeObjeto__Group_1__05930);
            rule__EstadoDeObjeto__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group_1__0"


    // $ANTLR start "rule__EstadoDeObjeto__Group_1__0__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2989:1: rule__EstadoDeObjeto__Group_1__0__Impl : ( 'con valor' ) ;
    public final void rule__EstadoDeObjeto__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2993:1: ( ( 'con valor' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2994:1: ( 'con valor' )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2994:1: ( 'con valor' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:2995:1: 'con valor'
            {
             before(grammarAccess.getEstadoDeObjetoAccess().getConValorKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__EstadoDeObjeto__Group_1__0__Impl5958); 
             after(grammarAccess.getEstadoDeObjetoAccess().getConValorKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group_1__0__Impl"


    // $ANTLR start "rule__EstadoDeObjeto__Group_1__1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3008:1: rule__EstadoDeObjeto__Group_1__1 : rule__EstadoDeObjeto__Group_1__1__Impl ;
    public final void rule__EstadoDeObjeto__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3012:1: ( rule__EstadoDeObjeto__Group_1__1__Impl )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3013:2: rule__EstadoDeObjeto__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EstadoDeObjeto__Group_1__1__Impl_in_rule__EstadoDeObjeto__Group_1__15989);
            rule__EstadoDeObjeto__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group_1__1"


    // $ANTLR start "rule__EstadoDeObjeto__Group_1__1__Impl"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3019:1: rule__EstadoDeObjeto__Group_1__1__Impl : ( ( rule__EstadoDeObjeto__ValorAssignment_1_1 ) ) ;
    public final void rule__EstadoDeObjeto__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3023:1: ( ( ( rule__EstadoDeObjeto__ValorAssignment_1_1 ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3024:1: ( ( rule__EstadoDeObjeto__ValorAssignment_1_1 ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3024:1: ( ( rule__EstadoDeObjeto__ValorAssignment_1_1 ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3025:1: ( rule__EstadoDeObjeto__ValorAssignment_1_1 )
            {
             before(grammarAccess.getEstadoDeObjetoAccess().getValorAssignment_1_1()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3026:1: ( rule__EstadoDeObjeto__ValorAssignment_1_1 )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3026:2: rule__EstadoDeObjeto__ValorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EstadoDeObjeto__ValorAssignment_1_1_in_rule__EstadoDeObjeto__Group_1__1__Impl6016);
            rule__EstadoDeObjeto__ValorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEstadoDeObjetoAccess().getValorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__Group_1__1__Impl"


    // $ANTLR start "rule__Juego__ObjetosAssignment_0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3041:1: rule__Juego__ObjetosAssignment_0 : ( ruleObjeto ) ;
    public final void rule__Juego__ObjetosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3045:1: ( ( ruleObjeto ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3046:1: ( ruleObjeto )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3046:1: ( ruleObjeto )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3047:1: ruleObjeto
            {
             before(grammarAccess.getJuegoAccess().getObjetosObjetoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObjeto_in_rule__Juego__ObjetosAssignment_06055);
            ruleObjeto();

            state._fsp--;

             after(grammarAccess.getJuegoAccess().getObjetosObjetoParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__ObjetosAssignment_0"


    // $ANTLR start "rule__Juego__PosicionAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3056:1: rule__Juego__PosicionAssignment_1 : ( rulePosicion ) ;
    public final void rule__Juego__PosicionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3060:1: ( ( rulePosicion ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3061:1: ( rulePosicion )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3061:1: ( rulePosicion )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3062:1: rulePosicion
            {
             before(grammarAccess.getJuegoAccess().getPosicionPosicionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePosicion_in_rule__Juego__PosicionAssignment_16086);
            rulePosicion();

            state._fsp--;

             after(grammarAccess.getJuegoAccess().getPosicionPosicionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__PosicionAssignment_1"


    // $ANTLR start "rule__Juego__HabitacionesAssignment_2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3071:1: rule__Juego__HabitacionesAssignment_2 : ( ruleHabitacion ) ;
    public final void rule__Juego__HabitacionesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3075:1: ( ( ruleHabitacion ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3076:1: ( ruleHabitacion )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3076:1: ( ruleHabitacion )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3077:1: ruleHabitacion
            {
             before(grammarAccess.getJuegoAccess().getHabitacionesHabitacionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHabitacion_in_rule__Juego__HabitacionesAssignment_26117);
            ruleHabitacion();

            state._fsp--;

             after(grammarAccess.getJuegoAccess().getHabitacionesHabitacionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__HabitacionesAssignment_2"


    // $ANTLR start "rule__Juego__ComandosAssignment_3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3086:1: rule__Juego__ComandosAssignment_3 : ( ruleComando ) ;
    public final void rule__Juego__ComandosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3090:1: ( ( ruleComando ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3091:1: ( ruleComando )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3091:1: ( ruleComando )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3092:1: ruleComando
            {
             before(grammarAccess.getJuegoAccess().getComandosComandoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComando_in_rule__Juego__ComandosAssignment_36148);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getJuegoAccess().getComandosComandoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Juego__ComandosAssignment_3"


    // $ANTLR start "rule__Objeto__RecogibleAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3101:1: rule__Objeto__RecogibleAssignment_1 : ( ( 'recogible' ) ) ;
    public final void rule__Objeto__RecogibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3105:1: ( ( ( 'recogible' ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3106:1: ( ( 'recogible' ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3106:1: ( ( 'recogible' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3107:1: ( 'recogible' )
            {
             before(grammarAccess.getObjetoAccess().getRecogibleRecogibleKeyword_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3108:1: ( 'recogible' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3109:1: 'recogible'
            {
             before(grammarAccess.getObjetoAccess().getRecogibleRecogibleKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Objeto__RecogibleAssignment_16184); 
             after(grammarAccess.getObjetoAccess().getRecogibleRecogibleKeyword_1_0()); 

            }

             after(grammarAccess.getObjetoAccess().getRecogibleRecogibleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__RecogibleAssignment_1"


    // $ANTLR start "rule__Objeto__NameAssignment_2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3124:1: rule__Objeto__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Objeto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3128:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3129:1: ( RULE_ID )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3129:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3130:1: RULE_ID
            {
             before(grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_26223); 
             after(grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__NameAssignment_2"


    // $ANTLR start "rule__Objeto__DescripcionAssignment_3_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3139:1: rule__Objeto__DescripcionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Objeto__DescripcionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3143:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3144:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3144:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3145:1: RULE_STRING
            {
             before(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_3_16254); 
             after(grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__DescripcionAssignment_3_1"


    // $ANTLR start "rule__Objeto__EstadoAssignment_4_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3154:1: rule__Objeto__EstadoAssignment_4_1 : ( ruleEstadoDeObjeto ) ;
    public final void rule__Objeto__EstadoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3158:1: ( ( ruleEstadoDeObjeto ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3159:1: ( ruleEstadoDeObjeto )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3159:1: ( ruleEstadoDeObjeto )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3160:1: ruleEstadoDeObjeto
            {
             before(grammarAccess.getObjetoAccess().getEstadoEstadoDeObjetoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEstadoDeObjeto_in_rule__Objeto__EstadoAssignment_4_16285);
            ruleEstadoDeObjeto();

            state._fsp--;

             after(grammarAccess.getObjetoAccess().getEstadoEstadoDeObjetoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__EstadoAssignment_4_1"


    // $ANTLR start "rule__Objeto__AccionesAssignment_5"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3169:1: rule__Objeto__AccionesAssignment_5 : ( ruleAccion ) ;
    public final void rule__Objeto__AccionesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3173:1: ( ( ruleAccion ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3174:1: ( ruleAccion )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3174:1: ( ruleAccion )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3175:1: ruleAccion
            {
             before(grammarAccess.getObjetoAccess().getAccionesAccionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAccion_in_rule__Objeto__AccionesAssignment_56316);
            ruleAccion();

            state._fsp--;

             after(grammarAccess.getObjetoAccess().getAccionesAccionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objeto__AccionesAssignment_5"


    // $ANTLR start "rule__Habitacion__FinalAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3184:1: rule__Habitacion__FinalAssignment_1 : ( ( 'final' ) ) ;
    public final void rule__Habitacion__FinalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3188:1: ( ( ( 'final' ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3189:1: ( ( 'final' ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3189:1: ( ( 'final' ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3190:1: ( 'final' )
            {
             before(grammarAccess.getHabitacionAccess().getFinalFinalKeyword_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3191:1: ( 'final' )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3192:1: 'final'
            {
             before(grammarAccess.getHabitacionAccess().getFinalFinalKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Habitacion__FinalAssignment_16352); 
             after(grammarAccess.getHabitacionAccess().getFinalFinalKeyword_1_0()); 

            }

             after(grammarAccess.getHabitacionAccess().getFinalFinalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__FinalAssignment_1"


    // $ANTLR start "rule__Habitacion__NameAssignment_2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3207:1: rule__Habitacion__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Habitacion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3211:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3212:1: ( RULE_ID )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3212:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3213:1: RULE_ID
            {
             before(grammarAccess.getHabitacionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Habitacion__NameAssignment_26391); 
             after(grammarAccess.getHabitacionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__NameAssignment_2"


    // $ANTLR start "rule__Habitacion__DescripcionAssignment_6"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3222:1: rule__Habitacion__DescripcionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Habitacion__DescripcionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3226:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3227:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3227:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3228:1: RULE_STRING
            {
             before(grammarAccess.getHabitacionAccess().getDescripcionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Habitacion__DescripcionAssignment_66422); 
             after(grammarAccess.getHabitacionAccess().getDescripcionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__DescripcionAssignment_6"


    // $ANTLR start "rule__Habitacion__EstadoACambiarAssignment_7_2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3237:1: rule__Habitacion__EstadoACambiarAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__Habitacion__EstadoACambiarAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3241:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3242:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3242:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3243:1: RULE_STRING
            {
             before(grammarAccess.getHabitacionAccess().getEstadoACambiarSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Habitacion__EstadoACambiarAssignment_7_26453); 
             after(grammarAccess.getHabitacionAccess().getEstadoACambiarSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__EstadoACambiarAssignment_7_2"


    // $ANTLR start "rule__Habitacion__ObjetoACambiarAssignment_7_4"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3252:1: rule__Habitacion__ObjetoACambiarAssignment_7_4 : ( ( RULE_ID ) ) ;
    public final void rule__Habitacion__ObjetoACambiarAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3256:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3257:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3257:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3258:1: ( RULE_ID )
            {
             before(grammarAccess.getHabitacionAccess().getObjetoACambiarObjetoCrossReference_7_4_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3259:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3260:1: RULE_ID
            {
             before(grammarAccess.getHabitacionAccess().getObjetoACambiarObjetoIDTerminalRuleCall_7_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Habitacion__ObjetoACambiarAssignment_7_46488); 
             after(grammarAccess.getHabitacionAccess().getObjetoACambiarObjetoIDTerminalRuleCall_7_4_0_1()); 

            }

             after(grammarAccess.getHabitacionAccess().getObjetoACambiarObjetoCrossReference_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__ObjetoACambiarAssignment_7_4"


    // $ANTLR start "rule__Habitacion__ValorNuevoAssignment_7_6"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3271:1: rule__Habitacion__ValorNuevoAssignment_7_6 : ( RULE_STRING ) ;
    public final void rule__Habitacion__ValorNuevoAssignment_7_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3275:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3276:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3276:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3277:1: RULE_STRING
            {
             before(grammarAccess.getHabitacionAccess().getValorNuevoSTRINGTerminalRuleCall_7_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Habitacion__ValorNuevoAssignment_7_66523); 
             after(grammarAccess.getHabitacionAccess().getValorNuevoSTRINGTerminalRuleCall_7_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__ValorNuevoAssignment_7_6"


    // $ANTLR start "rule__Habitacion__ObjetosAssignment_8_1_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3286:1: rule__Habitacion__ObjetosAssignment_8_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Habitacion__ObjetosAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3290:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3291:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3291:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3292:1: ( RULE_ID )
            {
             before(grammarAccess.getHabitacionAccess().getObjetosObjetoCrossReference_8_1_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3293:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3294:1: RULE_ID
            {
             before(grammarAccess.getHabitacionAccess().getObjetosObjetoIDTerminalRuleCall_8_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Habitacion__ObjetosAssignment_8_1_16558); 
             after(grammarAccess.getHabitacionAccess().getObjetosObjetoIDTerminalRuleCall_8_1_1_0_1()); 

            }

             after(grammarAccess.getHabitacionAccess().getObjetosObjetoCrossReference_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Habitacion__ObjetosAssignment_8_1_1"


    // $ANTLR start "rule__Posicion__HabitacionAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3305:1: rule__Posicion__HabitacionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Posicion__HabitacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3309:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3310:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3310:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3311:1: ( RULE_ID )
            {
             before(grammarAccess.getPosicionAccess().getHabitacionHabitacionCrossReference_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3312:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3313:1: RULE_ID
            {
             before(grammarAccess.getPosicionAccess().getHabitacionHabitacionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Posicion__HabitacionAssignment_16597); 
             after(grammarAccess.getPosicionAccess().getHabitacionHabitacionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPosicionAccess().getHabitacionHabitacionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Posicion__HabitacionAssignment_1"


    // $ANTLR start "rule__DescribirObjeto__ObjetoAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3324:1: rule__DescribirObjeto__ObjetoAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DescribirObjeto__ObjetoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3328:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3329:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3329:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3330:1: ( RULE_ID )
            {
             before(grammarAccess.getDescribirObjetoAccess().getObjetoObjetoCrossReference_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3331:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3332:1: RULE_ID
            {
             before(grammarAccess.getDescribirObjetoAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DescribirObjeto__ObjetoAssignment_16636); 
             after(grammarAccess.getDescribirObjetoAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDescribirObjetoAccess().getObjetoObjetoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescribirObjeto__ObjetoAssignment_1"


    // $ANTLR start "rule__RecogerObjeto__ObjetoAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3343:1: rule__RecogerObjeto__ObjetoAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RecogerObjeto__ObjetoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3347:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3348:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3348:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3349:1: ( RULE_ID )
            {
             before(grammarAccess.getRecogerObjetoAccess().getObjetoObjetoCrossReference_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3350:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3351:1: RULE_ID
            {
             before(grammarAccess.getRecogerObjetoAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecogerObjeto__ObjetoAssignment_16675); 
             after(grammarAccess.getRecogerObjetoAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRecogerObjetoAccess().getObjetoObjetoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecogerObjeto__ObjetoAssignment_1"


    // $ANTLR start "rule__Acciones__ObjetoAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3362:1: rule__Acciones__ObjetoAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Acciones__ObjetoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3366:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3367:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3367:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3368:1: ( RULE_ID )
            {
             before(grammarAccess.getAccionesAccess().getObjetoObjetoCrossReference_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3369:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3370:1: RULE_ID
            {
             before(grammarAccess.getAccionesAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Acciones__ObjetoAssignment_16714); 
             after(grammarAccess.getAccionesAccess().getObjetoObjetoIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAccionesAccess().getObjetoObjetoCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Acciones__ObjetoAssignment_1"


    // $ANTLR start "rule__EjecutarAccion__AccionAssignment_0_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3381:1: rule__EjecutarAccion__AccionAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__EjecutarAccion__AccionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3385:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3386:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3386:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3387:1: ( RULE_ID )
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionIrACrossReference_0_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3388:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3389:1: RULE_ID
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionIrAIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EjecutarAccion__AccionAssignment_0_16753); 
             after(grammarAccess.getEjecutarAccionAccess().getAccionIrAIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getEjecutarAccionAccess().getAccionIrACrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__AccionAssignment_0_1"


    // $ANTLR start "rule__EjecutarAccion__ObjetoAssignment_0_3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3400:1: rule__EjecutarAccion__ObjetoAssignment_0_3 : ( ( RULE_ID ) ) ;
    public final void rule__EjecutarAccion__ObjetoAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3404:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3405:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3405:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3406:1: ( RULE_ID )
            {
             before(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoCrossReference_0_3_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3407:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3408:1: RULE_ID
            {
             before(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoIDTerminalRuleCall_0_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EjecutarAccion__ObjetoAssignment_0_36792); 
             after(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoIDTerminalRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoCrossReference_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__ObjetoAssignment_0_3"


    // $ANTLR start "rule__EjecutarAccion__AccionAssignment_1_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3419:1: rule__EjecutarAccion__AccionAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__EjecutarAccion__AccionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3423:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3424:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3424:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3425:1: ( RULE_ID )
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionAccionCrossReference_1_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3426:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3427:1: RULE_ID
            {
             before(grammarAccess.getEjecutarAccionAccess().getAccionAccionIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EjecutarAccion__AccionAssignment_1_16831); 
             after(grammarAccess.getEjecutarAccionAccess().getAccionAccionIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getEjecutarAccionAccess().getAccionAccionCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__AccionAssignment_1_1"


    // $ANTLR start "rule__EjecutarAccion__ObjetoAssignment_1_2"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3438:1: rule__EjecutarAccion__ObjetoAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__EjecutarAccion__ObjetoAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3442:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3443:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3443:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3444:1: ( RULE_ID )
            {
             before(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoCrossReference_1_2_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3445:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3446:1: RULE_ID
            {
             before(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EjecutarAccion__ObjetoAssignment_1_26870); 
             after(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getEjecutarAccionAccess().getObjetoObjetoCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EjecutarAccion__ObjetoAssignment_1_2"


    // $ANTLR start "rule__IrA__NameAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3457:1: rule__IrA__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IrA__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3461:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3462:1: ( RULE_ID )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3462:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3463:1: RULE_ID
            {
             before(grammarAccess.getIrAAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IrA__NameAssignment_16905); 
             after(grammarAccess.getIrAAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__NameAssignment_1"


    // $ANTLR start "rule__IrA__HabitacionAssignment_3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3472:1: rule__IrA__HabitacionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__IrA__HabitacionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3476:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3477:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3477:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3478:1: ( RULE_ID )
            {
             before(grammarAccess.getIrAAccess().getHabitacionHabitacionCrossReference_3_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3479:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3480:1: RULE_ID
            {
             before(grammarAccess.getIrAAccess().getHabitacionHabitacionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IrA__HabitacionAssignment_36940); 
             after(grammarAccess.getIrAAccess().getHabitacionHabitacionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getIrAAccess().getHabitacionHabitacionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__HabitacionAssignment_3"


    // $ANTLR start "rule__IrA__VariableAssignment_4_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3491:1: rule__IrA__VariableAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__IrA__VariableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3495:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3496:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3496:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3497:1: ( RULE_ID )
            {
             before(grammarAccess.getIrAAccess().getVariableEstadoDeObjetoCrossReference_4_1_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3498:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3499:1: RULE_ID
            {
             before(grammarAccess.getIrAAccess().getVariableEstadoDeObjetoIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IrA__VariableAssignment_4_16979); 
             after(grammarAccess.getIrAAccess().getVariableEstadoDeObjetoIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getIrAAccess().getVariableEstadoDeObjetoCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__VariableAssignment_4_1"


    // $ANTLR start "rule__IrA__ValorAssignment_4_3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3510:1: rule__IrA__ValorAssignment_4_3 : ( RULE_STRING ) ;
    public final void rule__IrA__ValorAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3514:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3515:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3515:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3516:1: RULE_STRING
            {
             before(grammarAccess.getIrAAccess().getValorSTRINGTerminalRuleCall_4_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IrA__ValorAssignment_4_37014); 
             after(grammarAccess.getIrAAccess().getValorSTRINGTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IrA__ValorAssignment_4_3"


    // $ANTLR start "rule__CambiarEstado__NameAssignment_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3525:1: rule__CambiarEstado__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CambiarEstado__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3529:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3530:1: ( RULE_ID )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3530:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3531:1: RULE_ID
            {
             before(grammarAccess.getCambiarEstadoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CambiarEstado__NameAssignment_17045); 
             after(grammarAccess.getCambiarEstadoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__NameAssignment_1"


    // $ANTLR start "rule__CambiarEstado__VariableACambiarAssignment_3"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3540:1: rule__CambiarEstado__VariableACambiarAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CambiarEstado__VariableACambiarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3544:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3545:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3545:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3546:1: ( RULE_ID )
            {
             before(grammarAccess.getCambiarEstadoAccess().getVariableACambiarEstadoDeObjetoCrossReference_3_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3547:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3548:1: RULE_ID
            {
             before(grammarAccess.getCambiarEstadoAccess().getVariableACambiarEstadoDeObjetoIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CambiarEstado__VariableACambiarAssignment_37080); 
             after(grammarAccess.getCambiarEstadoAccess().getVariableACambiarEstadoDeObjetoIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCambiarEstadoAccess().getVariableACambiarEstadoDeObjetoCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__VariableACambiarAssignment_3"


    // $ANTLR start "rule__CambiarEstado__ValorNuevoAssignment_5"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3559:1: rule__CambiarEstado__ValorNuevoAssignment_5 : ( RULE_STRING ) ;
    public final void rule__CambiarEstado__ValorNuevoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3563:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3564:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3564:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3565:1: RULE_STRING
            {
             before(grammarAccess.getCambiarEstadoAccess().getValorNuevoSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CambiarEstado__ValorNuevoAssignment_57115); 
             after(grammarAccess.getCambiarEstadoAccess().getValorNuevoSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__ValorNuevoAssignment_5"


    // $ANTLR start "rule__CambiarEstado__VariableCondicionAssignment_7"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3574:1: rule__CambiarEstado__VariableCondicionAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__CambiarEstado__VariableCondicionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3578:1: ( ( ( RULE_ID ) ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3579:1: ( ( RULE_ID ) )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3579:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3580:1: ( RULE_ID )
            {
             before(grammarAccess.getCambiarEstadoAccess().getVariableCondicionEstadoDeObjetoCrossReference_7_0()); 
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3581:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3582:1: RULE_ID
            {
             before(grammarAccess.getCambiarEstadoAccess().getVariableCondicionEstadoDeObjetoIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CambiarEstado__VariableCondicionAssignment_77150); 
             after(grammarAccess.getCambiarEstadoAccess().getVariableCondicionEstadoDeObjetoIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getCambiarEstadoAccess().getVariableCondicionEstadoDeObjetoCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__VariableCondicionAssignment_7"


    // $ANTLR start "rule__CambiarEstado__ValorCondicionalAssignment_9"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3593:1: rule__CambiarEstado__ValorCondicionalAssignment_9 : ( RULE_STRING ) ;
    public final void rule__CambiarEstado__ValorCondicionalAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3597:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3598:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3598:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3599:1: RULE_STRING
            {
             before(grammarAccess.getCambiarEstadoAccess().getValorCondicionalSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CambiarEstado__ValorCondicionalAssignment_97185); 
             after(grammarAccess.getCambiarEstadoAccess().getValorCondicionalSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CambiarEstado__ValorCondicionalAssignment_9"


    // $ANTLR start "rule__EstadoDeObjeto__NameAssignment_0"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3608:1: rule__EstadoDeObjeto__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EstadoDeObjeto__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3612:1: ( ( RULE_ID ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3613:1: ( RULE_ID )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3613:1: ( RULE_ID )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3614:1: RULE_ID
            {
             before(grammarAccess.getEstadoDeObjetoAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EstadoDeObjeto__NameAssignment_07216); 
             after(grammarAccess.getEstadoDeObjetoAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__NameAssignment_0"


    // $ANTLR start "rule__EstadoDeObjeto__ValorAssignment_1_1"
    // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3623:1: rule__EstadoDeObjeto__ValorAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EstadoDeObjeto__ValorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3627:1: ( ( RULE_STRING ) )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3628:1: ( RULE_STRING )
            {
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3628:1: ( RULE_STRING )
            // ../aventurasGraficas.ui/src-gen/ar/edu/unq/ui/contentassist/antlr/internal/InternalAventuraGrafica.g:3629:1: RULE_STRING
            {
             before(grammarAccess.getEstadoDeObjetoAccess().getValorSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EstadoDeObjeto__ValorAssignment_1_17247); 
             after(grammarAccess.getEstadoDeObjetoAccess().getValorSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EstadoDeObjeto__ValorAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJuego_in_entryRuleJuego61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJuego68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Juego__Group__0_in_ruleJuego94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0_in_ruleObjeto154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHabitacion_in_entryRuleHabitacion181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHabitacion188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__0_in_ruleHabitacion214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosicion_in_entryRulePosicion241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosicion248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Posicion__Group__0_in_rulePosicion274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComando_in_entryRuleComando301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComando308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comando__Alternatives_in_ruleComando334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarObjetos_in_entryRuleMostrarObjetos361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMostrarObjetos368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MostrarObjetos__Group__0_in_ruleMostrarObjetos394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribirObjeto_in_entryRuleDescribirObjeto421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescribirObjeto428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DescribirObjeto__Group__0_in_ruleDescribirObjeto454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecogerObjeto_in_entryRuleRecogerObjeto481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecogerObjeto488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecogerObjeto__Group__0_in_ruleRecogerObjeto514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarInventario_in_entryRuleMostrarInventario541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMostrarInventario548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MostrarInventario__Group__0_in_ruleMostrarInventario574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcciones_in_entryRuleAcciones601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcciones608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Acciones__Group__0_in_ruleAcciones634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEjecutarAccion_in_entryRuleEjecutarAccion661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEjecutarAccion668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Alternatives_in_ruleEjecutarAccion694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccion728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Accion__Alternatives_in_ruleAccion754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIrA_in_entryRuleIrA781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIrA788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group__0_in_ruleIrA814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCambiarEstado_in_entryRuleCambiarEstado841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCambiarEstado848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__0_in_ruleCambiarEstado874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstadoDeObjeto_in_entryRuleEstadoDeObjeto901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEstadoDeObjeto908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group__0_in_ruleEstadoDeObjeto934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarObjetos_in_rule__Comando__Alternatives970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribirObjeto_in_rule__Comando__Alternatives987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecogerObjeto_in_rule__Comando__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarInventario_in_rule__Comando__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcciones_in_rule__Comando__Alternatives1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEjecutarAccion_in_rule__Comando__Alternatives1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__0_in_rule__EjecutarAccion__Alternatives1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_1__0_in_rule__EjecutarAccion__Alternatives1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EjecutarAccion__Alternatives_0_21139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EjecutarAccion__Alternatives_0_21159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EjecutarAccion__Alternatives_0_21179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIrA_in_rule__Accion__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCambiarEstado_in_rule__Accion__Alternatives1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Juego__Group__0__Impl_in_rule__Juego__Group__01260 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Juego__Group__1_in_rule__Juego__Group__01263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Juego__ObjetosAssignment_0_in_rule__Juego__Group__0__Impl1290 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Juego__Group__1__Impl_in_rule__Juego__Group__11321 = new BitSet(new long[]{0x000000017C020000L});
    public static final BitSet FOLLOW_rule__Juego__Group__2_in_rule__Juego__Group__11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Juego__PosicionAssignment_1_in_rule__Juego__Group__1__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Juego__Group__2__Impl_in_rule__Juego__Group__21381 = new BitSet(new long[]{0x000000017C020000L});
    public static final BitSet FOLLOW_rule__Juego__Group__3_in_rule__Juego__Group__21384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Juego__HabitacionesAssignment_2_in_rule__Juego__Group__2__Impl1411 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Juego__Group__3__Impl_in_rule__Juego__Group__31442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Juego__ComandosAssignment_3_in_rule__Juego__Group__3__Impl1469 = new BitSet(new long[]{0x000000017C000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__0__Impl_in_rule__Objeto__Group__01508 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1_in_rule__Objeto__Group__01511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Objeto__Group__0__Impl1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__1__Impl_in_rule__Objeto__Group__11570 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2_in_rule__Objeto__Group__11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__RecogibleAssignment_1_in_rule__Objeto__Group__1__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__2__Impl_in_rule__Objeto__Group__21631 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3_in_rule__Objeto__Group__21634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__NameAssignment_2_in_rule__Objeto__Group__2__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__3__Impl_in_rule__Objeto__Group__31691 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4_in_rule__Objeto__Group__31694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group_3__0_in_rule__Objeto__Group__3__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__4__Impl_in_rule__Objeto__Group__41752 = new BitSet(new long[]{0x0000000100018000L});
    public static final BitSet FOLLOW_rule__Objeto__Group__5_in_rule__Objeto__Group__41755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group_4__0_in_rule__Objeto__Group__4__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group__5__Impl_in_rule__Objeto__Group__51813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__AccionesAssignment_5_in_rule__Objeto__Group__5__Impl1840 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group_3__0__Impl_in_rule__Objeto__Group_3__01883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Objeto__Group_3__1_in_rule__Objeto__Group_3__01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Objeto__Group_3__0__Impl1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group_3__1__Impl_in_rule__Objeto__Group_3__11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__DescripcionAssignment_3_1_in_rule__Objeto__Group_3__1__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group_4__0__Impl_in_rule__Objeto__Group_4__02006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Objeto__Group_4__1_in_rule__Objeto__Group_4__02009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Objeto__Group_4__0__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__Group_4__1__Impl_in_rule__Objeto__Group_4__12068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Objeto__EstadoAssignment_4_1_in_rule__Objeto__Group_4__1__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__0__Impl_in_rule__Habitacion__Group__02129 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__1_in_rule__Habitacion__Group__02132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Habitacion__Group__0__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__1__Impl_in_rule__Habitacion__Group__12191 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__2_in_rule__Habitacion__Group__12194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__FinalAssignment_1_in_rule__Habitacion__Group__1__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__2__Impl_in_rule__Habitacion__Group__22252 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__3_in_rule__Habitacion__Group__22255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__NameAssignment_2_in_rule__Habitacion__Group__2__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__3__Impl_in_rule__Habitacion__Group__32312 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__4_in_rule__Habitacion__Group__32315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Habitacion__Group__3__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__4__Impl_in_rule__Habitacion__Group__42374 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__5_in_rule__Habitacion__Group__42377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Habitacion__Group__4__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__5__Impl_in_rule__Habitacion__Group__52436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__6_in_rule__Habitacion__Group__52439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Habitacion__Group__5__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__6__Impl_in_rule__Habitacion__Group__62498 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__7_in_rule__Habitacion__Group__62501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__DescripcionAssignment_6_in_rule__Habitacion__Group__6__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__7__Impl_in_rule__Habitacion__Group__72558 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__8_in_rule__Habitacion__Group__72561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__0_in_rule__Habitacion__Group__7__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group__8__Impl_in_rule__Habitacion__Group__82619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8__0_in_rule__Habitacion__Group__8__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__0__Impl_in_rule__Habitacion__Group_7__02695 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__1_in_rule__Habitacion__Group_7__02698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Habitacion__Group_7__0__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__1__Impl_in_rule__Habitacion__Group_7__12757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__2_in_rule__Habitacion__Group_7__12760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Habitacion__Group_7__1__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__2__Impl_in_rule__Habitacion__Group_7__22819 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__3_in_rule__Habitacion__Group_7__22822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__EstadoACambiarAssignment_7_2_in_rule__Habitacion__Group_7__2__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__3__Impl_in_rule__Habitacion__Group_7__32879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__4_in_rule__Habitacion__Group_7__32882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Habitacion__Group_7__3__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__4__Impl_in_rule__Habitacion__Group_7__42941 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__5_in_rule__Habitacion__Group_7__42944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__ObjetoACambiarAssignment_7_4_in_rule__Habitacion__Group_7__4__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__5__Impl_in_rule__Habitacion__Group_7__53001 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__6_in_rule__Habitacion__Group_7__53004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Habitacion__Group_7__5__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_7__6__Impl_in_rule__Habitacion__Group_7__63063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__ValorNuevoAssignment_7_6_in_rule__Habitacion__Group_7__6__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8__0__Impl_in_rule__Habitacion__Group_8__03134 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8__1_in_rule__Habitacion__Group_8__03137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Habitacion__Group_8__0__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8__1__Impl_in_rule__Habitacion__Group_8__13196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8_1__0_in_rule__Habitacion__Group_8__1__Impl3223 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8_1__0__Impl_in_rule__Habitacion__Group_8_1__03258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8_1__1_in_rule__Habitacion__Group_8_1__03261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Habitacion__Group_8_1__0__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__Group_8_1__1__Impl_in_rule__Habitacion__Group_8_1__13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Habitacion__ObjetosAssignment_8_1_1_in_rule__Habitacion__Group_8_1__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Posicion__Group__0__Impl_in_rule__Posicion__Group__03381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Posicion__Group__1_in_rule__Posicion__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Posicion__Group__0__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Posicion__Group__1__Impl_in_rule__Posicion__Group__13443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Posicion__HabitacionAssignment_1_in_rule__Posicion__Group__1__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MostrarObjetos__Group__0__Impl_in_rule__MostrarObjetos__Group__03504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__MostrarObjetos__Group__1_in_rule__MostrarObjetos__Group__03507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MostrarObjetos__Group__0__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MostrarObjetos__Group__1__Impl_in_rule__MostrarObjetos__Group__13566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DescribirObjeto__Group__0__Impl_in_rule__DescribirObjeto__Group__03628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DescribirObjeto__Group__1_in_rule__DescribirObjeto__Group__03631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DescribirObjeto__Group__0__Impl3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DescribirObjeto__Group__1__Impl_in_rule__DescribirObjeto__Group__13690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DescribirObjeto__ObjetoAssignment_1_in_rule__DescribirObjeto__Group__1__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecogerObjeto__Group__0__Impl_in_rule__RecogerObjeto__Group__03751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecogerObjeto__Group__1_in_rule__RecogerObjeto__Group__03754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RecogerObjeto__Group__0__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecogerObjeto__Group__1__Impl_in_rule__RecogerObjeto__Group__13813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecogerObjeto__ObjetoAssignment_1_in_rule__RecogerObjeto__Group__1__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MostrarInventario__Group__0__Impl_in_rule__MostrarInventario__Group__03874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_rule__MostrarInventario__Group__1_in_rule__MostrarInventario__Group__03877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MostrarInventario__Group__0__Impl3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MostrarInventario__Group__1__Impl_in_rule__MostrarInventario__Group__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Acciones__Group__0__Impl_in_rule__Acciones__Group__03998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Acciones__Group__1_in_rule__Acciones__Group__04001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Acciones__Group__0__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Acciones__Group__1__Impl_in_rule__Acciones__Group__14060 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Acciones__Group__2_in_rule__Acciones__Group__14063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Acciones__ObjetoAssignment_1_in_rule__Acciones__Group__1__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Acciones__Group__2__Impl_in_rule__Acciones__Group__24120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Acciones__Group__2__Impl4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__0__Impl_in_rule__EjecutarAccion__Group_0__04185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__1_in_rule__EjecutarAccion__Group_0__04188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EjecutarAccion__Group_0__0__Impl4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__1__Impl_in_rule__EjecutarAccion__Group_0__14247 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__2_in_rule__EjecutarAccion__Group_0__14250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__AccionAssignment_0_1_in_rule__EjecutarAccion__Group_0__1__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__2__Impl_in_rule__EjecutarAccion__Group_0__24307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__3_in_rule__EjecutarAccion__Group_0__24310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Alternatives_0_2_in_rule__EjecutarAccion__Group_0__2__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_0__3__Impl_in_rule__EjecutarAccion__Group_0__34367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__ObjetoAssignment_0_3_in_rule__EjecutarAccion__Group_0__3__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_1__0__Impl_in_rule__EjecutarAccion__Group_1__04432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_1__1_in_rule__EjecutarAccion__Group_1__04435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EjecutarAccion__Group_1__0__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_1__1__Impl_in_rule__EjecutarAccion__Group_1__14494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_1__2_in_rule__EjecutarAccion__Group_1__14497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__AccionAssignment_1_1_in_rule__EjecutarAccion__Group_1__1__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__Group_1__2__Impl_in_rule__EjecutarAccion__Group_1__24554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EjecutarAccion__ObjetoAssignment_1_2_in_rule__EjecutarAccion__Group_1__2__Impl4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group__0__Impl_in_rule__IrA__Group__04617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IrA__Group__1_in_rule__IrA__Group__04620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__IrA__Group__0__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group__1__Impl_in_rule__IrA__Group__14679 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__IrA__Group__2_in_rule__IrA__Group__14682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__NameAssignment_1_in_rule__IrA__Group__1__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group__2__Impl_in_rule__IrA__Group__24739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IrA__Group__3_in_rule__IrA__Group__24742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__IrA__Group__2__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group__3__Impl_in_rule__IrA__Group__34801 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__IrA__Group__4_in_rule__IrA__Group__34804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__HabitacionAssignment_3_in_rule__IrA__Group__3__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group__4__Impl_in_rule__IrA__Group__44861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__0_in_rule__IrA__Group__4__Impl4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__0__Impl_in_rule__IrA__Group_4__04929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__1_in_rule__IrA__Group_4__04932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__IrA__Group_4__0__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__1__Impl_in_rule__IrA__Group_4__14991 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__2_in_rule__IrA__Group_4__14994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__VariableAssignment_4_1_in_rule__IrA__Group_4__1__Impl5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__2__Impl_in_rule__IrA__Group_4__25051 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__3_in_rule__IrA__Group_4__25054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__IrA__Group_4__2__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__Group_4__3__Impl_in_rule__IrA__Group_4__35113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IrA__ValorAssignment_4_3_in_rule__IrA__Group_4__3__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__0__Impl_in_rule__CambiarEstado__Group__05178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__1_in_rule__CambiarEstado__Group__05181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CambiarEstado__Group__0__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__1__Impl_in_rule__CambiarEstado__Group__15240 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__2_in_rule__CambiarEstado__Group__15243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__NameAssignment_1_in_rule__CambiarEstado__Group__1__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__2__Impl_in_rule__CambiarEstado__Group__25300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__3_in_rule__CambiarEstado__Group__25303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__CambiarEstado__Group__2__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__3__Impl_in_rule__CambiarEstado__Group__35362 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__4_in_rule__CambiarEstado__Group__35365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__VariableACambiarAssignment_3_in_rule__CambiarEstado__Group__3__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__4__Impl_in_rule__CambiarEstado__Group__45422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__5_in_rule__CambiarEstado__Group__45425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CambiarEstado__Group__4__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__5__Impl_in_rule__CambiarEstado__Group__55484 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__6_in_rule__CambiarEstado__Group__55487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__ValorNuevoAssignment_5_in_rule__CambiarEstado__Group__5__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__6__Impl_in_rule__CambiarEstado__Group__65544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__7_in_rule__CambiarEstado__Group__65547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CambiarEstado__Group__6__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__7__Impl_in_rule__CambiarEstado__Group__75606 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__8_in_rule__CambiarEstado__Group__75609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__VariableCondicionAssignment_7_in_rule__CambiarEstado__Group__7__Impl5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__8__Impl_in_rule__CambiarEstado__Group__85666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__9_in_rule__CambiarEstado__Group__85669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CambiarEstado__Group__8__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__Group__9__Impl_in_rule__CambiarEstado__Group__95728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CambiarEstado__ValorCondicionalAssignment_9_in_rule__CambiarEstado__Group__9__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group__0__Impl_in_rule__EstadoDeObjeto__Group__05805 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group__1_in_rule__EstadoDeObjeto__Group__05808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__NameAssignment_0_in_rule__EstadoDeObjeto__Group__0__Impl5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group__1__Impl_in_rule__EstadoDeObjeto__Group__15865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group_1__0_in_rule__EstadoDeObjeto__Group__1__Impl5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group_1__0__Impl_in_rule__EstadoDeObjeto__Group_1__05927 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group_1__1_in_rule__EstadoDeObjeto__Group_1__05930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EstadoDeObjeto__Group_1__0__Impl5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__Group_1__1__Impl_in_rule__EstadoDeObjeto__Group_1__15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EstadoDeObjeto__ValorAssignment_1_1_in_rule__EstadoDeObjeto__Group_1__1__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_rule__Juego__ObjetosAssignment_06055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosicion_in_rule__Juego__PosicionAssignment_16086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHabitacion_in_rule__Juego__HabitacionesAssignment_26117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComando_in_rule__Juego__ComandosAssignment_36148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Objeto__RecogibleAssignment_16184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Objeto__NameAssignment_26223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Objeto__DescripcionAssignment_3_16254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstadoDeObjeto_in_rule__Objeto__EstadoAssignment_4_16285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccion_in_rule__Objeto__AccionesAssignment_56316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Habitacion__FinalAssignment_16352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Habitacion__NameAssignment_26391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Habitacion__DescripcionAssignment_66422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Habitacion__EstadoACambiarAssignment_7_26453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Habitacion__ObjetoACambiarAssignment_7_46488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Habitacion__ValorNuevoAssignment_7_66523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Habitacion__ObjetosAssignment_8_1_16558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Posicion__HabitacionAssignment_16597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DescribirObjeto__ObjetoAssignment_16636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecogerObjeto__ObjetoAssignment_16675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Acciones__ObjetoAssignment_16714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EjecutarAccion__AccionAssignment_0_16753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EjecutarAccion__ObjetoAssignment_0_36792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EjecutarAccion__AccionAssignment_1_16831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EjecutarAccion__ObjetoAssignment_1_26870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IrA__NameAssignment_16905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IrA__HabitacionAssignment_36940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IrA__VariableAssignment_4_16979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IrA__ValorAssignment_4_37014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CambiarEstado__NameAssignment_17045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CambiarEstado__VariableACambiarAssignment_37080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CambiarEstado__ValorNuevoAssignment_57115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CambiarEstado__VariableCondicionAssignment_77150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CambiarEstado__ValorCondicionalAssignment_97185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EstadoDeObjeto__NameAssignment_07216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EstadoDeObjeto__ValorAssignment_1_17247 = new BitSet(new long[]{0x0000000000000002L});

}