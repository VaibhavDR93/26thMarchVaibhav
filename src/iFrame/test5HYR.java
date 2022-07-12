package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test5HYR {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("hello");
		Thread.sleep(3000);
		//switch main webpage to frame1
		driver.switchTo().frame("frm1");
		WebElement dropdown = driver.findElement(By.id("course"));
		Select course=new Select(dropdown);
		course.selectByValue("java");
		//switch frame1 to main webpage 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys(" this is main page");
		//switch main webpage to frame1
		driver.switchTo().frame("frm1");
		WebElement mulSelected = driver.findElement(By.id("ide"));
		Select ide=new Select(mulSelected);
		ide.isMultiple();
		ide.selectByIndex(0);
		ide.selectByIndex(3);
		//switch frame1 to frame2 thats we need to first switch focus on main page and then switch to frame2
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Vaibhav");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Shinde");
	    driver.findElement(By.id("englishchbx")).click();
	  //switch frame2 to Nasted frame3 thats we need to first switch focus on main page and then switch to nasted frame3
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frm3");
	    driver.findElement(By.id("name")).sendKeys("Good night");
	    //nasted parentframe3 switch to  its child frame1
	    driver.switchTo().frame("frm1");
	    Select course1=new Select(driver.findElement(By.id("course")));
	    course1.selectByValue("python");
	    //child frame1 switch to child frame2 first we need to switch focus to its parentFrame3 then switch to its child frame2
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame("frm2");
	    driver.findElement(By.id("firstName")).sendKeys("Viraj");
	    Thread.sleep(3000);
	    driver.findElement(By.id("lastName")).sendKeys("Shinde");
	    //child frame3 switch to main webpage
	    driver.switchTo().defaultContent();
	    WebElement text = driver.findElement(By.xpath("(//h1[@itemprop='name'])[1]"));
	    System.out.println(text.getText());
		
		
		
		

	}

}
