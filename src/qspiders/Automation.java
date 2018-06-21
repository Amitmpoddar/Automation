package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Demo2.html");
		WebElement tv=driver.findElement(By.tagName("input"));
		tv.sendKeys("Selenium");
		tv.sendKeys(Keys.CONTROL+"a");
		tv.sendKeys(Keys.CONTROL+"c");
		WebElement v = driver.findElement(By.xpath("//input[@type='password']"));
		v.sendKeys(Keys.CONTROL+"v");

	}

}
