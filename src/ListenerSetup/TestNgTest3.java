package ListenerSetup;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestNgTest3 {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("myMethod1 TC passed",true);
  }
  @Test
  public void myMethod2() 
  {
	  
	  Reporter.log("myMethod2 TC failed",true);
	  Assert.fail();
  }
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("myMethod3 TC skipped",true);
  }
}
