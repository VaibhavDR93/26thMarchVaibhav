package TestNgVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod2() 
  {
	  String a=null;
	  String b="vs";
	  
	  Assert.assertNull(a, "value is not Null TC is failed");
	  Reporter.log("value is Null TC is passed");
	  
	  Assert.assertNotNull(b, "value is Null TC is failed");
	  Reporter.log("value is not Null TC is passed");
  }
}
