package qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://localhost:8080/user/submit_tt.do");
String t = driver.getTitle();
System.out.println(t);
String u = driver.getCurrentUrl();
System.out.println(u);
String z = driver.getPageSource();
System.out.println(z);
driver.close();
	}

}
