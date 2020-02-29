/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.myBot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Ask</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.bot.myBot.ActionAsk#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.bot.myBot.ActionAsk#getAskVariable <em>Ask Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.bot.myBot.MyBotPackage#getActionAsk()
 * @model
 * @generated
 */
public interface ActionAsk extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.bot.myBot.Text}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference list.
   * @see org.xtext.example.bot.myBot.MyBotPackage#getActionAsk_Text()
   * @model containment="true"
   * @generated
   */
  EList<Text> getText();

  /**
   * Returns the value of the '<em><b>Ask Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.bot.myBot.AskVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ask Variable</em>' containment reference list.
   * @see org.xtext.example.bot.myBot.MyBotPackage#getActionAsk_AskVariable()
   * @model containment="true"
   * @generated
   */
  EList<AskVariable> getAskVariable();

} // ActionAsk