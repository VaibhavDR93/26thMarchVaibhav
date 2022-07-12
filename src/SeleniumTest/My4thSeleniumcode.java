package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My4thSeleniumcode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaibhav@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");

		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		

	}

}
