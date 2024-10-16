package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;


public class Testannotations2 {
	
	@Test(groups="cycle1",invocationCount=2) // this will run this method twice
	public void test1() {
		System.out.println("Test1");
		assertEquals("poorni","Poorni");
	}


	@Test(groups="cycle1")
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(groups="cycle1")
	public void test3() {
		System.out.println("Test3");
	}
	
	//dependsOnMethods - it depends on specific method. If test2,test3,test5 is pass then only this test4 method will execute. 
	//if any one test2, test3, test5 fails then it will not execute test4 method
	@Test(dependsOnMethods= {"test2","test3","test1"})
	public void test4() {
		System.out.println("Test4");
	}

	//dependsOnGroups - it depends on specific groups "cycle1". if any of this group cycle1 fails. Then it will skip executing this test5.
	// Only dependsOnGroups="cycle1" if all are pass then only test5 will get executed.
	@Test(dependsOnGroups="cycle1",alwaysRun=true) 
	public void test5() {
		System.out.println("Test5");
	}
	// alwaysRun=true will run this test method irrespective of even if  dependsOnGroups="cycle1" test methods get failed 

	
	



}
