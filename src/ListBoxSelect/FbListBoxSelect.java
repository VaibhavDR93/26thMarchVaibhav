package ListBoxSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbListBoxSelect {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		
		//Select day
		WebElement day = driver.findElement(By.id("day"));
		Select s1=new Select(day);
		//s1.selectByIndex(7);
		//s1.selectByVisibleText("8");
		s1.selectByValue("8");
		Thread.sleep(5000);
		
		//Select month
		WebElement month = driver.findElement(By.id("month"));
		Select s2=new Select(month);
		//s2.selectByIndex(9);
		//s2.selectByVisibleText("Oct");
		s2.selectByValue("10");
		Thread.sleep(5000);
		
		//Select year
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1996");
		
	}

}
