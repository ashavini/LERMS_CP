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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement

/*WebUI.openBrowser('')

WebUI.navigateToUrl('http://siachen:8003/AXIS_LERM_WEB_UAT_V4/login.aspx')

WebUI.setText(findTestObject('Object Repository/Folder 1/Page_Loan Equivalent Risk System/input_User Name_ctl00MainConte'), 
    GlobalVariable.MKUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Folder 1/Page_Loan Equivalent Risk System/input_Password_ctl00MainConten'), 
    GlobalVariable.MKPassword)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Loan Equivalent Risk System/input_Password_ctl00MainConten_1'))

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Loan Equivalent Risk System/a_Counterparty Limit Maintaine'))

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.waitForPageLoad(GlobalVariable.G_Timeout_Small)
WebUI.maximizeWindow()*/

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/Page_Counterparty Limit Monitoring/a_Transactions'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/a_Withdraw Transfer Limit'), 
    10)

WebUI.click(findTestObject('Object Repository/WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/a_Withdraw Transfer Limit'))

WebUI.click(findTestObject('Object Repository/WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00'))

WebUI.setText(findTestObject('Object Repository/WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/input_COUNTERPARTY_GridView1ct'), 
    'AIDNI FO')

WebUI.click(findTestObject('Object Repository/WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/input_COUNTERPARTY_GridView1ct_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/span_AIDNI FO KNAB'))

WebUI.delay(2)

WebUI.takeScreenshot("C:\\Users\\ashavini\\Desktop\\Katalon\\Ankita\\Automation Project\\LERMS_Counterparty\\Screenshots\\WD transfer Limit.png");


WebUI.scrollToElement(findTestObject('WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00_1'), 
    5)

WebUI.click(findTestObject('Object Repository/WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00_1'))

WebUI.acceptAlert()

WebUI.waitForAlert(20)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText,'Transfer Limit withdrawn successfully', false)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/WD Objects/WD Req Obj/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00_2'))

WebUI.delay(2)

