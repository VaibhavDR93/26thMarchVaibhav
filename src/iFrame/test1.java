package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//Displaying a webpage as a part a another webpage is known as iframe. 
//1.	Iframe will be created by using tagname iframe.
//2.	Procedure to handle iframe1 To handle iframe we need to switch selenium focus from main page to frame by using 

		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.xpath("(//pre[@class=' CodeMirror-line '])[15]"));
		a.click();
		Thread.sleep(10000);
		a.sendKeys("hi guys work hard");

	}

}
