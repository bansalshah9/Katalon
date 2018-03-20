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

WebUI.navigateToUrl('https://servicenow-apttus11.apttuscloud.com/ui/cpq/quote/detail/5e102c4c-7523-e811-896b-00155d7fe074?flow=Default&uid=ce652490-210e-e811-80c2-0004ffb07c3f')

WebUI.setText(findTestObject('Page_SSOUAT (10)/input_username'), 'prachy.gupta@servicenow.com')

WebUI.setText(findTestObject('Page_SSOUAT (10)/input_password'), 'White%balls%')

WebUI.click(findTestObject('Page_SSOUAT (10)/input_submitButton'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/md-icon_more_vert'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/li_Revert To Draft'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/button_Configure Products'))

WebUI.click(findTestObject('Page_CPQ Cart (4)/button_Finalize'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/div_Approvals'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/button_Submit'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/span_3'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/md-icon_more_vert'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/button_Approve'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/span_3'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/md-icon_more_vert'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/span_Approve'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/span_Approve'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/span_3'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/md-list_2.1'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/md-icon_more_vert'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/span_Approve'))

WebUI.click(findTestObject('Page_Apttus - Quote Page (15)/span_Approve'))

WebUI.closeBrowser()

