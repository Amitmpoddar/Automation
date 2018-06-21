package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).sendKeys("Math");
		Thread.sleep(5000);
	List<WebElement> ele = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
	int count = ele.size();
	System.out.println(count);
	for(WebElement w:ele)
	{
		String t = w.getText();
		System.out.println(t);
	}
		
		
	
	}

}
