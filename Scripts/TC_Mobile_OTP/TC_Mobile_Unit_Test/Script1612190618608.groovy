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

Mobile.startApplication('D:\\chataja-indonesia-messenger-lifestyle-app_5.2.5.apk', false)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/TC_UniteTest/android.widget.EditText - Ketik pesan disini'), 'kamu dimana', 
    0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (4)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.TextView - Tambah kontak baru'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.Button - Tambah akun baru'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.TextView - Pengaturan'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.Switch - NONAKTIF'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject(''), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.Button - Kesehatan'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.Button - LIHAT KANAL'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.Button - IKUTI'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (8)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (9)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.TextView - Pilih dari Galeri'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (10)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (11)'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.Button - TERAPKAN'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.Button - Simpan'), 0)

Mobile.tap(findTestObject('Object Repository/TC_UniteTest/android.widget.ImageView (12)'), 0)

Mobile.closeApplication()

