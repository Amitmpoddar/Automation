package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://localhost:8080/login.do");


WebElement e = driver.findElement(By.id("headerContainer"));
String text = e.getText();
System.out.println(text);

	}

}
