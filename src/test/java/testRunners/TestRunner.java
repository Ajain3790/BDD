package testRunners;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.GenericDriver;

import static common.GenericDriver.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import seleniumPage.HomePageLocaters;
import seleniumPage.LoginPageLocaters;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Features", glue= "stepDefinitions", tags ={"@Smoke"},

plugin = {
         "rerun:target/rerun.txt",
         "pretty",
        "junit:target/cucumber-xml-report.xml",
        "html:target/cucumber-reports",
        "json:target/test-results.json"
		// "pretty", "json:target/cucumber-reports/Cucumber.json",
		// "junit:target/cucumber-reports/Cucumber.xml",
		// "html:target/cucumber-reports"
        
}, 

monochrome = true)


public class TestRunner {

	public static HomePageLocaters HomePageInstance; 
	public static LoginPageLocaters LoginPageInstance;
	
	static GenericDriver CH =new GenericDriver();
	@BeforeClass
	public static void Browsersetup(){
		//String ChromeBrowser = System.getProperty("Chromebrowser");
		CH.launchChrome();
		pageObjectSetup();
		
	}
	
	@AfterClass
	public static void closeBrowser(){
		CH.driver.quit();
	}
	
	
	public static void pageObjectSetup(){
		
			HomePageInstance = new HomePageLocaters(CH.driver);
			LoginPageInstance = new LoginPageLocaters(CH.driver);
	}
	
	
	
	
	
	

}
