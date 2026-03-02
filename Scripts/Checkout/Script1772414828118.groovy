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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil

KeywordUtil.logInfo("Login test excecuted")

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('LoginPage/username_input'), 'standard_user')

WebUI.setText(findTestObject('LoginPage/password_input'), 'secret_sauce')

WebUI.click(findTestObject('LoginPage/login_button'))

WebUI.click(findTestObject('Inventory/button_addToCart'))

WebUI.click(findTestObject('Inventory/icon_cart'))

WebUI.click(findTestObject('CartPage/button_checkout'))

WebUI.setText(findTestObject('CheckoutPage/input_firstName'), 'Yuniartha')

WebUI.setText(findTestObject('CheckoutPage/input_lastName'), 'Putri')

WebUI.setText(findTestObject('CheckoutPage/input_zipCode'), '116172')

WebUI.click(findTestObject('CheckoutPage/button_continue'))

WebUI.click(findTestObject('CheckoutPage/button_finish'))

WebUI.verifyElementText(findTestObject('CheckoutPage/txt_complete'), 'Thank you for your order!')

