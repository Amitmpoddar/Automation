package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelorParmeters {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.IE.driver", "./software/MicrosoftWebDriver.exe");
		
	}
	@Parameters({"browser"})
	@Test
	public void login(String browser)
	{
		if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
			
		}
		driver.get("https://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
	
	}

}

