package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotAvoidFileOverwrite {

	public static void main(String[] args) throws IOException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//screen shot
		//1.cast driver object to TakeScreenShot interface then we need to call function getscreenshotAs(pass argument);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2.for avoiding overwrite file we using randomString class of string object
		String str = RandomString.make(4);
		
		//.set file saving location
		File destination=new File("E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\screenShots\\myScreenShot"+str+".png");
		
		//3.copy file from source to destination by using copyFile() whuch is present in fileHandler class
		FileHandler.copy(source, destination);

	}

}
