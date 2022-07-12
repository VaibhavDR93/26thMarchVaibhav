package KiteUsingPomWithTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassTestNg {
	WebDriver driver;
	LoginPageKite login;
	PinPageKite pin;
	HomePageKite home;
	Sheet mysheet;
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("--headless");

		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Reporter.log("Launching Browser",true);
			 File myfile=new File("E:\\excle\\Book1.xlsx");
			 mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
			 
			
			login=new LoginPageKite(driver);
			pin=new PinPageKite(driver);
			home=new HomePageKite(driver);
	}
	@BeforeMethod
	public void loginKite()
	{
		 String UID = mysheet.getRow(3).getCell(0).getStringCellValue();
		  String PWD = mysheet.getRow(3).getCell(1).getStringCellValue();
		  String PIN = mysheet.getRow(3).getCell(2).getStringCellValue();
		  login.sendUserID(UID);
		  Reporter.log("sending userid",true);
		  login.sendPassword(PWD);
		  Reporter.log("sending password",true);
		  login.clickloginButton();
		  Reporter.log("click on login button",true);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  
		  pin.sendpin(PIN);
		  Reporter.log("sending pin",true);
		  pin.clickContinueButton();
		  Reporter.log("click on continue button",true);
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	
	}
   @Test
   public void validateUID() 
   {
	   String actualUserName = home.getActualUID();
	   String expectedUserName = mysheet.getRow(3).getCell(0).getStringCellValue();
	   Reporter.log("validating uid",true);
	   Assert.assertEquals(actualUserName, expectedUserName,"Actual & Expected user name not matching TC failed");
	   Reporter.log("Actual & Expected user name are matching TC passed",true);
   }
   @AfterMethod
   public void logoutkite() throws InterruptedException 
   {
	   home.clickLogoutButton();
	   Reporter.log("Login out",true);
	   
   }
   @AfterClass
   public void closeBrowser() 
   {
	   driver.close();
	   Reporter.log("Browser closed",true);
   }
   
}
