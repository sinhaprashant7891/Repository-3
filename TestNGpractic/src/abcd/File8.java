package abcd;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class File8 {

	@Test(dataProvider="data")
	public void registerUsr(String Fname,String Lname,String email,String password)
	{
		System.out.println("Fname");
		System.out.println("Lname");
		System.out.println("email");
		System.out.println("password");
	}
	@DataProvider(name="data")
	public Object[][] testData(){
		Object[][] obj=new Object[3][4];
				
				obj[0][0]="rahul";
				obj[0][1]="singh";
				obj[0][2]="r@gmail.com";
				obj[0][3]="rahul@123";
	
				obj[1][0]="prashant";
				obj[1][1]="singh";
				obj[1][2]="p@gmail.com";
				obj[1][3]="singh@123";
				
				obj[2][0]="rahu";
				obj[2][1]="singh";
				obj[2][2]="r@gmail.com";
				obj[2][3]="rahul@123";
	
				return obj;
	
	}
	
}
