package ar.edu.unq.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ar.edu.unq.services.AventuraGraficaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAventuraGraficaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'objeto'", "'recogible'", "'descripcion'", "'tiene'", "'habitacion'", "'final'", "'al ingresar'", "'-'", "'mostrar'", "'cambiar el'", "'de'", "'al valor'", "'objetos'", "'iniciar en'", "'objetos ?'", "'describir'", "'recoger'", "'inventario ?'", "'acciones'", "'?'", "'accion'", "'a'", "'al'", "'a la'", "'hace ir a'", "'cuando'", "'es'", "'hace cambiar el'", "'con valor'"
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
    public String getGrammarFileName() { return "../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g"; }



     	private AventuraGraficaGrammarAccess grammarAccess;
     	
        public InternalAventuraGraficaParser(TokenStream input, AventuraGraficaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Juego";	
       	}
       	
       	@Override
       	protected AventuraGraficaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJuego"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:67:1: entryRuleJuego returns [EObject current=null] : iv_ruleJuego= ruleJuego EOF ;
    public final EObject entryRuleJuego() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJuego = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:68:2: (iv_ruleJuego= ruleJuego EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:69:2: iv_ruleJuego= ruleJuego EOF
            {
             newCompositeNode(grammarAccess.getJuegoRule()); 
            pushFollow(FOLLOW_ruleJuego_in_entryRuleJuego75);
            iv_ruleJuego=ruleJuego();

            state._fsp--;

             current =iv_ruleJuego; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJuego85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJuego"


    // $ANTLR start "ruleJuego"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:76:1: ruleJuego returns [EObject current=null] : ( ( (lv_objetos_0_0= ruleObjeto ) )* ( (lv_posicion_1_0= rulePosicion ) ) ( (lv_habitaciones_2_0= ruleHabitacion ) )* ( (lv_comandos_3_0= ruleComando ) )* ) ;
    public final EObject ruleJuego() throws RecognitionException {
        EObject current = null;

        EObject lv_objetos_0_0 = null;

        EObject lv_posicion_1_0 = null;

        EObject lv_habitaciones_2_0 = null;

        EObject lv_comandos_3_0 = null;


         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:79:28: ( ( ( (lv_objetos_0_0= ruleObjeto ) )* ( (lv_posicion_1_0= rulePosicion ) ) ( (lv_habitaciones_2_0= ruleHabitacion ) )* ( (lv_comandos_3_0= ruleComando ) )* ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:80:1: ( ( (lv_objetos_0_0= ruleObjeto ) )* ( (lv_posicion_1_0= rulePosicion ) ) ( (lv_habitaciones_2_0= ruleHabitacion ) )* ( (lv_comandos_3_0= ruleComando ) )* )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:80:1: ( ( (lv_objetos_0_0= ruleObjeto ) )* ( (lv_posicion_1_0= rulePosicion ) ) ( (lv_habitaciones_2_0= ruleHabitacion ) )* ( (lv_comandos_3_0= ruleComando ) )* )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:80:2: ( (lv_objetos_0_0= ruleObjeto ) )* ( (lv_posicion_1_0= rulePosicion ) ) ( (lv_habitaciones_2_0= ruleHabitacion ) )* ( (lv_comandos_3_0= ruleComando ) )*
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:80:2: ( (lv_objetos_0_0= ruleObjeto ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:81:1: (lv_objetos_0_0= ruleObjeto )
            	    {
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:81:1: (lv_objetos_0_0= ruleObjeto )
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:82:3: lv_objetos_0_0= ruleObjeto
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJuegoAccess().getObjetosObjetoParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleObjeto_in_ruleJuego131);
            	    lv_objetos_0_0=ruleObjeto();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJuegoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"objetos",
            	            		lv_objetos_0_0, 
            	            		"Objeto");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:98:3: ( (lv_posicion_1_0= rulePosicion ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:99:1: (lv_posicion_1_0= rulePosicion )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:99:1: (lv_posicion_1_0= rulePosicion )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:100:3: lv_posicion_1_0= rulePosicion
            {
             
            	        newCompositeNode(grammarAccess.getJuegoAccess().getPosicionPosicionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePosicion_in_ruleJuego153);
            lv_posicion_1_0=rulePosicion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJuegoRule());
            	        }
                   		set(
                   			current, 
                   			"posicion",
                    		lv_posicion_1_0, 
                    		"Posicion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:116:2: ( (lv_habitaciones_2_0= ruleHabitacion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:117:1: (lv_habitaciones_2_0= ruleHabitacion )
            	    {
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:117:1: (lv_habitaciones_2_0= ruleHabitacion )
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:118:3: lv_habitaciones_2_0= ruleHabitacion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJuegoAccess().getHabitacionesHabitacionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHabitacion_in_ruleJuego174);
            	    lv_habitaciones_2_0=ruleHabitacion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJuegoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"habitaciones",
            	            		lv_habitaciones_2_0, 
            	            		"Habitacion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:134:3: ( (lv_comandos_3_0= ruleComando ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=25 && LA3_0<=29)||LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:135:1: (lv_comandos_3_0= ruleComando )
            	    {
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:135:1: (lv_comandos_3_0= ruleComando )
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:136:3: lv_comandos_3_0= ruleComando
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJuegoAccess().getComandosComandoParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComando_in_ruleJuego196);
            	    lv_comandos_3_0=ruleComando();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJuegoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comandos",
            	            		lv_comandos_3_0, 
            	            		"Comando");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJuego"


    // $ANTLR start "entryRuleObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:160:1: entryRuleObjeto returns [EObject current=null] : iv_ruleObjeto= ruleObjeto EOF ;
    public final EObject entryRuleObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjeto = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:161:2: (iv_ruleObjeto= ruleObjeto EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:162:2: iv_ruleObjeto= ruleObjeto EOF
            {
             newCompositeNode(grammarAccess.getObjetoRule()); 
            pushFollow(FOLLOW_ruleObjeto_in_entryRuleObjeto233);
            iv_ruleObjeto=ruleObjeto();

            state._fsp--;

             current =iv_ruleObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjeto243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjeto"


    // $ANTLR start "ruleObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:169:1: ruleObjeto returns [EObject current=null] : (otherlv_0= 'objeto' ( (lv_recogible_1_0= 'recogible' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'descripcion' ( (lv_descripcion_4_0= RULE_STRING ) ) )? (otherlv_5= 'tiene' ( (lv_estado_6_0= ruleEstadoDeObjeto ) ) )? ( (lv_acciones_7_0= ruleAccion ) )* ) ;
    public final EObject ruleObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_recogible_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_descripcion_4_0=null;
        Token otherlv_5=null;
        EObject lv_estado_6_0 = null;

        EObject lv_acciones_7_0 = null;


         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:172:28: ( (otherlv_0= 'objeto' ( (lv_recogible_1_0= 'recogible' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'descripcion' ( (lv_descripcion_4_0= RULE_STRING ) ) )? (otherlv_5= 'tiene' ( (lv_estado_6_0= ruleEstadoDeObjeto ) ) )? ( (lv_acciones_7_0= ruleAccion ) )* ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:173:1: (otherlv_0= 'objeto' ( (lv_recogible_1_0= 'recogible' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'descripcion' ( (lv_descripcion_4_0= RULE_STRING ) ) )? (otherlv_5= 'tiene' ( (lv_estado_6_0= ruleEstadoDeObjeto ) ) )? ( (lv_acciones_7_0= ruleAccion ) )* )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:173:1: (otherlv_0= 'objeto' ( (lv_recogible_1_0= 'recogible' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'descripcion' ( (lv_descripcion_4_0= RULE_STRING ) ) )? (otherlv_5= 'tiene' ( (lv_estado_6_0= ruleEstadoDeObjeto ) ) )? ( (lv_acciones_7_0= ruleAccion ) )* )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:173:3: otherlv_0= 'objeto' ( (lv_recogible_1_0= 'recogible' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'descripcion' ( (lv_descripcion_4_0= RULE_STRING ) ) )? (otherlv_5= 'tiene' ( (lv_estado_6_0= ruleEstadoDeObjeto ) ) )? ( (lv_acciones_7_0= ruleAccion ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleObjeto280); 

                	newLeafNode(otherlv_0, grammarAccess.getObjetoAccess().getObjetoKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:177:1: ( (lv_recogible_1_0= 'recogible' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:178:1: (lv_recogible_1_0= 'recogible' )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:178:1: (lv_recogible_1_0= 'recogible' )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:179:3: lv_recogible_1_0= 'recogible'
                    {
                    lv_recogible_1_0=(Token)match(input,12,FOLLOW_12_in_ruleObjeto298); 

                            newLeafNode(lv_recogible_1_0, grammarAccess.getObjetoAccess().getRecogibleRecogibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjetoRule());
                    	        }
                           		setWithLastConsumed(current, "recogible", true, "recogible");
                    	    

                    }


                    }
                    break;

            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:192:3: ( (lv_name_2_0= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:193:1: (lv_name_2_0= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:193:1: (lv_name_2_0= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:194:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjeto329); 

            			newLeafNode(lv_name_2_0, grammarAccess.getObjetoAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjetoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:210:2: (otherlv_3= 'descripcion' ( (lv_descripcion_4_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:210:4: otherlv_3= 'descripcion' ( (lv_descripcion_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleObjeto347); 

                        	newLeafNode(otherlv_3, grammarAccess.getObjetoAccess().getDescripcionKeyword_3_0());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:214:1: ( (lv_descripcion_4_0= RULE_STRING ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:215:1: (lv_descripcion_4_0= RULE_STRING )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:215:1: (lv_descripcion_4_0= RULE_STRING )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:216:3: lv_descripcion_4_0= RULE_STRING
                    {
                    lv_descripcion_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleObjeto364); 

                    			newLeafNode(lv_descripcion_4_0, grammarAccess.getObjetoAccess().getDescripcionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjetoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"descripcion",
                            		lv_descripcion_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:232:4: (otherlv_5= 'tiene' ( (lv_estado_6_0= ruleEstadoDeObjeto ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:232:6: otherlv_5= 'tiene' ( (lv_estado_6_0= ruleEstadoDeObjeto ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleObjeto384); 

                        	newLeafNode(otherlv_5, grammarAccess.getObjetoAccess().getTieneKeyword_4_0());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:236:1: ( (lv_estado_6_0= ruleEstadoDeObjeto ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:237:1: (lv_estado_6_0= ruleEstadoDeObjeto )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:237:1: (lv_estado_6_0= ruleEstadoDeObjeto )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:238:3: lv_estado_6_0= ruleEstadoDeObjeto
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjetoAccess().getEstadoEstadoDeObjetoParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEstadoDeObjeto_in_ruleObjeto405);
                    lv_estado_6_0=ruleEstadoDeObjeto();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjetoRule());
                    	        }
                           		set(
                           			current, 
                           			"estado",
                            		lv_estado_6_0, 
                            		"EstadoDeObjeto");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:254:4: ( (lv_acciones_7_0= ruleAccion ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:255:1: (lv_acciones_7_0= ruleAccion )
            	    {
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:255:1: (lv_acciones_7_0= ruleAccion )
            	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:256:3: lv_acciones_7_0= ruleAccion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjetoAccess().getAccionesAccionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAccion_in_ruleObjeto428);
            	    lv_acciones_7_0=ruleAccion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjetoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"acciones",
            	            		lv_acciones_7_0, 
            	            		"Accion");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjeto"


    // $ANTLR start "entryRuleHabitacion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:280:1: entryRuleHabitacion returns [EObject current=null] : iv_ruleHabitacion= ruleHabitacion EOF ;
    public final EObject entryRuleHabitacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHabitacion = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:281:2: (iv_ruleHabitacion= ruleHabitacion EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:282:2: iv_ruleHabitacion= ruleHabitacion EOF
            {
             newCompositeNode(grammarAccess.getHabitacionRule()); 
            pushFollow(FOLLOW_ruleHabitacion_in_entryRuleHabitacion465);
            iv_ruleHabitacion=ruleHabitacion();

            state._fsp--;

             current =iv_ruleHabitacion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHabitacion475); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHabitacion"


    // $ANTLR start "ruleHabitacion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:289:1: ruleHabitacion returns [EObject current=null] : (otherlv_0= 'habitacion' ( (lv_final_1_0= 'final' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'al ingresar' otherlv_4= '-' otherlv_5= 'mostrar' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= '-' otherlv_8= 'cambiar el' ( (lv_estadoACambiar_9_0= RULE_STRING ) ) otherlv_10= 'de' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'al valor' ( (lv_valorNuevo_13_0= RULE_STRING ) ) )? (otherlv_14= 'objetos' (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )* )? ) ;
    public final EObject ruleHabitacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_final_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_descripcion_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_estadoACambiar_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_valorNuevo_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:292:28: ( (otherlv_0= 'habitacion' ( (lv_final_1_0= 'final' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'al ingresar' otherlv_4= '-' otherlv_5= 'mostrar' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= '-' otherlv_8= 'cambiar el' ( (lv_estadoACambiar_9_0= RULE_STRING ) ) otherlv_10= 'de' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'al valor' ( (lv_valorNuevo_13_0= RULE_STRING ) ) )? (otherlv_14= 'objetos' (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )* )? ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:293:1: (otherlv_0= 'habitacion' ( (lv_final_1_0= 'final' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'al ingresar' otherlv_4= '-' otherlv_5= 'mostrar' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= '-' otherlv_8= 'cambiar el' ( (lv_estadoACambiar_9_0= RULE_STRING ) ) otherlv_10= 'de' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'al valor' ( (lv_valorNuevo_13_0= RULE_STRING ) ) )? (otherlv_14= 'objetos' (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )* )? )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:293:1: (otherlv_0= 'habitacion' ( (lv_final_1_0= 'final' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'al ingresar' otherlv_4= '-' otherlv_5= 'mostrar' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= '-' otherlv_8= 'cambiar el' ( (lv_estadoACambiar_9_0= RULE_STRING ) ) otherlv_10= 'de' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'al valor' ( (lv_valorNuevo_13_0= RULE_STRING ) ) )? (otherlv_14= 'objetos' (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )* )? )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:293:3: otherlv_0= 'habitacion' ( (lv_final_1_0= 'final' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'al ingresar' otherlv_4= '-' otherlv_5= 'mostrar' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= '-' otherlv_8= 'cambiar el' ( (lv_estadoACambiar_9_0= RULE_STRING ) ) otherlv_10= 'de' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'al valor' ( (lv_valorNuevo_13_0= RULE_STRING ) ) )? (otherlv_14= 'objetos' (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleHabitacion512); 

                	newLeafNode(otherlv_0, grammarAccess.getHabitacionAccess().getHabitacionKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:297:1: ( (lv_final_1_0= 'final' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:298:1: (lv_final_1_0= 'final' )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:298:1: (lv_final_1_0= 'final' )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:299:3: lv_final_1_0= 'final'
                    {
                    lv_final_1_0=(Token)match(input,16,FOLLOW_16_in_ruleHabitacion530); 

                            newLeafNode(lv_final_1_0, grammarAccess.getHabitacionAccess().getFinalFinalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHabitacionRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:312:3: ( (lv_name_2_0= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:313:1: (lv_name_2_0= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:313:1: (lv_name_2_0= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:314:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHabitacion561); 

            			newLeafNode(lv_name_2_0, grammarAccess.getHabitacionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHabitacionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleHabitacion578); 

                	newLeafNode(otherlv_3, grammarAccess.getHabitacionAccess().getAlIngresarKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleHabitacion590); 

                	newLeafNode(otherlv_4, grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_4());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHabitacion602); 

                	newLeafNode(otherlv_5, grammarAccess.getHabitacionAccess().getMostrarKeyword_5());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:342:1: ( (lv_descripcion_6_0= RULE_STRING ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:343:1: (lv_descripcion_6_0= RULE_STRING )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:343:1: (lv_descripcion_6_0= RULE_STRING )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:344:3: lv_descripcion_6_0= RULE_STRING
            {
            lv_descripcion_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHabitacion619); 

            			newLeafNode(lv_descripcion_6_0, grammarAccess.getHabitacionAccess().getDescripcionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHabitacionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"descripcion",
                    		lv_descripcion_6_0, 
                    		"STRING");
            	    

            }


            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:360:2: (otherlv_7= '-' otherlv_8= 'cambiar el' ( (lv_estadoACambiar_9_0= RULE_STRING ) ) otherlv_10= 'de' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'al valor' ( (lv_valorNuevo_13_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:360:4: otherlv_7= '-' otherlv_8= 'cambiar el' ( (lv_estadoACambiar_9_0= RULE_STRING ) ) otherlv_10= 'de' ( (otherlv_11= RULE_ID ) ) otherlv_12= 'al valor' ( (lv_valorNuevo_13_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleHabitacion637); 

                        	newLeafNode(otherlv_7, grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleHabitacion649); 

                        	newLeafNode(otherlv_8, grammarAccess.getHabitacionAccess().getCambiarElKeyword_7_1());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:368:1: ( (lv_estadoACambiar_9_0= RULE_STRING ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:369:1: (lv_estadoACambiar_9_0= RULE_STRING )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:369:1: (lv_estadoACambiar_9_0= RULE_STRING )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:370:3: lv_estadoACambiar_9_0= RULE_STRING
                    {
                    lv_estadoACambiar_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHabitacion666); 

                    			newLeafNode(lv_estadoACambiar_9_0, grammarAccess.getHabitacionAccess().getEstadoACambiarSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHabitacionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"estadoACambiar",
                            		lv_estadoACambiar_9_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleHabitacion683); 

                        	newLeafNode(otherlv_10, grammarAccess.getHabitacionAccess().getDeKeyword_7_3());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:390:1: ( (otherlv_11= RULE_ID ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:391:1: (otherlv_11= RULE_ID )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:391:1: (otherlv_11= RULE_ID )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:392:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getHabitacionRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHabitacion703); 

                    		newLeafNode(otherlv_11, grammarAccess.getHabitacionAccess().getObjetoACambiarObjetoCrossReference_7_4_0()); 
                    	

                    }


                    }

                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleHabitacion715); 

                        	newLeafNode(otherlv_12, grammarAccess.getHabitacionAccess().getAlValorKeyword_7_5());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:407:1: ( (lv_valorNuevo_13_0= RULE_STRING ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:408:1: (lv_valorNuevo_13_0= RULE_STRING )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:408:1: (lv_valorNuevo_13_0= RULE_STRING )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:409:3: lv_valorNuevo_13_0= RULE_STRING
                    {
                    lv_valorNuevo_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHabitacion732); 

                    			newLeafNode(lv_valorNuevo_13_0, grammarAccess.getHabitacionAccess().getValorNuevoSTRINGTerminalRuleCall_7_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHabitacionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valorNuevo",
                            		lv_valorNuevo_13_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:425:4: (otherlv_14= 'objetos' (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:425:6: otherlv_14= 'objetos' (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleHabitacion752); 

                        	newLeafNode(otherlv_14, grammarAccess.getHabitacionAccess().getObjetosKeyword_8_0());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:429:1: (otherlv_15= '-' ( (otherlv_16= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:429:3: otherlv_15= '-' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleHabitacion765); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getHabitacionAccess().getHyphenMinusKeyword_8_1_0());
                    	        
                    	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:433:1: ( (otherlv_16= RULE_ID ) )
                    	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:434:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:434:1: (otherlv_16= RULE_ID )
                    	    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:435:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getHabitacionRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHabitacion785); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getHabitacionAccess().getObjetosObjetoCrossReference_8_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHabitacion"


    // $ANTLR start "entryRulePosicion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:454:1: entryRulePosicion returns [EObject current=null] : iv_rulePosicion= rulePosicion EOF ;
    public final EObject entryRulePosicion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosicion = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:455:2: (iv_rulePosicion= rulePosicion EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:456:2: iv_rulePosicion= rulePosicion EOF
            {
             newCompositeNode(grammarAccess.getPosicionRule()); 
            pushFollow(FOLLOW_rulePosicion_in_entryRulePosicion825);
            iv_rulePosicion=rulePosicion();

            state._fsp--;

             current =iv_rulePosicion; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosicion835); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosicion"


    // $ANTLR start "rulePosicion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:463:1: rulePosicion returns [EObject current=null] : (otherlv_0= 'iniciar en' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePosicion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:466:28: ( (otherlv_0= 'iniciar en' ( (otherlv_1= RULE_ID ) ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:467:1: (otherlv_0= 'iniciar en' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:467:1: (otherlv_0= 'iniciar en' ( (otherlv_1= RULE_ID ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:467:3: otherlv_0= 'iniciar en' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePosicion872); 

                	newLeafNode(otherlv_0, grammarAccess.getPosicionAccess().getIniciarEnKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:471:1: ( (otherlv_1= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:472:1: (otherlv_1= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:472:1: (otherlv_1= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:473:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPosicionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePosicion892); 

            		newLeafNode(otherlv_1, grammarAccess.getPosicionAccess().getHabitacionHabitacionCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosicion"


    // $ANTLR start "entryRuleComando"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:492:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:493:2: (iv_ruleComando= ruleComando EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:494:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_ruleComando_in_entryRuleComando928);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComando938); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:501:1: ruleComando returns [EObject current=null] : (this_MostrarObjetos_0= ruleMostrarObjetos | this_DescribirObjeto_1= ruleDescribirObjeto | this_RecogerObjeto_2= ruleRecogerObjeto | this_MostrarInventario_3= ruleMostrarInventario | this_Acciones_4= ruleAcciones | this_EjecutarAccion_5= ruleEjecutarAccion ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_MostrarObjetos_0 = null;

        EObject this_DescribirObjeto_1 = null;

        EObject this_RecogerObjeto_2 = null;

        EObject this_MostrarInventario_3 = null;

        EObject this_Acciones_4 = null;

        EObject this_EjecutarAccion_5 = null;


         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:504:28: ( (this_MostrarObjetos_0= ruleMostrarObjetos | this_DescribirObjeto_1= ruleDescribirObjeto | this_RecogerObjeto_2= ruleRecogerObjeto | this_MostrarInventario_3= ruleMostrarInventario | this_Acciones_4= ruleAcciones | this_EjecutarAccion_5= ruleEjecutarAccion ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:505:1: (this_MostrarObjetos_0= ruleMostrarObjetos | this_DescribirObjeto_1= ruleDescribirObjeto | this_RecogerObjeto_2= ruleRecogerObjeto | this_MostrarInventario_3= ruleMostrarInventario | this_Acciones_4= ruleAcciones | this_EjecutarAccion_5= ruleEjecutarAccion )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:505:1: (this_MostrarObjetos_0= ruleMostrarObjetos | this_DescribirObjeto_1= ruleDescribirObjeto | this_RecogerObjeto_2= ruleRecogerObjeto | this_MostrarInventario_3= ruleMostrarInventario | this_Acciones_4= ruleAcciones | this_EjecutarAccion_5= ruleEjecutarAccion )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            case 29:
                {
                alt12=5;
                }
                break;
            case 31:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:506:5: this_MostrarObjetos_0= ruleMostrarObjetos
                    {
                     
                            newCompositeNode(grammarAccess.getComandoAccess().getMostrarObjetosParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMostrarObjetos_in_ruleComando985);
                    this_MostrarObjetos_0=ruleMostrarObjetos();

                    state._fsp--;

                     
                            current = this_MostrarObjetos_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:516:5: this_DescribirObjeto_1= ruleDescribirObjeto
                    {
                     
                            newCompositeNode(grammarAccess.getComandoAccess().getDescribirObjetoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDescribirObjeto_in_ruleComando1012);
                    this_DescribirObjeto_1=ruleDescribirObjeto();

                    state._fsp--;

                     
                            current = this_DescribirObjeto_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:526:5: this_RecogerObjeto_2= ruleRecogerObjeto
                    {
                     
                            newCompositeNode(grammarAccess.getComandoAccess().getRecogerObjetoParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRecogerObjeto_in_ruleComando1039);
                    this_RecogerObjeto_2=ruleRecogerObjeto();

                    state._fsp--;

                     
                            current = this_RecogerObjeto_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:536:5: this_MostrarInventario_3= ruleMostrarInventario
                    {
                     
                            newCompositeNode(grammarAccess.getComandoAccess().getMostrarInventarioParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMostrarInventario_in_ruleComando1066);
                    this_MostrarInventario_3=ruleMostrarInventario();

                    state._fsp--;

                     
                            current = this_MostrarInventario_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:546:5: this_Acciones_4= ruleAcciones
                    {
                     
                            newCompositeNode(grammarAccess.getComandoAccess().getAccionesParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAcciones_in_ruleComando1093);
                    this_Acciones_4=ruleAcciones();

                    state._fsp--;

                     
                            current = this_Acciones_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:556:5: this_EjecutarAccion_5= ruleEjecutarAccion
                    {
                     
                            newCompositeNode(grammarAccess.getComandoAccess().getEjecutarAccionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEjecutarAccion_in_ruleComando1120);
                    this_EjecutarAccion_5=ruleEjecutarAccion();

                    state._fsp--;

                     
                            current = this_EjecutarAccion_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleMostrarObjetos"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:572:1: entryRuleMostrarObjetos returns [EObject current=null] : iv_ruleMostrarObjetos= ruleMostrarObjetos EOF ;
    public final EObject entryRuleMostrarObjetos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMostrarObjetos = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:573:2: (iv_ruleMostrarObjetos= ruleMostrarObjetos EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:574:2: iv_ruleMostrarObjetos= ruleMostrarObjetos EOF
            {
             newCompositeNode(grammarAccess.getMostrarObjetosRule()); 
            pushFollow(FOLLOW_ruleMostrarObjetos_in_entryRuleMostrarObjetos1155);
            iv_ruleMostrarObjetos=ruleMostrarObjetos();

            state._fsp--;

             current =iv_ruleMostrarObjetos; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMostrarObjetos1165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMostrarObjetos"


    // $ANTLR start "ruleMostrarObjetos"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:581:1: ruleMostrarObjetos returns [EObject current=null] : (otherlv_0= 'objetos ?' () ) ;
    public final EObject ruleMostrarObjetos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:584:28: ( (otherlv_0= 'objetos ?' () ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:585:1: (otherlv_0= 'objetos ?' () )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:585:1: (otherlv_0= 'objetos ?' () )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:585:3: otherlv_0= 'objetos ?' ()
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleMostrarObjetos1202); 

                	newLeafNode(otherlv_0, grammarAccess.getMostrarObjetosAccess().getObjetosKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:589:1: ()
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:590:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMostrarObjetosAccess().getMostrarObjetosAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMostrarObjetos"


    // $ANTLR start "entryRuleDescribirObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:603:1: entryRuleDescribirObjeto returns [EObject current=null] : iv_ruleDescribirObjeto= ruleDescribirObjeto EOF ;
    public final EObject entryRuleDescribirObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescribirObjeto = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:604:2: (iv_ruleDescribirObjeto= ruleDescribirObjeto EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:605:2: iv_ruleDescribirObjeto= ruleDescribirObjeto EOF
            {
             newCompositeNode(grammarAccess.getDescribirObjetoRule()); 
            pushFollow(FOLLOW_ruleDescribirObjeto_in_entryRuleDescribirObjeto1247);
            iv_ruleDescribirObjeto=ruleDescribirObjeto();

            state._fsp--;

             current =iv_ruleDescribirObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescribirObjeto1257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescribirObjeto"


    // $ANTLR start "ruleDescribirObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:612:1: ruleDescribirObjeto returns [EObject current=null] : (otherlv_0= 'describir' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDescribirObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:615:28: ( (otherlv_0= 'describir' ( (otherlv_1= RULE_ID ) ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:616:1: (otherlv_0= 'describir' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:616:1: (otherlv_0= 'describir' ( (otherlv_1= RULE_ID ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:616:3: otherlv_0= 'describir' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDescribirObjeto1294); 

                	newLeafNode(otherlv_0, grammarAccess.getDescribirObjetoAccess().getDescribirKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:620:1: ( (otherlv_1= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:621:1: (otherlv_1= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:621:1: (otherlv_1= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:622:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDescribirObjetoRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDescribirObjeto1314); 

            		newLeafNode(otherlv_1, grammarAccess.getDescribirObjetoAccess().getObjetoObjetoCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescribirObjeto"


    // $ANTLR start "entryRuleRecogerObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:641:1: entryRuleRecogerObjeto returns [EObject current=null] : iv_ruleRecogerObjeto= ruleRecogerObjeto EOF ;
    public final EObject entryRuleRecogerObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecogerObjeto = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:642:2: (iv_ruleRecogerObjeto= ruleRecogerObjeto EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:643:2: iv_ruleRecogerObjeto= ruleRecogerObjeto EOF
            {
             newCompositeNode(grammarAccess.getRecogerObjetoRule()); 
            pushFollow(FOLLOW_ruleRecogerObjeto_in_entryRuleRecogerObjeto1350);
            iv_ruleRecogerObjeto=ruleRecogerObjeto();

            state._fsp--;

             current =iv_ruleRecogerObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecogerObjeto1360); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecogerObjeto"


    // $ANTLR start "ruleRecogerObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:650:1: ruleRecogerObjeto returns [EObject current=null] : (otherlv_0= 'recoger' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRecogerObjeto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:653:28: ( (otherlv_0= 'recoger' ( (otherlv_1= RULE_ID ) ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:654:1: (otherlv_0= 'recoger' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:654:1: (otherlv_0= 'recoger' ( (otherlv_1= RULE_ID ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:654:3: otherlv_0= 'recoger' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleRecogerObjeto1397); 

                	newLeafNode(otherlv_0, grammarAccess.getRecogerObjetoAccess().getRecogerKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:658:1: ( (otherlv_1= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:659:1: (otherlv_1= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:659:1: (otherlv_1= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:660:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRecogerObjetoRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecogerObjeto1417); 

            		newLeafNode(otherlv_1, grammarAccess.getRecogerObjetoAccess().getObjetoObjetoCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecogerObjeto"


    // $ANTLR start "entryRuleMostrarInventario"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:679:1: entryRuleMostrarInventario returns [EObject current=null] : iv_ruleMostrarInventario= ruleMostrarInventario EOF ;
    public final EObject entryRuleMostrarInventario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMostrarInventario = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:680:2: (iv_ruleMostrarInventario= ruleMostrarInventario EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:681:2: iv_ruleMostrarInventario= ruleMostrarInventario EOF
            {
             newCompositeNode(grammarAccess.getMostrarInventarioRule()); 
            pushFollow(FOLLOW_ruleMostrarInventario_in_entryRuleMostrarInventario1453);
            iv_ruleMostrarInventario=ruleMostrarInventario();

            state._fsp--;

             current =iv_ruleMostrarInventario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMostrarInventario1463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMostrarInventario"


    // $ANTLR start "ruleMostrarInventario"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:688:1: ruleMostrarInventario returns [EObject current=null] : (otherlv_0= 'inventario ?' () ) ;
    public final EObject ruleMostrarInventario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:691:28: ( (otherlv_0= 'inventario ?' () ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:692:1: (otherlv_0= 'inventario ?' () )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:692:1: (otherlv_0= 'inventario ?' () )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:692:3: otherlv_0= 'inventario ?' ()
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleMostrarInventario1500); 

                	newLeafNode(otherlv_0, grammarAccess.getMostrarInventarioAccess().getInventarioKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:696:1: ()
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:697:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMostrarInventarioAccess().getMostrarInventarioAction_1(),
                        current);
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMostrarInventario"


    // $ANTLR start "entryRuleAcciones"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:710:1: entryRuleAcciones returns [EObject current=null] : iv_ruleAcciones= ruleAcciones EOF ;
    public final EObject entryRuleAcciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcciones = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:711:2: (iv_ruleAcciones= ruleAcciones EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:712:2: iv_ruleAcciones= ruleAcciones EOF
            {
             newCompositeNode(grammarAccess.getAccionesRule()); 
            pushFollow(FOLLOW_ruleAcciones_in_entryRuleAcciones1545);
            iv_ruleAcciones=ruleAcciones();

            state._fsp--;

             current =iv_ruleAcciones; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAcciones1555); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcciones"


    // $ANTLR start "ruleAcciones"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:719:1: ruleAcciones returns [EObject current=null] : (otherlv_0= 'acciones' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' ) ;
    public final EObject ruleAcciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:722:28: ( (otherlv_0= 'acciones' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:723:1: (otherlv_0= 'acciones' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:723:1: (otherlv_0= 'acciones' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?' )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:723:3: otherlv_0= 'acciones' ( (otherlv_1= RULE_ID ) ) otherlv_2= '?'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAcciones1592); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionesAccess().getAccionesKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:727:1: ( (otherlv_1= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:728:1: (otherlv_1= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:728:1: (otherlv_1= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:729:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionesRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAcciones1612); 

            		newLeafNode(otherlv_1, grammarAccess.getAccionesAccess().getObjetoObjetoCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAcciones1624); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionesAccess().getQuestionMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcciones"


    // $ANTLR start "entryRuleEjecutarAccion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:752:1: entryRuleEjecutarAccion returns [EObject current=null] : iv_ruleEjecutarAccion= ruleEjecutarAccion EOF ;
    public final EObject entryRuleEjecutarAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEjecutarAccion = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:753:2: (iv_ruleEjecutarAccion= ruleEjecutarAccion EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:754:2: iv_ruleEjecutarAccion= ruleEjecutarAccion EOF
            {
             newCompositeNode(grammarAccess.getEjecutarAccionRule()); 
            pushFollow(FOLLOW_ruleEjecutarAccion_in_entryRuleEjecutarAccion1660);
            iv_ruleEjecutarAccion=ruleEjecutarAccion();

            state._fsp--;

             current =iv_ruleEjecutarAccion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEjecutarAccion1670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEjecutarAccion"


    // $ANTLR start "ruleEjecutarAccion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:761:1: ruleEjecutarAccion returns [EObject current=null] : ( (otherlv_0= 'accion' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' ) ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'accion' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) ) ) ;
    public final EObject ruleEjecutarAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:764:28: ( ( (otherlv_0= 'accion' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' ) ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'accion' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:765:1: ( (otherlv_0= 'accion' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' ) ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'accion' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) ) )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:765:1: ( (otherlv_0= 'accion' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' ) ( (otherlv_5= RULE_ID ) ) ) | (otherlv_6= 'accion' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( ((LA14_2>=32 && LA14_2<=34)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==RULE_ID) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:765:2: (otherlv_0= 'accion' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' ) ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:765:2: (otherlv_0= 'accion' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' ) ( (otherlv_5= RULE_ID ) ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:765:4: otherlv_0= 'accion' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' ) ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEjecutarAccion1708); 

                        	newLeafNode(otherlv_0, grammarAccess.getEjecutarAccionAccess().getAccionKeyword_0_0());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:769:1: ( (otherlv_1= RULE_ID ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:770:1: (otherlv_1= RULE_ID )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:770:1: (otherlv_1= RULE_ID )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:771:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEjecutarAccionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEjecutarAccion1728); 

                    		newLeafNode(otherlv_1, grammarAccess.getEjecutarAccionAccess().getAccionIrACrossReference_0_1_0()); 
                    	

                    }


                    }

                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:782:2: (otherlv_2= 'a' | otherlv_3= 'al' | otherlv_4= 'a la' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt13=1;
                        }
                        break;
                    case 33:
                        {
                        alt13=2;
                        }
                        break;
                    case 34:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:782:4: otherlv_2= 'a'
                            {
                            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleEjecutarAccion1741); 

                                	newLeafNode(otherlv_2, grammarAccess.getEjecutarAccionAccess().getAKeyword_0_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:787:7: otherlv_3= 'al'
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleEjecutarAccion1759); 

                                	newLeafNode(otherlv_3, grammarAccess.getEjecutarAccionAccess().getAlKeyword_0_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:792:7: otherlv_4= 'a la'
                            {
                            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleEjecutarAccion1777); 

                                	newLeafNode(otherlv_4, grammarAccess.getEjecutarAccionAccess().getALaKeyword_0_2_2());
                                

                            }
                            break;

                    }

                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:796:2: ( (otherlv_5= RULE_ID ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:797:1: (otherlv_5= RULE_ID )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:797:1: (otherlv_5= RULE_ID )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:798:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEjecutarAccionRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEjecutarAccion1798); 

                    		newLeafNode(otherlv_5, grammarAccess.getEjecutarAccionAccess().getObjetoObjetoCrossReference_0_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:810:6: (otherlv_6= 'accion' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:810:6: (otherlv_6= 'accion' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:810:8: otherlv_6= 'accion' ( (otherlv_7= RULE_ID ) ) ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEjecutarAccion1818); 

                        	newLeafNode(otherlv_6, grammarAccess.getEjecutarAccionAccess().getAccionKeyword_1_0());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:814:1: ( (otherlv_7= RULE_ID ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:815:1: (otherlv_7= RULE_ID )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:815:1: (otherlv_7= RULE_ID )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:816:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEjecutarAccionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEjecutarAccion1838); 

                    		newLeafNode(otherlv_7, grammarAccess.getEjecutarAccionAccess().getAccionAccionCrossReference_1_1_0()); 
                    	

                    }


                    }

                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:827:2: ( (otherlv_8= RULE_ID ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:828:1: (otherlv_8= RULE_ID )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:828:1: (otherlv_8= RULE_ID )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:829:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEjecutarAccionRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEjecutarAccion1858); 

                    		newLeafNode(otherlv_8, grammarAccess.getEjecutarAccionAccess().getObjetoObjetoCrossReference_1_2_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEjecutarAccion"


    // $ANTLR start "entryRuleAccion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:848:1: entryRuleAccion returns [EObject current=null] : iv_ruleAccion= ruleAccion EOF ;
    public final EObject entryRuleAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccion = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:849:2: (iv_ruleAccion= ruleAccion EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:850:2: iv_ruleAccion= ruleAccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FOLLOW_ruleAccion_in_entryRuleAccion1895);
            iv_ruleAccion=ruleAccion();

            state._fsp--;

             current =iv_ruleAccion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccion1905); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccion"


    // $ANTLR start "ruleAccion"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:857:1: ruleAccion returns [EObject current=null] : (this_IrA_0= ruleIrA | this_CambiarEstado_1= ruleCambiarEstado ) ;
    public final EObject ruleAccion() throws RecognitionException {
        EObject current = null;

        EObject this_IrA_0 = null;

        EObject this_CambiarEstado_1 = null;


         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:860:28: ( (this_IrA_0= ruleIrA | this_CambiarEstado_1= ruleCambiarEstado ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:861:1: (this_IrA_0= ruleIrA | this_CambiarEstado_1= ruleCambiarEstado )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:861:1: (this_IrA_0= ruleIrA | this_CambiarEstado_1= ruleCambiarEstado )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_ID) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==38) ) {
                        alt15=2;
                    }
                    else if ( (LA15_2==35) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:862:5: this_IrA_0= ruleIrA
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getIrAParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIrA_in_ruleAccion1952);
                    this_IrA_0=ruleIrA();

                    state._fsp--;

                     
                            current = this_IrA_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:872:5: this_CambiarEstado_1= ruleCambiarEstado
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getCambiarEstadoParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCambiarEstado_in_ruleAccion1979);
                    this_CambiarEstado_1=ruleCambiarEstado();

                    state._fsp--;

                     
                            current = this_CambiarEstado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccion"


    // $ANTLR start "entryRuleIrA"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:888:1: entryRuleIrA returns [EObject current=null] : iv_ruleIrA= ruleIrA EOF ;
    public final EObject entryRuleIrA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIrA = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:889:2: (iv_ruleIrA= ruleIrA EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:890:2: iv_ruleIrA= ruleIrA EOF
            {
             newCompositeNode(grammarAccess.getIrARule()); 
            pushFollow(FOLLOW_ruleIrA_in_entryRuleIrA2014);
            iv_ruleIrA=ruleIrA();

            state._fsp--;

             current =iv_ruleIrA; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIrA2024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIrA"


    // $ANTLR start "ruleIrA"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:897:1: ruleIrA returns [EObject current=null] : (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace ir a' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'cuando' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'es' ( (lv_valor_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleIrA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_valor_7_0=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:900:28: ( (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace ir a' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'cuando' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'es' ( (lv_valor_7_0= RULE_STRING ) ) )? ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:901:1: (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace ir a' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'cuando' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'es' ( (lv_valor_7_0= RULE_STRING ) ) )? )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:901:1: (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace ir a' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'cuando' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'es' ( (lv_valor_7_0= RULE_STRING ) ) )? )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:901:3: otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace ir a' ( (otherlv_3= RULE_ID ) ) (otherlv_4= 'cuando' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'es' ( (lv_valor_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleIrA2061); 

                	newLeafNode(otherlv_0, grammarAccess.getIrAAccess().getAccionKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:905:1: ( (lv_name_1_0= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:906:1: (lv_name_1_0= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:906:1: (lv_name_1_0= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:907:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIrA2078); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIrAAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIrARule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleIrA2095); 

                	newLeafNode(otherlv_2, grammarAccess.getIrAAccess().getHaceIrAKeyword_2());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:927:1: ( (otherlv_3= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:928:1: (otherlv_3= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:928:1: (otherlv_3= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:929:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIrARule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIrA2115); 

            		newLeafNode(otherlv_3, grammarAccess.getIrAAccess().getHabitacionHabitacionCrossReference_3_0()); 
            	

            }


            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:940:2: (otherlv_4= 'cuando' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'es' ( (lv_valor_7_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:940:4: otherlv_4= 'cuando' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'es' ( (lv_valor_7_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleIrA2128); 

                        	newLeafNode(otherlv_4, grammarAccess.getIrAAccess().getCuandoKeyword_4_0());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:944:1: ( (otherlv_5= RULE_ID ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:945:1: (otherlv_5= RULE_ID )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:945:1: (otherlv_5= RULE_ID )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:946:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIrARule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIrA2148); 

                    		newLeafNode(otherlv_5, grammarAccess.getIrAAccess().getVariableEstadoDeObjetoCrossReference_4_1_0()); 
                    	

                    }


                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleIrA2160); 

                        	newLeafNode(otherlv_6, grammarAccess.getIrAAccess().getEsKeyword_4_2());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:961:1: ( (lv_valor_7_0= RULE_STRING ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:962:1: (lv_valor_7_0= RULE_STRING )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:962:1: (lv_valor_7_0= RULE_STRING )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:963:3: lv_valor_7_0= RULE_STRING
                    {
                    lv_valor_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIrA2177); 

                    			newLeafNode(lv_valor_7_0, grammarAccess.getIrAAccess().getValorSTRINGTerminalRuleCall_4_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIrARule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valor",
                            		lv_valor_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIrA"


    // $ANTLR start "entryRuleCambiarEstado"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:987:1: entryRuleCambiarEstado returns [EObject current=null] : iv_ruleCambiarEstado= ruleCambiarEstado EOF ;
    public final EObject entryRuleCambiarEstado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCambiarEstado = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:988:2: (iv_ruleCambiarEstado= ruleCambiarEstado EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:989:2: iv_ruleCambiarEstado= ruleCambiarEstado EOF
            {
             newCompositeNode(grammarAccess.getCambiarEstadoRule()); 
            pushFollow(FOLLOW_ruleCambiarEstado_in_entryRuleCambiarEstado2220);
            iv_ruleCambiarEstado=ruleCambiarEstado();

            state._fsp--;

             current =iv_ruleCambiarEstado; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCambiarEstado2230); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCambiarEstado"


    // $ANTLR start "ruleCambiarEstado"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:996:1: ruleCambiarEstado returns [EObject current=null] : (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace cambiar el' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'al valor' ( (lv_valorNuevo_5_0= RULE_STRING ) ) otherlv_6= 'cuando' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'es' ( (lv_valorCondicional_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleCambiarEstado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_valorNuevo_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_valorCondicional_9_0=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:999:28: ( (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace cambiar el' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'al valor' ( (lv_valorNuevo_5_0= RULE_STRING ) ) otherlv_6= 'cuando' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'es' ( (lv_valorCondicional_9_0= RULE_STRING ) ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1000:1: (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace cambiar el' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'al valor' ( (lv_valorNuevo_5_0= RULE_STRING ) ) otherlv_6= 'cuando' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'es' ( (lv_valorCondicional_9_0= RULE_STRING ) ) )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1000:1: (otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace cambiar el' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'al valor' ( (lv_valorNuevo_5_0= RULE_STRING ) ) otherlv_6= 'cuando' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'es' ( (lv_valorCondicional_9_0= RULE_STRING ) ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1000:3: otherlv_0= 'accion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hace cambiar el' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'al valor' ( (lv_valorNuevo_5_0= RULE_STRING ) ) otherlv_6= 'cuando' ( (otherlv_7= RULE_ID ) ) otherlv_8= 'es' ( (lv_valorCondicional_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCambiarEstado2267); 

                	newLeafNode(otherlv_0, grammarAccess.getCambiarEstadoAccess().getAccionKeyword_0());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1004:1: ( (lv_name_1_0= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1005:1: (lv_name_1_0= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1005:1: (lv_name_1_0= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1006:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCambiarEstado2284); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCambiarEstadoAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCambiarEstadoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleCambiarEstado2301); 

                	newLeafNode(otherlv_2, grammarAccess.getCambiarEstadoAccess().getHaceCambiarElKeyword_2());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1026:1: ( (otherlv_3= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1027:1: (otherlv_3= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1027:1: (otherlv_3= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1028:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCambiarEstadoRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCambiarEstado2321); 

            		newLeafNode(otherlv_3, grammarAccess.getCambiarEstadoAccess().getVariableACambiarEstadoDeObjetoCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleCambiarEstado2333); 

                	newLeafNode(otherlv_4, grammarAccess.getCambiarEstadoAccess().getAlValorKeyword_4());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1043:1: ( (lv_valorNuevo_5_0= RULE_STRING ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1044:1: (lv_valorNuevo_5_0= RULE_STRING )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1044:1: (lv_valorNuevo_5_0= RULE_STRING )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1045:3: lv_valorNuevo_5_0= RULE_STRING
            {
            lv_valorNuevo_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCambiarEstado2350); 

            			newLeafNode(lv_valorNuevo_5_0, grammarAccess.getCambiarEstadoAccess().getValorNuevoSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCambiarEstadoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valorNuevo",
                    		lv_valorNuevo_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleCambiarEstado2367); 

                	newLeafNode(otherlv_6, grammarAccess.getCambiarEstadoAccess().getCuandoKeyword_6());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1065:1: ( (otherlv_7= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1066:1: (otherlv_7= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1066:1: (otherlv_7= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1067:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCambiarEstadoRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCambiarEstado2387); 

            		newLeafNode(otherlv_7, grammarAccess.getCambiarEstadoAccess().getVariableCondicionEstadoDeObjetoCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleCambiarEstado2399); 

                	newLeafNode(otherlv_8, grammarAccess.getCambiarEstadoAccess().getEsKeyword_8());
                
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1082:1: ( (lv_valorCondicional_9_0= RULE_STRING ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1083:1: (lv_valorCondicional_9_0= RULE_STRING )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1083:1: (lv_valorCondicional_9_0= RULE_STRING )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1084:3: lv_valorCondicional_9_0= RULE_STRING
            {
            lv_valorCondicional_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCambiarEstado2416); 

            			newLeafNode(lv_valorCondicional_9_0, grammarAccess.getCambiarEstadoAccess().getValorCondicionalSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCambiarEstadoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valorCondicional",
                    		lv_valorCondicional_9_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCambiarEstado"


    // $ANTLR start "entryRuleEstadoDeObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1108:1: entryRuleEstadoDeObjeto returns [EObject current=null] : iv_ruleEstadoDeObjeto= ruleEstadoDeObjeto EOF ;
    public final EObject entryRuleEstadoDeObjeto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstadoDeObjeto = null;


        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1109:2: (iv_ruleEstadoDeObjeto= ruleEstadoDeObjeto EOF )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1110:2: iv_ruleEstadoDeObjeto= ruleEstadoDeObjeto EOF
            {
             newCompositeNode(grammarAccess.getEstadoDeObjetoRule()); 
            pushFollow(FOLLOW_ruleEstadoDeObjeto_in_entryRuleEstadoDeObjeto2457);
            iv_ruleEstadoDeObjeto=ruleEstadoDeObjeto();

            state._fsp--;

             current =iv_ruleEstadoDeObjeto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEstadoDeObjeto2467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEstadoDeObjeto"


    // $ANTLR start "ruleEstadoDeObjeto"
    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1117:1: ruleEstadoDeObjeto returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'con valor' ( (lv_valor_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEstadoDeObjeto() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_valor_2_0=null;

         enterRule(); 
            
        try {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1120:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'con valor' ( (lv_valor_2_0= RULE_STRING ) ) )? ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1121:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'con valor' ( (lv_valor_2_0= RULE_STRING ) ) )? )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1121:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'con valor' ( (lv_valor_2_0= RULE_STRING ) ) )? )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1121:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'con valor' ( (lv_valor_2_0= RULE_STRING ) ) )?
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1121:2: ( (lv_name_0_0= RULE_ID ) )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1122:1: (lv_name_0_0= RULE_ID )
            {
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1122:1: (lv_name_0_0= RULE_ID )
            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1123:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEstadoDeObjeto2509); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEstadoDeObjetoAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEstadoDeObjetoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1139:2: (otherlv_1= 'con valor' ( (lv_valor_2_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1139:4: otherlv_1= 'con valor' ( (lv_valor_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEstadoDeObjeto2527); 

                        	newLeafNode(otherlv_1, grammarAccess.getEstadoDeObjetoAccess().getConValorKeyword_1_0());
                        
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1143:1: ( (lv_valor_2_0= RULE_STRING ) )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1144:1: (lv_valor_2_0= RULE_STRING )
                    {
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1144:1: (lv_valor_2_0= RULE_STRING )
                    // ../aventurasGraficas/src-gen/ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.g:1145:3: lv_valor_2_0= RULE_STRING
                    {
                    lv_valor_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEstadoDeObjeto2544); 

                    			newLeafNode(lv_valor_2_0, grammarAccess.getEstadoDeObjetoAccess().getValorSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEstadoDeObjetoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valor",
                            		lv_valor_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEstadoDeObjeto"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJuego_in_entryRuleJuego75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJuego85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_ruleJuego131 = new BitSet(new long[]{0x0000000001000800L});
    public static final BitSet FOLLOW_rulePosicion_in_ruleJuego153 = new BitSet(new long[]{0x00000000BE008002L});
    public static final BitSet FOLLOW_ruleHabitacion_in_ruleJuego174 = new BitSet(new long[]{0x00000000BE008002L});
    public static final BitSet FOLLOW_ruleComando_in_ruleJuego196 = new BitSet(new long[]{0x00000000BE000002L});
    public static final BitSet FOLLOW_ruleObjeto_in_entryRuleObjeto233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjeto243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleObjeto280 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleObjeto298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjeto329 = new BitSet(new long[]{0x0000000080006002L});
    public static final BitSet FOLLOW_13_in_ruleObjeto347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleObjeto364 = new BitSet(new long[]{0x0000000080004002L});
    public static final BitSet FOLLOW_14_in_ruleObjeto384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEstadoDeObjeto_in_ruleObjeto405 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAccion_in_ruleObjeto428 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleHabitacion_in_entryRuleHabitacion465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHabitacion475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHabitacion512 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleHabitacion530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHabitacion561 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHabitacion578 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHabitacion590 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHabitacion602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHabitacion619 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_18_in_ruleHabitacion637 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHabitacion649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHabitacion666 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleHabitacion683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHabitacion703 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleHabitacion715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHabitacion732 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleHabitacion752 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleHabitacion765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHabitacion785 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rulePosicion_in_entryRulePosicion825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosicion835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePosicion872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePosicion892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComando_in_entryRuleComando928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComando938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarObjetos_in_ruleComando985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribirObjeto_in_ruleComando1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecogerObjeto_in_ruleComando1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarInventario_in_ruleComando1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcciones_in_ruleComando1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEjecutarAccion_in_ruleComando1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarObjetos_in_entryRuleMostrarObjetos1155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMostrarObjetos1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMostrarObjetos1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribirObjeto_in_entryRuleDescribirObjeto1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescribirObjeto1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDescribirObjeto1294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDescribirObjeto1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecogerObjeto_in_entryRuleRecogerObjeto1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecogerObjeto1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRecogerObjeto1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecogerObjeto1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMostrarInventario_in_entryRuleMostrarInventario1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMostrarInventario1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMostrarInventario1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAcciones_in_entryRuleAcciones1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAcciones1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAcciones1592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAcciones1612 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAcciones1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEjecutarAccion_in_entryRuleEjecutarAccion1660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEjecutarAccion1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEjecutarAccion1708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEjecutarAccion1728 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_ruleEjecutarAccion1741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33_in_ruleEjecutarAccion1759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_34_in_ruleEjecutarAccion1777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEjecutarAccion1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEjecutarAccion1818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEjecutarAccion1838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEjecutarAccion1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion1895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccion1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIrA_in_ruleAccion1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCambiarEstado_in_ruleAccion1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIrA_in_entryRuleIrA2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIrA2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIrA2061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIrA2078 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleIrA2095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIrA2115 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleIrA2128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIrA2148 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleIrA2160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIrA2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCambiarEstado_in_entryRuleCambiarEstado2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCambiarEstado2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCambiarEstado2267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCambiarEstado2284 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCambiarEstado2301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCambiarEstado2321 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCambiarEstado2333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCambiarEstado2350 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCambiarEstado2367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCambiarEstado2387 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCambiarEstado2399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCambiarEstado2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstadoDeObjeto_in_entryRuleEstadoDeObjeto2457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEstadoDeObjeto2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEstadoDeObjeto2509 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEstadoDeObjeto2527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEstadoDeObjeto2544 = new BitSet(new long[]{0x0000000000000002L});

}