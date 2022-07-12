package WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iplPointTable {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2022");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//no of rows
		int rows = driver.findElements(By.xpath("//tbody[@id='pointsdata']//tr")).size();
		System.out.println(rows);
		//no of column
		int headers = driver.findElements(By.xpath("//tbody//tr[@class='ih-pt-tbl']/th")).size();
		System.out.println(headers);
		//no of textdata
		int columns = driver.findElements(By.xpath("//tr[@class='team0 ng-scope'][1]//td")).size();
		System.out.println(columns);
		
		for(int i=1;i<=rows;i++) 
		{
			for(int j=1;j<=columns;j++) 
			{
				String text = driver.findElement(By.xpath("//tbody[@id='pointsdata']//tr["+i+"]//td["+j+"]")).getText();
				Thread.sleep(100);
				System.out.print(text+" ");
				Thread.sleep(100);
				
			}
			System.out.println();
		}
		
		

	}

}
