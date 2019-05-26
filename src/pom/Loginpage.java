package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;

public class Loginpage extends Base_page{
@FindBy(id="username")
private WebElement ubox;
@FindBy(name="pwd")
private WebElement pwd;
@FindBy(xpath="//div[.='Login ']")
private WebElement login;
@FindBy(xpath="//span[contains(text(),'Username or Password is invalid. Please try again.')]")
private WebElement errmsg;

public Loginpage(WebDriver driver)
{
super(driver);
}

public void ubox(String un)
{
	ubox.sendKeys(un);
}

public void pwd(String pwdd)
{
	pwd.sendKeys(pwdd);
}
public void login()
{
	login.click();
}

public void verifyloginpage(String title)
{
	Verifytitle(title);
}
public void errmsg()
{
	verifyelement(errmsg);
	
}
}
