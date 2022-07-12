package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iplPointTable2 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2022");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//no of rows
		 List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='pointsdata']//tr"));
		System.out.println(rows.size());
		//no of column
		 List<WebElement> Columns = driver.findElements(By.xpath("//table[1]//tr//th"));
		System.out.println(Columns.size());
		
		for(WebElement C:Columns) 
		{
			System.out.print(C.getText()+" ");
		}
		System.out.println();
		for(WebElement R:rows)
		{
			Thread.sleep(2000);
			System.out.print(R.getText()+"  ");
			Thread.sleep(4000);
			
			System.out.println();
			
		}
		System.out.println();
		

	}

}
