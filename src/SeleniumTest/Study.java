package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study
{
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hi guys");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
				
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		
		
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate ')]")).getText());
	}
	

}
