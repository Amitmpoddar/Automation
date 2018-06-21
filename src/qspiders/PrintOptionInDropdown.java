package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionInDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("file:///D:/Dropdown.html");
WebElement ele = driver.findElement(By.id("SLV"));
Select s = new Select(ele);
List<WebElement> c = s.getOptions();
int q = c.size();
System.out.println(q);
for(WebElement e:c)
{
	String text = e.getText();
	System.out.println(text);
}

	}

}
