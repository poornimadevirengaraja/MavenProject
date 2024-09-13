package Framework;

import java.io.IOException;

import org.testng.annotations.Test;

public class Runner extends TestData {
	Module moduleref=new Module();
	
	
	@Test
	public void Testrunmethod() throws IOException, InterruptedException {
		testdatamethod();
		BaseClass.chromeopen();		
		moduleref.testcase1();
	}
	



}
