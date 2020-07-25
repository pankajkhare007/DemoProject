package ByListnerInterface;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerTestClass 
{
	
	@Test
	public void testMethod()
	{
		System.out.println("before assert calling");
		Assert.assertEquals(10, 11);
	}
}
