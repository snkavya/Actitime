package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.excel;
import pom.Entertimetrackpage;
import pom.Loginpage;

public class Verifyactitimeversion extends Base_Test {
	@Test
	public void testVerifyactitimeversion() throws EncryptedDocumentException, IOException, InterruptedException
	{
	  String un = excel.getcellvalue(Path, "Verifyactitimeversion", 0, 1);
	  String pwd = excel.getcellvalue(Path, "Verifyactitimeversion", 1, 1);
	  String hp_title = excel.getcellvalue(Path, "Verifyactitimeversion", 2, 1);
	  String title = excel.getcellvalue(Path, "Verifyactitimeversion", 3, 1);
	  String version = excel.getcellvalue(Path, "Verifyactitimeversion", 4, 1);
		Loginpage lp=new Loginpage(driver);
		lp.ubox(un);
		lp.pwd(pwd);
		lp.login();
		
		Entertimetrackpage ep=new Entertimetrackpage(driver);
		
		ep.verifyhomepage(hp_title);
		Thread.sleep(3000);
		ep.clickhelp();
		Thread.sleep(3000);
		ep.clickaboutactitime();
		Thread.sleep(3000);
		ep.actitimeversion(version);
		Thread.sleep(3000);
		ep.clickclose();
		Thread.sleep(3000);
		ep.logout();
		lp.verifyloginpage(title);
	}
}
