package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PriorityKeyword {
  @Test(priority = 1)
  public void c()
  {
	  Reporter.log("C",true);
  }
  @Test(priority = -1)
  public void a()
  {
	  Reporter.log("A",true);
  }
  @Test(priority = -2)
  public void b()
  {
	  Reporter.log("B",true);
  }
  @AfterMethod
  public void design()
  {
	  System.out.println("=================");
  }
}
