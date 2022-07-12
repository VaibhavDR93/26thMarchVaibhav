package TestNgKeywords;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledKeyword {
	 @Test(priority = 1)
	  public void c()
	  {
		 //Assert.fail();
		  Reporter.log("C",true);
	  }
	  @Test(enabled = false, priority = -1)
	  public void a()
	  {
		  Reporter.log("A",true);
	  }
	  @Test(priority = -2)
	  public void b()
	  {
		  Reporter.log("B",true);
	  }
}
