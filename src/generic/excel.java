package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class excel implements Auto_constant{
	public static String getcellvalue(String PATH,String sheet,int cell,int row) throws EncryptedDocumentException, IOException
	{
		String v="";
	try {
		FileInputStream fis=new FileInputStream(Path);
		Workbook wb=WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		 v = c.toString();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		Reporter.log("path is invalid", true);
	}
	return v;
	}

}
