package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//screen shot
		//1.cast driver object to TakeScreenShot interface then we need to call function getscreenshotAs(pass argument);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//.set file saving location
		File destination=new File("E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\screenShots\\myScreenShot.png");
		
		//3.copy file from source to destination by using copyFile() whuch is present in fileHandler class
		FileHandler.copy(source, destination);
		

	}

}
