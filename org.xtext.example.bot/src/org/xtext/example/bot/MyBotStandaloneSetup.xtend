/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MyBotStandaloneSetup extends MyBotStandaloneSetupGenerated {

	def static void doSetup() {
		new MyBotStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
