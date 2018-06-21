package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginpage {

	@Test
	public void abc()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
       Login l= new Login(driver);
       l.username("admin");
       l.password("manager");
       l.login1();
		
	}

}
