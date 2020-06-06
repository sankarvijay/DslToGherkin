package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_TYPE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'debut Scenario'", "'titre'", "'fin Scenario'", "'Cas de test : '", "'|'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int RULE_TYPE=5;
    public static final int T__16=16;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Scenario";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:64:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalMyDsl.g:64:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalMyDsl.g:65:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalMyDsl.g:71:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'debut Scenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'titre' ( (lv_titleScenario_3_0= RULE_STRING ) ) ( (lv_casDeTests_4_0= ruleCasDeTest ) )+ otherlv_5= 'fin Scenario' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_titleScenario_3_0=null;
        Token otherlv_5=null;
        EObject lv_casDeTests_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'debut Scenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'titre' ( (lv_titleScenario_3_0= RULE_STRING ) ) ( (lv_casDeTests_4_0= ruleCasDeTest ) )+ otherlv_5= 'fin Scenario' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'debut Scenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'titre' ( (lv_titleScenario_3_0= RULE_STRING ) ) ( (lv_casDeTests_4_0= ruleCasDeTest ) )+ otherlv_5= 'fin Scenario' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'debut Scenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'titre' ( (lv_titleScenario_3_0= RULE_STRING ) ) ( (lv_casDeTests_4_0= ruleCasDeTest ) )+ otherlv_5= 'fin Scenario' )
            // InternalMyDsl.g:79:3: otherlv_0= 'debut Scenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'titre' ( (lv_titleScenario_3_0= RULE_STRING ) ) ( (lv_casDeTests_4_0= ruleCasDeTest ) )+ otherlv_5= 'fin Scenario'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getDebutScenarioKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getTitreKeyword_2());
            		
            // InternalMyDsl.g:105:3: ( (lv_titleScenario_3_0= RULE_STRING ) )
            // InternalMyDsl.g:106:4: (lv_titleScenario_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:106:4: (lv_titleScenario_3_0= RULE_STRING )
            // InternalMyDsl.g:107:5: lv_titleScenario_3_0= RULE_STRING
            {
            lv_titleScenario_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_titleScenario_3_0, grammarAccess.getScenarioAccess().getTitleScenarioSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titleScenario",
            						lv_titleScenario_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:123:3: ( (lv_casDeTests_4_0= ruleCasDeTest ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:124:4: (lv_casDeTests_4_0= ruleCasDeTest )
            	    {
            	    // InternalMyDsl.g:124:4: (lv_casDeTests_4_0= ruleCasDeTest )
            	    // InternalMyDsl.g:125:5: lv_casDeTests_4_0= ruleCasDeTest
            	    {

            	    					newCompositeNode(grammarAccess.getScenarioAccess().getCasDeTestsCasDeTestParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_casDeTests_4_0=ruleCasDeTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    					}
            	    					add(
            	    						current,
            	    						"casDeTests",
            	    						lv_casDeTests_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.CasDeTest");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getFinScenarioKeyword_5());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleCasDeTest"
    // InternalMyDsl.g:150:1: entryRuleCasDeTest returns [EObject current=null] : iv_ruleCasDeTest= ruleCasDeTest EOF ;
    public final EObject entryRuleCasDeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCasDeTest = null;


        try {
            // InternalMyDsl.g:150:50: (iv_ruleCasDeTest= ruleCasDeTest EOF )
            // InternalMyDsl.g:151:2: iv_ruleCasDeTest= ruleCasDeTest EOF
            {
             newCompositeNode(grammarAccess.getCasDeTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCasDeTest=ruleCasDeTest();

            state._fsp--;

             current =iv_ruleCasDeTest; 
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
    // $ANTLR end "entryRuleCasDeTest"


    // $ANTLR start "ruleCasDeTest"
    // InternalMyDsl.g:157:1: ruleCasDeTest returns [EObject current=null] : (otherlv_0= 'Cas de test : ' ( (lv_titreCasDeTest_1_0= RULE_STRING ) ) ( (lv_actions_2_0= ruleAction ) )+ ) ;
    public final EObject ruleCasDeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_titreCasDeTest_1_0=null;
        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:163:2: ( (otherlv_0= 'Cas de test : ' ( (lv_titreCasDeTest_1_0= RULE_STRING ) ) ( (lv_actions_2_0= ruleAction ) )+ ) )
            // InternalMyDsl.g:164:2: (otherlv_0= 'Cas de test : ' ( (lv_titreCasDeTest_1_0= RULE_STRING ) ) ( (lv_actions_2_0= ruleAction ) )+ )
            {
            // InternalMyDsl.g:164:2: (otherlv_0= 'Cas de test : ' ( (lv_titreCasDeTest_1_0= RULE_STRING ) ) ( (lv_actions_2_0= ruleAction ) )+ )
            // InternalMyDsl.g:165:3: otherlv_0= 'Cas de test : ' ( (lv_titreCasDeTest_1_0= RULE_STRING ) ) ( (lv_actions_2_0= ruleAction ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCasDeTestAccess().getCasDeTestKeyword_0());
            		
            // InternalMyDsl.g:169:3: ( (lv_titreCasDeTest_1_0= RULE_STRING ) )
            // InternalMyDsl.g:170:4: (lv_titreCasDeTest_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:170:4: (lv_titreCasDeTest_1_0= RULE_STRING )
            // InternalMyDsl.g:171:5: lv_titreCasDeTest_1_0= RULE_STRING
            {
            lv_titreCasDeTest_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_titreCasDeTest_1_0, grammarAccess.getCasDeTestAccess().getTitreCasDeTestSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCasDeTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"titreCasDeTest",
            						lv_titreCasDeTest_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:187:3: ( (lv_actions_2_0= ruleAction ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:188:4: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:188:4: (lv_actions_2_0= ruleAction )
            	    // InternalMyDsl.g:189:5: lv_actions_2_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getCasDeTestAccess().getActionsActionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCasDeTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleCasDeTest"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:210:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:210:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:211:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:217:1: ruleAction returns [EObject current=null] : ( ( (lv_action_0_0= RULE_TYPE ) ) ( ( (lv_valeur_1_0= RULE_STRING ) ) | ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_action_0_0=null;
        Token lv_valeur_1_0=null;
        Token lv_valeur_2_0=null;
        Token otherlv_3=null;
        Token lv_texte_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:223:2: ( ( ( (lv_action_0_0= RULE_TYPE ) ) ( ( (lv_valeur_1_0= RULE_STRING ) ) | ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) ) ) ) )
            // InternalMyDsl.g:224:2: ( ( (lv_action_0_0= RULE_TYPE ) ) ( ( (lv_valeur_1_0= RULE_STRING ) ) | ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) ) ) )
            {
            // InternalMyDsl.g:224:2: ( ( (lv_action_0_0= RULE_TYPE ) ) ( ( (lv_valeur_1_0= RULE_STRING ) ) | ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) ) ) )
            // InternalMyDsl.g:225:3: ( (lv_action_0_0= RULE_TYPE ) ) ( ( (lv_valeur_1_0= RULE_STRING ) ) | ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) ) )
            {
            // InternalMyDsl.g:225:3: ( (lv_action_0_0= RULE_TYPE ) )
            // InternalMyDsl.g:226:4: (lv_action_0_0= RULE_TYPE )
            {
            // InternalMyDsl.g:226:4: (lv_action_0_0= RULE_TYPE )
            // InternalMyDsl.g:227:5: lv_action_0_0= RULE_TYPE
            {
            lv_action_0_0=(Token)match(input,RULE_TYPE,FOLLOW_3); 

            					newLeafNode(lv_action_0_0, grammarAccess.getActionAccess().getActionTYPETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_0_0,
            						"org.xtext.example.mydsl.MyDsl.TYPE");
            				

            }


            }

            // InternalMyDsl.g:243:3: ( ( (lv_valeur_1_0= RULE_STRING ) ) | ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_TYPE||(LA3_1>=14 && LA3_1<=15)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==16) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:244:4: ( (lv_valeur_1_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:244:4: ( (lv_valeur_1_0= RULE_STRING ) )
                    // InternalMyDsl.g:245:5: (lv_valeur_1_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:245:5: (lv_valeur_1_0= RULE_STRING )
                    // InternalMyDsl.g:246:6: lv_valeur_1_0= RULE_STRING
                    {
                    lv_valeur_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_valeur_1_0, grammarAccess.getActionAccess().getValeurSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valeur",
                    							lv_valeur_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:263:4: ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:263:4: ( ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:264:5: ( (lv_valeur_2_0= RULE_STRING ) ) otherlv_3= '|' ( (lv_texte_4_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:264:5: ( (lv_valeur_2_0= RULE_STRING ) )
                    // InternalMyDsl.g:265:6: (lv_valeur_2_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:265:6: (lv_valeur_2_0= RULE_STRING )
                    // InternalMyDsl.g:266:7: lv_valeur_2_0= RULE_STRING
                    {
                    lv_valeur_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_valeur_2_0, grammarAccess.getActionAccess().getValeurSTRINGTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"valeur",
                    								lv_valeur_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getActionAccess().getVerticalLineKeyword_1_1_1());
                    				
                    // InternalMyDsl.g:286:5: ( (lv_texte_4_0= RULE_STRING ) )
                    // InternalMyDsl.g:287:6: (lv_texte_4_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:287:6: (lv_texte_4_0= RULE_STRING )
                    // InternalMyDsl.g:288:7: lv_texte_4_0= RULE_STRING
                    {
                    lv_texte_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_texte_4_0, grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_1_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"texte",
                    								lv_texte_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


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
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}