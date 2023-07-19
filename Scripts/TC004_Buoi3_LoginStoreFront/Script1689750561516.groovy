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

WebUI.openBrowser('https://auto2023.myshopify.com/account/login')

//def emailList = new String[3]
//
//emailList[0] = "email1@gmail.com"
//
//emailList[1] = "email2@gmail.com"
//
//emailList[2] = "email3@gmail.com"

//def emailList = ["email1@gmail.com", "email2@gmail.com", "email3@gmail.com", "email4", "email5"]
//def i
//for(i = 0; i<5; i++) {
//	WebUI.setText(findTestObject('Object Repository/StoreFront/txt_email'), emailList[i] )
//}


//def loginInfo = [
//		account1 :[
//			email: "email1@gmail.com",
//			password:"1233"
//			],
//		
//		account2: [
//			email: "email2@gmail.com",
//			password:"567"
//			]
//		
//	]

//
//WebUI.setText(findTestObject('Object Repository/StoreFront/txt_email'), loginInfo.account1.email)
//
//WebUI.setText(findTestObject('Object Repository/StoreFront/txt_password'), '53647')

inputEmail('email1')

inputPass('123')
	
WebUI.click(findTestObject('Object Repository/StoreFront/btn_login'))

WebUI.takeScreenshot('screenshot1.png')

WebUI.closeBrowser()

def inputEmail(def email) {
	WebUI.setText(findTestObject('Object Repository/StoreFront/txt_email'), email)
}

def inputPass(def password) {
	WebUI.setText(findTestObject('Object Repository/StoreFront/txt_password'), password)
}