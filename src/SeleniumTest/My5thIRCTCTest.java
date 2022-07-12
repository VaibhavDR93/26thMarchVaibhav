package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My5thIRCTCTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Mumb");
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//li[@id='p-highlighted-option']")).click();
		//driver.findElement(By.xpath("(//li[@role='option'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Solapur");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[@id='p-highlighted-option']")).click();
		
		driver.findElement(By.xpath("(//label[@class='css-label_c t_c'])[1]")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
		
	    driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		
		
		
		

	}

}
