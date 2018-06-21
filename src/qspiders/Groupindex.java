package qspiders;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Groupindex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://localhost:8080/login.do");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.xpath("//div[.='Login ']")).click();
   String t= driver.getTitle();
   System.out.println(t);
   String u=driver.getCurrentUrl();
   System.out.println(u);
   if(t.equals("actiTIME - Login"))
   {
	   System.out.println("Homepage is Displayed");
   }
   else
   {
	   System.out.println("Homepage is not displayed");
   }
   Thread.sleep(3000);
   driver.findElement(By.id("logoutLink")).click();
   
   
   }
	}

