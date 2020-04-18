package seleniumPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocaters extends AbstractPage {

	public LoginPageLocaters(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement LoginField;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement PasswordField;
	
	@FindBy(xpath="//button[@id='signin_btn']")
	public WebElement LoginBtn;
	
	@FindBy(xpath="/html/body/header/nav[1]/div/nav/div/a[1]")
	public WebElement SignIn;

}
