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
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys

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

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

/*WebUI.waitForPageLoad(GlobalVariable.G_Timeout_Small)
*/
WebUI.delay(5)

WebUI.mouseOver(findTestObject('Review Date/Page_Counterparty Limit Monitoring/a_Masters'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Review Date/Page_Counterparty Limit Monitoring/a_Counterparty Review Mail Set'))

WebUI.mouseOver(findTestObject('Review Date/New Folder1/Page_Counterparty Limit Monitoring/input_CC Email ID(s)_ctl00Main'))

WebUI.sendKeys(findTestObject('Review Date/New Folder1/Page_Counterparty Limit Monitoring/input_CC Email ID(s)_ctl00Main'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.acceptAlert()

def data = findTestData('Review Date')

for (def index : 0) {
	WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/input__ctl00MainContenttxtRevi'), 
    data.internallyGetValue('Review Frequency Days', index))
	
	WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/input__ctl00MainContenttxtFrom'), 
    data.internallyGetValue('From Email ID', index))

   WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/input__ctl00MainContenttxtInit'), 
    data.internallyGetValue('Mail Before Due Date(In Days)', index))

   WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/textarea__ctl00MainContenttxtI'), 
    data.internallyGetValue('To Email ID(s)', index))

   WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/textarea_CC Email ID(s)_ctl00M'), 
    data.internallyGetValue('CC Email ID(s)', index))

  WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/input__ctl00MainContenttxtRemi'), 
    data.internallyGetValue('Mail Before Due Date1(In Days)', index))

  WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/input__ctl00MainContenttxtRemi_1'), 
    data.internallyGetValue('Mail Frequency(In Days)', index))

  WebUI.delay(2)



WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/textarea__ctl00MainContenttxtR'), 
    data.internallyGetValue('To Email ID1(s)', index))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/textarea_CC Email ID(s)_ctl00M_1'), 
    data.internallyGetValue('CC Email ID1(s) ', index))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/input__ctl00MainContenttxtEsca'), 
     data.internallyGetValue('Mail After Due Date(In Days)', index))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/input__ctl00MainContenttxtEsca_1'), 
     data.internallyGetValue('Mail Frequency1(In Days)', index))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/textarea__ctl00MainContenttxtE'), 
     data.internallyGetValue('To Email ID2(s)', index))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Review Date_ New Objects/Page_Counterparty Limit Monitoring/textarea_CC Email ID(s)_ctl00M_2'), 
    data.internallyGetValue('CC Email ID2(s)', index))
WebUI.delay(3)

WebUI.sendKeys(findTestObject('Review Date/New Folder1/Page_Counterparty Limit Monitoring/textarea_CC Email ID(s)_ctl00M_2'), 
        Keys.chord(Keys.TAB))

WebUI.takeScreenshot('C:\\Users\\ashavini\\Desktop\\Katalon\\Ankita\\Automation Project\\LERMS_Counterparty\\Screenshots\\Review Mail Setting.png')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Review Date/New Folder1/Page_Counterparty Limit Monitoring/input_CC Email ID(s)_ctl00Main'), 
        Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.getAlertText()

WebUI.acceptAlert()

WebUI.mouseOver(findTestObject('Review Date/Page_Counterparty Limit Monitoring/input_CC Email ID(s)_ctl00Main'))

WebUI.sendKeys(findTestObject('Review Date/Page_Counterparty Limit Monitoring/input_CC Email ID(s)_ctl00Main'), Keys.chord(
            Keys.ENTER))
}

