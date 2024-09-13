package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider(name="dpmethod")
	public Object[][] datap() {
		return new Object[][] {
			{"poornima","p123456"},
			{"swetha","s123456"}
		};
	}

	@Test(dataProvider="dpmethod")
	public void Test1(String t1, String t2) {
		System.out.println("userid="+t1+"Password="+t2);
	}
}
