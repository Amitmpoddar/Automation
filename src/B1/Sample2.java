package B1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	public WebDriver driver;
	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		
	}
	@Test
	public void Login1()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("manager'");
	}

@AfterMethod
public void close()
{
	driver.quit();
}
}
