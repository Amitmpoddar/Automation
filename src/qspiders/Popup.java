package qspiders;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		Thread.sleep(10000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		

	}

}
