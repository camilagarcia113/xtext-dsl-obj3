/*
 * generated by Xtext
 */
package ar.edu.unq.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AventuraGraficaAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("ar/edu/unq/parser/antlr/internal/InternalAventuraGrafica.tokens");
	}
}
