package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excle3imp {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("E:\\excle\\PURCHASE JAN FEB MARCH.xlsx");
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int totalNumOfRows = mysheet.getLastRowNum();
		int rowcount = totalNumOfRows;
		System.out.println("total Num Of Rows "+rowcount);
	    
		short totalNumOfcell = mysheet.getRow(rowcount).getLastCellNum();
		int cellcount = totalNumOfcell-1;
		System.out.println("total Num Of cell "+cellcount);
		System.out.println("==========================================================");
		
		//dynamic coding for reading all data from excle sheet
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=cellcount;j++)
			{
				Cell cellvalues = mysheet.getRow(i).getCell(j);
				//System.out.print(cellvalues+"  ");
				CellType datatype = cellvalues.getCellType();
				if(datatype==CellType.STRING)
				{
					String value = cellvalues.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.NUMERIC) 
				{
					double value = cellvalues.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.BOOLEAN)
				{
					boolean value = cellvalues.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(datatype==CellType.BLANK)
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		
		}
	}

}
