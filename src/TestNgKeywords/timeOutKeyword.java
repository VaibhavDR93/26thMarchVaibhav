package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOutKeyword {
	 @Test
	  public void c()
	  {
		  Reporter.log("C",true);
	  }
	  @Test(timeOut = 1000)
	  public void a() throws InterruptedException
	  {
		  Thread.sleep(1000);
		  Reporter.log("A",true);
	  }
	  @Test
	  public void b()
	  {
		  Reporter.log("B",true);
	  }
}
