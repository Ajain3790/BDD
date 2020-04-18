package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static common.GenericDriver.*;
import static testRunners.TestRunner.LoginPageInstance;
import org.assertj.core.api.SoftAssertions;


import org.assertj.core.api.SoftAssertions;

public class LoginPage {
	
	@Given("^user lands on login page$")
	public void user_lands_on_login_page() {
		driver.navigate().back();
	}

	@When("^user enter valid email \"([^\"]*)\"$")
	public void user_enter_valid_email(String email) {
		LoginPageInstance.LoginField.clear();
		LoginPageInstance.LoginField.sendKeys(email);
	    
	}

	@When("^user enter valid password \"([^\"]*)\"$")
	public void user_enter_valid_password(String password) 
	{
		LoginPageInstance.PasswordField.clear();
		LoginPageInstance.PasswordField.sendKeys(password);   
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() {
		LoginPageInstance.LoginBtn.click();
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() {
	    String actual = driver.getTitle();
	    String Expected= "Slack";
	    
	    SoftAssertions sa = new SoftAssertions();
	    sa.assertThat(actual).isEqualToIgnoringCase(Expected);
	    sa.assertAll();
	}


}
