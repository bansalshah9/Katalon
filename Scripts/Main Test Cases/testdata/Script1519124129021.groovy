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
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.InternalData as InternalData

ExcelData data = findTestData('data')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://myapplications--devfull.cs93.my.salesforce.com/')

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://servicenow-dev5.apttuscloud.com/ui/cpq/quote/home')

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_SSOUAT (6)/div_  document.write(dynamicTe'))

WebUI.setText(findTestObject('Page_Apttus - Quote Page/Page_SSOUAT (6)/input_username'), 'neehar.goel')

WebUI.setText(findTestObject('Page_Apttus - Quote Page/Page_SSOUAT (6)/input_password'), 'nub55.airbag')

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_SSOUAT (6)/input_submitButton'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/button_New Quote'))

WebUI.setText(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/input_QuoteName (1)'), 'tes')

WebUI.setText(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/input_QuoteName (1)'), 'te')

WebUI.setText(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/input_QuoteName (1)'), 'test')

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/md-select_NoneNew BusinessRene'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/div_New Business'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/md-select_DirectIndirectNone'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/md-option_Direct'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/span_Save'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (6)/span_Save'))

WebUI.closeBrowser()*/

WebUI.setText(findTestObject('Page_Login  Salesforce/input_username'), demo_usn, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Login  Salesforce/input_pw'),data.internallyGetValue("demo_usn", 0), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Login  Salesforce/input_pw'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Salesforce - Unlimited Edition/a_Agreements'))

WebUI.click(findTestObject('Page_Agreements Home  Salesforce -/input_new'))

WebUI.selectOptionByValue(findTestObject('Page_New Agreement Select Agreement/select_Advisory Board LetterAg'), '012d0000001lBoB', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_New Agreement Select Agreement/select_Advisory Board LetterAg'), '012d0000001lBoA', 
    true)

WebUI.click(findTestObject('Page_New Agreement Select Agreement/input_save'))

WebUI.click(findTestObject('Page_Salesforce - Unlimited Edition/input_j_id0j_id1j_id2j_id3j_id'))

WebUI.setText(findTestObject('Page_Agreement Edit Enter Title  Sa/input_Name'), agreement_name, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Agreement Edit Enter Title  Sa/img_lookupIconOn'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Page_Search  Salesforce - Unlimited/th_Open Society Institute'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_Agreement Edit Enter Title  Sa/img_lookupIconOn_1'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Page_Search  Salesforce - Unlimited/th_Womens Education for Advanc'))

WebUI.click(findTestObject('Page_Agreement Edit Enter Title  Sa/img_lookupIconOn_2'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('TestAutomation/testdata/Page_Search  Salesforce - Unlimited/Page_Search  Salesforce - Unlimited/a_Ruth Margerison'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_Agreement Edit Enter Title  Sa/img_lookupIconOn_3'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('TestAutomation/testdata/Page_Search  Salesforce - Unlimited/a_US Dollar'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('TestAutomation/testdata/Page_Search  Salesforce - Unlimited/Page_Agreement Edit Enter Title  Sa/input_00Nd0000009K7Xb'))

WebUI.click(findTestObject('TestAutomation/testdata/Page_Search  Salesforce - Unlimited/Page_Agreement Edit Enter Title  Sa/a_2222018'))

WebUI.click(findTestObject('TestAutomation/testdata/Page_Search  Salesforce - Unlimited/Page_Agreement Edit Enter Title  Sa/input_00Nd0000009K7XZ'))

WebUI.click(findTestObject('TestAutomation/testdata/Page_Search  Salesforce - Unlimited/Page_Agreement Edit Enter Title  Sa/Page_Agreement Edit Enter Title  Sa/td_23'))

WebUI.setText(findTestObject('Page_Agreement Edit Enter Title  Sa/textarea_00Nd0000009K8Q4'), 'test')

WebUI.selectOptionByValue(findTestObject('Page_Agreement Edit Enter Title  Sa/select_AfghanistanAland Island'), '2', true)

WebUI.click(findTestObject('Page_Agreement Edit Enter Title  Sa/img_00Nd0000009K8P9_right_arro'))

WebUI.click(findTestObject('Page_Agreement Edit Enter Title  Sa/td_--None--YesNonew picklist(0'))

WebUI.selectOptionByValue(findTestObject('Page_Agreement Edit Enter Title  Sa/select_--None--YesNo'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Page_Agreement Edit Enter Title  Sa/select_--None--YesNo_1'), 'Yes', true)

WebUI.selectOptionByValue(findTestObject('Page_Agreement Edit Enter Title  Sa/select_--None--YesNo'), 'No', true)

WebUI.selectOptionByValue(findTestObject('Page_Agreement Edit Enter Title  Sa/select_--None--YesNo_1'), 'No', true)

WebUI.selectOptionByValue(findTestObject('Page_Agreement Edit Enter Title  Sa/select_--None--YesNo_2'), 'No', true)

WebUI.click(findTestObject('Page_Agreement Edit Enter Title  Sa/input_save'))

WebUI.closeBrowser()

