package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterstestng {
	//parameters should be provided after the suite and before the test in testng.xml
	@Test
	@Parameters("userid")
	public void Test1(String uid) {
	System.out.println("This is the user id :"+uid);	
	}

	@Test
	@Parameters("password")
	public void Test2(String pwd) {
	System.out.println("This is the user id :"+pwd);	
	}
}
