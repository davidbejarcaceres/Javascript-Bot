/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.myBot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.bot.myBot.Shows#getShowType <em>Show Type</em>}</li>
 *   <li>{@link org.xtext.example.bot.myBot.Shows#getGenre <em>Genre</em>}</li>
 *   <li>{@link org.xtext.example.bot.myBot.Shows#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.xtext.example.bot.myBot.Shows#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.bot.myBot.MyBotPackage#getShows()
 * @model
 * @generated
 */
public interface Shows extends EObject
{
  /**
   * Returns the value of the '<em><b>Show Type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.bot.myBot.ShowType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Type</em>' containment reference list.
   * @see org.xtext.example.bot.myBot.MyBotPackage#getShows_ShowType()
   * @model containment="true"
   * @generated
   */
  EList<ShowType> getShowType();

  /**
   * Returns the value of the '<em><b>Genre</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.bot.myBot.Genre}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Genre</em>' containment reference list.
   * @see org.xtext.example.bot.myBot.MyBotPackage#getShows_Genre()
   * @model containment="true"
   * @generated
   */
  EList<Genre> getGenre();

  /**
   * Returns the value of the '<em><b>Language</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.bot.myBot.Language}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' containment reference list.
   * @see org.xtext.example.bot.myBot.MyBotPackage#getShows_Language()
   * @model containment="true"
   * @generated
   */
  EList<Language> getLanguage();

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.bot.myBot.Title}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference list.
   * @see org.xtext.example.bot.myBot.MyBotPackage#getShows_Title()
   * @model containment="true"
   * @generated
   */
  EList<Title> getTitle();

} // Shows
