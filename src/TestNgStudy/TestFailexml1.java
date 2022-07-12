package TestNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestFailexml1 {
	 @Test
	  public void p()
	  {
		 Assert.fail();
		  Reporter.log("P",true);
	  }
	  public void q()
	  {
		  Reporter.log("Q",true);
	  }
	  public void r()
	  {
		  Reporter.log("R",true);
	  }
}
