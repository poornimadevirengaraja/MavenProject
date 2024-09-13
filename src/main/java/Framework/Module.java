package Framework;

public class Module extends TestData{
	
	public void testcase1() {
		POM pomref=new POM();
		System.out.println(urnm);
		System.out.println(pwrd);
		pomref.username.sendKeys(urnm);
		pomref.password.sendKeys(pwrd);
		
	}

}
