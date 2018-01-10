package abcd;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class File1 {
	@Test
	public void login1()
	{
		System.out.println("Login by email 1");
	}
	@Test
	public void login2()
	{
		System.out.println("Login by email 2");
		throw new SkipException("No need");
	}
	@Test
	public void login3()
	{
		System.out.println("Login by email 3");
	}

}
