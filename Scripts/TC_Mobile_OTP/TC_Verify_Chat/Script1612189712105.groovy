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

Mobile.startApplication('D:\\chataja-indonesia-messenger-lifestyle-app_5.2.5.apk', true)

Mobile.setText(findTestObject('Object Repository/TC_VerifyChat/android.widget.EditText - Contoh 81212341212'), '89607257459', 
    0)

Mobile.tap(findTestObject('Object Repository/TC_VerifyChat/android.widget.Button - LANJUTKAN'), 0)

Mobile.tap(findTestObject('Object Repository/TC_VerifyChat/android.widget.CheckBox - Dengan ini anda telah menyetujui semua persyaratan dan ketentuan diatas'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.tapAndHold(findTestObject(''), 0, 0)

Mobile.tap(findTestObject('Object Repository/TC_VerifyChat/android.widget.CheckBox - Dengan ini anda telah menyetujui semua persyaratan dan ketentuan diatas (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/TC_VerifyChat/android.widget.TextView - Kirim Ulang'), 0)

Mobile.setText(findTestObject('Object Repository/TC_VerifyChat/android.widget.EditText'), '881068', 0)

Mobile.tap(findTestObject('Object Repository/TC_VerifyChat/android.widget.Button - LANJUTKAN (1)'), 0)

Mobile.closeApplication()

