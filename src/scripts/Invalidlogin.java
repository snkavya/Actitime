package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.excel;
import pom.Loginpage;

public class Invalidlogin extends Base_Test{
@Test
public void testInvalidlogin() throws EncryptedDocumentException, IOException
{
	String un = excel.getcellvalue(Path, "Invalidlogin", 0, 1);
	  String pwd = excel.getcellvalue(Path, "Invalidlogin", 1, 1);
		Loginpage lp=new Loginpage(driver);
		lp.ubox(un);
		lp.pwd(pwd);
		lp.login();
		lp.errmsg();
		
	  
}
}
