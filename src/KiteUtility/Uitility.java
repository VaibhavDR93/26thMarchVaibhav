package KiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import KiteBase.BaseProp;

public class Uitility extends BaseProp
{
	//1.excel
	//2.screenshot
	//3.closing
	
	public static String dataReadFromExcel(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		 File myfile=new File("E:\\excle\\Book1.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		 return value;
		
	}
	public static void pickScreenshot(String SSID) throws IOException 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\screenShots\\myScreenShot"+SSID+".png");
		FileHandler.copy(source, destination);
		
		
	}

}
