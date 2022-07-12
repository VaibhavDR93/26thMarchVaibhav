package homeWork;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//e.executeScript("arguments[0].scrollIntoView(true)",radioButton);
		WebElement opentab = driver.findElement(By.id("opentab"));
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("arguments[0].scrollIntoView(true)", opentab);
		opentab.click();
		opentab.click();
		
		String mainpageid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		for(String A:allids) 
		{
			if(!A.equals(mainpageid))
			driver.switchTo().window(A);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		driver.switchTo().window(mainpageid);
		WebElement welcome = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		e.executeScript("arguments[0].scrollIntoView(true)", welcome);
		System.out.println(welcome.getText());

	}

}
