/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.myBot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.bot.myBot.Title#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.bot.myBot.MyBotPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Text)
   * @see org.xtext.example.bot.myBot.MyBotPackage#getTitle_Name()
   * @model containment="true"
   * @generated
   */
  Text getName();

  /**
   * Sets the value of the '{@link org.xtext.example.bot.myBot.Title#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Text value);

} // Title