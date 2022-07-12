package ListBoxSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement multiselected = driver.findElement(By.id("cars"));
		Select s=new Select(multiselected);
		System.out.println(s.isMultiple());
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("saab");
		Thread.sleep(1000);
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		s.selectByIndex(3);
		Thread.sleep(1000);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		//s.deselectAll()
		
		s.deselectByIndex(3);
		Thread.sleep(1000);
		s.deselectByValue("opel");
		Thread.sleep(2000);
		s.deselectByVisibleText("Saab");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		
		//process for getAllOpetions
		Select AllSelected=new Select(driver.findElement(By.id("cars"))) ;
		List<WebElement> option = AllSelected.getOptions();
		System.out.println(option.size());
		Thread.sleep(2000);
		
		
		for(WebElement i:option) 
		{
			System.out.println(i.getText());
		}
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.navigate().back();
		
		

	}

}
