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
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.openBrowser('')

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

WebUI.waitForPageLoad(45)

WebUI.delay(2)


WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/Page_Counterparty Limit Monitoring/a_Transactions'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/a_Transfer Limit'), 
    10)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/a_Transfer Limit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/select_--SELECT--CHANGE IN LIM'), 
    '02', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/input__ctl00MainContentimgbtnL'))

WebUI.delay(2)


WebUI.mouseOver(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/iframe_or Esc Key_TB_iframeCon'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/input_COUNTERPARTY_NAME_GridVi'), 
    'AIDNI FO KNAB')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/input_COUNTERPARTY_NAME_GridVi_1'))

WebUI.click(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/span_AIDNI FO KNAB'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/input__ctl00MainContentimgChec'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/iframe_or Esc Key_TB_iframeCon_12'))

WebUI.mouseOver(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/iframe_or Esc Key_TB_iframeCon'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/input_USERID_GridView1ctl01txt (9)'), 
    'Ankita')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/input_USERID_GridView1ctl01btn (1)'))

WebUI.delay(2)

'Checker 1'
WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/td_ANKITA'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/input__ctl00MainContentimgChec_1'))

WebUI.mouseOver(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/iframe_or Esc Key_TB_iframeCon'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/input_USERID_GridView1ctl01txt (15)'), 
    'Ashavini')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/input_USERID_GridView1ctl01btn (1)'))

WebUI.delay(2)

'Checker 2'
WebUI.click(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/span_ASHAVINI'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/textarea_Maker Remark_ctl00Mai'), 
    'On Request initiate to check withdraw flow')

WebUI.selectOptionByValue(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/select_--SELECT--INDIASINGAPOR'), 
    'SG', true)

WebUI.setText(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/input_DERIVATIVE_ctl00MainCont'), 
    '10')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/Page_Counterparty Limit Monitoring/input_CREDIT LIMITS_ctl00MainC'),
	Keys.chord(Keys.TAB))


WebUI.selectOptionByValue(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/select_--SELECT--INDIASINGAPOR_1'), 
    'IN', true)


WebUI.setText(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/input_DERIVATIVE_ctl00MainCont_2'), 
    '1')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Folder 1/Page_Counterparty Limit Monitoring/Page_Counterparty Limit Monitoring/input_CREDIT LIMITS_ctl00MainC'),
	Keys.chord(Keys.TAB))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00'), 5)

WebUI.delay(3)

WebUI.takeScreenshot("C:\\Users\\ashavini\\Desktop\\Katalon\\Ankita\\Automation Project\\LERMS_Counterparty\\Screenshots\\MakerInitiation.png");

WebUI.click(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00'))

WebUI.waitForAlert(20)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText,'Limit Transfered successfully', false)

WebUI.acceptAlert()

WebUI.delay(4)

WebUI.click(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/ul_SIDDHIKA (TREASURY)'))


WebUI.delay(2)

WebUI.click(findTestObject('Folder 1/Page_Counterparty Limit Monitoring/a_Logout'))

WebUI.delay(3)

WebUI.switchToWindowTitle('Loan Equivalent Risk System')

WebUI.click(findTestObject('Folder 1/Page_Loan Equivalent Risk System/Page_Loan Equivalent Risk System/td_SIDDHIKA (TREASURY DEPARTME'))

WebUI.click(findTestObject('Folder 1/Page_Loan Equivalent Risk System/a_Logout'))

WebUI.click(findTestObject('Object Repository/WD Objects/MK Initiate/Page_Counterparty Limit Monitoring/input_()Mandatory Fields_ctl00'))

