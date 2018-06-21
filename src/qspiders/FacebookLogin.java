package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement q = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
q.sendKeys("amitmpoddar@gmail.com");
driver.findElement(By.id("pass")).sendKeys("9880675912");
driver.findElement(By.xpath("//input[@value='Log In']")).click();
String t=driver.getTitle();
System.out.println(t);
String u=driver.getCurrentUrl();
System.out.println(u);
if (t.equals("(7) Facebook"))
{
	System.out.println("Homepage is displayed");
}
else
{
	System.out.println("Homepage is not displayed");
}

}

	}


