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
@CucumberOptions(features="@target/rerun.txt", glue= "stepDefinitions",

plugin = {
        "rerun:target/rerun.txt"
}
		 
)

public class TestRunnerFailed {
	//public static HomePageLocaters HomePageInstance; 
	//public static LoginPageLocaters LoginPageInstance;
	
	
	@BeforeClass
	public static void Browsersetup(){
		
		GenericDriver.launchBrowser("Chrome");
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
