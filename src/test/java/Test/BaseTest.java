package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import GenricUtils.DriverUtils;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
		DriverUtils.createDriver();
	}
	
	

}

