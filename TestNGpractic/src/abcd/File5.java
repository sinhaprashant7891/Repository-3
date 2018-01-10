package abcd;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class File5 {
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login by email");
	}
	@Test(priority=2)
	public void navigation()
	{
		System.out.println("Navigating");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Logout");
	}

}
