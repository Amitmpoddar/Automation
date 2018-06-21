package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpbtn;
	
	@FindBy(xpath="//a[.='About actiTIME']")
	private WebElement aboutactitime;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closebtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logout()
	{
		logoutbtn.click();
	}
	public void help()
	{
		helpbtn.click();
	}
	public void about()
	{
		aboutactitime.click();
	}
	public void close()
	{
		closebtn.click();
	}

}
