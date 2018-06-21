package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://localhost:8080/login.do");
		    WebElement s=driver.findElement(By.id("username"));
		   boolean d= s.isDisplayed();
		    System.out.println(d);
		    boolean e= s.isEnabled();
		    System.out.println(e);
		    WebElement g= driver.findElement(By.id("keepLoggedInCheckBox"));
		    boolean w = g.isSelected();
		    System.out.println(w);
		    driver.get("file:///D:/Demo2.html");
		    WebElement h = driver.findElement(By.xpath("//input[@type='text']"));
		    h.sendKeys(Keys.CONTROL+"a");
		    h.sendKeys(Keys.DELETE);
		    driver.close();
		  
		    
		   
	}

}
