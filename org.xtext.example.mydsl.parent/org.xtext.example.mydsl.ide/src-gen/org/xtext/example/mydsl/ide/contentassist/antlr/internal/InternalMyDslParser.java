package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleScenario"
    // InternalMyDsl.g:53:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleScenario EOF )
            // InternalMyDsl.g:55:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalMyDsl.g:62:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Scenario__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Scenario__Group__0 )
            // InternalMyDsl.g:69:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleCasDeTest"
    // InternalMyDsl.g:78:1: entryRuleCasDeTest : ruleCasDeTest EOF ;
    public final void entryRuleCasDeTest() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCasDeTest EOF )
            // InternalMyDsl.g:80:1: ruleCasDeTest EOF
            {
             before(grammarAccess.getCasDeTestRule()); 
            pushFollow(FOLLOW_1);
            ruleCasDeTest();

            state._fsp--;

             after(grammarAccess.getCasDeTestRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCasDeTest"


    // $ANTLR start "ruleCasDeTest"
    // InternalMyDsl.g:87:1: ruleCasDeTest : ( ( rule__CasDeTest__Group__0 ) ) ;
    public final void ruleCasDeTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__CasDeTest__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__CasDeTest__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__CasDeTest__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__CasDeTest__Group__0 )
            {
             before(grammarAccess.getCasDeTestAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__CasDeTest__Group__0 )
            // InternalMyDsl.g:94:4: rule__CasDeTest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CasDeTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCasDeTestAccess().getGroup()); 

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
    // $ANTLR end "ruleCasDeTest"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:103:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAction EOF )
            // InternalMyDsl.g:105:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:112:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Action__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Action__Group__0 )
            // InternalMyDsl.g:119:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__Action__Alternatives_1"
    // InternalMyDsl.g:127:1: rule__Action__Alternatives_1 : ( ( ( rule__Action__ValeurAssignment_1_0 ) ) | ( ( rule__Action__Group_1_1__0 ) ) );
    public final void rule__Action__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( ( ( rule__Action__ValeurAssignment_1_0 ) ) | ( ( rule__Action__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_TYPE||(LA1_1>=14 && LA1_1<=15)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:132:2: ( ( rule__Action__ValeurAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:132:2: ( ( rule__Action__ValeurAssignment_1_0 ) )
                    // InternalMyDsl.g:133:3: ( rule__Action__ValeurAssignment_1_0 )
                    {
                     before(grammarAccess.getActionAccess().getValeurAssignment_1_0()); 
                    // InternalMyDsl.g:134:3: ( rule__Action__ValeurAssignment_1_0 )
                    // InternalMyDsl.g:134:4: rule__Action__ValeurAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ValeurAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getValeurAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:138:2: ( ( rule__Action__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:138:2: ( ( rule__Action__Group_1_1__0 ) )
                    // InternalMyDsl.g:139:3: ( rule__Action__Group_1_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:140:3: ( rule__Action__Group_1_1__0 )
                    // InternalMyDsl.g:140:4: rule__Action__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Action__Alternatives_1"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalMyDsl.g:148:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:152:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalMyDsl.g:153:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalMyDsl.g:160:1: rule__Scenario__Group__0__Impl : ( 'debut Scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:164:1: ( ( 'debut Scenario' ) )
            // InternalMyDsl.g:165:1: ( 'debut Scenario' )
            {
            // InternalMyDsl.g:165:1: ( 'debut Scenario' )
            // InternalMyDsl.g:166:2: 'debut Scenario'
            {
             before(grammarAccess.getScenarioAccess().getDebutScenarioKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getDebutScenarioKeyword_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalMyDsl.g:175:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:179:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalMyDsl.g:180:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalMyDsl.g:187:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__NameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:1: ( ( ( rule__Scenario__NameAssignment_1 ) ) )
            // InternalMyDsl.g:192:1: ( ( rule__Scenario__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:192:1: ( ( rule__Scenario__NameAssignment_1 ) )
            // InternalMyDsl.g:193:2: ( rule__Scenario__NameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:194:2: ( rule__Scenario__NameAssignment_1 )
            // InternalMyDsl.g:194:3: rule__Scenario__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalMyDsl.g:202:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalMyDsl.g:207:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalMyDsl.g:214:1: rule__Scenario__Group__2__Impl : ( 'titre' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:218:1: ( ( 'titre' ) )
            // InternalMyDsl.g:219:1: ( 'titre' )
            {
            // InternalMyDsl.g:219:1: ( 'titre' )
            // InternalMyDsl.g:220:2: 'titre'
            {
             before(grammarAccess.getScenarioAccess().getTitreKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getTitreKeyword_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalMyDsl.g:229:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalMyDsl.g:234:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalMyDsl.g:241:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__TitleScenarioAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( ( ( rule__Scenario__TitleScenarioAssignment_3 ) ) )
            // InternalMyDsl.g:246:1: ( ( rule__Scenario__TitleScenarioAssignment_3 ) )
            {
            // InternalMyDsl.g:246:1: ( ( rule__Scenario__TitleScenarioAssignment_3 ) )
            // InternalMyDsl.g:247:2: ( rule__Scenario__TitleScenarioAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getTitleScenarioAssignment_3()); 
            // InternalMyDsl.g:248:2: ( rule__Scenario__TitleScenarioAssignment_3 )
            // InternalMyDsl.g:248:3: rule__Scenario__TitleScenarioAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__TitleScenarioAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTitleScenarioAssignment_3()); 

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalMyDsl.g:256:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalMyDsl.g:261:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Scenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5();

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
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalMyDsl.g:268:1: rule__Scenario__Group__4__Impl : ( ( ( rule__Scenario__CasDeTestsAssignment_4 ) ) ( ( rule__Scenario__CasDeTestsAssignment_4 )* ) ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( ( ( ( rule__Scenario__CasDeTestsAssignment_4 ) ) ( ( rule__Scenario__CasDeTestsAssignment_4 )* ) ) )
            // InternalMyDsl.g:273:1: ( ( ( rule__Scenario__CasDeTestsAssignment_4 ) ) ( ( rule__Scenario__CasDeTestsAssignment_4 )* ) )
            {
            // InternalMyDsl.g:273:1: ( ( ( rule__Scenario__CasDeTestsAssignment_4 ) ) ( ( rule__Scenario__CasDeTestsAssignment_4 )* ) )
            // InternalMyDsl.g:274:2: ( ( rule__Scenario__CasDeTestsAssignment_4 ) ) ( ( rule__Scenario__CasDeTestsAssignment_4 )* )
            {
            // InternalMyDsl.g:274:2: ( ( rule__Scenario__CasDeTestsAssignment_4 ) )
            // InternalMyDsl.g:275:3: ( rule__Scenario__CasDeTestsAssignment_4 )
            {
             before(grammarAccess.getScenarioAccess().getCasDeTestsAssignment_4()); 
            // InternalMyDsl.g:276:3: ( rule__Scenario__CasDeTestsAssignment_4 )
            // InternalMyDsl.g:276:4: rule__Scenario__CasDeTestsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Scenario__CasDeTestsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getCasDeTestsAssignment_4()); 

            }

            // InternalMyDsl.g:279:2: ( ( rule__Scenario__CasDeTestsAssignment_4 )* )
            // InternalMyDsl.g:280:3: ( rule__Scenario__CasDeTestsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getCasDeTestsAssignment_4()); 
            // InternalMyDsl.g:281:3: ( rule__Scenario__CasDeTestsAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:281:4: rule__Scenario__CasDeTestsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Scenario__CasDeTestsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getCasDeTestsAssignment_4()); 

            }


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
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // InternalMyDsl.g:290:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:294:1: ( rule__Scenario__Group__5__Impl )
            // InternalMyDsl.g:295:2: rule__Scenario__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5__Impl();

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
    // $ANTLR end "rule__Scenario__Group__5"


    // $ANTLR start "rule__Scenario__Group__5__Impl"
    // InternalMyDsl.g:301:1: rule__Scenario__Group__5__Impl : ( 'fin Scenario' ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:305:1: ( ( 'fin Scenario' ) )
            // InternalMyDsl.g:306:1: ( 'fin Scenario' )
            {
            // InternalMyDsl.g:306:1: ( 'fin Scenario' )
            // InternalMyDsl.g:307:2: 'fin Scenario'
            {
             before(grammarAccess.getScenarioAccess().getFinScenarioKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getFinScenarioKeyword_5()); 

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
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__CasDeTest__Group__0"
    // InternalMyDsl.g:317:1: rule__CasDeTest__Group__0 : rule__CasDeTest__Group__0__Impl rule__CasDeTest__Group__1 ;
    public final void rule__CasDeTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:321:1: ( rule__CasDeTest__Group__0__Impl rule__CasDeTest__Group__1 )
            // InternalMyDsl.g:322:2: rule__CasDeTest__Group__0__Impl rule__CasDeTest__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CasDeTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasDeTest__Group__1();

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
    // $ANTLR end "rule__CasDeTest__Group__0"


    // $ANTLR start "rule__CasDeTest__Group__0__Impl"
    // InternalMyDsl.g:329:1: rule__CasDeTest__Group__0__Impl : ( 'Cas de test : ' ) ;
    public final void rule__CasDeTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( ( 'Cas de test : ' ) )
            // InternalMyDsl.g:334:1: ( 'Cas de test : ' )
            {
            // InternalMyDsl.g:334:1: ( 'Cas de test : ' )
            // InternalMyDsl.g:335:2: 'Cas de test : '
            {
             before(grammarAccess.getCasDeTestAccess().getCasDeTestKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCasDeTestAccess().getCasDeTestKeyword_0()); 

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
    // $ANTLR end "rule__CasDeTest__Group__0__Impl"


    // $ANTLR start "rule__CasDeTest__Group__1"
    // InternalMyDsl.g:344:1: rule__CasDeTest__Group__1 : rule__CasDeTest__Group__1__Impl rule__CasDeTest__Group__2 ;
    public final void rule__CasDeTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( rule__CasDeTest__Group__1__Impl rule__CasDeTest__Group__2 )
            // InternalMyDsl.g:349:2: rule__CasDeTest__Group__1__Impl rule__CasDeTest__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CasDeTest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CasDeTest__Group__2();

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
    // $ANTLR end "rule__CasDeTest__Group__1"


    // $ANTLR start "rule__CasDeTest__Group__1__Impl"
    // InternalMyDsl.g:356:1: rule__CasDeTest__Group__1__Impl : ( ( rule__CasDeTest__TitreCasDeTestAssignment_1 ) ) ;
    public final void rule__CasDeTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( ( ( rule__CasDeTest__TitreCasDeTestAssignment_1 ) ) )
            // InternalMyDsl.g:361:1: ( ( rule__CasDeTest__TitreCasDeTestAssignment_1 ) )
            {
            // InternalMyDsl.g:361:1: ( ( rule__CasDeTest__TitreCasDeTestAssignment_1 ) )
            // InternalMyDsl.g:362:2: ( rule__CasDeTest__TitreCasDeTestAssignment_1 )
            {
             before(grammarAccess.getCasDeTestAccess().getTitreCasDeTestAssignment_1()); 
            // InternalMyDsl.g:363:2: ( rule__CasDeTest__TitreCasDeTestAssignment_1 )
            // InternalMyDsl.g:363:3: rule__CasDeTest__TitreCasDeTestAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CasDeTest__TitreCasDeTestAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCasDeTestAccess().getTitreCasDeTestAssignment_1()); 

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
    // $ANTLR end "rule__CasDeTest__Group__1__Impl"


    // $ANTLR start "rule__CasDeTest__Group__2"
    // InternalMyDsl.g:371:1: rule__CasDeTest__Group__2 : rule__CasDeTest__Group__2__Impl ;
    public final void rule__CasDeTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( rule__CasDeTest__Group__2__Impl )
            // InternalMyDsl.g:376:2: rule__CasDeTest__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CasDeTest__Group__2__Impl();

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
    // $ANTLR end "rule__CasDeTest__Group__2"


    // $ANTLR start "rule__CasDeTest__Group__2__Impl"
    // InternalMyDsl.g:382:1: rule__CasDeTest__Group__2__Impl : ( ( ( rule__CasDeTest__ActionsAssignment_2 ) ) ( ( rule__CasDeTest__ActionsAssignment_2 )* ) ) ;
    public final void rule__CasDeTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( ( ( ( rule__CasDeTest__ActionsAssignment_2 ) ) ( ( rule__CasDeTest__ActionsAssignment_2 )* ) ) )
            // InternalMyDsl.g:387:1: ( ( ( rule__CasDeTest__ActionsAssignment_2 ) ) ( ( rule__CasDeTest__ActionsAssignment_2 )* ) )
            {
            // InternalMyDsl.g:387:1: ( ( ( rule__CasDeTest__ActionsAssignment_2 ) ) ( ( rule__CasDeTest__ActionsAssignment_2 )* ) )
            // InternalMyDsl.g:388:2: ( ( rule__CasDeTest__ActionsAssignment_2 ) ) ( ( rule__CasDeTest__ActionsAssignment_2 )* )
            {
            // InternalMyDsl.g:388:2: ( ( rule__CasDeTest__ActionsAssignment_2 ) )
            // InternalMyDsl.g:389:3: ( rule__CasDeTest__ActionsAssignment_2 )
            {
             before(grammarAccess.getCasDeTestAccess().getActionsAssignment_2()); 
            // InternalMyDsl.g:390:3: ( rule__CasDeTest__ActionsAssignment_2 )
            // InternalMyDsl.g:390:4: rule__CasDeTest__ActionsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__CasDeTest__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCasDeTestAccess().getActionsAssignment_2()); 

            }

            // InternalMyDsl.g:393:2: ( ( rule__CasDeTest__ActionsAssignment_2 )* )
            // InternalMyDsl.g:394:3: ( rule__CasDeTest__ActionsAssignment_2 )*
            {
             before(grammarAccess.getCasDeTestAccess().getActionsAssignment_2()); 
            // InternalMyDsl.g:395:3: ( rule__CasDeTest__ActionsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_TYPE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:395:4: rule__CasDeTest__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CasDeTest__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCasDeTestAccess().getActionsAssignment_2()); 

            }


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
    // $ANTLR end "rule__CasDeTest__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalMyDsl.g:405:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:409:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalMyDsl.g:410:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalMyDsl.g:417:1: rule__Action__Group__0__Impl : ( ( rule__Action__ActionAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( ( ( rule__Action__ActionAssignment_0 ) ) )
            // InternalMyDsl.g:422:1: ( ( rule__Action__ActionAssignment_0 ) )
            {
            // InternalMyDsl.g:422:1: ( ( rule__Action__ActionAssignment_0 ) )
            // InternalMyDsl.g:423:2: ( rule__Action__ActionAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getActionAssignment_0()); 
            // InternalMyDsl.g:424:2: ( rule__Action__ActionAssignment_0 )
            // InternalMyDsl.g:424:3: rule__Action__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionAssignment_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalMyDsl.g:432:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:436:1: ( rule__Action__Group__1__Impl )
            // InternalMyDsl.g:437:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__1__Impl();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalMyDsl.g:443:1: rule__Action__Group__1__Impl : ( ( rule__Action__Alternatives_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( ( ( rule__Action__Alternatives_1 ) ) )
            // InternalMyDsl.g:448:1: ( ( rule__Action__Alternatives_1 ) )
            {
            // InternalMyDsl.g:448:1: ( ( rule__Action__Alternatives_1 ) )
            // InternalMyDsl.g:449:2: ( rule__Action__Alternatives_1 )
            {
             before(grammarAccess.getActionAccess().getAlternatives_1()); 
            // InternalMyDsl.g:450:2: ( rule__Action__Alternatives_1 )
            // InternalMyDsl.g:450:3: rule__Action__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group_1_1__0"
    // InternalMyDsl.g:459:1: rule__Action__Group_1_1__0 : rule__Action__Group_1_1__0__Impl rule__Action__Group_1_1__1 ;
    public final void rule__Action__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( rule__Action__Group_1_1__0__Impl rule__Action__Group_1_1__1 )
            // InternalMyDsl.g:464:2: rule__Action__Group_1_1__0__Impl rule__Action__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Action__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1_1__1();

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
    // $ANTLR end "rule__Action__Group_1_1__0"


    // $ANTLR start "rule__Action__Group_1_1__0__Impl"
    // InternalMyDsl.g:471:1: rule__Action__Group_1_1__0__Impl : ( ( rule__Action__ValeurAssignment_1_1_0 ) ) ;
    public final void rule__Action__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( ( ( rule__Action__ValeurAssignment_1_1_0 ) ) )
            // InternalMyDsl.g:476:1: ( ( rule__Action__ValeurAssignment_1_1_0 ) )
            {
            // InternalMyDsl.g:476:1: ( ( rule__Action__ValeurAssignment_1_1_0 ) )
            // InternalMyDsl.g:477:2: ( rule__Action__ValeurAssignment_1_1_0 )
            {
             before(grammarAccess.getActionAccess().getValeurAssignment_1_1_0()); 
            // InternalMyDsl.g:478:2: ( rule__Action__ValeurAssignment_1_1_0 )
            // InternalMyDsl.g:478:3: rule__Action__ValeurAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ValeurAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getValeurAssignment_1_1_0()); 

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
    // $ANTLR end "rule__Action__Group_1_1__0__Impl"


    // $ANTLR start "rule__Action__Group_1_1__1"
    // InternalMyDsl.g:486:1: rule__Action__Group_1_1__1 : rule__Action__Group_1_1__1__Impl rule__Action__Group_1_1__2 ;
    public final void rule__Action__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( rule__Action__Group_1_1__1__Impl rule__Action__Group_1_1__2 )
            // InternalMyDsl.g:491:2: rule__Action__Group_1_1__1__Impl rule__Action__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Action__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1_1__2();

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
    // $ANTLR end "rule__Action__Group_1_1__1"


    // $ANTLR start "rule__Action__Group_1_1__1__Impl"
    // InternalMyDsl.g:498:1: rule__Action__Group_1_1__1__Impl : ( '|' ) ;
    public final void rule__Action__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( ( '|' ) )
            // InternalMyDsl.g:503:1: ( '|' )
            {
            // InternalMyDsl.g:503:1: ( '|' )
            // InternalMyDsl.g:504:2: '|'
            {
             before(grammarAccess.getActionAccess().getVerticalLineKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getVerticalLineKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Action__Group_1_1__1__Impl"


    // $ANTLR start "rule__Action__Group_1_1__2"
    // InternalMyDsl.g:513:1: rule__Action__Group_1_1__2 : rule__Action__Group_1_1__2__Impl ;
    public final void rule__Action__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( rule__Action__Group_1_1__2__Impl )
            // InternalMyDsl.g:518:2: rule__Action__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Action__Group_1_1__2"


    // $ANTLR start "rule__Action__Group_1_1__2__Impl"
    // InternalMyDsl.g:524:1: rule__Action__Group_1_1__2__Impl : ( ( rule__Action__TexteAssignment_1_1_2 ) ) ;
    public final void rule__Action__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( ( ( rule__Action__TexteAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:529:1: ( ( rule__Action__TexteAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:529:1: ( ( rule__Action__TexteAssignment_1_1_2 ) )
            // InternalMyDsl.g:530:2: ( rule__Action__TexteAssignment_1_1_2 )
            {
             before(grammarAccess.getActionAccess().getTexteAssignment_1_1_2()); 
            // InternalMyDsl.g:531:2: ( rule__Action__TexteAssignment_1_1_2 )
            // InternalMyDsl.g:531:3: rule__Action__TexteAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__TexteAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTexteAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Action__Group_1_1__2__Impl"


    // $ANTLR start "rule__Scenario__NameAssignment_1"
    // InternalMyDsl.g:540:1: rule__Scenario__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Scenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:545:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:545:2: ( RULE_STRING )
            // InternalMyDsl.g:546:3: RULE_STRING
            {
             before(grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__NameAssignment_1"


    // $ANTLR start "rule__Scenario__TitleScenarioAssignment_3"
    // InternalMyDsl.g:555:1: rule__Scenario__TitleScenarioAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Scenario__TitleScenarioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:560:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:560:2: ( RULE_STRING )
            // InternalMyDsl.g:561:3: RULE_STRING
            {
             before(grammarAccess.getScenarioAccess().getTitleScenarioSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getTitleScenarioSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__TitleScenarioAssignment_3"


    // $ANTLR start "rule__Scenario__CasDeTestsAssignment_4"
    // InternalMyDsl.g:570:1: rule__Scenario__CasDeTestsAssignment_4 : ( ruleCasDeTest ) ;
    public final void rule__Scenario__CasDeTestsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( ( ruleCasDeTest ) )
            // InternalMyDsl.g:575:2: ( ruleCasDeTest )
            {
            // InternalMyDsl.g:575:2: ( ruleCasDeTest )
            // InternalMyDsl.g:576:3: ruleCasDeTest
            {
             before(grammarAccess.getScenarioAccess().getCasDeTestsCasDeTestParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCasDeTest();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getCasDeTestsCasDeTestParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Scenario__CasDeTestsAssignment_4"


    // $ANTLR start "rule__CasDeTest__TitreCasDeTestAssignment_1"
    // InternalMyDsl.g:585:1: rule__CasDeTest__TitreCasDeTestAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CasDeTest__TitreCasDeTestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:590:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:590:2: ( RULE_STRING )
            // InternalMyDsl.g:591:3: RULE_STRING
            {
             before(grammarAccess.getCasDeTestAccess().getTitreCasDeTestSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCasDeTestAccess().getTitreCasDeTestSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CasDeTest__TitreCasDeTestAssignment_1"


    // $ANTLR start "rule__CasDeTest__ActionsAssignment_2"
    // InternalMyDsl.g:600:1: rule__CasDeTest__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__CasDeTest__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( ( ruleAction ) )
            // InternalMyDsl.g:605:2: ( ruleAction )
            {
            // InternalMyDsl.g:605:2: ( ruleAction )
            // InternalMyDsl.g:606:3: ruleAction
            {
             before(grammarAccess.getCasDeTestAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getCasDeTestAccess().getActionsActionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CasDeTest__ActionsAssignment_2"


    // $ANTLR start "rule__Action__ActionAssignment_0"
    // InternalMyDsl.g:615:1: rule__Action__ActionAssignment_0 : ( RULE_TYPE ) ;
    public final void rule__Action__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( RULE_TYPE ) )
            // InternalMyDsl.g:620:2: ( RULE_TYPE )
            {
            // InternalMyDsl.g:620:2: ( RULE_TYPE )
            // InternalMyDsl.g:621:3: RULE_TYPE
            {
             before(grammarAccess.getActionAccess().getActionTYPETerminalRuleCall_0_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionTYPETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Action__ActionAssignment_0"


    // $ANTLR start "rule__Action__ValeurAssignment_1_0"
    // InternalMyDsl.g:630:1: rule__Action__ValeurAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__Action__ValeurAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:635:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:635:2: ( RULE_STRING )
            // InternalMyDsl.g:636:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getValeurSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getValeurSTRINGTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Action__ValeurAssignment_1_0"


    // $ANTLR start "rule__Action__ValeurAssignment_1_1_0"
    // InternalMyDsl.g:645:1: rule__Action__ValeurAssignment_1_1_0 : ( RULE_STRING ) ;
    public final void rule__Action__ValeurAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:650:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:650:2: ( RULE_STRING )
            // InternalMyDsl.g:651:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getValeurSTRINGTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getValeurSTRINGTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__Action__ValeurAssignment_1_1_0"


    // $ANTLR start "rule__Action__TexteAssignment_1_1_2"
    // InternalMyDsl.g:660:1: rule__Action__TexteAssignment_1_1_2 : ( RULE_STRING ) ;
    public final void rule__Action__TexteAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:665:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:665:2: ( RULE_STRING )
            // InternalMyDsl.g:666:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Action__TexteAssignment_1_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}