package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	@FindBy(id="username")
	private WebElement usernametextbox;
	
	@FindBy(name="pwd")
	private WebElement passwordtextbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errormsg;
	
	public Loginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String usname)
	{
		usernametextbox.sendKeys(usname);
	}
    
	public void password(String pwdname)
	{
		passwordtextbox.sendKeys(pwdname);
	}
	public void login1()
	{
		loginbtn.click();
	}
}
