package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String mainPageID = driver.getWindowHandle();//main page id
		System.out.println(mainPageID);
		System.out.println("====================");
		//open child window popup
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		//to handle multiple windows/to get multiple ids
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		//while(it.hasNext()) 
		//{
		//	System.out.println(it.next());
			
		//}
		
		String mainpageid = it.next();
		String childpageid = it.next();
		
		//to switch focus to child window
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("hello");
		//driver.close();//will close only current focused tab
		//driver.quit();//will close all tabs/pages opened by selenium
		
		driver.switchTo().window(mainpageid);//switch focus from childpage to main page
		WebElement text = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println(text.getText());
		
	 
		
		
		

	}

}
