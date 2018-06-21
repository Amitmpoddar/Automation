package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.shaadi.com/");
driver.findElement(By.xpath("//a[@type='login']")).click();
driver.findElement(By.name("email")).sendKeys("amitmpoddar@gmail.com");
driver.findElement(By.xpath("//input[@id='password_page']")).sendKeys("9880675912aA@");
driver.findElement(By.xpath("//a[.='Sign In']")).click();
	}

}
