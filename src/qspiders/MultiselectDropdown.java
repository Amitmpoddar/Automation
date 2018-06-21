package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Dropdown.html");
		WebElement ele = driver.findElement(By.id("SLV"));
		Select s = new Select(ele);
		s.selectByIndex(1);
		s.selectByValue("p");
		s.selectByVisibleText("Gobi");
		Thread.sleep(3000);
		s.deselectByIndex(1);
		s.deselectByValue("p");
		s.deselectByVisibleText("Gobi");

	}

}
