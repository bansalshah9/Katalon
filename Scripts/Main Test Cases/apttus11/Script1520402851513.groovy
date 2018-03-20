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

WebUI.navigateToUrl(CPQURL)

WebUI.setText(findTestObject('Page_SSOUAT/input_username'), Username)

WebUI.setText(findTestObject('Page_SSOUAT/input_password'), password)

WebUI.click(findTestObject('Page_SSOUAT/input_submitButton'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Configure Products'), 90)

attribute = WebUI.getAttribute(findTestObject('Page_Apttus - Quote Page/div_Draft'), 'class')

verifttrue = attribute.contains('select')

WebUI.verifyEqual(true, verifttrue)

quote = WebUI.getText(findTestObject('Page_Apttus - Quote Page/QUOTEid'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Configure Products'))

WebUI.waitForElementVisible(findTestObject('Page_CPQ Cart/input_catalog-search-input fie'), 60)

WebUI.setText(findTestObject('Page_CPQ Cart/input_catalog-search-input fie'), Product)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_CPQ Cart/input_catalog-search-input fie'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart/button_Configure...'), 60)

WebUI.click(findTestObject('Page_CPQ Cart/button_Configure...'))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart/button_Go to Pricing'), 60)

WebUI.click(findTestObject('Page_CPQ Cart/button_Go to Pricing'))

WebUI.setText(findTestObject('Page_CPQ Cart/input_Apttus_Config2__Quantity'), '5')

WebUI.click(findTestObject('Page_CPQ Cart/button_Reprice'))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart/button_Reprice'), 90)

WebUI.click(findTestObject('Page_CPQ Cart/b'))

WebUI.click(findTestObject('Page_CPQ Cart/div_ Discount'))

WebUI.setText(findTestObject('Page_CPQ Cart/input_Apttus_Config2__Adjustme'), '10')

WebUI.click(findTestObject('Page_CPQ Cart/button_Reprice'))

WebUI.waitForElementClickable(findTestObject('Page_CPQ Cart/button_Reprice'), 90)

WebUI.click(findTestObject('Page_CPQ Cart/button_Finalize'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/md-tab-item_Approvals'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/md-tab-item_Approvals'))

WebUI.waitForAngularLoad(90)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Submit'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Submit'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Generate and Send Propo'), 90)

attribute = WebUI.getAttribute(findTestObject('Page_Apttus - Quote Page/div_Approved'), 'class')

verifttrue = attribute.contains('select')

WebUI.verifyEqual(true, verifttrue)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Generate and Send Propo'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - DocGen/button_New Proposal Document'), 90)

WebUI.click(findTestObject('Page_Apttus - DocGen/button_New Proposal Document'))

WebUI.selectOptionByValue(findTestObject('Page_Apttus - DocGen/select_PDFDOCX'), 'string:DOCX', true)

WebUI.setText(findTestObject('Page_Apttus - DocGen/input_form-control'), 'te')

WebUI.waitForElementVisible(findTestObject('Page_Apttus - DocGen/td_Budgetary Quote Template'), 90)

WebUI.click(findTestObject('Page_Apttus - DocGen/td_Budgetary Quote Template'))

WebUI.click(findTestObject('Page_Apttus - DocGen/button_Generate'))

WebUI.waitForElementVisible(findTestObject('Page_Apttus - DocGen/button_Email'), 90)

WebUI.delay(70)

WebUI.verifyElementPresent(findTestObject('Page_Apttus - DocGen/verifyDocGenerated'), 90)

WebUI.click(findTestObject('Page_Apttus - DocGen/button_Email'))

WebUI.setText(findTestObject('Page_Apttus - DocGen/input_subjectLine'), 'test')

WebUI.delay(2)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Apttus - DocGen/enterName'), 'testemail')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Apttus - DocGen/emailselect'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Apttus - DocGen/button_Send'))

WebUI.delay(30)

WebUI.click(findTestObject('Page_Apttus - DocGen/linkQuote'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Accept Quote'), 90)

attribute = WebUI.getAttribute(findTestObject('Page_Apttus - Quote Page/div_Presented'), 'class')

'hard coded as an object\r\n'
WebUI.verifyElementPresent(findTestObject('Page_Apttus - Quote Page/firstProductPresent'), 90)

verifttrue = attribute.contains('select')

WebUI.verifyEqual(true, verifttrue)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Accept Quote'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Yes'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Yes'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Generate'), 90)

title = WebUI.getWindowTitle()

assert title == 'Apttus - Contract Lifecycle Management'

quoteidclm = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/quoteid'))

WebUI.verifyEqual(quoteidclm, quote)

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-chip_Request  Request'))

WebUI.verifyEqual('Request | Request', statusAuthoring)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Generate'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/div_md-off'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/div_md-off'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Submit'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Submit'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send to Requester'), 90)

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-chip_In Authoring  Author C'))

WebUI.verifyEqual('In Authoring | Author Contract', statusAuthoring)

WebUI.delay(5)

WebUI.closeBrowser()

