package qspiders;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG{
	@Test(invocationCount=5,priority=1)
	public void abc()
	{
		Reporter.log("calls",true);
	}
	@Test
	public void xyz()
	{
		Reporter.log("settings",true);
	}
	@Test(priority=-2)
	public void pqr()
	{
		Reporter.log("chats",true);
	}
}

