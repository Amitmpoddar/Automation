package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  WebDriverWait wait = new WebDriverWait(driver,60);
  WebElement q = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//input[@type='text'])[2]"))));
   q.sendKeys("amitmpoddar@gmail.com");
  
  
  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9880675912aA@");

  driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
  String t = driver.getTitle();
  System.out.println(t);
  String u = driver.getCurrentUrl();
  System.out.println(u);
  
  wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='My Account']"))).click();
 
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Logout']")));
	}

}

