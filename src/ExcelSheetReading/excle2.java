package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excle2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("E:\\excle\\Book2.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		Row myrow = mysheet.getRow(2);
		Cell mycell = myrow.getCell(1);
		System.out.println(mycell.getCellType());
		System.out.println("==================================");
		
		//static code for reading all data from excle sheet
		for(int i=0;i<=2;i++) 
		{
			for(int j=0;j<=1;j++) 
			{
				String mydata = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(mydata+" ");
			}
			System.out.println();
		}

	}

}
