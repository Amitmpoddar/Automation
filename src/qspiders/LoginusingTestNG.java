package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginusingTestNG {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		String t = driver.getTitle();
		System.out.println(t);
		Assert.assertEquals(t,"actitime");
		
		String u = driver.getCurrentUrl();
		System.out.println(u);
		//driver.findElement(By.id("logoutlink")).click();
	}
      /* @AfterMethod
         public void closeapp()
         {
    	   driver.close();
         }*/
       
	
}

																																																																																																																																																																																																																																																																																																																																																		
