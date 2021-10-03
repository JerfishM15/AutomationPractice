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
import utileria.accion as accion

WebUI.openBrowser("https://rahulshettyacademy.com/AutomationPractice/");
WebUI.maximizeWindow();

//if text appear
if(accion.present("//img[@class='logoClass']", 10)) {
	
	//click every radio button
	
		accion.click("//input[@value='radio1']");
		accion.click("//input[@value='radio2']");
		accion.click("//input[@value='radio3']");
		
	
	
	//sugestion box (the xpath for the text is dynamic, so i didn't figured it out how to catch it)
	accion.click("//input[@id='autocomplete']");
	WebUI.setText(accion.makeTestObjectFromXpath("//input[@id='autocomplete']"), "Dominican Republic");
	
	
	
	// select every DropDown option
	
		
		accion.click("//select[@id='dropdown-class-example']");
		accion.click("//option[contains(text(),'Option1')]");

	
	//select every checkbox
	
		accion.click("//input[@id='checkBoxOption1']");
		accion.click("//input[@id='checkBoxOption2']");
		accion.click("//input[@id='checkBoxOption3']");
		
	

	//hide and show btn 
	accion.click("//input[@id='hide-textbox']");
	
	WebUI.delay(3);
		
	accion.click("//input[@id='show-textbox']");
	
	WebUI.delay(3);
	

	//scroll
	WebUI.scrollToElement(accion.makeTestObjectFromXpath("//div[@class='tableFixHead']"), 10);
		
}

WebUI.closeBrowser();