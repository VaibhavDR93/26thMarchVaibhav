package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1AlertPopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//simple alert popup
		driver.findElement(By.id("alertBox")).click();
		//To handle alert popup we need to switch selenium focus from main page to alert popup
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		//confirmation alert popup
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(alt.getText());
		alt.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		// display prompt box alert popup
		driver.findElement(By.id("promptBox")).click();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.sendKeys("Vaibhav Shinde");
		Thread.sleep(10000);
		alt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		

	}

}
