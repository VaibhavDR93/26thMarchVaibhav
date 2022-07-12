package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(11000);
		//1
		System.out.println(driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).getText());
		//2
		String text = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).getText();
		System.out.println(text);
		//3
		WebElement SignIn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		System.out.println(SignIn.getText());
		
		SignIn.click();
		Thread.sleep(5000);

	}

}
