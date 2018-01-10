package abcd;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class File7 {

	@Parameters("email")
	@Test
	public void login(String email)
	{
		System.out.println("Inside Login");
		System.out.println(email);
	}
}
