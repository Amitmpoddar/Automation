package qspiders;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollH {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		for(int i=0;i<30;i++)
		{
			j.executeScript("window.scrollBy(300,)");
		}
	Thread.sleep(1000);
	for(int i=30;i>0;i--)
	{
		j.executeScript("window.scrollBy(-300,0)");
	}
	}

	

}

