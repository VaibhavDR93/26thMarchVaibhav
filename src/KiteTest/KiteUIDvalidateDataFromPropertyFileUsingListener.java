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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteBase.BaseProp;
import KitePomClasses.HomePageKite;
import KitePomClasses.LoginPageKite;
import KitePomClasses.PinPageKite;
import KiteUtility.uitilityProperties;

@Listeners(KiteUtility.uitilityListener.class)
public class KiteUIDvalidateDataFromPropertyFileUsingListener extends BaseProp
{
	LoginPageKite login;
	PinPageKite pin;
	HomePageKite home;
	//String SSID="002";
	
  @BeforeClass
  public void launchBrowser() throws IOException
  {
	  setupBrowser();
	  login=new LoginPageKite(driver);
	  pin=new PinPageKite(driver);
	  home=new HomePageKite(driver);
	  
  }
  @BeforeMethod
  public void loginKite() throws EncryptedDocumentException, IOException 
  {
	  login.sendUserID(uitilityProperties.getDataFromPropertyFile("UID"));
	  login.sendPassword(uitilityProperties.getDataFromPropertyFile("PWD"));
	  login.clickloginButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendpin(uitilityProperties.getDataFromPropertyFile("PIN"));
	  pin.clickContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
  @Test
  public void validateUID() throws EncryptedDocumentException, IOException 
  {
	  
	  Assert.assertEquals(home.getActualUID(), uitilityProperties.getDataFromPropertyFile("UID"),"actual & expected result are not matching TC FAILED");
	  Assert.fail();
	// Uitility.pickScreenshot(SSID);
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
