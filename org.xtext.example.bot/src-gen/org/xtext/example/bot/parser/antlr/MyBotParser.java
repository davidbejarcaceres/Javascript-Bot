/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.bot.parser.antlr.internal.InternalMyBotParser;
import org.xtext.example.bot.services.MyBotGrammarAccess;

public class MyBotParser extends AbstractAntlrParser {

	@Inject
	private MyBotGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyBotParser createParser(XtextTokenStream stream) {
		return new InternalMyBotParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Bot";
	}

	public MyBotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyBotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
