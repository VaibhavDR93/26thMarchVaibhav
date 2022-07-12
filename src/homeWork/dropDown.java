package homeWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement dropdown = driver.findElement(By.xpath("//input[@list='mah-district']"));
		wait.until(ExpectedConditions.visibilityOf(dropdown));
		
		//dropdown.click();
		Thread.sleep(1000);
		
	
		//dropdown.sendKeys("pune");
		Actions act=new Actions(driver);
		act.sendKeys(dropdown,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
		}
		act.sendKeys(Keys.ENTER);

	}

}
