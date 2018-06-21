package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		WebElement e= driver.findElement(By.xpath("(//div[@class='dashboardTitle'])[1]"));
		WebElement f= driver.findElement(By.xpath("(//div[@class='dashboardTitle'])[2]"));
		Actions a= new Actions(driver);
		a.dragAndDrop(e, f).perform();
	}

}
