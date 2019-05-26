package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_page {
	public WebDriver driver;
	public Base_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Verifytitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
	}
	public void verifyelement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is found",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not found",true);
			Assert.fail();
		}

	}

}


