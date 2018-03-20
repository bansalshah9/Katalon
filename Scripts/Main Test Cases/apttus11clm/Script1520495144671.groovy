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

WebUI.navigateToUrl(CLMURL)

WebUI.setText(findTestObject('Page_SSOUAT/input_username'), Username)

WebUI.setText(findTestObject('Page_SSOUAT/input_password'), password)

WebUI.click(findTestObject('Page_SSOUAT/input_submitButton'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send to Requester'), 90)

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-chip_In Authoring  Author C'))

WebUI.verifyEqual('In Authoring | Author Contract', statusAuthoring)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/nextbutton'))

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/nextbutton'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-tab-item_Approvals'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/div_Approvals'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Submit - Copy'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Submit - Copy'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send for Review'), 90)

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-chip_In Authoring  Language'))

WebUI.verifyEqual('In Authoring | Language Approved', statusAuthoring)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send for Review'))

WebUI.setText(findTestObject('Page_Apttus - Contract Lifecycle Ma/input_name-input-0'), reviewUsername)

WebUI.setText(findTestObject('Page_Apttus - Contract Lifecycle Ma/input_email-input-0'), reviewEmail)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/span_Template selection'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Apttus - Contract Lifecycle Ma/input_Subject'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/div_note-editable panel-body'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/selectTemplate'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-option_Send for Review (MOA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_OK'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_OK'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send for Wet Signature'), 90)

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-chip_In Authoring  Other Pa'))

WebUI.verifyEqual('In Authoring | Other Party Review', statusAuthoring)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send for Wet Signature'))

WebUI.setText(findTestObject('Page_Apttus - Contract Lifecycle Ma/input_name-input-0'), SignUsername)

WebUI.setText(findTestObject('Page_Apttus - Contract Lifecycle Ma/input_email-input-0'), SignEmail)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/span_Additional Details'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Apttus - Contract Lifecycle Ma/input_Subject'), 'test')

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/div_note-editable panel-body'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/selectTemplate'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-option_Send for Signature (_1'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Send'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_OK'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_OK'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Mark as Signed'), 90)

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-chip_In Signatures  Pending'))

WebUI.verifyEqual('In Signatures | Pending Other Party Signature', statusAuthoring)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Mark as Signed'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Yes'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Yes'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Close'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma/button_Close'))

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma/md-chip_In Signatures  Fully S'))

WebUI.verifyEqual('In Signatures | Fully Signed', statusAuthoring)

WebUI.closeBrowser()

