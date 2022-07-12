package waitSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//explicit wait--->used for single element
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		wait.until(ExpectedConditions.visibilityOf(aboutUs));
		
		aboutUs.click();
		
		
		
		
		
	}

}
