package TestNgStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGrooping1 {
	@Test
	  public void o() 
	  {
		  Reporter.log("O",true);
	  }
	  @Test(groups = {"regression"})
	  public void p() 
	  {
		  Reporter.log("P regression",true);
	  }
	  @Test(groups = {"sanity"})
	  public void q() 
	  {
		  Reporter.log("Q sanity",true);
	  }
	  @Test(groups = {"regression"})
	  public void r() 
	  {
		  Reporter.log("R regression",true);
	  }
}
