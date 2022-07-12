package ExcelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excle1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//first need to create File object and pass the path  along with name and extension in File 
		
		File myfile=new File("E:\\excle\\Book1.xlsx");
		// Using WorkBookFactory class read excel sheet
		
		// read String value
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		//read char value
		String grade = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(grade);
		//read numeric value
		double num = WorkbookFactory.create(myfile).getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		System.out.println(num);
		//read boolen value
		boolean result = WorkbookFactory.create(myfile).getSheetAt(0).getRow(0).getCell(1).getBooleanCellValue();
		System.out.println(result);
		
		String all = WorkbookFactory.create(myfile).getSheetAt(0).getRow(4).getCell(5).getStringCellValue();
		System.out.println(all);
		
		
		
		
		

	}

}
