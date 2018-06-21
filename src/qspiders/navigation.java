package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

		public static void main(String[] args) throws InterruptedException  {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://localhost:8080/user/submit_tt.do");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.close();
		
	}

}
