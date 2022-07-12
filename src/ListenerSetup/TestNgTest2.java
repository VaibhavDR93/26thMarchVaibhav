package ListenerSetup;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerSetup.Listener.class)
public class TestNgTest2 {
  @Test
  public void myMethod4() 
  {
	  Reporter.log("myMethod4 TC passed",true);
  }
  @Test
  public void myMethod5() 
  {
	  
	  Reporter.log("myMethod5 TC failed",true);
	  Assert.fail();
  }
  @Test(dependsOnMethods = {"myMethod5"})
  public void myMethod6() 
  {
	  Reporter.log("myMethod6 TC skipped",true);
  }
}
