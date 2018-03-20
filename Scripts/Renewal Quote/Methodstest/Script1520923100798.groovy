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
import com.microsoft.sqlserver.jdbc.format as format
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.lang.Number as Number

//Launch Browser
WebUI.openBrowser('')

//Maximize browser Window
WebUI.maximizeWindow()

//Launch URL
WebUI.navigateToUrl('https://servicenow-apttus11.apttuscloud.com/ui/cpq/quote/detail/5e102c4c-7523-e811-896b-00155d7fe074')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://servicenowext.oktapreview.com/login/login.htm?fromURI=%2Fapp%2Fservicenowexternalportal_apttussnowperf_1%2Fexkdcery72Duhu2RN0h7%2Fsso%2Fsaml%3FSAMLRequest%3DfVJNb%252bMgFPwrFncbk4%252fGQnGkbKOqkbpdK87uYS8VtZ8bVAwsD5r03y%252bxG6nRansCPebNaGZYouiV5evgD3oHfwKgT7abktju1MzadpZPu0J0bMbisejm%252bWL%252bnBf5tOmKgiS%252fwKE0uiSTLCfJFjHAVqMX2sdRzoo0n6Zsvs%252fnnN3wWfGbJJUz3jRGfZO6lfqlJMFpbgRK5Fr0gNw3vF5%252ff%252bCRkT%252bPIOT3%252b32VVj%252fqPUnWiOB8FL01GkMPrgb3Jhv4uXsoycF7i5xSHGfaHFNhvQ%252fIWDZeGmVCmzWmp3X0XVfDsQO0kQ1Ison2pRZ%252bMPUvG5x8Zl69sA7eJBwHHmHtNQKcFsoa54V6GkUxPlhw3ROjcHptG3Dvi8kmHMJk95gfFhTR0HMNJDn1SiMfKvk6GvuRI1ktz2g%252bZO8%252b7X%252b9Li4pktXFpbDyKiNpqECr0jNZenGwpJ%252fURmnLHyP9dlMZJZv35M64Xvj%252fq7OMDRPZpt0A5dALqdZt6wAx9quUOd46EB5K4l2IpdDVKHv9S1d%252fAQ%253d%253d%26RelayState%3Dhttps%3A%2F%2Fservicenow-apttus11.apttuscloud.com%2Fui%2Fcpq%2Fquote%2Fdetail%2F5e102c4c-7523-e811-896b-00155d7fe074')

WebUI.setText(findTestObject('ContactDetail and Payment Terms/Page_SSOUAT/input_username'), 'prachy.gupta@servicenow.com')

WebUI.setText(findTestObject('ContactDetail and Payment Terms/Page_SSOUAT/input_password'), 'White%balls%')

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_SSOUAT/input_submitButton'))

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/span_tray-icon-fixed'))

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/a_Suneetha Pothireddy'))

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/a_Suneetha Pothireddy'))

//WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/span_tray-icon-fixed_1'))

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/div_inputs ands-medium apt-foc'))

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/a_JJ Services Inc'))

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/a_Johnson  Johnson'))

WebUI.click(findTestObject('ContactDetail and Payment Terms/Page_Apttus - Quote Page/div_Ship To Location    JJ Ser'))

WebUI.closeBrowser()

//Enter UserName
WebUI.setText(findTestObject('Page_SSOUAT/input_username'), userName)

//Enter Password
WebUI.setText(findTestObject('Page_SSOUAT/input_password'), password)

//Click on Submit button
WebUI.click(findTestObject('Page_SSOUAT/input_submitButton'))

//Wait for element to be present or page to be load
WebUI.waitForElementVisible(findTestObject('Page_Apttus - Quote Page/div_Q-000000000271'), 10)

//Store the value to Type selected in quote
resultType1 = WebUI.getText(findTestObject('Page_Apttus - Quote Page/Page_Apttus - Quote Page/div_Renewal'))

// Verify the value of Type with the predefined variable
assert resultType == resultType1

//Get the text of AgreementId and store it in AgreementIdVar
AgreementIdVar = WebUI.getText(findTestObject('Page_Apttus - Quote Page/span_OF0763435-1'))

//Verify the values
assert AgreementID == AgreementIdVar

//Get the ExpectedStartDate value and store it in ExpectedStartDateVar
ExpectedStartDateVar = WebUI.getText(findTestObject('Page_Apttus - Quote Page/div_2019-03-09'))

//Verify the value
assert ExpectedStartDate == ExpectedStartDateVar

//WebUI.verifyMatch(ExpectedStartDate, ExpectedStartDate, true)
ExpectedEndDateVar = WebUI.getText(findTestObject('Page_Apttus - Quote Page/div_2022-03-08'))

assert ExpectedEndDate == ExpectedEndDateVar

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
basePrice = WebUI.getText(findTestObject('Cart/Page_CPQ Cart (1)/div_USD 1250.00'))

//Value to TCV present on line item
TCVlineitem = WebUI.getText(findTestObject('Cart/Page_CPQ Cart (1)/div_USD 243000.00 (1)'))

// Method to calclulate and verify TCV on line item,
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
WebUI.click(findTestObject('Cart/Page_CPQ Cart (1)/div_Product'))

//Method to calclulate and verify Net Unit Price on line item,
netUnitPrice = WebUI.getText(findTestObject('Cart/Page_CPQ Cart (1)/div_USD 1125.00'))

netUnitPrice(basePrice, quantity, sellingTerm, netUnitPrice)

//Flagged as Multiselect
WebUI.click(findTestObject('Cart/Page_CPQ Cart (1)/ul_select2-choices (1)'))

//Total of cart
WebUI.click(findTestObject('Cart/Page_CPQ Cart (1)/div_USD 307500.12 (1)'))

//Click on Reprice
WebUI.click(findTestObject('Cart/Page_CPQ Cart (1)/button_Reprice')) /*
 * Method to calclulate and verify TCV on line item, 
 Formula - TCV = BP *Quantity * term
 
 */
//Variable declaration
//convert the string to integer and remove USD and .00
//Convert the quantity to integer
//Convert the SellingTerm to integer and remove the decimal value.
//Calculate the TCV value
//Assert the TCV value
//BP*qtny*term/quantity/term

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

