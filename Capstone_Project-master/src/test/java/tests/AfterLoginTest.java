package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.AfterLoginPage;
import pages.LoginPage;
public class AfterLoginTest extends BaseClass{

	@Parameters({"Email","Password"})
	@Test
	public void afterLogin(String Emailval,String Passwordval) {
		AfterLoginPage AfterLogin = new AfterLoginPage();
		AfterLogin.afterlogin(Emailval, Passwordval);
		
		
	}
}