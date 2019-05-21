/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyBotGrammarAccess extends AbstractGrammarElementFinder {
	
	public class BotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.Bot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBotAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStartBotKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cShowsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cShowsShowsParserRuleCall_2_0 = (RuleCall)cShowsAssignment_2.eContents().get(0);
		private final Assignment cStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStateStateParserRuleCall_3_0 = (RuleCall)cStateAssignment_3.eContents().get(0);
		private final Keyword cEndBotKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Bot:
		//	{Bot}
		//	'StartBot'
		//	shows+=Shows*
		//	state+=State*
		//	'EndBot';
		@Override public ParserRule getRule() { return rule; }
		
		//{Bot} 'StartBot' shows+=Shows* state+=State* 'EndBot'
		public Group getGroup() { return cGroup; }
		
		//{Bot}
		public Action getBotAction_0() { return cBotAction_0; }
		
		//'StartBot'
		public Keyword getStartBotKeyword_1() { return cStartBotKeyword_1; }
		
		//shows+=Shows*
		public Assignment getShowsAssignment_2() { return cShowsAssignment_2; }
		
		//Shows
		public RuleCall getShowsShowsParserRuleCall_2_0() { return cShowsShowsParserRuleCall_2_0; }
		
		//state+=State*
		public Assignment getStateAssignment_3() { return cStateAssignment_3; }
		
		//State
		public RuleCall getStateStateParserRuleCall_3_0() { return cStateStateParserRuleCall_3_0; }
		
		//'EndBot'
		public Keyword getEndBotKeyword_4() { return cEndBotKeyword_4; }
	}
	public class ShowsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.Shows");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cShowKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cShowTypeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cShowTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cShowTypeShowTypeParserRuleCall_2_0 = (RuleCall)cShowTypeAssignment_2.eContents().get(0);
		private final Keyword cGenreKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cGenreAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cGenreGenreParserRuleCall_4_0 = (RuleCall)cGenreAssignment_4.eContents().get(0);
		private final Keyword cLanguageKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLanguageAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLanguageLanguageParserRuleCall_6_0 = (RuleCall)cLanguageAssignment_6.eContents().get(0);
		private final Keyword cTitleKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTitleAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTitleTitleParserRuleCall_8_0 = (RuleCall)cTitleAssignment_8.eContents().get(0);
		private final Keyword cEndShowKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Shows:
		//	'Show'
		//	'ShowType' showType+=ShowType
		//	'Genre' genre+=Genre
		//	'Language' language+=Language
		//	'Title' title+=Title
		//	'EndShow';
		@Override public ParserRule getRule() { return rule; }
		
		//'Show' 'ShowType' showType+=ShowType 'Genre' genre+=Genre 'Language' language+=Language 'Title' title+=Title 'EndShow'
		public Group getGroup() { return cGroup; }
		
		//'Show'
		public Keyword getShowKeyword_0() { return cShowKeyword_0; }
		
		//'ShowType'
		public Keyword getShowTypeKeyword_1() { return cShowTypeKeyword_1; }
		
		//showType+=ShowType
		public Assignment getShowTypeAssignment_2() { return cShowTypeAssignment_2; }
		
		//ShowType
		public RuleCall getShowTypeShowTypeParserRuleCall_2_0() { return cShowTypeShowTypeParserRuleCall_2_0; }
		
		//'Genre'
		public Keyword getGenreKeyword_3() { return cGenreKeyword_3; }
		
		//genre+=Genre
		public Assignment getGenreAssignment_4() { return cGenreAssignment_4; }
		
		//Genre
		public RuleCall getGenreGenreParserRuleCall_4_0() { return cGenreGenreParserRuleCall_4_0; }
		
		//'Language'
		public Keyword getLanguageKeyword_5() { return cLanguageKeyword_5; }
		
		//language+=Language
		public Assignment getLanguageAssignment_6() { return cLanguageAssignment_6; }
		
		//Language
		public RuleCall getLanguageLanguageParserRuleCall_6_0() { return cLanguageLanguageParserRuleCall_6_0; }
		
		//'Title'
		public Keyword getTitleKeyword_7() { return cTitleKeyword_7; }
		
		//title+=Title
		public Assignment getTitleAssignment_8() { return cTitleAssignment_8; }
		
		//Title
		public RuleCall getTitleTitleParserRuleCall_8_0() { return cTitleTitleParserRuleCall_8_0; }
		
		//'EndShow'
		public Keyword getEndShowKeyword_9() { return cEndShowKeyword_9; }
	}
	public class ShowTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.ShowType");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//ShowType:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class GenreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.Genre");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Genre:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class LanguageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.Language");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Language:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class TitleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.Title");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameTextParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Title:
		//	name=Text;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Text
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//Text
		public RuleCall getNameTextParserRuleCall_0() { return cNameTextParserRuleCall_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cActionSayAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionSayActionSayParserRuleCall_2_0 = (RuleCall)cActionSayAssignment_2.eContents().get(0);
		private final Assignment cActionAskAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActionAskActionAskParserRuleCall_3_0 = (RuleCall)cActionAskAssignment_3.eContents().get(0);
		private final Assignment cActionRecommendAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionRecommendActionRecommendParserRuleCall_4_0 = (RuleCall)cActionRecommendAssignment_4.eContents().get(0);
		private final Keyword cEndStateKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//State:
		//	'State' name=ID
		//	actionSay+=ActionSay
		//	actionAsk+=ActionAsk?
		//	actionRecommend+=ActionRecommend?
		//	'EndState';
		@Override public ParserRule getRule() { return rule; }
		
		//'State' name=ID actionSay+=ActionSay actionAsk+=ActionAsk? actionRecommend+=ActionRecommend? 'EndState'
		public Group getGroup() { return cGroup; }
		
		//'State'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//actionSay+=ActionSay
		public Assignment getActionSayAssignment_2() { return cActionSayAssignment_2; }
		
		//ActionSay
		public RuleCall getActionSayActionSayParserRuleCall_2_0() { return cActionSayActionSayParserRuleCall_2_0; }
		
		//actionAsk+=ActionAsk?
		public Assignment getActionAskAssignment_3() { return cActionAskAssignment_3; }
		
		//ActionAsk
		public RuleCall getActionAskActionAskParserRuleCall_3_0() { return cActionAskActionAskParserRuleCall_3_0; }
		
		//actionRecommend+=ActionRecommend?
		public Assignment getActionRecommendAssignment_4() { return cActionRecommendAssignment_4; }
		
		//ActionRecommend
		public RuleCall getActionRecommendActionRecommendParserRuleCall_4_0() { return cActionRecommendActionRecommendParserRuleCall_4_0; }
		
		//'EndState'
		public Keyword getEndStateKeyword_5() { return cEndStateKeyword_5; }
	}
	public class ActionSayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.ActionSay");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSayKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTextParserRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		
		//ActionSay:
		//	'Say'
		//	text+=Text;
		@Override public ParserRule getRule() { return rule; }
		
		//'Say' text+=Text
		public Group getGroup() { return cGroup; }
		
		//'Say'
		public Keyword getSayKeyword_0() { return cSayKeyword_0; }
		
		//text+=Text
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//Text
		public RuleCall getTextTextParserRuleCall_1_0() { return cTextTextParserRuleCall_1_0; }
	}
	public class ActionAskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.ActionAsk");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTextParserRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Assignment cAskVariableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAskVariableAskVariableParserRuleCall_2_0 = (RuleCall)cAskVariableAssignment_2.eContents().get(0);
		
		//ActionAsk:
		//	'Ask'
		//	text+=Text
		//	askVariable+=AskVariable;
		@Override public ParserRule getRule() { return rule; }
		
		//'Ask' text+=Text askVariable+=AskVariable
		public Group getGroup() { return cGroup; }
		
		//'Ask'
		public Keyword getAskKeyword_0() { return cAskKeyword_0; }
		
		//text+=Text
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//Text
		public RuleCall getTextTextParserRuleCall_1_0() { return cTextTextParserRuleCall_1_0; }
		
		//askVariable+=AskVariable
		public Assignment getAskVariableAssignment_2() { return cAskVariableAssignment_2; }
		
		//AskVariable
		public RuleCall getAskVariableAskVariableParserRuleCall_2_0() { return cAskVariableAskVariableParserRuleCall_2_0; }
	}
	public class ActionRecommendElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.ActionRecommend");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRecommendKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTextParserRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Assignment cAskRecommendAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAskRecommendAskRecommendParserRuleCall_2_0 = (RuleCall)cAskRecommendAssignment_2.eContents().get(0);
		
		//ActionRecommend:
		//	'Recommend'
		//	text+=Text
		//	askRecommend+=AskRecommend*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Recommend' text+=Text askRecommend+=AskRecommend*
		public Group getGroup() { return cGroup; }
		
		//'Recommend'
		public Keyword getRecommendKeyword_0() { return cRecommendKeyword_0; }
		
		//text+=Text
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//Text
		public RuleCall getTextTextParserRuleCall_1_0() { return cTextTextParserRuleCall_1_0; }
		
		//askRecommend+=AskRecommend*
		public Assignment getAskRecommendAssignment_2() { return cAskRecommendAssignment_2; }
		
		//AskRecommend
		public RuleCall getAskRecommendAskRecommendParserRuleCall_2_0() { return cAskRecommendAskRecommendParserRuleCall_2_0; }
	}
	public class TextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.Text");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Text:
		//	name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=STRING
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0() { return cNameSTRINGTerminalRuleCall_0; }
	}
	public class AskVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.AskVariable");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//AskVariable:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class AskRecommendElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.bot.MyBot.AskRecommend");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//AskRecommend:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final BotElements pBot;
	private final ShowsElements pShows;
	private final ShowTypeElements pShowType;
	private final GenreElements pGenre;
	private final LanguageElements pLanguage;
	private final TitleElements pTitle;
	private final StateElements pState;
	private final ActionSayElements pActionSay;
	private final ActionAskElements pActionAsk;
	private final ActionRecommendElements pActionRecommend;
	private final TextElements pText;
	private final AskVariableElements pAskVariable;
	private final AskRecommendElements pAskRecommend;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyBotGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBot = new BotElements();
		this.pShows = new ShowsElements();
		this.pShowType = new ShowTypeElements();
		this.pGenre = new GenreElements();
		this.pLanguage = new LanguageElements();
		this.pTitle = new TitleElements();
		this.pState = new StateElements();
		this.pActionSay = new ActionSayElements();
		this.pActionAsk = new ActionAskElements();
		this.pActionRecommend = new ActionRecommendElements();
		this.pText = new TextElements();
		this.pAskVariable = new AskVariableElements();
		this.pAskRecommend = new AskRecommendElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.bot.MyBot".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Bot:
	//	{Bot}
	//	'StartBot'
	//	shows+=Shows*
	//	state+=State*
	//	'EndBot';
	public BotElements getBotAccess() {
		return pBot;
	}
	
	public ParserRule getBotRule() {
		return getBotAccess().getRule();
	}
	
	//Shows:
	//	'Show'
	//	'ShowType' showType+=ShowType
	//	'Genre' genre+=Genre
	//	'Language' language+=Language
	//	'Title' title+=Title
	//	'EndShow';
	public ShowsElements getShowsAccess() {
		return pShows;
	}
	
	public ParserRule getShowsRule() {
		return getShowsAccess().getRule();
	}
	
	//ShowType:
	//	name=ID;
	public ShowTypeElements getShowTypeAccess() {
		return pShowType;
	}
	
	public ParserRule getShowTypeRule() {
		return getShowTypeAccess().getRule();
	}
	
	//Genre:
	//	name=ID;
	public GenreElements getGenreAccess() {
		return pGenre;
	}
	
	public ParserRule getGenreRule() {
		return getGenreAccess().getRule();
	}
	
	//Language:
	//	name=ID;
	public LanguageElements getLanguageAccess() {
		return pLanguage;
	}
	
	public ParserRule getLanguageRule() {
		return getLanguageAccess().getRule();
	}
	
	//Title:
	//	name=Text;
	public TitleElements getTitleAccess() {
		return pTitle;
	}
	
	public ParserRule getTitleRule() {
		return getTitleAccess().getRule();
	}
	
	//State:
	//	'State' name=ID
	//	actionSay+=ActionSay
	//	actionAsk+=ActionAsk?
	//	actionRecommend+=ActionRecommend?
	//	'EndState';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//ActionSay:
	//	'Say'
	//	text+=Text;
	public ActionSayElements getActionSayAccess() {
		return pActionSay;
	}
	
	public ParserRule getActionSayRule() {
		return getActionSayAccess().getRule();
	}
	
	//ActionAsk:
	//	'Ask'
	//	text+=Text
	//	askVariable+=AskVariable;
	public ActionAskElements getActionAskAccess() {
		return pActionAsk;
	}
	
	public ParserRule getActionAskRule() {
		return getActionAskAccess().getRule();
	}
	
	//ActionRecommend:
	//	'Recommend'
	//	text+=Text
	//	askRecommend+=AskRecommend*;
	public ActionRecommendElements getActionRecommendAccess() {
		return pActionRecommend;
	}
	
	public ParserRule getActionRecommendRule() {
		return getActionRecommendAccess().getRule();
	}
	
	//Text:
	//	name=STRING;
	public TextElements getTextAccess() {
		return pText;
	}
	
	public ParserRule getTextRule() {
		return getTextAccess().getRule();
	}
	
	//AskVariable:
	//	name=ID;
	public AskVariableElements getAskVariableAccess() {
		return pAskVariable;
	}
	
	public ParserRule getAskVariableRule() {
		return getAskVariableAccess().getRule();
	}
	
	//AskRecommend:
	//	name=ID;
	public AskRecommendElements getAskRecommendAccess() {
		return pAskRecommend;
	}
	
	public ParserRule getAskRecommendRule() {
		return getAskRecommendAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
