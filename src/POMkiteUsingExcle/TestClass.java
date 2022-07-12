package POMkiteUsingExcle;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		 File myfile=new File("E:\\excle\\Book1.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		  String UID = mysheet.getRow(3).getCell(0).getStringCellValue();
		  String PWD = mysheet.getRow(3).getCell(1).getStringCellValue();
		  String PIN = mysheet.getRow(3).getCell(2).getStringCellValue();
	
		 System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(100);
			
			LoginPageKite LPK=new LoginPageKite(driver);
			LPK.sendUserID(UID);
			LPK.sendPassword(PWD);
			LPK.clickloginButton();
			Thread.sleep(2000);
			
			PinPageKite PPK=new PinPageKite(driver);
			PPK.sendpin(PIN);
			PPK.clickContinueButton();
			Thread.sleep(1000);
			
			HomePageKite HPK=new HomePageKite(driver);
			HPK.validateUserName(UID);
			HPK.clickonUserName();
			HPK.clickLogoutButton();
			
			

	}

}
