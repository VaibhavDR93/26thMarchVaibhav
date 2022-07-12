package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayMethod {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		WebElement textbox = driver.findElement(By.name("show-hide"));
		
		if (textbox.isDisplayed())
		{
			System.out.println("thank you textbox is displayed");
		}
		else 
		{
			System.out.println("cant find textbox");
		}
		
		hide.click();
		if (textbox.isDisplayed())
		{
			System.out.println("thank you textbox is displayed");
		}
		else 
		{
			System.out.println("cant find textbox");
		}
		show.click();
		Thread.sleep(2000);
		
		if (textbox.isDisplayed()) 
		{
			textbox.sendKeys("good luck");
		}
		else
		{
			System.out.println("textbox is not displayed");
		}
		

	}

}
