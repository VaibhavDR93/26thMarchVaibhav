package POMforKiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(100);
			
			LoginPageKite LPK=new LoginPageKite(driver);
			LPK.sendUserID();
			LPK.sendPassword();
			LPK.clickloginButton();
			Thread.sleep(2000);
			
			PinPageKite PPK=new PinPageKite(driver);
			PPK.sendpin();
			PPK.clickContinueButton();
			Thread.sleep(1000);
			
			HomePageKite HPK=new HomePageKite(driver);
			HPK.validateUserName();
			HPK.clickonUserName();
			HPK.clickLogoutButton();
			
			

	}

}
