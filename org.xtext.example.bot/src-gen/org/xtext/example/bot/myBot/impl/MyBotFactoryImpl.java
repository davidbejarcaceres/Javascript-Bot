/**
 * generated by Xtext 2.17.1
 */
package org.xtext.example.bot.myBot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.bot.myBot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyBotFactoryImpl extends EFactoryImpl implements MyBotFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyBotFactory init()
  {
    try
    {
      MyBotFactory theMyBotFactory = (MyBotFactory)EPackage.Registry.INSTANCE.getEFactory(MyBotPackage.eNS_URI);
      if (theMyBotFactory != null)
      {
        return theMyBotFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyBotFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyBotFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyBotPackage.BOT: return createBot();
      case MyBotPackage.SHOWS: return createShows();
      case MyBotPackage.SHOW_TYPE: return createShowType();
      case MyBotPackage.GENRE: return createGenre();
      case MyBotPackage.LANGUAGE: return createLanguage();
      case MyBotPackage.TITLE: return createTitle();
      case MyBotPackage.STATE: return createState();
      case MyBotPackage.ACTION_SAY: return createActionSay();
      case MyBotPackage.ACTION_ASK: return createActionAsk();
      case MyBotPackage.ACTION_RECOMMEND: return createActionRecommend();
      case MyBotPackage.TEXT: return createText();
      case MyBotPackage.ASK_VARIABLE: return createAskVariable();
      case MyBotPackage.ASK_RECOMMEND: return createAskRecommend();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bot createBot()
  {
    BotImpl bot = new BotImpl();
    return bot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Shows createShows()
  {
    ShowsImpl shows = new ShowsImpl();
    return shows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShowType createShowType()
  {
    ShowTypeImpl showType = new ShowTypeImpl();
    return showType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Genre createGenre()
  {
    GenreImpl genre = new GenreImpl();
    return genre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Language createLanguage()
  {
    LanguageImpl language = new LanguageImpl();
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Title createTitle()
  {
    TitleImpl title = new TitleImpl();
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionSay createActionSay()
  {
    ActionSayImpl actionSay = new ActionSayImpl();
    return actionSay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionAsk createActionAsk()
  {
    ActionAskImpl actionAsk = new ActionAskImpl();
    return actionAsk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionRecommend createActionRecommend()
  {
    ActionRecommendImpl actionRecommend = new ActionRecommendImpl();
    return actionRecommend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AskVariable createAskVariable()
  {
    AskVariableImpl askVariable = new AskVariableImpl();
    return askVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AskRecommend createAskRecommend()
  {
    AskRecommendImpl askRecommend = new AskRecommendImpl();
    return askRecommend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyBotPackage getMyBotPackage()
  {
    return (MyBotPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyBotPackage getPackage()
  {
    return MyBotPackage.eINSTANCE;
  }

} //MyBotFactoryImpl
