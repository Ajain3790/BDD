package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericDriver {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
	
	    	WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			//option.setHeadless(true);
			option.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}else if(browser.equalsIgnoreCase("FireFox"))
		{
	
	    	WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option=new FirefoxOptions();
			//option.setHeadless(true);
			option.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new FirefoxDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		
	}

}
