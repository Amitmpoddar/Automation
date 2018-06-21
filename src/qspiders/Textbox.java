package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///D:/Demo2.html");
WebElement s = driver.findElement(By.id("abc"));
s.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
s.sendKeys(Keys.CONTROL+"x");
WebElement e = driver.findElement(By.id("xyz"));
Thread.sleep(2000);
e.clear();
e.sendKeys(Keys.CONTROL+"v");
s.sendKeys("Jspiders");
	}

}
