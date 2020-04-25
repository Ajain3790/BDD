package testRunners;

//import static common.GenericDriver.driver;

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
        "json:target/test-results.json"
		// "pretty", "json:target/cucumber-reports/Cucumber.json",
		// "junit:target/cucumber-reports/Cucumber.xml",
		// "html:target/cucumber-reports"
        
}, 

monochrome = true)



public class TestRunnerFireFox {
	
	static //public static HomePageLocaters HomePageInstance; 
	//public static LoginPageLocaters LoginPageInstance;
	GenericDriver FF =new GenericDriver();
	
	@BeforeClass
	public static void Browsersetup(){
		
		//String FirefoxBrowser = System.getProperty("Firefoxbrowser");
		//GenericDriver.launchFirefox();
		
		FF.launchFirefox();
		pageObjectSetup();
		
	}
	
	@AfterClass
	public static void closeBrowser(){
		FF.driver.quit();
	}
	
	
	public static void pageObjectSetup(){
		
		TestRunner.HomePageInstance = new HomePageLocaters(FF.driver);
		TestRunner.LoginPageInstance = new LoginPageLocaters(FF.driver);
	}

}
