package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {

	// Hard Assert means if statement or test method fails it will not execute next test method or next line after failure

	String name="poornimadevi";

	@Test(priority=1)
	public void test1() {
		
		System.out.println("Test1");
		Assert.assertTrue(name.equals("poornimadevi"));

		//if you are not using this statement "sa.assertAll();"  then all the test1, test2, test3 will show Pass only.
		//if you are using this statement "sa.assertAll();" then only it will show which ever tests get failed and which ever test get pass.
	}
	
	@Test(priority=2)
	public void test2() {			
		System.out.println("Test2");
		//assertEquals("ABC", "ABC");
		Assert.assertEquals("abc", "ABC");
		System.out.println("Test2 statement after failure");// it will not print this statement if the above assert equals statement fails.
		
	}
	
	
	@Test(priority=3)
	public void test3() {	
		System.out.println("Test3");
		Assert.assertEquals("monday", "monday");
		
	}
}
