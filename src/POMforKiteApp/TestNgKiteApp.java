package POMforKiteApp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNgKiteApp {

private WebDriver driver;

@Test
  public void validateUserID()
  {
	
	
	HomePageKite HPK=new HomePageKite(driver);
	HPK.validateUserName();
	HPK.clickonUserName();
	
  }
  @BeforeMethod
  public void loginKiteApp()
  {
	  
	  LoginPageKite LPK=new LoginPageKite(driver);
		LPK.sendUserID();
		LPK.sendPassword();	
		LPK.clickloginButton();
  }

  @AfterMethod
  public void logoutKiteApp()
  {
	  
	  HomePageKite HPK=new HomePageKite(driver);
	  HPK.clickLogoutButton();
  }

  @BeforeClass
  public void launchBrowserAndKiteAPP() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	  
  }

  @AfterClass
  public void closeBrowser() 
  {
	  
	  driver.close();
  }

}
