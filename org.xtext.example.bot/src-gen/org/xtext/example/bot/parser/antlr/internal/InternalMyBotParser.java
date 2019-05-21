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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyBotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StartBot'", "'EndBot'", "'Show'", "'ShowType'", "'Genre'", "'Language'", "'Title'", "'EndShow'", "'State'", "'EndState'", "'Say'", "'Ask'", "'Recommend'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyBotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyBotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyBotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyBot.g"; }



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




    // $ANTLR start "entryRuleBot"
    // InternalMyBot.g:64:1: entryRuleBot returns [EObject current=null] : iv_ruleBot= ruleBot EOF ;
    public final EObject entryRuleBot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBot = null;


        try {
            // InternalMyBot.g:64:44: (iv_ruleBot= ruleBot EOF )
            // InternalMyBot.g:65:2: iv_ruleBot= ruleBot EOF
            {
             newCompositeNode(grammarAccess.getBotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBot=ruleBot();

            state._fsp--;

             current =iv_ruleBot; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBot"


    // $ANTLR start "ruleBot"
    // InternalMyBot.g:71:1: ruleBot returns [EObject current=null] : ( () otherlv_1= 'StartBot' ( (lv_shows_2_0= ruleShows ) )* ( (lv_state_3_0= ruleState ) )* otherlv_4= 'EndBot' ) ;
    public final EObject ruleBot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_shows_2_0 = null;

        EObject lv_state_3_0 = null;



        	enterRule();

        try {
            // InternalMyBot.g:77:2: ( ( () otherlv_1= 'StartBot' ( (lv_shows_2_0= ruleShows ) )* ( (lv_state_3_0= ruleState ) )* otherlv_4= 'EndBot' ) )
            // InternalMyBot.g:78:2: ( () otherlv_1= 'StartBot' ( (lv_shows_2_0= ruleShows ) )* ( (lv_state_3_0= ruleState ) )* otherlv_4= 'EndBot' )
            {
            // InternalMyBot.g:78:2: ( () otherlv_1= 'StartBot' ( (lv_shows_2_0= ruleShows ) )* ( (lv_state_3_0= ruleState ) )* otherlv_4= 'EndBot' )
            // InternalMyBot.g:79:3: () otherlv_1= 'StartBot' ( (lv_shows_2_0= ruleShows ) )* ( (lv_state_3_0= ruleState ) )* otherlv_4= 'EndBot'
            {
            // InternalMyBot.g:79:3: ()
            // InternalMyBot.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBotAccess().getBotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBotAccess().getStartBotKeyword_1());
            		
            // InternalMyBot.g:90:3: ( (lv_shows_2_0= ruleShows ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyBot.g:91:4: (lv_shows_2_0= ruleShows )
            	    {
            	    // InternalMyBot.g:91:4: (lv_shows_2_0= ruleShows )
            	    // InternalMyBot.g:92:5: lv_shows_2_0= ruleShows
            	    {

            	    					newCompositeNode(grammarAccess.getBotAccess().getShowsShowsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_shows_2_0=ruleShows();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBotRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shows",
            	    						lv_shows_2_0,
            	    						"org.xtext.example.bot.MyBot.Shows");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyBot.g:109:3: ( (lv_state_3_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyBot.g:110:4: (lv_state_3_0= ruleState )
            	    {
            	    // InternalMyBot.g:110:4: (lv_state_3_0= ruleState )
            	    // InternalMyBot.g:111:5: lv_state_3_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getBotAccess().getStateStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_state_3_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBotRule());
            	    					}
            	    					add(
            	    						current,
            	    						"state",
            	    						lv_state_3_0,
            	    						"org.xtext.example.bot.MyBot.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBotAccess().getEndBotKeyword_4());
            		

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
    // $ANTLR end "ruleBot"


    // $ANTLR start "entryRuleShows"
    // InternalMyBot.g:136:1: entryRuleShows returns [EObject current=null] : iv_ruleShows= ruleShows EOF ;
    public final EObject entryRuleShows() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShows = null;


        try {
            // InternalMyBot.g:136:46: (iv_ruleShows= ruleShows EOF )
            // InternalMyBot.g:137:2: iv_ruleShows= ruleShows EOF
            {
             newCompositeNode(grammarAccess.getShowsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShows=ruleShows();

            state._fsp--;

             current =iv_ruleShows; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShows"


    // $ANTLR start "ruleShows"
    // InternalMyBot.g:143:1: ruleShows returns [EObject current=null] : (otherlv_0= 'Show' otherlv_1= 'ShowType' ( (lv_showType_2_0= ruleShowType ) ) otherlv_3= 'Genre' ( (lv_genre_4_0= ruleGenre ) ) otherlv_5= 'Language' ( (lv_language_6_0= ruleLanguage ) ) otherlv_7= 'Title' ( (lv_title_8_0= ruleTitle ) ) otherlv_9= 'EndShow' ) ;
    public final EObject ruleShows() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_showType_2_0 = null;

        EObject lv_genre_4_0 = null;

        EObject lv_language_6_0 = null;

        EObject lv_title_8_0 = null;



        	enterRule();

        try {
            // InternalMyBot.g:149:2: ( (otherlv_0= 'Show' otherlv_1= 'ShowType' ( (lv_showType_2_0= ruleShowType ) ) otherlv_3= 'Genre' ( (lv_genre_4_0= ruleGenre ) ) otherlv_5= 'Language' ( (lv_language_6_0= ruleLanguage ) ) otherlv_7= 'Title' ( (lv_title_8_0= ruleTitle ) ) otherlv_9= 'EndShow' ) )
            // InternalMyBot.g:150:2: (otherlv_0= 'Show' otherlv_1= 'ShowType' ( (lv_showType_2_0= ruleShowType ) ) otherlv_3= 'Genre' ( (lv_genre_4_0= ruleGenre ) ) otherlv_5= 'Language' ( (lv_language_6_0= ruleLanguage ) ) otherlv_7= 'Title' ( (lv_title_8_0= ruleTitle ) ) otherlv_9= 'EndShow' )
            {
            // InternalMyBot.g:150:2: (otherlv_0= 'Show' otherlv_1= 'ShowType' ( (lv_showType_2_0= ruleShowType ) ) otherlv_3= 'Genre' ( (lv_genre_4_0= ruleGenre ) ) otherlv_5= 'Language' ( (lv_language_6_0= ruleLanguage ) ) otherlv_7= 'Title' ( (lv_title_8_0= ruleTitle ) ) otherlv_9= 'EndShow' )
            // InternalMyBot.g:151:3: otherlv_0= 'Show' otherlv_1= 'ShowType' ( (lv_showType_2_0= ruleShowType ) ) otherlv_3= 'Genre' ( (lv_genre_4_0= ruleGenre ) ) otherlv_5= 'Language' ( (lv_language_6_0= ruleLanguage ) ) otherlv_7= 'Title' ( (lv_title_8_0= ruleTitle ) ) otherlv_9= 'EndShow'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getShowsAccess().getShowKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getShowsAccess().getShowTypeKeyword_1());
            		
            // InternalMyBot.g:159:3: ( (lv_showType_2_0= ruleShowType ) )
            // InternalMyBot.g:160:4: (lv_showType_2_0= ruleShowType )
            {
            // InternalMyBot.g:160:4: (lv_showType_2_0= ruleShowType )
            // InternalMyBot.g:161:5: lv_showType_2_0= ruleShowType
            {

            					newCompositeNode(grammarAccess.getShowsAccess().getShowTypeShowTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_showType_2_0=ruleShowType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShowsRule());
            					}
            					add(
            						current,
            						"showType",
            						lv_showType_2_0,
            						"org.xtext.example.bot.MyBot.ShowType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getShowsAccess().getGenreKeyword_3());
            		
            // InternalMyBot.g:182:3: ( (lv_genre_4_0= ruleGenre ) )
            // InternalMyBot.g:183:4: (lv_genre_4_0= ruleGenre )
            {
            // InternalMyBot.g:183:4: (lv_genre_4_0= ruleGenre )
            // InternalMyBot.g:184:5: lv_genre_4_0= ruleGenre
            {

            					newCompositeNode(grammarAccess.getShowsAccess().getGenreGenreParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_genre_4_0=ruleGenre();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShowsRule());
            					}
            					add(
            						current,
            						"genre",
            						lv_genre_4_0,
            						"org.xtext.example.bot.MyBot.Genre");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getShowsAccess().getLanguageKeyword_5());
            		
            // InternalMyBot.g:205:3: ( (lv_language_6_0= ruleLanguage ) )
            // InternalMyBot.g:206:4: (lv_language_6_0= ruleLanguage )
            {
            // InternalMyBot.g:206:4: (lv_language_6_0= ruleLanguage )
            // InternalMyBot.g:207:5: lv_language_6_0= ruleLanguage
            {

            					newCompositeNode(grammarAccess.getShowsAccess().getLanguageLanguageParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_language_6_0=ruleLanguage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShowsRule());
            					}
            					add(
            						current,
            						"language",
            						lv_language_6_0,
            						"org.xtext.example.bot.MyBot.Language");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getShowsAccess().getTitleKeyword_7());
            		
            // InternalMyBot.g:228:3: ( (lv_title_8_0= ruleTitle ) )
            // InternalMyBot.g:229:4: (lv_title_8_0= ruleTitle )
            {
            // InternalMyBot.g:229:4: (lv_title_8_0= ruleTitle )
            // InternalMyBot.g:230:5: lv_title_8_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getShowsAccess().getTitleTitleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_title_8_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShowsRule());
            					}
            					add(
            						current,
            						"title",
            						lv_title_8_0,
            						"org.xtext.example.bot.MyBot.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getShowsAccess().getEndShowKeyword_9());
            		

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
    // $ANTLR end "ruleShows"


    // $ANTLR start "entryRuleShowType"
    // InternalMyBot.g:255:1: entryRuleShowType returns [EObject current=null] : iv_ruleShowType= ruleShowType EOF ;
    public final EObject entryRuleShowType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowType = null;


        try {
            // InternalMyBot.g:255:49: (iv_ruleShowType= ruleShowType EOF )
            // InternalMyBot.g:256:2: iv_ruleShowType= ruleShowType EOF
            {
             newCompositeNode(grammarAccess.getShowTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShowType=ruleShowType();

            state._fsp--;

             current =iv_ruleShowType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleShowType"


    // $ANTLR start "ruleShowType"
    // InternalMyBot.g:262:1: ruleShowType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleShowType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyBot.g:268:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyBot.g:269:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyBot.g:269:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyBot.g:270:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyBot.g:270:3: (lv_name_0_0= RULE_ID )
            // InternalMyBot.g:271:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getShowTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getShowTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleShowType"


    // $ANTLR start "entryRuleGenre"
    // InternalMyBot.g:290:1: entryRuleGenre returns [EObject current=null] : iv_ruleGenre= ruleGenre EOF ;
    public final EObject entryRuleGenre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenre = null;


        try {
            // InternalMyBot.g:290:46: (iv_ruleGenre= ruleGenre EOF )
            // InternalMyBot.g:291:2: iv_ruleGenre= ruleGenre EOF
            {
             newCompositeNode(grammarAccess.getGenreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenre=ruleGenre();

            state._fsp--;

             current =iv_ruleGenre; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGenre"


    // $ANTLR start "ruleGenre"
    // InternalMyBot.g:297:1: ruleGenre returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleGenre() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyBot.g:303:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyBot.g:304:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyBot.g:304:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyBot.g:305:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyBot.g:305:3: (lv_name_0_0= RULE_ID )
            // InternalMyBot.g:306:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getGenreAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGenreRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleGenre"


    // $ANTLR start "entryRuleLanguage"
    // InternalMyBot.g:325:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalMyBot.g:325:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalMyBot.g:326:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalMyBot.g:332:1: ruleLanguage returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyBot.g:338:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyBot.g:339:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyBot.g:339:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyBot.g:340:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyBot.g:340:3: (lv_name_0_0= RULE_ID )
            // InternalMyBot.g:341:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLanguageRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleTitle"
    // InternalMyBot.g:360:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalMyBot.g:360:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalMyBot.g:361:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalMyBot.g:367:1: ruleTitle returns [EObject current=null] : ( (lv_name_0_0= ruleText ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyBot.g:373:2: ( ( (lv_name_0_0= ruleText ) ) )
            // InternalMyBot.g:374:2: ( (lv_name_0_0= ruleText ) )
            {
            // InternalMyBot.g:374:2: ( (lv_name_0_0= ruleText ) )
            // InternalMyBot.g:375:3: (lv_name_0_0= ruleText )
            {
            // InternalMyBot.g:375:3: (lv_name_0_0= ruleText )
            // InternalMyBot.g:376:4: lv_name_0_0= ruleText
            {

            				newCompositeNode(grammarAccess.getTitleAccess().getNameTextParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleText();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTitleRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.bot.MyBot.Text");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleState"
    // InternalMyBot.g:396:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyBot.g:396:46: (iv_ruleState= ruleState EOF )
            // InternalMyBot.g:397:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyBot.g:403:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actionSay_2_0= ruleActionSay ) ) ( (lv_actionAsk_3_0= ruleActionAsk ) )? ( (lv_actionRecommend_4_0= ruleActionRecommend ) )? otherlv_5= 'EndState' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_5=null;
        EObject lv_actionSay_2_0 = null;

        EObject lv_actionAsk_3_0 = null;

        EObject lv_actionRecommend_4_0 = null;



        	enterRule();

        try {
            // InternalMyBot.g:409:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actionSay_2_0= ruleActionSay ) ) ( (lv_actionAsk_3_0= ruleActionAsk ) )? ( (lv_actionRecommend_4_0= ruleActionRecommend ) )? otherlv_5= 'EndState' ) )
            // InternalMyBot.g:410:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actionSay_2_0= ruleActionSay ) ) ( (lv_actionAsk_3_0= ruleActionAsk ) )? ( (lv_actionRecommend_4_0= ruleActionRecommend ) )? otherlv_5= 'EndState' )
            {
            // InternalMyBot.g:410:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actionSay_2_0= ruleActionSay ) ) ( (lv_actionAsk_3_0= ruleActionAsk ) )? ( (lv_actionRecommend_4_0= ruleActionRecommend ) )? otherlv_5= 'EndState' )
            // InternalMyBot.g:411:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ( (lv_actionSay_2_0= ruleActionSay ) ) ( (lv_actionAsk_3_0= ruleActionAsk ) )? ( (lv_actionRecommend_4_0= ruleActionRecommend ) )? otherlv_5= 'EndState'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyBot.g:415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyBot.g:416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyBot.g:416:4: (lv_name_1_0= RULE_ID )
            // InternalMyBot.g:417:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyBot.g:433:3: ( (lv_actionSay_2_0= ruleActionSay ) )
            // InternalMyBot.g:434:4: (lv_actionSay_2_0= ruleActionSay )
            {
            // InternalMyBot.g:434:4: (lv_actionSay_2_0= ruleActionSay )
            // InternalMyBot.g:435:5: lv_actionSay_2_0= ruleActionSay
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionSayActionSayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_actionSay_2_0=ruleActionSay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"actionSay",
            						lv_actionSay_2_0,
            						"org.xtext.example.bot.MyBot.ActionSay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyBot.g:452:3: ( (lv_actionAsk_3_0= ruleActionAsk ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyBot.g:453:4: (lv_actionAsk_3_0= ruleActionAsk )
                    {
                    // InternalMyBot.g:453:4: (lv_actionAsk_3_0= ruleActionAsk )
                    // InternalMyBot.g:454:5: lv_actionAsk_3_0= ruleActionAsk
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getActionAskActionAskParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_actionAsk_3_0=ruleActionAsk();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					add(
                    						current,
                    						"actionAsk",
                    						lv_actionAsk_3_0,
                    						"org.xtext.example.bot.MyBot.ActionAsk");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyBot.g:471:3: ( (lv_actionRecommend_4_0= ruleActionRecommend ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyBot.g:472:4: (lv_actionRecommend_4_0= ruleActionRecommend )
                    {
                    // InternalMyBot.g:472:4: (lv_actionRecommend_4_0= ruleActionRecommend )
                    // InternalMyBot.g:473:5: lv_actionRecommend_4_0= ruleActionRecommend
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getActionRecommendActionRecommendParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_actionRecommend_4_0=ruleActionRecommend();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					add(
                    						current,
                    						"actionRecommend",
                    						lv_actionRecommend_4_0,
                    						"org.xtext.example.bot.MyBot.ActionRecommend");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStateAccess().getEndStateKeyword_5());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleActionSay"
    // InternalMyBot.g:498:1: entryRuleActionSay returns [EObject current=null] : iv_ruleActionSay= ruleActionSay EOF ;
    public final EObject entryRuleActionSay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSay = null;


        try {
            // InternalMyBot.g:498:50: (iv_ruleActionSay= ruleActionSay EOF )
            // InternalMyBot.g:499:2: iv_ruleActionSay= ruleActionSay EOF
            {
             newCompositeNode(grammarAccess.getActionSayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionSay=ruleActionSay();

            state._fsp--;

             current =iv_ruleActionSay; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionSay"


    // $ANTLR start "ruleActionSay"
    // InternalMyBot.g:505:1: ruleActionSay returns [EObject current=null] : (otherlv_0= 'Say' ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleActionSay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalMyBot.g:511:2: ( (otherlv_0= 'Say' ( (lv_text_1_0= ruleText ) ) ) )
            // InternalMyBot.g:512:2: (otherlv_0= 'Say' ( (lv_text_1_0= ruleText ) ) )
            {
            // InternalMyBot.g:512:2: (otherlv_0= 'Say' ( (lv_text_1_0= ruleText ) ) )
            // InternalMyBot.g:513:3: otherlv_0= 'Say' ( (lv_text_1_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActionSayAccess().getSayKeyword_0());
            		
            // InternalMyBot.g:517:3: ( (lv_text_1_0= ruleText ) )
            // InternalMyBot.g:518:4: (lv_text_1_0= ruleText )
            {
            // InternalMyBot.g:518:4: (lv_text_1_0= ruleText )
            // InternalMyBot.g:519:5: lv_text_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getActionSayAccess().getTextTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionSayRule());
            					}
            					add(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.xtext.example.bot.MyBot.Text");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleActionSay"


    // $ANTLR start "entryRuleActionAsk"
    // InternalMyBot.g:540:1: entryRuleActionAsk returns [EObject current=null] : iv_ruleActionAsk= ruleActionAsk EOF ;
    public final EObject entryRuleActionAsk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionAsk = null;


        try {
            // InternalMyBot.g:540:50: (iv_ruleActionAsk= ruleActionAsk EOF )
            // InternalMyBot.g:541:2: iv_ruleActionAsk= ruleActionAsk EOF
            {
             newCompositeNode(grammarAccess.getActionAskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionAsk=ruleActionAsk();

            state._fsp--;

             current =iv_ruleActionAsk; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionAsk"


    // $ANTLR start "ruleActionAsk"
    // InternalMyBot.g:547:1: ruleActionAsk returns [EObject current=null] : (otherlv_0= 'Ask' ( (lv_text_1_0= ruleText ) ) ( (lv_askVariable_2_0= ruleAskVariable ) ) ) ;
    public final EObject ruleActionAsk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_text_1_0 = null;

        EObject lv_askVariable_2_0 = null;



        	enterRule();

        try {
            // InternalMyBot.g:553:2: ( (otherlv_0= 'Ask' ( (lv_text_1_0= ruleText ) ) ( (lv_askVariable_2_0= ruleAskVariable ) ) ) )
            // InternalMyBot.g:554:2: (otherlv_0= 'Ask' ( (lv_text_1_0= ruleText ) ) ( (lv_askVariable_2_0= ruleAskVariable ) ) )
            {
            // InternalMyBot.g:554:2: (otherlv_0= 'Ask' ( (lv_text_1_0= ruleText ) ) ( (lv_askVariable_2_0= ruleAskVariable ) ) )
            // InternalMyBot.g:555:3: otherlv_0= 'Ask' ( (lv_text_1_0= ruleText ) ) ( (lv_askVariable_2_0= ruleAskVariable ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAskAccess().getAskKeyword_0());
            		
            // InternalMyBot.g:559:3: ( (lv_text_1_0= ruleText ) )
            // InternalMyBot.g:560:4: (lv_text_1_0= ruleText )
            {
            // InternalMyBot.g:560:4: (lv_text_1_0= ruleText )
            // InternalMyBot.g:561:5: lv_text_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getActionAskAccess().getTextTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_text_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionAskRule());
            					}
            					add(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.xtext.example.bot.MyBot.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyBot.g:578:3: ( (lv_askVariable_2_0= ruleAskVariable ) )
            // InternalMyBot.g:579:4: (lv_askVariable_2_0= ruleAskVariable )
            {
            // InternalMyBot.g:579:4: (lv_askVariable_2_0= ruleAskVariable )
            // InternalMyBot.g:580:5: lv_askVariable_2_0= ruleAskVariable
            {

            					newCompositeNode(grammarAccess.getActionAskAccess().getAskVariableAskVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_askVariable_2_0=ruleAskVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionAskRule());
            					}
            					add(
            						current,
            						"askVariable",
            						lv_askVariable_2_0,
            						"org.xtext.example.bot.MyBot.AskVariable");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleActionAsk"


    // $ANTLR start "entryRuleActionRecommend"
    // InternalMyBot.g:601:1: entryRuleActionRecommend returns [EObject current=null] : iv_ruleActionRecommend= ruleActionRecommend EOF ;
    public final EObject entryRuleActionRecommend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionRecommend = null;


        try {
            // InternalMyBot.g:601:56: (iv_ruleActionRecommend= ruleActionRecommend EOF )
            // InternalMyBot.g:602:2: iv_ruleActionRecommend= ruleActionRecommend EOF
            {
             newCompositeNode(grammarAccess.getActionRecommendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionRecommend=ruleActionRecommend();

            state._fsp--;

             current =iv_ruleActionRecommend; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionRecommend"


    // $ANTLR start "ruleActionRecommend"
    // InternalMyBot.g:608:1: ruleActionRecommend returns [EObject current=null] : (otherlv_0= 'Recommend' ( (lv_text_1_0= ruleText ) ) ( (lv_askRecommend_2_0= ruleAskRecommend ) )* ) ;
    public final EObject ruleActionRecommend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_text_1_0 = null;

        EObject lv_askRecommend_2_0 = null;



        	enterRule();

        try {
            // InternalMyBot.g:614:2: ( (otherlv_0= 'Recommend' ( (lv_text_1_0= ruleText ) ) ( (lv_askRecommend_2_0= ruleAskRecommend ) )* ) )
            // InternalMyBot.g:615:2: (otherlv_0= 'Recommend' ( (lv_text_1_0= ruleText ) ) ( (lv_askRecommend_2_0= ruleAskRecommend ) )* )
            {
            // InternalMyBot.g:615:2: (otherlv_0= 'Recommend' ( (lv_text_1_0= ruleText ) ) ( (lv_askRecommend_2_0= ruleAskRecommend ) )* )
            // InternalMyBot.g:616:3: otherlv_0= 'Recommend' ( (lv_text_1_0= ruleText ) ) ( (lv_askRecommend_2_0= ruleAskRecommend ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getActionRecommendAccess().getRecommendKeyword_0());
            		
            // InternalMyBot.g:620:3: ( (lv_text_1_0= ruleText ) )
            // InternalMyBot.g:621:4: (lv_text_1_0= ruleText )
            {
            // InternalMyBot.g:621:4: (lv_text_1_0= ruleText )
            // InternalMyBot.g:622:5: lv_text_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getActionRecommendAccess().getTextTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_text_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRecommendRule());
            					}
            					add(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.xtext.example.bot.MyBot.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyBot.g:639:3: ( (lv_askRecommend_2_0= ruleAskRecommend ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyBot.g:640:4: (lv_askRecommend_2_0= ruleAskRecommend )
            	    {
            	    // InternalMyBot.g:640:4: (lv_askRecommend_2_0= ruleAskRecommend )
            	    // InternalMyBot.g:641:5: lv_askRecommend_2_0= ruleAskRecommend
            	    {

            	    					newCompositeNode(grammarAccess.getActionRecommendAccess().getAskRecommendAskRecommendParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_askRecommend_2_0=ruleAskRecommend();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRecommendRule());
            	    					}
            	    					add(
            	    						current,
            	    						"askRecommend",
            	    						lv_askRecommend_2_0,
            	    						"org.xtext.example.bot.MyBot.AskRecommend");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleActionRecommend"


    // $ANTLR start "entryRuleText"
    // InternalMyBot.g:662:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalMyBot.g:662:45: (iv_ruleText= ruleText EOF )
            // InternalMyBot.g:663:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMyBot.g:669:1: ruleText returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyBot.g:675:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMyBot.g:676:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMyBot.g:676:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMyBot.g:677:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMyBot.g:677:3: (lv_name_0_0= RULE_STRING )
            // InternalMyBot.g:678:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleAskVariable"
    // InternalMyBot.g:697:1: entryRuleAskVariable returns [EObject current=null] : iv_ruleAskVariable= ruleAskVariable EOF ;
    public final EObject entryRuleAskVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAskVariable = null;


        try {
            // InternalMyBot.g:697:52: (iv_ruleAskVariable= ruleAskVariable EOF )
            // InternalMyBot.g:698:2: iv_ruleAskVariable= ruleAskVariable EOF
            {
             newCompositeNode(grammarAccess.getAskVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAskVariable=ruleAskVariable();

            state._fsp--;

             current =iv_ruleAskVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAskVariable"


    // $ANTLR start "ruleAskVariable"
    // InternalMyBot.g:704:1: ruleAskVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAskVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyBot.g:710:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyBot.g:711:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyBot.g:711:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyBot.g:712:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyBot.g:712:3: (lv_name_0_0= RULE_ID )
            // InternalMyBot.g:713:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAskVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAskVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAskVariable"


    // $ANTLR start "entryRuleAskRecommend"
    // InternalMyBot.g:732:1: entryRuleAskRecommend returns [EObject current=null] : iv_ruleAskRecommend= ruleAskRecommend EOF ;
    public final EObject entryRuleAskRecommend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAskRecommend = null;


        try {
            // InternalMyBot.g:732:53: (iv_ruleAskRecommend= ruleAskRecommend EOF )
            // InternalMyBot.g:733:2: iv_ruleAskRecommend= ruleAskRecommend EOF
            {
             newCompositeNode(grammarAccess.getAskRecommendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAskRecommend=ruleAskRecommend();

            state._fsp--;

             current =iv_ruleAskRecommend; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAskRecommend"


    // $ANTLR start "ruleAskRecommend"
    // InternalMyBot.g:739:1: ruleAskRecommend returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAskRecommend() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyBot.g:745:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyBot.g:746:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyBot.g:746:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyBot.g:747:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyBot.g:747:3: (lv_name_0_0= RULE_ID )
            // InternalMyBot.g:748:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAskRecommendAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAskRecommendRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleAskRecommend"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000083000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000D00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});

}