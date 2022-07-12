package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//total number of rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println(rows.size());
		//total number of columns in table
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr//th"));
		System.out.println(columns.size());
		
		for(WebElement cdata:columns)
		{
			System.out.print(cdata.getText());
		}
		
		for(WebElement Rdata:rows) 
		{
			System.out.print(Rdata.getText());
			System.out.println();
		}

	}

}
