package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2StaticType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// Here we read the excel sheet by using Static testing.
		// Static testing --> By seeing the sheet and after we cannot change the program.
		
		File myfile = new File("C:\\\\Users\\\\Akshay\\\\Contacts\\\\Desktop\\\\Selenium\\\\ExcelEg1.xlsx");
        
		Workbook book = WorkbookFactory.create(myfile); 
		// For Static we put same type of data.
		Sheet mySheet = book.getSheet("Sheet2");
		
		for(int i=0; i<=2; i++) //Outer for loop for Rows
		{
			for(int j=0; j<=3; j++) //Inner for loop for Cells.
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue(); //because all values we put in excel sheet are string type.
				System.out.println(value+" ");
			}
			//System.out.println();
		}
		
		System.out.println("============================");
		
		// We want in array or excel type form then
		
		for(int i=0; i<=2; i++) //Outer for loop for Rows
		{
			for(int j=0; j<=3; j++) //Inner for loop for Cells.
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue(); //because all values we put in excel sheet are string type.
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
