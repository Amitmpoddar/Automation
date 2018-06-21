package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginwithin3sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
try 
{
	driver.get("https://www.actiTIME.com/");
	System.out.println("page is displayed within 3 sec");
}
catch(Exception e)
{
	System.out.println("page is not displyed within 3 sec");
}
}

}


