package homeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxVCT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement listboxselet = driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(listboxselet);
		System.out.println(s.isMultiple());
		s.selectByIndex(2);
		s.selectByValue("option1");
		System.out.println(listboxselet.isSelected());
		
		List<WebElement> allopetions = s.getOptions();
		System.out.println(allopetions.size());
		
		for(WebElement a:allopetions)
		{
			System.out.println(a.getText());
			if(a.getText().equals("Option3"));
			a.click();
		}
		
		List<WebElement> allop = driver.findElements(By.xpath("//select[contains(@id,'dropdown')]//option"));
		for(WebElement i:allop) 
		{
			System.out.println(i.getText());
			if(i.getText().equals("Select"));
			i.click();
		}
		
		

	}

}
