package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actiTIME.com");
		WebDriverWait wait = new WebDriverWait(driver,60);
      WebElement q = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
       q.sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.xpath("//div[.='Login ']"));
       String t = driver.getTitle();
		System.out.println(t);
		
		String u = driver.getCurrentUrl();
		System.out.println(u);
		if(t.equals("actiTIME-LOGIN"))
{
	System.out.println("Homepage displayed");
}
else
{
	System.out.println("Homepage not displayed");
}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	}

}
