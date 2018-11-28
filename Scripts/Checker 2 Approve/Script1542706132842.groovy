import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://siachen:8003/AXIS_LERM_WEB_UAT_V4/login.aspx')

WebUI.setText(findTestObject('Object Repository/Checker 1 Forms Objects/Page_Loan Equivalent Risk System/input_User Name_ctl00MainConte'), 
    GlobalVariable.CK2Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Checker 1 Forms Objects/Page_Loan Equivalent Risk System/input_Password_ctl00MainConten'), 
    GlobalVariable.CK2Password)

WebUI.click(findTestObject('Object Repository/Checker 1 Forms Objects/Page_Loan Equivalent Risk System/input_Password_ctl00MainConten_1'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Loan Equivalent Risk System/a_Counterparty Limit Maintaine'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

/*WebUI.waitForPageLoad(3)*/
WebUI.maximizeWindow()
WebUI.mouseOver(findTestObject('Checker 1 Forms Objects/Page_Counterparty Limit Monitoring/a_Authorization'))

WebUI.waitForElementVisible(findTestObject('Checker 1 Forms Objects/Page_Counterparty Limit Monitoring/a_Authorization'), 
    10)

WebUI.click(findTestObject('Object Repository/Checker 1 Forms Objects/Page_Counterparty Limit Monitoring/a_Transfer Limit'))

WebUI.delay(3)

WebUI.takeScreenshot("C:\\Users\\ashavini\\Desktop\\Katalon\\Ankita\\Automation Project\\LERMS_Counterparty\\Screenshots\\Checker2_Recorddetails.png");


WebUI.click(findTestObject('Object Repository/Checker 1 Forms Objects/Page_Counterparty Limit Monitoring/span_IN'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/Checker 1 Forms Objects/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00'))

WebUI.acceptAlert()

WebUI.waitForAlert(20)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText,'Authorized Successfully', false)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.click(findTestObject('Checker 1 Forms Objects/Page_Counterparty Limit Monitoring/ul_ANKITA (TREASURY)'))

WebUI.delay(5)

WebUI.click(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/a_Logout'))

/*WebUI.click(findTestObject('Object Rep ository/Checker 1 Forms Objects/Page_Counterparty Limit Monitoring/a_Logout'))
*/
WebUI.switchToWindowTitle('Loan Equivalent Risk System')

WebUI.click(findTestObject('Folder 1/Page_Loan Equivalent Risk System/Page_Loan Equivalent Risk System/td_SIDDHIKA (TREASURY DEPARTME'))

WebUI.click(findTestObject('Object Repository/Checker 1 Forms Objects/Page_Loan Equivalent Risk System/a_Logout'))

