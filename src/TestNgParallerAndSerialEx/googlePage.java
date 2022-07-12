package TestNgParallerAndSerialEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googlePage {
  @Test
  public void googleLaunch() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
  }
}
