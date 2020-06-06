/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
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
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDebutScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTitreKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTitleScenarioAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTitleScenarioSTRINGTerminalRuleCall_3_0 = (RuleCall)cTitleScenarioAssignment_3.eContents().get(0);
		private final Assignment cCasDeTestsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCasDeTestsCasDeTestParserRuleCall_4_0 = (RuleCall)cCasDeTestsAssignment_4.eContents().get(0);
		private final Keyword cFinScenarioKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Scenario:
		//	"debut Scenario" name=STRING "titre" titleScenario=STRING
		//	casDeTests+=CasDeTest+
		//	"fin Scenario";
		@Override public ParserRule getRule() { return rule; }
		
		//"debut Scenario" name=STRING "titre" titleScenario=STRING casDeTests+=CasDeTest+ "fin Scenario"
		public Group getGroup() { return cGroup; }
		
		//"debut Scenario"
		public Keyword getDebutScenarioKeyword_0() { return cDebutScenarioKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//"titre"
		public Keyword getTitreKeyword_2() { return cTitreKeyword_2; }
		
		//titleScenario=STRING
		public Assignment getTitleScenarioAssignment_3() { return cTitleScenarioAssignment_3; }
		
		//STRING
		public RuleCall getTitleScenarioSTRINGTerminalRuleCall_3_0() { return cTitleScenarioSTRINGTerminalRuleCall_3_0; }
		
		//casDeTests+=CasDeTest+
		public Assignment getCasDeTestsAssignment_4() { return cCasDeTestsAssignment_4; }
		
		//CasDeTest
		public RuleCall getCasDeTestsCasDeTestParserRuleCall_4_0() { return cCasDeTestsCasDeTestParserRuleCall_4_0; }
		
		//"fin Scenario"
		public Keyword getFinScenarioKeyword_5() { return cFinScenarioKeyword_5; }
	}
	public class CasDeTestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.CasDeTest");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCasDeTestKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTitreCasDeTestAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTitreCasDeTestSTRINGTerminalRuleCall_1_0 = (RuleCall)cTitreCasDeTestAssignment_1.eContents().get(0);
		private final Assignment cActionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionsActionParserRuleCall_2_0 = (RuleCall)cActionsAssignment_2.eContents().get(0);
		
		//CasDeTest:
		//	"Cas de test : " titreCasDeTest=STRING
		//	actions+=Action+;
		@Override public ParserRule getRule() { return rule; }
		
		//"Cas de test : " titreCasDeTest=STRING actions+=Action+
		public Group getGroup() { return cGroup; }
		
		//"Cas de test : "
		public Keyword getCasDeTestKeyword_0() { return cCasDeTestKeyword_0; }
		
		//titreCasDeTest=STRING
		public Assignment getTitreCasDeTestAssignment_1() { return cTitreCasDeTestAssignment_1; }
		
		//STRING
		public RuleCall getTitreCasDeTestSTRINGTerminalRuleCall_1_0() { return cTitreCasDeTestSTRINGTerminalRuleCall_1_0; }
		
		//actions+=Action+
		public Assignment getActionsAssignment_2() { return cActionsAssignment_2; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_2_0() { return cActionsActionParserRuleCall_2_0; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cActionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cActionTYPETerminalRuleCall_0_0 = (RuleCall)cActionAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValeurAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cValeurSTRINGTerminalRuleCall_1_0_0 = (RuleCall)cValeurAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cValeurAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cValeurSTRINGTerminalRuleCall_1_1_0_0 = (RuleCall)cValeurAssignment_1_1_0.eContents().get(0);
		private final Keyword cVerticalLineKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cTexteAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cTexteSTRINGTerminalRuleCall_1_1_2_0 = (RuleCall)cTexteAssignment_1_1_2.eContents().get(0);
		
		//Action:
		//	action=TYPE (valeur=STRING | valeur=STRING "|" texte=STRING);
		@Override public ParserRule getRule() { return rule; }
		
		//action=TYPE (valeur=STRING | valeur=STRING "|" texte=STRING)
		public Group getGroup() { return cGroup; }
		
		//action=TYPE
		public Assignment getActionAssignment_0() { return cActionAssignment_0; }
		
		//TYPE
		public RuleCall getActionTYPETerminalRuleCall_0_0() { return cActionTYPETerminalRuleCall_0_0; }
		
		//valeur=STRING | valeur=STRING "|" texte=STRING
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//valeur=STRING
		public Assignment getValeurAssignment_1_0() { return cValeurAssignment_1_0; }
		
		//STRING
		public RuleCall getValeurSTRINGTerminalRuleCall_1_0_0() { return cValeurSTRINGTerminalRuleCall_1_0_0; }
		
		//valeur=STRING "|" texte=STRING
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//valeur=STRING
		public Assignment getValeurAssignment_1_1_0() { return cValeurAssignment_1_1_0; }
		
		//STRING
		public RuleCall getValeurSTRINGTerminalRuleCall_1_1_0_0() { return cValeurSTRINGTerminalRuleCall_1_1_0_0; }
		
		//"|"
		public Keyword getVerticalLineKeyword_1_1_1() { return cVerticalLineKeyword_1_1_1; }
		
		//texte=STRING
		public Assignment getTexteAssignment_1_1_2() { return cTexteAssignment_1_1_2; }
		
		//STRING
		public RuleCall getTexteSTRINGTerminalRuleCall_1_1_2_0() { return cTexteSTRINGTerminalRuleCall_1_1_2_0; }
	}
	
	
	private final ScenarioElements pScenario;
	private final CasDeTestElements pCasDeTest;
	private final ActionElements pAction;
	private final TerminalRule tTYPE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pScenario = new ScenarioElements();
		this.pCasDeTest = new CasDeTestElements();
		this.pAction = new ActionElements();
		this.tTYPE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.TYPE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
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

	
	//Scenario:
	//	"debut Scenario" name=STRING "titre" titleScenario=STRING
	//	casDeTests+=CasDeTest+
	//	"fin Scenario";
	public ScenarioElements getScenarioAccess() {
		return pScenario;
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}
	
	//CasDeTest:
	//	"Cas de test : " titreCasDeTest=STRING
	//	actions+=Action+;
	public CasDeTestElements getCasDeTestAccess() {
		return pCasDeTest;
	}
	
	public ParserRule getCasDeTestRule() {
		return getCasDeTestAccess().getRule();
	}
	
	//Action:
	//	action=TYPE (valeur=STRING | valeur=STRING "|" texte=STRING);
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//terminal TYPE:
	//	"ouvrir url" | "saisir identifiant" | "saisir mot de passe" | "clic id=" | "naviguer" | "verifier id=";
	public TerminalRule getTYPERule() {
		return tTYPE;
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
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
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
