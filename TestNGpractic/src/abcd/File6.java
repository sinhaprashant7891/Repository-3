package abcd;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class File6 {
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login by email");
		Assert.assertEquals("yah","waa");
	}
	@Test()
	public void navigation()
	{
		System.out.println("Navigating");
	}
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("Logout");
	}

}
