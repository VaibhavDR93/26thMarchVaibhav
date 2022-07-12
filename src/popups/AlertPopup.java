package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	//Procedure to handle Alert popup
	//1.	To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		//	Alert alt = driver.switchTo().alert();
	//2.	Alert is an interface which contains abstract methods like:
		//	1. accept(): use to click on ok button.
		//	2. dismiss(): use to click on cancel button.
		//	3. getText(): use to get text present in a alert popup.


	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		//To handle alert popup we need to switch selenium focus from main page to alert popup
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(7000);
		Alert alt2=driver.switchTo().alert();
		alt2.dismiss();
	
	
		
		

	}

}
