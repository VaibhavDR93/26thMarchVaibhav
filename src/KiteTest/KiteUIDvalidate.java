package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePomClasses.HomePageKite;
import KitePomClasses.LoginPageKite;
import KitePomClasses.PinPageKite;
import KiteUtility.Uitility;

public class KiteUIDvalidate extends Base
{
	LoginPageKite login;
	PinPageKite pin;
	HomePageKite home;
	String SSID="001";
	
  @BeforeClass
  public void launchBrowser()
  {
	  setupBrowser();
	  login=new LoginPageKite(driver);
	  pin=new PinPageKite(driver);
	  home=new HomePageKite(driver);
	  
  }
  @BeforeMethod
  public void loginKite() throws EncryptedDocumentException, IOException 
  {
	  login.sendUserID(Uitility.dataReadFromExcel(3, 0));
	  login.sendPassword(Uitility.dataReadFromExcel(3, 1));
	  login.clickloginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendpin(Uitility.dataReadFromExcel(3, 2));
	  pin.clickContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUID() throws EncryptedDocumentException, IOException 
  {
	  String actualUID = home.getActualUID();
	  String expectedUID = Uitility.dataReadFromExcel(3, 0);
	  Assert.assertEquals(actualUID, expectedUID,"actual & expected result are not matching TC FAILED");
	  Uitility.pickScreenshot(SSID);
	  Reporter.log("actual & expected result are matching TC PASSED",true);
  }
  @AfterMethod
  public void logoutKite() throws InterruptedException 
  {
	  home.clickLogoutButton();
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
