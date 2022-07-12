package ListBoxSelect;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.id("input-country"));
		Select c=new Select(country);
		Thread.sleep(5000);
		System.out.println(c.isMultiple());
		//c.selectByValue("99");
		
		
		//selecting option from dropdown without using select class methods
		List<WebElement> allopetions = c.getOptions();
		System.out.println(allopetions.size());
		Thread.sleep(10000);
		
		for(WebElement i:allopetions) 
		{
			if(i.getText().equals("Italy")) 
			{
				i.click();
				
				
			}
			else {
				System.out.println(i.getText());
				
			}
			
			
		}
		

	}

}
