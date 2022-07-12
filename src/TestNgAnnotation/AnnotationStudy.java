package TestNgAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationStudy {
  @Test(priority = 1)
  public void validateUID()
  {
	  Reporter.log("UID validated",true);
  }
  @Test(priority = 2)
  public void validateDashBoard()
  {
	  Reporter.log("DashBoard validated",true);
  }
  
  @BeforeMethod
  public void loginToApp()
  {
	  Reporter.log("login success",true);
  }

  @AfterMethod
  public void logoutApp()
  {
	  Reporter.log("logout success",true);
  }

  @BeforeClass
  public void launchBrowserAndApp() 
  {
	  Reporter.log("Browser & app launched",true);
  }

  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser closed",true);
  }

}
