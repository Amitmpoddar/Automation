package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String t = driver.getTitle();
		System.out.println(t);
		
		String u = driver.getCurrentUrl();
		System.out.println(u);
		driver.close();
	}	

}
