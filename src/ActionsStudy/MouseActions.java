package ActionsStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.linkText("Selenium"));
		//mouse actions perform by using actions class and pass the driver object
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
		act.click(element).perform();
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightclick).perform();//contextClick used for rightclick
		Thread.sleep(1000);
		WebElement dropdown = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']"));
		act.sendKeys(dropdown, Keys.ARROW_DOWN).build().perform();
		//for(int a=0; a<=6;a++) 
		//{
			//act.sendKeys(Keys.ARROW_DOWN);
			//Thread.sleep(500);
		//}
		//act.sendKeys(Keys.ENTER);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();
		
		WebElement Dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Dclick).perform();
		Thread.sleep(1000);
		alt.accept();
		
		act.click(element).perform();
		Thread.sleep(2000);
		
		for(int i=1;i<=19;i++) 
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0\"]")));
		
		WebElement hpopup = driver.findElement(By.xpath("//div[@id='dismiss-button']"));
		Thread.sleep(3000);
		act.click(hpopup).perform();
		
		//WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		//WebElement dist = driver.findElement(By.id("amt8"));
		//act.dragAndDrop(source, dist).perform();
		
		

	}

}
