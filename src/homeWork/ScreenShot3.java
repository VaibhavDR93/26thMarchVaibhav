package homeWork;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot3 {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make(4);
		File locatin=new File("E:\\\\SW TESTING\\\\AUTOMATION TESTING\\\\Selenium\\\\screenShots\\\\myScreenShot"+str+".png");
		FileHandler.copy(source, locatin);
		
		Thread.sleep(2000);
		driver.navigate().to("https://vctcpune.com/selenium/practice.html");
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str1 = RandomString.make(4);
		File locatin1=new File("E:\\\\SW TESTING\\\\AUTOMATION TESTING\\\\Selenium\\\\screenShots\\\\myScreenShot"+str1+".png");
		FileHandler.copy(source1, locatin1);
		

	}

}
