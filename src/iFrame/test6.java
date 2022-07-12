package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test6 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Frames')]"));
		System.out.println(text.getText());
		//selenium focus switch from man page to frame
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.tagName("input"));
		search.click();
		search.sendKeys("nasted frame");
		//focus switch from frame to main page
		driver.switchTo().defaultContent();
		WebElement text2 = driver.findElement(By.xpath("//span[contains(text(),'Not a Friendl')]"));
		System.out.println(text2.getText());
		//focus switch from main page to nasted childFrame first we need to switch focus childs parent frame and then childframe
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		//focus switch from nasted child frame to its imidiate parent frame
		driver.switchTo().parentFrame();
		search.click();
		search.sendKeys(" practice");
		//focus switch from parent frame to another frame first we need to switch focus on main page and then another frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		Select animal=new Select(driver.findElement(By.id("animals")));
		animal.selectByIndex(1);
		
		
		

	}

}
