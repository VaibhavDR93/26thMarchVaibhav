package TestNgCrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowser {
  @Test
  public void firefoxBrowserLaunch() 
  {
	  System.setProperty("webdriver.gecko.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
  }
}
