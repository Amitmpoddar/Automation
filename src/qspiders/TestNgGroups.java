package qspiders;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgGroups {
@BeforeMethod(alwaysRun=true)
public void login()
{
	Reporter.log("login",true);
}
@Test
public void calls()
{
Reporter.log("calls",true);	
}
@Test(groups= {"status","whatsup"})
public void status()
{
	Reporter.log("status",true);
}
@Test
public void chats() 
{
	Reporter.log("chats",true);
}
@AfterMethod(alwaysRun=true)
public void logout()
{
	Reporter.log("logout",true);
}

}
