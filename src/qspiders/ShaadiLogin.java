package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShaadiLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.id("ap_email")).sendKeys("amitmpoddar@gmail.com");
driver.findElement(By.id("ap_password")).sendKeys("9880675912aA@");
driver.findElement(By.id("signInSubmit")).click();
String t = driver.getTitle();
System.out.println(t);
String u = driver.getCurrentUrl();
System.out.println(u);
	}

}
