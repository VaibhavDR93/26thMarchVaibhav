package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 String text = driver.findElement(By.partialLinkText("Pavili")).getText();
		 System.out.println(text);
		 
		 driver.switchTo().frame(0);
		 String text1 = driver.findElement(By.id("frametext")).getText();
		 System.out.println(text1);
		 
		 driver.switchTo().parentFrame();
		 String text2 = driver.findElement(By.linkText("Blogger")).getText();
		 System.out.println(text2);
		
		 driver.switchTo().frame("Frame2");
		 String text3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		 System.out.println(text3);
		 
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame(0);
		 String text4 = driver.findElement(By.linkText("Category1")).getText();
		 System.out.println(text4);
		 
		// driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.name("home")).click();

		 
		 
		 

	}

}
