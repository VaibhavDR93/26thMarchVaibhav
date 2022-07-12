package kiteAppTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitApp {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement passWord = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys("ELR321");
		passWord.sendKeys("Dhana1111");
		LoginButton.click();
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continuebutton.click();
		Thread.sleep(1000);
		
		//Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserID = userName.getText();
		String exceptedUserID = "ELR321";
		if(actualUserID.equals(exceptedUserID))
		{
			System.out.println("UID matching Test case is PASSED");
		}
		else 
		{
			System.out.println("UID not matching Test case is FAILED");
		}
		
		userName.click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		

	}

}
