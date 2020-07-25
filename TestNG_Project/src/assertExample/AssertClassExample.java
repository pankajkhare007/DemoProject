package assertExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertClassExample 
{
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.gecko.driver","lib\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		//Assert.
		Assert.assertEquals( driver.getTitle(),"Welcome: Mercury Tours","Strings are not matching");
		//Write a code to login and write a method called isUserLoggedInSuccessfully and isUserLoggedOut which returns boolean.
		Assert.assertTrue(isUserLoggedInSuccessfully(), "User failed to login");
		Assert.assertFalse(isUserLoggedOut());
		SoftAssert as=new SoftAssert();
			
		}
	public boolean isUserLoggedInSuccessfully()
	{
		return false;
	}
	public boolean isUserLoggedOut()
	{
		return false;
	}

}
