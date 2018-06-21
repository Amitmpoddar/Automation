package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("(//div[@class='mTxt'])[6]")).click();
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("amitmpoddar@gmail.com");
driver.findElement(By.xpath("//input[@id='pLogin']")).sendKeys("9880675912");
driver.findElement(By.xpath("//button[.='Login']")).click();
String t = driver.getTitle();
System.out.println(t);
String u = driver.getCurrentUrl();
System.out.println(u);
driver.findElement(By.xpath("//div[.='My Naukri']")).click();
	}

}
