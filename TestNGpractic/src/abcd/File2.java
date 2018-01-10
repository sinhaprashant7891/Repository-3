package abcd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class File2 {
	@Test
	public void signup1()
	{
		System.out.println("signup by email 1");
		try {
		Assert.assertEquals("yahoo","google");
	}
		catch(Throwable t)
		{
			System.out.println(t);
		}
		System.out.println("After Handling");
	}
	@Test
	public void signup2()
	{
		System.out.println("signup by email 2");
	}
	@Test
	public void signup3()
	{
		System.out.println("signup by email 3");
	}

}
