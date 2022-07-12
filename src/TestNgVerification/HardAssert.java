package TestNgVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void HardA() 
  {
	  String a="love";
	  String b="love";
	  
	  Assert.assertNotEquals(a, b,"a&b value are matching Tc failed");
	  Assert.assertEquals(a, b,"a&b value are not matching TC failed");
  }
}
