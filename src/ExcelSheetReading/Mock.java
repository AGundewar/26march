package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Mock {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("C:\\\\Users\\\\Akshay\\\\Contacts\\\\Desktop\\\\Selenium\\\\ExcelEg1.xlsx");
		
		Workbook book = WorkbookFactory.create(myfile);
		org.apache.poi.ss.usermodel.Sheet mysheet = book.getSheet("Sheet1");
	
		int totalnoofrows = mysheet.getLastRowNum();
//		System.out.println(totalnoofrows);
		int rowcount = totalnoofrows;
		short totalnoofcell = mysheet.getRow(totalnoofrows).getLastCellNum();
//		System.out.println(totalnoofcell);
		int cellcount = totalnoofcell-1;
		
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=cellcount;j++)
			{
				org.apache.poi.ss.usermodel.Cell value = mysheet.getRow(i).getCell(j);
				if (value!=null)
				{
					org.apache.poi.ss.usermodel.CellType datatype = value.getCellType();
					if(datatype == org.apache.poi.ss.usermodel.CellType.STRING)
					{
						String v = value.getStringCellValue();
						System.out.print(v+"  ");
					}
					else if(datatype == org.apache.poi.ss.usermodel.CellType.NUMERIC)
					{
						double v = value.getNumericCellValue();
						System.out.print(v+"  ");
					}
					else if(datatype== org.apache.poi.ss.usermodel.CellType.BOOLEAN)
					{
						boolean v = value.getBooleanCellValue();
						System.out.print(v+"  ");
					}
				}
				else
				{
//						else if(datatype==CellType.BLANK)
//						{
//							System.out.print("  ");
//						}
					System.out.print(" --- ");
				}
			}
			System.out.println();
		}

	}

}
