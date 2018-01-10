package abcd;

import org.testng.annotations.Test;

public class File9 {
	
	@Test(groups= {"performance"})
	public void feature1()
	{
		System.out.println("Inside Feature 1");
	}
	@Test(groups= {"regresion"})
	public void feature2()
	{
		System.out.println("Inside Feature 2");
	}
	@Test(groups= {"performance","regresion"})
	public void feature3()
	{
		System.out.println("Inside Feature 3");
	}

}
