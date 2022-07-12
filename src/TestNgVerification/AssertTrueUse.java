package TestNgVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMethod1()
  {
	  boolean a=true;
	  boolean b=false;
	  
	  Assert.assertTrue(a, "value is false TC is failed");
	  Reporter.log("value is true Tc is passed",true);
	  
	  Assert.assertFalse(b, "value is true TC is failed");
	  Reporter.log("value is false TC is passed",true);
  }
}
