/*
 * generated by Xtext
 */
package ar.edu.unq.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ar.edu.unq.services.AventuraGraficaGrammarAccess;

public class AventuraGraficaParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AventuraGraficaGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected ar.edu.unq.parser.antlr.internal.InternalAventuraGraficaParser createParser(XtextTokenStream stream) {
		return new ar.edu.unq.parser.antlr.internal.InternalAventuraGraficaParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Juego";
	}
	
	public AventuraGraficaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AventuraGraficaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
