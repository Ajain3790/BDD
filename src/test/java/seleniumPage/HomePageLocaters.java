package seleniumPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocaters extends AbstractPage {
	
		
	public HomePageLocaters(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="/html/body/nav[1]/ul/li[1]/a")
	public WebElement ProductLink;

}
