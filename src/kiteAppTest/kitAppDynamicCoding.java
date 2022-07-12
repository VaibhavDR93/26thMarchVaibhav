package kiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitAppDynamicCoding {
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
			
			WebElement userID = driver.findElement(By.id("userid"));
			WebElement passWord = driver.findElement(By.id("password"));
			WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userID.sendKeys(UID);
			passWord.sendKeys(PWD);
			LoginButton.click();
			Thread.sleep(1000);
			
			WebElement pin = driver.findElement(By.id("pin"));
			WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			pin.sendKeys(PIN);
			continuebutton.click();
			Thread.sleep(1000);
			
			//Alert alt = driver.switchTo().alert();
			//alt.dismiss();
			
			WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
			String actualUserID = userName.getText();
			String exceptedUserID = UID;
			if(actualUserID.equals(exceptedUserID))
			{
				System.out.println("UID matching Test case is PASSED");
			}
			else 
			{
				System.out.println("UID not matching Test case is FAILED");
			}
			
			userName.click();
			Thread.sleep(200);
			driver.findElement(By.xpath("//a[@target='_self']")).click();
			Thread.sleep(2000);
			
			driver.quit();
			

	}

}
