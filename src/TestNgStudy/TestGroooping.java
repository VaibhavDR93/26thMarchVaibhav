package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroooping {
  @Test(groups = {"sanity"})
  public void a() 
  {
	  Reporter.log("A sanity",true);
  }
  @Test(groups = {"regression"})
  public void b() 
  {
	  Reporter.log("B regression",true);
  }
  @Test(groups = {"sanity"})
  public void c() 
  {
	  Reporter.log("C sanity",true);
  }
  @Test(groups = {"regression"})
  public void d() 
  {
	  Reporter.log("D regression",true);
  }
}
