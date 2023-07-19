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
import shopify.shopify as Shopify

Shopify shopify = new Shopify()

//WebUI.openBrowser('https://apps.shopify.com/medion/install')

/// get store_url to install app
//def url_admin = WebUI.getUrl()
//def store_url = url_admin.split("/")[4]
//println store_url

//WebUI.maximizeWindow()
//
//shopify.logInShopify(email, password)

WebUI.navigateToUrl('https://apps.shopify.com/medion/install')

WebUI.click(findTestObject('Object Repository/InstallApp/btn_account'))

WebUI.click(findTestObject('Object Repository/InstallApp/btn_login_w_url'))

WebUI.setText(findTestObject('Object Repository/InstallApp/txt_store_url'), 'store-auto-990')

WebUI.click(findTestObject('Object Repository/InstallApp/btn_login'))

WebUI.click(findTestObject('Object Repository/InstallApp/btn_add_app'))

//WebUI.click(findTestObject('Object Repository/InstallApp/btn_account'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/InstallApp/btn_install_app'))

WebUI.delay(10)

WebUI.takeScreenshot('ScreenShot\\screenshot.png')

//WebUI.closeBrowser()