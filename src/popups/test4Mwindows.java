package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4Mwindows {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String MpID = driver.getWindowHandle();
		System.out.println(MpID);
		driver.findElement(By.linkText("Try it Yourself")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Try it Yourself")).click();
		
		Set<String> allId = driver.getWindowHandles();
		//ArrayList al=new ArrayList(allId);
		
		for ( String all : allId)
		{
			System.out.println(all);
			if(!all.equals(MpID))
			{
				driver.switchTo().window(all);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
				Thread.sleep(5000);
			}
			
			
		}
		driver.switchTo().window(MpID);
		String text = driver.findElement(By.linkText("Try it Yourself")).getText();
		System.out.println(text);

	}

}
