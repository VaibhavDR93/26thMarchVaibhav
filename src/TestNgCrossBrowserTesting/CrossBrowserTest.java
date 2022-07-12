package TestNgCrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	@Parameters("BrowserName")
  @Test
  public void launchingBrowsers(String name) throws InterruptedException
  {
	  WebDriver driver = null;
	 
	  if(name.equals("Firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
	  }
	  else if(name.equals("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver(); 
	  }
	  
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.close();
  }
}
