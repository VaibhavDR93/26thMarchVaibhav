package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my3rdseleniumcode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		driver.findElement(By.xpath("//span[@title='Group 12 Velocity ']")).click();

	}

}
