package POMvelocity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html"); 
		
		PomPracticePage ppp=new PomPracticePage(driver);
		ppp.clickRadioButton();
		
		ppp.handlingDropdown();
		
		ppp.textLatestNews();
		
		Thread.sleep(5000);
		driver.switchTo().frame("courses-iframe");
		ppp.textKatarjBranch();

	}

}
