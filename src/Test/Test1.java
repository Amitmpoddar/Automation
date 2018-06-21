package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.Loginpage1;

public class Test1 {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		Loginpage1 l = new Loginpage1(driver);
		l.username("admin");
		l.password("manager");
		l.login1();
		Homepage h = new Homepage(driver);
		h.logout();
	}

}
