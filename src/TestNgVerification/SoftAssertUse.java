package TestNgVerification;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void softA()
  {
	  String a="love";
	  String b="love";
	  
	  //to use soft assert we need to create object of SoftAssert class
	  SoftAssert soft=new SoftAssert();
	 
	  soft.assertNotEquals(a, b,"a&b value are matching tc is failed");
	  soft.assertEquals(a, b,"a&b value are not matching tc is failed");
	  
	  soft.assertAll();
  }
}
