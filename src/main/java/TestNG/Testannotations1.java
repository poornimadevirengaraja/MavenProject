package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

/*
 * Priority = -1,0,1,2
 * without priority it runs in alphabetical order
 */
public class Testannotations1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=0)
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority=-1)
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test
	public void a() {
		System.out.println("a");
	}
	@Test(enabled=false) // it will not execute the test cases
	public void b() {
		System.out.println("b");
	}
	@Test
	public void c() {
		System.out.println("c");
	}
	@Test
	public void d() {
		System.out.println("d");
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After suite");
	}

	
	



}
