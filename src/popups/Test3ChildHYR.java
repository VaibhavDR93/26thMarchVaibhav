package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3ChildHYR {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String mainpageID = driver.getWindowHandle();
		System.out.println(mainpageID);
		
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(4000);
		Set<String> ids = driver.getWindowHandles();
		for (String id: ids)
		{
			System.out.println(id);
			if(!id.equals(mainpageID)) 
			{
				driver.switchTo().window(id);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vaibhav");	
			}
			
		}
		
		
			
			
			
		}

	}


