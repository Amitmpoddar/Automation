package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facebook1 {
	static {
		System.setProperty("webdriver.ie.driver", "./software/microsoftwebdriver.exe");
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new InternetExplorerDriver();
WebDriver driver1 = new ChromeDriver();
Facebook1.faceb(driver);
Facebook1.faceb(driver1);
	}
	
	public static void faceb(WebDriver driver)
	{
		driver.get("https://www.facebook.com/");
		String t = driver.getTitle();
		System.out.println(t);
		String u = driver.getCurrentUrl();
		System.out.println(u);
		driver.close();
	}
		
}

	


