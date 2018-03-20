import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://servicenow-apttus11.apttuscloud.com/ui/cpq/quote/detail/678d610b-3821-e811-896b-00155d7fe074?flow=Default&uid=ce652490-210e-e811-80c2-0004ffb07c3f')

WebUI.setText(findTestObject('Page_SSOUAT (6)/input_username'), 'prachy.gupta@servicenow.com')

WebUI.setText(findTestObject('Page_SSOUAT (6)/input_password'), 'White%balls%')

WebUI.click(findTestObject('Page_SSOUAT (6)/input_submitButton'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page (9)/button_Configure Products'), 90)

attribute = WebUI.getAttribute(findTestObject('Page_Apttus - Quote Page (11)/div_Draft'), 'class')

verifttrue = attribute.contains('select')

assert verifttrue == true

quote = WebUI.getText(findTestObject('Page_Apttus - Quote Page (13)/QUOTEid'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (9)/button_Configure Products'))

WebUI.waitForElementVisible(findTestObject('Page_CPQ Cart (3)/input_catalog-search-input fie'), 60)

WebUI.setText(findTestObject('Page_CPQ Cart (3)/input_catalog-search-input fie'), 'Service Management Suite v2 with Performance Analytics - Fulfiller User ')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_CPQ Cart (3)/input_catalog-search-input fie'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart (3)/button_Configure...'), 60)

WebUI.click(findTestObject('Page_CPQ Cart (3)/button_Configure...'))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart (3)/button_Go to Pricing'), 60)

WebUI.click(findTestObject('Page_CPQ Cart (3)/button_Go to Pricing'))

WebUI.setText(findTestObject('Page_CPQ Cart (3)/input_Apttus_Config2__Quantity'), '5')

WebUI.click(findTestObject('Page_CPQ Cart (3)/button_Reprice'))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart (3)/button_Reprice'), 90)

WebUI.click(findTestObject('Page_CPQ Cart (3)/b'))

WebUI.click(findTestObject('Page_CPQ Cart (3)/div_ Discount'))

WebUI.setText(findTestObject('Page_CPQ Cart (3)/input_Apttus_Config2__Adjustme'), '10')

WebUI.click(findTestObject('Page_CPQ Cart (3)/button_Reprice'))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart (3)/button_Reprice'), 90)

WebUI.click(findTestObject('Page_CPQ Cart (3)/button_Finalize'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page (9)/md-tab-item_Approvals'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page (9)/md-tab-item_Approvals'))

WebUI.waitForAngularLoad(90)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page (9)/button_Submit'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page (9)/button_Submit'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page (9)/button_Generate and Send Propo'), 90)

attribute = WebUI.getAttribute(findTestObject('Page_Apttus - Quote Page (11)/div_Approved'), 'class')

verifttrue = attribute.contains('select')

assert verifttrue == true

WebUI.click(findTestObject('Page_Apttus - Quote Page (9)/button_Generate and Send Propo'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - DocGen (3)/button_New Proposal Document'), 90)

WebUI.click(findTestObject('Page_Apttus - DocGen (3)/button_New Proposal Document'))

WebUI.selectOptionByValue(findTestObject('Page_Apttus - DocGen (3)/select_PDFDOCX'), 'string:DOCX', true)

WebUI.setText(findTestObject('Page_Apttus - DocGen (3)/input_form-control'), 'te')

WebUI.waitForElementVisible(findTestObject('Page_Apttus - DocGen (5)/td_Budgetary Quote Template'), 90)

WebUI.click(findTestObject('Page_Apttus - DocGen (5)/td_Budgetary Quote Template'))

WebUI.click(findTestObject('Page_Apttus - DocGen (3)/button_Generate'))

WebUI.waitForElementVisible(findTestObject('Page_Apttus - DocGen (3)/button_Email'), 90)

WebUI.delay(70)

WebUI.verifyElementPresent(findTestObject('Page_Apttus - DocGen (4)/verifyDocGenerated'), 90)

WebUI.click(findTestObject('Page_Apttus - DocGen (3)/button_Email'))

WebUI.setText(findTestObject('Page_Apttus - DocGen (3)/input_subjectLine'), 'test')

WebUI.delay(2)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Apttus - DocGen (4)/enterName'), 'testemail')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Apttus - DocGen (4)/emailselect'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Apttus - DocGen (3)/button_Send'))

WebUI.delay(30)

WebUI.click(findTestObject('Page_Apttus - DocGen (4)/linkQuote'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page (9)/button_Accept Quote'), 90)

attribute = WebUI.getAttribute(findTestObject('Page_Apttus - Quote Page (11)/div_Presented'), 'class')

'hard coded as an object\r\n'
WebUI.verifyElementPresent(findTestObject('Page_Apttus - Quote Page (13)/firstProductPresent'), 90)

verifttrue = attribute.contains('select')

assert verifttrue == true

WebUI.click(findTestObject('Page_Apttus - Quote Page (9)/button_Accept Quote'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page (9)/button_Yes'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page (9)/button_Yes'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma (3)/button_Generate'), 90)

title = WebUI.getWindowTitle()

assert title == 'Apttus - Contract Lifecycle Management'

quoteidclm = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma (8)/quoteid'))

WebUI.verifyEqual(quoteidclm, quote)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma (3)/button_Generate'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma (7)/div_md-off'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma (7)/div_md-off'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma (3)/button_Submit'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma (3)/button_Submit'))

WebUI.closeBrowser()

