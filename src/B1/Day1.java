package B1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get(" http://www.demo.guru99.com/V4/");
driver.findElement(By.name("uid")).sendKeys("mngr136544");
driver.findElement(By.name("password")).sendKeys("egepaze");
driver.findElement(By.name("btnLogin")).click();
	}

}
