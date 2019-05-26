package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_constant {
	public WebDriver driver;
	static{
		System.setProperty(Gecko_key, Gecko_value);
	}
	@BeforeMethod
	public void openappln()
	{
		 driver=new FirefoxDriver();
		driver.get("https://online.actitime.com/ks/login.do");
	}
	@AfterMethod
	public void closeaplln()
	{
		driver.quit();
	}

}
