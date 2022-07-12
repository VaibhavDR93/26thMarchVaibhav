package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//get()-->used for enter url & open an applicatin
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);//used for matching speed of selenium & browser
		
		//close()-->used for close current opened tab of browser
		
		//driver.close();//method used for close current tab of browser
		
		//quit()-->used for close all tabs are present in browser
		
		//driver.quit();//method used for close all tab which are present in browser
		
		driver.manage().window().maximize();//used for maximize browser
		//driver.manage().window().minimize();//used for minimize browser
		
		//navigate()-->used for open an application & move forword & backword & refresh webpage
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		//getTitle()-->used for get title of webpage return type in string
		
		System.out.println(driver.getTitle()); 
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl()-->used for get URL of webpage return type in string
		
		System.out.println(driver.getCurrentUrl());
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		

	}

}
