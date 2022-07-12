package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectMethod {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		checkBox1.click();
		
		if (checkBox1.isSelected()) 
		{
			System.out.println("check box is already selected");
		}
		else 
		{
			//checkBox1.click();
			System.out.println("Check box now selected");
		}
		
		WebElement checkBox3 = driver.findElement(By.id("checkBoxOption3"));
		checkBox3.click();
		checkBox3.click();
		if (checkBox3.isSelected()) 
		{
			if (checkBox1.isSelected())
			{
				System.out.println("both are selected");
			}
			else {
				System.out.println("please select checkbox1");
			}
			
		}
		else 
		{
			
			System.out.println("checkbox3 is unselected");
		}
		

	}

}
