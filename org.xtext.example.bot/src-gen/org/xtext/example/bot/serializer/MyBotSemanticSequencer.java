/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.bot.myBot.ActionAsk;
import org.xtext.example.bot.myBot.ActionRecommend;
import org.xtext.example.bot.myBot.ActionSay;
import org.xtext.example.bot.myBot.AskRecommend;
import org.xtext.example.bot.myBot.AskVariable;
import org.xtext.example.bot.myBot.Bot;
import org.xtext.example.bot.myBot.Genre;
import org.xtext.example.bot.myBot.Language;
import org.xtext.example.bot.myBot.MyBotPackage;
import org.xtext.example.bot.myBot.ShowType;
import org.xtext.example.bot.myBot.Shows;
import org.xtext.example.bot.myBot.State;
import org.xtext.example.bot.myBot.Text;
import org.xtext.example.bot.myBot.Title;
import org.xtext.example.bot.services.MyBotGrammarAccess;

@SuppressWarnings("all")
public class MyBotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyBotGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyBotPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyBotPackage.ACTION_ASK:
				sequence_ActionAsk(context, (ActionAsk) semanticObject); 
				return; 
			case MyBotPackage.ACTION_RECOMMEND:
				sequence_ActionRecommend(context, (ActionRecommend) semanticObject); 
				return; 
			case MyBotPackage.ACTION_SAY:
				sequence_ActionSay(context, (ActionSay) semanticObject); 
				return; 
			case MyBotPackage.ASK_RECOMMEND:
				sequence_AskRecommend(context, (AskRecommend) semanticObject); 
				return; 
			case MyBotPackage.ASK_VARIABLE:
				sequence_AskVariable(context, (AskVariable) semanticObject); 
				return; 
			case MyBotPackage.BOT:
				sequence_Bot(context, (Bot) semanticObject); 
				return; 
			case MyBotPackage.GENRE:
				sequence_Genre(context, (Genre) semanticObject); 
				return; 
			case MyBotPackage.LANGUAGE:
				sequence_Language(context, (Language) semanticObject); 
				return; 
			case MyBotPackage.SHOW_TYPE:
				sequence_ShowType(context, (ShowType) semanticObject); 
				return; 
			case MyBotPackage.SHOWS:
				sequence_Shows(context, (Shows) semanticObject); 
				return; 
			case MyBotPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case MyBotPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			case MyBotPackage.TITLE:
				sequence_Title(context, (Title) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionAsk returns ActionAsk
	 *
	 * Constraint:
	 *     (text+=Text askVariable+=AskVariable)
	 */
	protected void sequence_ActionAsk(ISerializationContext context, ActionAsk semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionRecommend returns ActionRecommend
	 *
	 * Constraint:
	 *     (text+=Text askRecommend+=AskRecommend*)
	 */
	protected void sequence_ActionRecommend(ISerializationContext context, ActionRecommend semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionSay returns ActionSay
	 *
	 * Constraint:
	 *     text+=Text
	 */
	protected void sequence_ActionSay(ISerializationContext context, ActionSay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AskRecommend returns AskRecommend
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AskRecommend(ISerializationContext context, AskRecommend semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyBotPackage.Literals.ASK_RECOMMEND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyBotPackage.Literals.ASK_RECOMMEND__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAskRecommendAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AskVariable returns AskVariable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AskVariable(ISerializationContext context, AskVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyBotPackage.Literals.ASK_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyBotPackage.Literals.ASK_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAskVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Bot returns Bot
	 *
	 * Constraint:
	 *     (shows+=Shows* state+=State*)
	 */
	protected void sequence_Bot(ISerializationContext context, Bot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Genre returns Genre
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Genre(ISerializationContext context, Genre semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyBotPackage.Literals.GENRE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyBotPackage.Literals.GENRE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGenreAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Language returns Language
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Language(ISerializationContext context, Language semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyBotPackage.Literals.LANGUAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyBotPackage.Literals.LANGUAGE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ShowType returns ShowType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ShowType(ISerializationContext context, ShowType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyBotPackage.Literals.SHOW_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyBotPackage.Literals.SHOW_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShowTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Shows returns Shows
	 *
	 * Constraint:
	 *     (showType+=ShowType genre+=Genre language+=Language title+=Title)
	 */
	protected void sequence_Shows(ISerializationContext context, Shows semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID actionSay+=ActionSay actionAsk+=ActionAsk? actionRecommend+=ActionRecommend?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Text returns Text
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyBotPackage.Literals.TEXT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyBotPackage.Literals.TEXT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Title returns Title
	 *
	 * Constraint:
	 *     name=Text
	 */
	protected void sequence_Title(ISerializationContext context, Title semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyBotPackage.Literals.TITLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyBotPackage.Literals.TITLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTitleAccess().getNameTextParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
