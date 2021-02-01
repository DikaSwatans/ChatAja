import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web.chataja.co.id/')

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/TS_Function/Page_ChatAja/input_Sign in_form-control'), '89607257459')

WebUI.click(findTestObject('Object Repository/TS_Function/Page_ChatAja/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/TS_Function/Page_ChatAja/input_Fill OTP code below_form-control text-center'), 
    '943386')

WebUI.click(findTestObject('Object Repository/TS_Function/Page_ChatAja/button_Confirm Code'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/svg'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/svg_1'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/p_Olkn'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/input_Your Name_name'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/img'))

WebUI.setText(findTestObject('Object Repository/TS_Function/Page_(1) New Message/input_Your Name_name'), 'Olin Wintarlina')

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/svg_Your Name_mb-md-2 pointer btn p-0 allow'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/path'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/li_anaku 0 Pin Chat check'))

WebUI.setText(findTestObject('Object Repository/TS_Function/Page_(1) New Message/textarea_check_messageToSent'), 'dimana')

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/button_Pick your emoji_buttonSend'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/button_Pick your emoji_buttonEmoji'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/span_Smileys  People_emoji-fallback'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/button_Pick your emoji_buttonSend'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/button_Pick your emoji_buttonSticker'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/img_1'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/i_Cancel_ti-power-off'))

WebUI.click(findTestObject('Object Repository/TS_Function/Page_(1) New Message/button_Sure'))

WebUI.closeBrowser()

