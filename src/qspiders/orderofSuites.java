package qspiders;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orderofSuites {
@BeforeSuite
public void a()
{
	Reporter.log("BeforeSuite",true);
}
@AfterSuite
public void b()
{
	Reporter.log("Aftersuite",true);
}
@BeforeTest
public void c()
{
	Reporter.log("BeforeTest",true);
}
@AfterTest
public void d()
{
	Reporter.log("AfterTest",true);
}
@BeforeMethod
public void e()
{
	Reporter.log("BeforeMethod",true);
}
@AfterMethod
public void f()
{
	Reporter.log("AfterMethod",true);
}
@BeforeClass
public void g()
{
	Reporter.log("BeforeClass",true);
}
@AfterClass
public void h()
{
	Reporter.log("Afterclass",true);
}
@Test
public void i()
{
	Reporter.log("Test",true);
}
}
