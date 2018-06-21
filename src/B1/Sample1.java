package B1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {
public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void login()
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
}

@AfterMethod
public void closeapp()
{
	driver.quit();
}
}
