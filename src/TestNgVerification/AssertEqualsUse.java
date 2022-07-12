package TestNgVerification;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod()
  {
	  String a="vaibhav";
	  String b="vaibhav1";
	  
	 // Assert.assertEquals(a, b,"a&b values are not matching TC failed");
	 // Reporter.log("a&b values are matching TC pass",true);
	  
	  Assert.assertNotEquals(a, b, "a&b values are matching TC is failed");
	  Reporter.log("a&b values are not matching TC pass",true);
	  
  }
}
