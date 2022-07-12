package Misslinear;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noOflinksonwebpage {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next().getText());
		}
		
		for(WebElement all:links) 
		{
			String a = all.getText();
			if(a.equals("About Us"))
			{
				all.click();
				break;
			}
		}

	}

}
