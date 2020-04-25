package testRunners;

import static common.GenericDriver.driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import common.GenericDriver;
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
        "json:target/test-resultsFF.json"
		// "pretty", "json:target/cucumber-reports/Cucumber.json",
		// "junit:target/cucumber-reports/Cucumber.xml",
		// "html:target/cucumber-reports"
        
}, 

monochrome = true)



public class TestRunnerFireFox {
	
	 //public static HomePageLocaters HomePageInstance; 
	//public static LoginPageLocaters LoginPageInstance;
	
	
	@BeforeClass
	public static void Browsersetup(){
		
		//String FirefoxBrowser = System.getProperty("Firefoxbrowser");
		//GenericDriver.launchFirefox();
		
		GenericDriver.launchBrowser("Firefox");
		pageObjectSetup();
		
	}
	
	@AfterClass
	public static void closeBrowser(){
		driver.quit();
	}
	
	
	public static void pageObjectSetup(){
		
		TestRunner.HomePageInstance = new HomePageLocaters(driver);
		TestRunner.LoginPageInstance = new LoginPageLocaters(driver);
	}

}
