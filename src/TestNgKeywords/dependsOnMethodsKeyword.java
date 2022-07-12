package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethodsKeyword {
	 @Test
	  public void c()
	  {
		  Reporter.log("C",true);
	  }
	  @Test(dependsOnMethods = {"b"})
	  public void a()
	  {
		  Reporter.log("A",true);
	  }
	  @Test
	  public void b()
	  {
		  Reporter.log("B",true);
	  }
}
