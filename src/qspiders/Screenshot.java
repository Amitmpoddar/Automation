package qspiders;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://localhost:8080/user/submit_tt.do");
TakesScreenshot t =(TakesScreenshot)driver;

File src = t.getScreenshotAs(OutputType.FILE);
File dest = new File("D://shaadipic.png");
FileUtils.copyFile(src,dest);
driver.close();
	}



	}


