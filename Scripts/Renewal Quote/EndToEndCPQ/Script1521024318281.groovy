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

//Launch Browser
WebUI.openBrowser('')

//Maximize browser Window
WebUI.maximizeWindow()

//Launch URL
WebUI.navigateToUrl('https://servicenow-apttus11.apttuscloud.com/ui/cpq/quote/detail/5e102c4c-7523-e811-896b-00155d7fe074')

//Enter UserName
WebUI.setText(findTestObject('Page_SSOUAT/input_username'), userName)

//Enter Password
WebUI.setText(findTestObject('Page_SSOUAT/input_password'), password)

//Click on Submit button
WebUI.click(findTestObject('Page_SSOUAT/input_submitButton'))

//Wait for element to be present or page to be load
WebUI.waitForElementVisible(findTestObject('Page_Apttus - Quote Page/button_Configure Products'), 90)

//Store the value to Type selected in quote
//resultType1 = WebUI.getText(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page/div_Renewal'))
// Verify the value of Type with the predefined variable
//assert resultType == resultType1
//Get the text of AgreementId and store it in AgreementIdVar
AgreementIdVar = WebUI.getText(findTestObject('Page_Apttus - Quote Page/span_OF0763435-1'))

//Verify the values
assert AgreementId == AgreementIdVar

//Get the ExpectedStartDate value and store it in ExpectedStartDateVar
ExpectedStartDateVar = WebUI.getText(findTestObject('Page_Apttus - Quote Page/div_2019-03-09'))

//Verify the value
//assert ExpectedStartDate == ExpectedStartDateVar
//WebUI.verifyMatch(ExpectedStartDate, ExpectedStartDate, true)
ExpectedEndDateVar = WebUI.getText(findTestObject('Page_Apttus - Quote Page/div_2022-03-08'))

//assert ExpectedEndDate == ExpectedEndDateVar
//Click on Configure Products
WebUI.click(findTestObject('Page_Apttus - Quote Page/span_Configure Products'))

//Wait for page to be load and element to be clickable
WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/span_Configure Products'), 20)

//Click on wrench icon
WebUI.click(findTestObject('Cart/Page_CPQ Cart/md-icon_build'))

//Click on Go To Pricing
WebUI.click(findTestObject('Cart/Page_CPQ Cart/i_ss-addcart'))

// Set the quantity
WebUI.setText(findTestObject('Cart/Page_CPQ Cart/input_Apttus_Config2__Quantity'), quantity)

// Get the Selling term value and store it in sellingTerm
sellingTerm = WebUI.getText(findTestObject('Cart/Page_CPQ Cart/div_36.00000'))

//Get the base price value and store it in basePrice
basePrice = WebUI.getText(findTestObject('Cart/Page_CPQ Cart/div_USD 1250.00'))

//Value to TCV present on line item
TCVlineitem = WebUI.getText(findTestObject('Cart/Page_CPQ Cart (1)/div_USD 243000.00 (1)'))

TCVValue(basePrice, quantity, sellingTerm, TCVlineitem)

//Method to validate the NNACV value, for this product its not populating
/*NNACVlineitem = WebUI.getText(findTestObject('NNACV/Page_CPQ Cart/div_fieldtype-wrapper fieldtyp'))
println(NNACVlineitem)
NNACVInt = Integer.parseInt(NNACVlineitem)
if (NNACVInt>=0) {
NNACV(basePrice, quantity, sellingTerm, NNACVlineitem)
}*/
//Get the Product start date and verify it with the Quote Expected Start Date
lineItemStartDate = WebUI.getText(findTestObject('Cart/lineitems/Page_CPQ Cart/input_Apttus_Config2__StartDat'))

//assert lineItemStartDate == ExpectedStartDate
//Get the Product End date and verify it with the Quote End Start Date
lineItemEndDate = WebUI.getText(findTestObject('Cart/lineitems/Page_CPQ Cart/input_Apttus_Config2__EndDate_'))

//assert lineitemEndDate == ExpectedEndDate
WebUI.click(findTestObject('Cart/Page_CPQ Cart/div_Product'))

//Method to calclulate and verify Net Unit Price on line item,
netUnitPrice = WebUI.getText(findTestObject('Cart/Page_CPQ Cart/div_USD 1125.00'))

netUnitPrice(basePrice, quantity, sellingTerm, netUnitPrice)

//Flagged as Multiselect
WebUI.click(findTestObject('Cart/Page_CPQ Cart/ul_select2-choices (1)'))

WebUI.click(findTestObject('Page_CPQ Cart/button_Finalize'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/md-tab-item_Approvals'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/md-tab-item_Approvals'))

WebUI.waitForAngularLoad(90)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Submit'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Submit'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Recall Approval'), 90)

/*
WebUI.delay(10)

WebUI.click(findTestObject('Page_Apttus - Quote Page/span_3'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/first approver'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/span_Approve'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/span_Approve'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Approve'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Approve'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Recall Approval'), 90)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Apttus - Quote Page/span_3'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/second approver'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/span_Approve'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/span_Approve'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Approve'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Approve'))*/
WebUI.delay(10)

WebUI.click(findTestObject('Page_Apttus - Quote Page/span_3'))

WebUI.click(findTestObject('Page_Apttus - Quote Page/third approver'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (1)/span_Approve'), 90)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page (1)/span_Approve'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Quote Page/button_Approve'), 90)

WebUI.click(findTestObject('Page_Apttus - Quote Page/button_Approve'))

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

//quoteidclm = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma (8)/quoteid'))
//WebUI.verifyEqual(quoteidclm, quote)
statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma (8)/md-chip_Request  Request'))

WebUI.verifyEqual('Request | Request', statusAuthoring)

/*WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma (3)/button_Generate'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma (7)/div_md-off'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma (7)/div_md-off'))

WebUI.waitForElementClickable(findTestObject('Page_Apttus - Contract Lifecycle Ma (3)/button_Submit'), 90)

WebUI.click(findTestObject('Page_Apttus - Contract Lifecycle Ma (3)/button_Submit'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Page_Apttus - Contract Lifecycle Ma (4)/button_Send to Requester'), 90)

statusAuthoring = WebUI.getText(findTestObject('Page_Apttus - Contract Lifecycle Ma (8)/md-chip_In Authoring  Author C'))

WebUI.verifyEqual('In Authoring | Author Contract', statusAuthoring)

WebUI.delay(5)*/
WebUI.closeBrowser()

WebUI.delay(5)

def TCVValue(def basePrice, def quantity1, def sellingTerm, def TCVlineitem) {
    TCVText = TCVlineitem

    int BPIntQ

    int TCV

    BPLength = basePrice.length()

    BPStr = basePrice.toString().substring(4)

    BpTemp = BPStr.toString().replace('.00', '')

    baseP = BpTemp.toString().replace(',', '')

    BpInt = Integer.parseInt(baseP)

    quan = Integer.parseInt(quantity)

    STTemp = sellingTerm.toString().replace('.00000', '')

    STInt = Integer.parseInt(STTemp)

    TCV = (((BpInt * quan) * STInt) * 0.9)

    TCVStr = TCVText.toString().substring(4)

    TCVTemp = TCVStr.toString().replace('.00', '')

    ActTCV = TCVTemp.toString().replace(',', '')

    TCVInt = Integer.parseInt(ActTCV)

    assert TCV == TCVInt
}

def NNACV(def basePrice, def quantity1, def sellingTerm, def NNACVlineitem) {
    NNACVText = NNACVlineitem

    int BPIntQ

    int TCV

    BPLength = basePrice.length()

    BPStr = basePrice.toString().substring(4)

    BpTemp = BPStr.toString().replace('.00', '')

    baseP = BpTemp.toString().replace(',', '')

    BpInt = Integer.parseInt(baseP)

    quan = Integer.parseInt(quantity)

    STTemp = sellingTerm.toString().replace('.00000', '')

    STInt = Integer.parseInt(STTemp)

    NNACV = ((((BpInt * quan) * STInt) * 0.9) / 12)

    NNACVStr = NNACVText.toString().substring(4)

    NNACVTemp = NNACVStr.toString().replace('.00', '')

    ActNNACV = NNACVTemp.toString().replace(',', '')

    NNACVInt = Integer.parseInt(ActNNACV)

    assert NNACV == NNACVInt
}

def netUnitPrice(def basePrice, def quantity1, def sellingTerm, def NetUnitPrice) {
    NUPText = NetUnitPrice

    int BPInt

    BPLength = basePrice.length()

    BPStr = basePrice.toString().substring(4)

    BpTemp = BPStr.toString().replace('.00', '')

    baseP = BpTemp.toString().replace(',', '')

    BpInt = Integer.parseInt(baseP)

    quan = Integer.parseInt(quantity)

    STTemp = sellingTerm.toString().replace('.00000', '')

    STInt = Integer.parseInt(STTemp)

    NUP = (((((BpInt * quan) * STInt) * 0.9) / quan) / STInt)

    NUPStr = NUPText.toString().substring(4)

    NUPTemp = NUPStr.toString().replace('.00', '')

    ActNUP = NUPTemp.toString().replace(',', '')

    NUPInt = Integer.parseInt(ActNUP)

    assert NUP == NUPInt
}

