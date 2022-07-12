package SelectClassUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectForDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		//System.out.println(option1.isSelected());\
		
	//	WebElement Checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		 //find the option present in the dropdown menu
		 Select selectelement = new Select (driver.findElement(By.id("dropdown-class-example")));
		 List<WebElement> option = selectelement.getOptions();
		 System.out.println(option.size());
		 Thread.sleep(5000);
		 //print
		 for(WebElement i:option)
		 {
			 System.out.println(i.getText());
		 }
		 Thread.sleep(7000);
		 //selectByindex
		// selectelement.selectByIndex(3);
		//selectByVisibleText
		 selectelement.selectByVisibleText("Option1");
		 
		boolean mul = selectelement.isMultiple();
		System.out.println(mul);
		 

	}

}
