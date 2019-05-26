package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.excel;
import pom.Entertimetrackpage;
import pom.Loginpage;

public class Validloginlogout extends Base_Test{
@Test
public void testValidloginlogout() throws EncryptedDocumentException, IOException, InterruptedException
{
  String un = excel.getcellvalue(Path, "Validloginlogout", 0, 1);
  String pwd = excel.getcellvalue(Path, "Validloginlogout", 1, 1);
  String hp_title = excel.getcellvalue(Path, "Validloginlogout", 2, 1);
  String title = excel.getcellvalue(Path, "Validloginlogout", 3, 1);
	Loginpage lp=new Loginpage(driver);
	lp.ubox(un);
	lp.pwd(pwd);
	lp.login();
	
	Entertimetrackpage ep=new Entertimetrackpage(driver);
	
	ep.verifyhomepage(hp_title);
	Thread.sleep(3000);
	ep.logout();
	lp.verifyloginpage(title);
	
}


}
