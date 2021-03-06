/*
 * generated by Xtext 2.17.1
 */
grammar InternalMyBot;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.bot.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.bot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.bot.services.MyBotGrammarAccess;

}

@parser::members {

 	private MyBotGrammarAccess grammarAccess;

    public InternalMyBotParser(TokenStream input, MyBotGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Bot";
   	}

   	@Override
   	protected MyBotGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBot
entryRuleBot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBotRule()); }
	iv_ruleBot=ruleBot
	{ $current=$iv_ruleBot.current; }
	EOF;

// Rule Bot
ruleBot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBotAccess().getBotAction_0(),
					$current);
			}
		)
		otherlv_1='StartBot'
		{
			newLeafNode(otherlv_1, grammarAccess.getBotAccess().getStartBotKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBotAccess().getShowsShowsParserRuleCall_2_0());
				}
				lv_shows_2_0=ruleShows
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBotRule());
					}
					add(
						$current,
						"shows",
						lv_shows_2_0,
						"org.xtext.example.bot.MyBot.Shows");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getBotAccess().getStateStateParserRuleCall_3_0());
				}
				lv_state_3_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBotRule());
					}
					add(
						$current,
						"state",
						lv_state_3_0,
						"org.xtext.example.bot.MyBot.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='EndBot'
		{
			newLeafNode(otherlv_4, grammarAccess.getBotAccess().getEndBotKeyword_4());
		}
	)
;

// Entry rule entryRuleShows
entryRuleShows returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShowsRule()); }
	iv_ruleShows=ruleShows
	{ $current=$iv_ruleShows.current; }
	EOF;

// Rule Shows
ruleShows returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Show'
		{
			newLeafNode(otherlv_0, grammarAccess.getShowsAccess().getShowKeyword_0());
		}
		otherlv_1='ShowType'
		{
			newLeafNode(otherlv_1, grammarAccess.getShowsAccess().getShowTypeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShowsAccess().getShowTypeShowTypeParserRuleCall_2_0());
				}
				lv_showType_2_0=ruleShowType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShowsRule());
					}
					add(
						$current,
						"showType",
						lv_showType_2_0,
						"org.xtext.example.bot.MyBot.ShowType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='Genre'
		{
			newLeafNode(otherlv_3, grammarAccess.getShowsAccess().getGenreKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShowsAccess().getGenreGenreParserRuleCall_4_0());
				}
				lv_genre_4_0=ruleGenre
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShowsRule());
					}
					add(
						$current,
						"genre",
						lv_genre_4_0,
						"org.xtext.example.bot.MyBot.Genre");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='Language'
		{
			newLeafNode(otherlv_5, grammarAccess.getShowsAccess().getLanguageKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShowsAccess().getLanguageLanguageParserRuleCall_6_0());
				}
				lv_language_6_0=ruleLanguage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShowsRule());
					}
					add(
						$current,
						"language",
						lv_language_6_0,
						"org.xtext.example.bot.MyBot.Language");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='Title'
		{
			newLeafNode(otherlv_7, grammarAccess.getShowsAccess().getTitleKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShowsAccess().getTitleTitleParserRuleCall_8_0());
				}
				lv_title_8_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShowsRule());
					}
					add(
						$current,
						"title",
						lv_title_8_0,
						"org.xtext.example.bot.MyBot.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='EndShow'
		{
			newLeafNode(otherlv_9, grammarAccess.getShowsAccess().getEndShowKeyword_9());
		}
	)
;

// Entry rule entryRuleShowType
entryRuleShowType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShowTypeRule()); }
	iv_ruleShowType=ruleShowType
	{ $current=$iv_ruleShowType.current; }
	EOF;

// Rule ShowType
ruleShowType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getShowTypeAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getShowTypeRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleGenre
entryRuleGenre returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGenreRule()); }
	iv_ruleGenre=ruleGenre
	{ $current=$iv_ruleGenre.current; }
	EOF;

// Rule Genre
ruleGenre returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getGenreAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getGenreRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleLanguage
entryRuleLanguage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageRule()); }
	iv_ruleLanguage=ruleLanguage
	{ $current=$iv_ruleLanguage.current; }
	EOF;

// Rule Language
ruleLanguage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLanguageRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleTitle
entryRuleTitle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTitleRule()); }
	iv_ruleTitle=ruleTitle
	{ $current=$iv_ruleTitle.current; }
	EOF;

// Rule Title
ruleTitle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTitleAccess().getNameTextParserRuleCall_0());
			}
			lv_name_0_0=ruleText
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTitleRule());
				}
				set(
					$current,
					"name",
					lv_name_0_0,
					"org.xtext.example.bot.MyBot.Text");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='State'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionSayActionSayParserRuleCall_2_0());
				}
				lv_actionSay_2_0=ruleActionSay
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actionSay",
						lv_actionSay_2_0,
						"org.xtext.example.bot.MyBot.ActionSay");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionAskActionAskParserRuleCall_3_0());
				}
				lv_actionAsk_3_0=ruleActionAsk
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actionAsk",
						lv_actionAsk_3_0,
						"org.xtext.example.bot.MyBot.ActionAsk");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionRecommendActionRecommendParserRuleCall_4_0());
				}
				lv_actionRecommend_4_0=ruleActionRecommend
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actionRecommend",
						lv_actionRecommend_4_0,
						"org.xtext.example.bot.MyBot.ActionRecommend");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_5='EndState'
		{
			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getEndStateKeyword_5());
		}
	)
;

// Entry rule entryRuleActionSay
entryRuleActionSay returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionSayRule()); }
	iv_ruleActionSay=ruleActionSay
	{ $current=$iv_ruleActionSay.current; }
	EOF;

// Rule ActionSay
ruleActionSay returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Say'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionSayAccess().getSayKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionSayAccess().getTextTextParserRuleCall_1_0());
				}
				lv_text_1_0=ruleText
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionSayRule());
					}
					add(
						$current,
						"text",
						lv_text_1_0,
						"org.xtext.example.bot.MyBot.Text");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleActionAsk
entryRuleActionAsk returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionAskRule()); }
	iv_ruleActionAsk=ruleActionAsk
	{ $current=$iv_ruleActionAsk.current; }
	EOF;

// Rule ActionAsk
ruleActionAsk returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Ask'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionAskAccess().getAskKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionAskAccess().getTextTextParserRuleCall_1_0());
				}
				lv_text_1_0=ruleText
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionAskRule());
					}
					add(
						$current,
						"text",
						lv_text_1_0,
						"org.xtext.example.bot.MyBot.Text");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getActionAskAccess().getAskVariableAskVariableParserRuleCall_2_0());
				}
				lv_askVariable_2_0=ruleAskVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionAskRule());
					}
					add(
						$current,
						"askVariable",
						lv_askVariable_2_0,
						"org.xtext.example.bot.MyBot.AskVariable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleActionRecommend
entryRuleActionRecommend returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRecommendRule()); }
	iv_ruleActionRecommend=ruleActionRecommend
	{ $current=$iv_ruleActionRecommend.current; }
	EOF;

// Rule ActionRecommend
ruleActionRecommend returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Recommend'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionRecommendAccess().getRecommendKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionRecommendAccess().getTextTextParserRuleCall_1_0());
				}
				lv_text_1_0=ruleText
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionRecommendRule());
					}
					add(
						$current,
						"text",
						lv_text_1_0,
						"org.xtext.example.bot.MyBot.Text");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getActionRecommendAccess().getAskRecommendAskRecommendParserRuleCall_2_0());
				}
				lv_askRecommend_2_0=ruleAskRecommend
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionRecommendRule());
					}
					add(
						$current,
						"askRecommend",
						lv_askRecommend_2_0,
						"org.xtext.example.bot.MyBot.AskRecommend");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleText
entryRuleText returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTextRule()); }
	iv_ruleText=ruleText
	{ $current=$iv_ruleText.current; }
	EOF;

// Rule Text
ruleText returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTextRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleAskVariable
entryRuleAskVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAskVariableRule()); }
	iv_ruleAskVariable=ruleAskVariable
	{ $current=$iv_ruleAskVariable.current; }
	EOF;

// Rule AskVariable
ruleAskVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getAskVariableAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAskVariableRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleAskRecommend
entryRuleAskRecommend returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAskRecommendRule()); }
	iv_ruleAskRecommend=ruleAskRecommend
	{ $current=$iv_ruleAskRecommend.current; }
	EOF;

// Rule AskRecommend
ruleAskRecommend returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getAskRecommendAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAskRecommendRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
