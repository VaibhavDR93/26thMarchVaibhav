package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2ChildBPopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String mainpageid = driver.getWindowHandle();
		System.out.println(mainpageid);
		
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String mainpageID = it.next();
		System.out.println(mainpageID);
		String tabid = it.next();
		System.out.println(tabid);
		//focus switch from main page to tab
		driver.switchTo().window(tabid);
		System.out.println(driver.getTitle());
		//driver.close();
		//focus switch from tab to mainpage
		driver.switchTo().window(mainpageid);
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allids = driver.getWindowHandles();
		Iterator<String> it1 = allids.iterator();
		String mainpageid1 = it1.next();
		System.out.println(mainpageid1);
		String tab1 = it1.next();
		System.out.println(tab1);
		String childwindowid = it1.next();
		System.out.println(childwindowid);
		//focus switch from mainpage to childbrowserPopup
		driver.switchTo().window(childwindowid);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("hello");
		//focus switch from childbrowserPopup to mainpage
		driver.switchTo().window(mainpageID);
		WebElement text = driver.findElement(By.xpath("//p[text()='Click below to download a file']"));
		System.out.println(text.getText());
		
		
		
		
		

	}

}
