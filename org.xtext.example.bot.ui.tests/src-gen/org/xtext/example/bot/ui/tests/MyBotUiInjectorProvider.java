/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.bot.ui.internal.BotActivator;

public class MyBotUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BotActivator.getInstance().getInjector("org.xtext.example.bot.MyBot");
	}

}
