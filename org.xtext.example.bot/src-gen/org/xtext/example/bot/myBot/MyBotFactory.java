/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.myBot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.bot.myBot.MyBotPackage
 * @generated
 */
public interface MyBotFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyBotFactory eINSTANCE = org.xtext.example.bot.myBot.impl.MyBotFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Bot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bot</em>'.
   * @generated
   */
  Bot createBot();

  /**
   * Returns a new object of class '<em>Shows</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shows</em>'.
   * @generated
   */
  Shows createShows();

  /**
   * Returns a new object of class '<em>Show Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Type</em>'.
   * @generated
   */
  ShowType createShowType();

  /**
   * Returns a new object of class '<em>Genre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Genre</em>'.
   * @generated
   */
  Genre createGenre();

  /**
   * Returns a new object of class '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language</em>'.
   * @generated
   */
  Language createLanguage();

  /**
   * Returns a new object of class '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Title</em>'.
   * @generated
   */
  Title createTitle();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Action Say</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Say</em>'.
   * @generated
   */
  ActionSay createActionSay();

  /**
   * Returns a new object of class '<em>Action Ask</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Ask</em>'.
   * @generated
   */
  ActionAsk createActionAsk();

  /**
   * Returns a new object of class '<em>Action Recommend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Recommend</em>'.
   * @generated
   */
  ActionRecommend createActionRecommend();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Ask Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ask Variable</em>'.
   * @generated
   */
  AskVariable createAskVariable();

  /**
   * Returns a new object of class '<em>Ask Recommend</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ask Recommend</em>'.
   * @generated
   */
  AskRecommend createAskRecommend();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyBotPackage getMyBotPackage();

} //MyBotFactory
