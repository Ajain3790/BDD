package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static testRunners.TestRunner.*;

import java.util.concurrent.TimeUnit;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.GenericDriver;

import static common.GenericDriver.*;
   
public class HomePage {
	
	GenericDriver GD =new GenericDriver();
	@When("^User enter valid URL \"([^\"]*)\"$")
	public void user_enter_valid_URL(String arg1) {
	   
		GD.driver.get(arg1);
	}

	@Then("^Homepage should be launched as default page$")
	public void homepage_should_be_launched_as_default_page() {
	   
	  String actual = GD.driver.getTitle();
	  System.out.println(actual);
	 String Expected= "Slack";  
	 SoftAssertions sa = new SoftAssertions();
	    sa.assertThat(actual).isEqualToIgnoringCase(Expected);
	    sa.assertAll();
	  
	  
	  
	}
	
	@When("^user click on Product Link$")
	public void user_click_on_Product_Link() {
		
		HomePageInstance.ProductLink.click();
		GD.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@Then("^User should navigate to product page$")
	public void user_should_navigate_to_product_page() {
		WebDriverWait wait = new WebDriverWait(GD.driver, 15);
		  wait.until(ExpectedConditions.elementToBeClickable(HomePageInstance.SingInLink));
		String actual = GD.driver.getTitle();
		 System.out.println(actual);
		 String expected="Features | Slack";
		 SoftAssertions sa = new SoftAssertions();
		    sa.assertThat(actual).isEqualToIgnoringCase(expected);
		    sa.assertAll();
	 
	}

	
	
}
