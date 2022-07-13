package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3DynamicType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		// Here we read the excel sheet by using Dynamic testing.
		// Dynamic testing --> By not seeing the sheet we can calculate
		//how many rows, column and which type of information is their.

		File myfile = new File("C:\\Users\\Akshay\\Contacts\\Desktop\\Selenium\\ExcelEg1.xlsx");
        
		Workbook book = WorkbookFactory.create(myfile); 
		// For Dynamic we put Any type of data.
		Sheet mySheet = book.getSheet("Sheet1");
		
    //  First up all we calculate How many rows are their.
        int totalNumberOfRows = mySheet.getLastRowNum();
        int rowCount = totalNumberOfRows;
        System.out.println("Rows are "+rowCount); //it will start from 0.
		
    //  now we calculate how many Cells are their.
        short totalNumberOfCells = mySheet.getRow(totalNumberOfRows).getLastCellNum(); //here first we use row then column.
//        System.out.println("Cells are "+totalNumberOfCells); //this is start from 1 and this is not valid.
        int cellCount = totalNumberOfCells-1;
        System.out.println("Cells are "+cellCount);
        
        System.out.println("==============================");
        
    //  now we use for loop but without putting any number.
        for(int i=0; i<=rowCount; i++)
        {
        	for(int j=0; j<=cellCount; j++)
        	{
        		Cell cellValue = mySheet.getRow(i).getCell(j);
        		if(cellValue!=null)
        		{
        		CellType dataType = cellValue.getCellType(); //to know the type of values
        		
        		if(dataType == CellType.STRING)
        		{
        			String value = cellValue.getStringCellValue();
        			System.out.print(value+" ");
        		}
        		
        		else if (dataType == CellType.NUMERIC)
        		{
        			double value = cellValue.getNumericCellValue();
					System.out.print(value+" ");
				}
        		
        		else if (dataType == CellType.BOOLEAN)
        		{
        			boolean value = cellValue.getBooleanCellValue();
        			System.out.print(value+" ");
				}
        		
        		
        		else if (dataType == CellType.BLANK)
        		{
				    System.out.print("  ");	
				}
        		}
        		
        		else
        		{
        			System.out.print("=== ");
        		}
        		
				
        	}
        	System.out.println();
        }
        
        
        
        
        
        
        
	}

}
