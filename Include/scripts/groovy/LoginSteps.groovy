import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	
	@Given("User navigates to Login page")
	def navigateToLoginPage(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://web.chataja.co.id/')
		
	}
	@When("User enters (.*) and (.*)")
	def enterCredentials(String phone_number, String otp){
		WebUI.setText(findTestObject('Object Repository/TC_Cucumber/Page_ChatAja/input_Sign in_form-control'), phone_number)
		WebUI.click(findTestObject('Object Repository/TC_Cucumber/Page_ChatAja/button_Sign in'))
		WebUI.setText(findTestObject('Object Repository/TC_Cucumber/Page_ChatAja/input_Fill OTP code below_form-control text-center'),
			otp)
		
	}
	@And("Click on Login Button")
	def clickLogin(){
		WebUI.click(findTestObject('Object Repository/TC_Cucumber/Page_ChatAja/button_Confirm Code'))
		
	}
	@Then("User navigate to Home")
	def verifyHomePage(){
		WebUI.delay(15)
		WebUI.closeBrowser()
		
		
	}



}