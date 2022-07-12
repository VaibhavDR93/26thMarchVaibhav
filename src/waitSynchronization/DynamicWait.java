package waitSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		//implicitWait();
		explicitWait();

	}
	public static void implicitWait()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.close();
	}
	public static void explicitWait()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		wait.until(ExpectedConditions.visibilityOf(aboutUs));
		
		aboutUs.click();
		
	}

}
