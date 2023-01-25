package Test;

import org.testng.annotations.Test;

import GenricUtils.DriverUtils;
import Pages.Admin;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void Login() throws InterruptedException
	
	{
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp=new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
		
		Admin pt=new Admin();
		pt.clickAdmin();
		pt.clickAdd();
	}
	

}
