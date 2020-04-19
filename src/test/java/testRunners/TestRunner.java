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
        //"rerun:target/rerun.txt",
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
	
	
	@BeforeClass
	public static void Browsersetup(){
		
		GenericDriver.launchBrowser("FireFox");
		pageObjectSetup();
		
	}
	
	@AfterClass
	public static void closeBrowser(){
		driver.close();
	}
	
	
	public static void pageObjectSetup(){
		
			HomePageInstance = new HomePageLocaters(driver);
			LoginPageInstance = new LoginPageLocaters(driver);
	}
	
	
	
	
	
	

}
