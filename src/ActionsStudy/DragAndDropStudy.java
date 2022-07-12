package ActionsStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		//WebElement source1 = driver.findElement(By.xpath("(//li//img)[1]"));
		//WebElement source2 = driver.findElement(By.xpath("(//li//img)[2]"));
		
		WebElement target = driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		//act.dragAndDrop(source1, target).perform();
		Thread.sleep(2000);
		//act.dragAndDrop(source2, target).perform();
		
		
		List<WebElement> allImg = driver.findElements(By.xpath("//ul//li//img"));
		for(WebElement a:allImg) 
		{
			act.dragAndDrop(a, target).perform();
			Thread.sleep(2000);
		}

	}

}
