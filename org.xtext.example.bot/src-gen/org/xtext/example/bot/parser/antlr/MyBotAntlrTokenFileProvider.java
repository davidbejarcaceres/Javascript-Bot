/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyBotAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/bot/parser/antlr/internal/InternalMyBot.tokens");
	}
}
