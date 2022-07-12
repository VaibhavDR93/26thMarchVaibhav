package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalScrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html"); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		JavascriptExecutor e = (JavascriptExecutor) driver;
		e.executeScript("window.scrollBy(90,800)");


	}

}
