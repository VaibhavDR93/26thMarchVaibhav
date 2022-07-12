package ListenerSetup;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerSetup.Listener.class)
public class TestNgTest1 {
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
