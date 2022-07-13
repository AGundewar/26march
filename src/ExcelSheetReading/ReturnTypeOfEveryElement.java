package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReturnTypeOfEveryElement {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("C:\\\\Users\\\\Akshay\\\\Contacts\\\\Desktop\\\\Selenium\\\\ExcelEg1.xlsx");
		// Here we make small small pieces of large program i.e
		
		//WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		// Return types are ,
		Workbook book = WorkbookFactory.create(myfile); 
		Sheet mysheet = book.getSheet("Sheet1");
		Row myRow = mysheet.getRow(2);
		Cell myCell = myRow.getCell(4);
		System.out.println(myCell.getCellType());
		//getCellType() gives data type of element.
		
	}

}
