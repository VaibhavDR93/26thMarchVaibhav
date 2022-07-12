package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeyMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//Sendkeys():  This method is use to enter value in the input/text field
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hi guys");
		Thread.sleep(5000);
		
		//Clear():This method is use to clear value in the text field.
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(1000);
		
		//Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
		
		driver.findElement(By.xpath("//select[contains(@id,'dropdown')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='option2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='option3']")).click();
		
		// getText:  This method is use to get text present in a webpage. Return type of getText function is String.
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText());
		
		//isEnabled(): This method is use to verify element is enebled or disabled.return type is boolean
		System.out.println(driver.findElement(By.xpath("//input[@value='option3']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@value='option2']")).isDisplayed());
		
		//. isSelected(): This method is use to verify radio button/checkbox is selected or not.return type is boolean
		System.out.println(driver.findElement(By.xpath("//input[@value='option3']")).isSelected());
		
		
	}

}
