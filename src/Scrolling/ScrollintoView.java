package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollintoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html"); 
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));//explicit wait
		
		JavascriptExecutor e = (JavascriptExecutor)driver;//scrolling
		
		
		WebElement radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement dropDown = driver.findElement(By.xpath("//input[@list='mah-district']"));
		WebElement text = driver.findElement(By.xpath("//h3[text()='Latest News']"));
		
		
		e.executeScript("arguments[0].scrollIntoView(true)",radioButton);
		wait.until(ExpectedConditions.visibilityOf(radioButton));
		radioButton.click();
		
		e.executeScript("arguments[0].scrollIntoView(true)",dropDown);
		wait.until(ExpectedConditions.visibilityOf(dropDown));
		Actions act=new Actions(driver);
		act.click(dropDown).perform();
		for(int i=1;i<=1;i++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			//Thread.sleep(200);
		}
		act.sendKeys(Keys.ENTER).perform();
		
		
		e.executeScript("arguments[0].scrollIntoView(true)",text);
		wait.until(ExpectedConditions.visibilityOf(text));
		System.out.println(text.getText());

	}

}
