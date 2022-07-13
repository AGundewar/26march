package A_KiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{
     //Here we use the parameter that we needs.
	  
	//1) excel
	//2) screenshot
	//3) closing
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("C:\\\\Users\\\\Akshay\\\\Contacts\\\\Desktop\\\\Selenium\\\\ExcelEg1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	    String value = mySheet.getRow(row).getCell(cell).getStringCellValue(); 
		
		return value;
		
	}
	
}
 