package B1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
	}
	@Parameters({"browser"})
	@Test
	public void login(String browser)
	{
		if(browser.equals("Chrome"))
		{
		
			driver=new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
			
		}
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
	
	}

}

