package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// Here we read the excel sheet.
		// row --> row and column --> cell
		// And we start the index from 0.
		
		// Create excel sheet and pass the path along with name and extension in file.
		
		// First up all we create the object of File.
		File myfile = new File("C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\ExcelEg1.xlsx");
		
		//using WorkBookFactory class read excel sheet.
		
	//1. How to read String values.
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(name);
		
		String position = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(4).getStringCellValue();
        System.out.println(position);
        
        System.out.println("**********************************");
        
    //2. How to read Numeric values
        double run = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
        System.out.println(run);
        
        double strikerate = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
        System.out.println(strikerate);
	
        System.out.println("**********************************");
        
    //3. How to read Character values.
        //it is same as String because here no special method for character.
        String wicket = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(4).getStringCellValue();
	    System.out.println(wicket);
	    
	    System.out.println("**********************************");
	    
	//4. How to read Boolean Values.
	    boolean booleanValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(5).getBooleanCellValue();
	    System.out.println(booleanValue);
	    
	    boolean bv = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(5).getBooleanCellValue();
	    System.out.println(bv);
	    
	
	}

}
