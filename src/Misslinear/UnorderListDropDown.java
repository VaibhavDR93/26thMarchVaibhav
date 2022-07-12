package Misslinear;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderListDropDown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("car");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println(options.size());
		
		for(WebElement a:options) 
		{
			System.out.println(a.getText());
			if(a.getText().equals("cardekho")) 
			{
				a.click();
				break;
				
			}
		}

	}

}
