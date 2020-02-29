/*
 * generated by Xtext 2.17.1
 * Author: David Béjar Cáceres 2019
 */
package org.xtext.example.bot.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

// src/src-gen/org.xtext.example.bot.*
import org.xtext.example.bot.MyBotStandaloneSetupGenerated
import org.xtext.example.bot.AbstractMyBotRuntimeModule

// src/src-gen/org.xtext.example.bot.myBot.*
import org.xtext.example.bot.myBot.ActionAsk
import org.xtext.example.bot.myBot.ActionRecommend
import org.xtext.example.bot.myBot.ActionSay
import org.xtext.example.bot.myBot.AskRecommend
import org.xtext.example.bot.myBot.AskVariable
import org.xtext.example.bot.myBot.Bot
import org.xtext.example.bot.myBot.Genre
import org.xtext.example.bot.myBot.Language
import org.xtext.example.bot.myBot.MyBotFactory
import org.xtext.example.bot.myBot.MyBotPackage
import org.xtext.example.bot.myBot.Shows
import org.xtext.example.bot.myBot.ShowType 
import org.xtext.example.bot.myBot.State
import org.xtext.example.bot.myBot.Text
import org.xtext.example.bot.myBot.Title
import org.eclipse.emf.common.util.EList
import java.util.Random

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyBotGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		fsa.generateFile(resource.className+".js",
			toJavaCode(resource.contents.head as Bot))
	}
	
	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}
	
	def toJavaCode(Bot sm){
		'''
		var restify = require('restify');
		var builder = require('botbuilder');
		
		//Creates global variables
		«FOR state : sm.state»
			«FOR aa : state.actionAsk»
				«var variableName = aa.askVariable.get(0).name»var «variableName.substring (1,variableName.length-1)» = "";
			«ENDFOR»
		«ENDFOR»
		
		//Define characteristics that match with shows 
		var characteristics=[]
		«FOR show : sm.shows»
			«var tipo = show.showType.get(0).name»
			«var genero = show.genre.get(0).name»
			«var idioma = show.language.get(0).name»
			characteristics[«sm.shows.indexOf(show)»] =  "«tipo.toLowerCase»" + "«genero.toLowerCase»" + "«idioma.toLowerCase»";
		«ENDFOR»
		
		//Define the shows that match with the characteristics
		var shows=[]
		«FOR show : sm.shows» 
			«var titulo = show.title.get(0).name.name»shows[«sm.shows.indexOf(show)»] =  "«titulo»";
		«ENDFOR»
		
		// Setup Restify Server
		var server = restify.createServer();
		server.listen(process.env.port || process.env.PORT || 3978, function () {
			console.log('%s listening to %s', server.name, server.url);
		});
		
		// Create chat connector for communicating with the Bot Framework Service
		var connector = new builder.ChatConnector({
			appId: process.env.MICROSOFT_APP_ID,
			appPassword: process.env.MICROSOFT_APP_PASSWORD
		});
		
		// Listen for messages from users
		server.post('/api/messages', connector.listen());
		
		// Service dialog
		var bot = new builder.UniversalBot(connector, [
			//Initial welcome
		    function (session) {
	            // A Card's Submit Action obj for reservation was received
	            if (session.message && session.message.value) {
	            	//Call the processSubmitAction Function to process reservation
	                processSubmitAction(session, session.message.value);
	                return;
	            }
		    
            //ITERATE STATES-ACTION
			«FOR state : sm.state»
			«generateCode(state)»
			«ENDFOR»
		
			}
		//END OF THE MAIN BODY
		])
		
		//Capture and process reservation
		function processSubmitAction(session, value) {
			var reply=value.reply;
		    if (reply.toLowerCase()=="no"){
		        session.send("We are sorry you didn't want to buy it. You can search for a different one!");
		    } else if (reply.toLowerCase()=="yes"){
		        session.send("Congratulations, you just bought it :)!");
		    } else {
		        session.send("Congratulations, you just bought season(s) " + reply + " :)!");
		    }
		        session.endDialog();
		}
		'''
		
	}
	
	def generateCode(State state) {
		'''
		«IF (!state.name.equals("Four") && !state.name.equals("Five"))»
				«generateSay(state.actionSay.get(0).text)»
			«generateAsk(state.actionAsk.get(0).text, state.actionAsk.get(0).askVariable)»
		«ELSEIF(state.name.equals("Four"))»
			«generateRecommendFound(state)»
		«ELSE»
			«generateRecommendNotFound(state)»
		«ENDIF»
		'''
	}
	
	def generateRecommendNotFound(State state) {
		'''
		«»
			if (showFound == false){
				var random = parseInt(Math.random() * (characteristics.length - 1));
				«generateSay(state.actionSay.get(0).text)»
				«generateRecommendMessage(state.actionRecommend.get(0).text, "random")»
				bot.dialog(shows[random], require('./'+shows[random])); 
				session.beginDialog(shows[random]);
			}
		'''
	}
	
	def generateRecommendFound(State state) {
		'''
		«var userCharacteristics = caracteristicsList(state)»
			var userCharacteristics = «userCharacteristics»;
			var showFound = false;
			for (i=0; i<characteristics.length; i++){
				if (userCharacteristics == characteristics[i]){
					showFound = true;
					«generateSay(state.actionSay.get(0).text)»
					«generateRecommendMessage(state.actionRecommend.get(0).text, "i")»
					bot.dialog(shows[i], require('./'+shows[i]));
			        session.beginDialog(shows[i]);
			    }
			}
		'''
	}
	
	def generateRecommendMessage(EList<Text> list, String index){
		'''
		session.send("«list.get(0).name»" + "***" + shows[«index»] + "***");
		'''
	}
	
	def generateAsk(EList<Text> listActionAsk, EList<AskVariable> listAskVariable) {
		'''
		«»
			builder.Prompts.text(session, "«listActionAsk.get(0).name»");
		
		},
		function (session, results) {
			«var variableName = listAskVariable.get(0).name»«variableName.substring (1,variableName.length-1)» = results.response.toLowerCase();
		'''
	}
	
	def generateSay(EList<Text> listSay) {
		'''
		«FOR say : listSay»
			session.send("«say.name»");
		«ENDFOR»
		'''
	}
	
	def String caracteristicsList(State state) { //Returns the list of characteristics, line 65
    	var carac = ""
    	var numVariables = state.actionRecommend.get(0).askRecommend.size
    	for (variable : state.actionRecommend.get(0).askRecommend) {    		
    		var nombre =  variable.name
    		//listaCaracteristicas.add(nombre.substring(1, nombre.length-1))
    		if (state.actionRecommend.get(0).askRecommend.indexOf(variable) != numVariables-1){
    			carac = (carac + nombre.substring(1, nombre.length-1) + " + " + " ")
    		} else{
    			carac = (carac + nombre.substring(1, nombre.length-1))
    		}
    	}
    	return carac
  	}
}