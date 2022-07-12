package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String t = driver.findElement(By.xpath("//a[@class='mailicon']")).getText();
		System.out.println(t);
		
		//switch the focus by using webElement
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));
		String t1 = driver.findElement(By.id("nseindex")).getText();
		System.out.println(t1);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("srchword")).sendKeys("Laptop table");
		
		String t2 = driver.findElement(By.xpath("//a[contains(@title,'Lightning fast b')]")).getText();
		System.out.println(t2);
		
		
		

	}

}
