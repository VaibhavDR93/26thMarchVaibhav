package TestNgStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestFaileXML {
  @Test
  public void a()
  {
	  Assert.fail();
	  Reporter.log("A",true);
  }
  public void b()
  {
	  Reporter.log("B",true);
  }
  public void c()
  {
	  Reporter.log("C",true);
  }
}
