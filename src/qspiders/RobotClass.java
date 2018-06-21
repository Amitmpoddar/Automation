package qspiders;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("(//a[.='Your Recommendations'])[2]"));
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_P);

	}

}
