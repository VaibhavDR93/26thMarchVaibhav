package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountKeyword {
  @Test(invocationCount = 5)
  public void testInvocation() 
  {
	  Reporter.log("Apple",true);
  }
  @AfterMethod
  public void isFruit()
  {
	  Reporter.log("Fruit",true);
  }
}
