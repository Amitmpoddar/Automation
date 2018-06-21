package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 int count = links.size();
		 System.out.println(count);
	}

}
