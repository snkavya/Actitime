package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.Assert;

import generic.Base_page;

public class Entertimetrackpage extends Base_page{
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement lo;
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[3]")
	private WebElement help;
	@FindBy(xpath="//a[.='About your actiTIME']")
	private WebElement aboutactitime;
	@FindBy(xpath="//span[contains(text(),'actiTIME')]")
	private WebElement version;
	@FindBy(xpath="//div[@id='aboutPopupCloseButtonId']")
	private WebElement close;
	//aRuha7eW
	public Entertimetrackpage(WebDriver driver)
	{
		super(driver);
	}
	public void logout()
	{
		lo.click();
	}
	public void clickhelp()
	{
		help.click();	
	}
	public void clickaboutactitime()
	{
		aboutactitime.click();
	}
	public void clickclose()
	{
		close.click();
	}
	public void verifyhomepage(String hp_title)
	{
		Verifytitle(hp_title);

	}
	public void actitimeversion(String eversion)
	{
		String aversion=version.getText();
		try{
			Assert.assertEquals(aversion, eversion);
			Reporter.log("version is matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("version is not matching",true);	
			Assert.fail();
		}
	}
}
