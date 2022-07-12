package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(15000);
		
		WebElement SignIn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		System.out.println(SignIn.getText());
		SignIn.click();
		Thread.sleep(5000);
		
		
		WebElement GetOTP = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(GetOTP.isEnabled());
		
		driver.findElement(By.id("mobileNumber")).sendKeys("8605154970");
		System.out.println(GetOTP.isEnabled());
		GetOTP.click();
		Thread.sleep(5000);
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		System.out.println(submit.isEnabled());
		
		driver.findElement(By.name("OTP")).sendKeys("778423");
		System.out.println(submit.isEnabled());
		Thread.sleep(2000);
		submit.click();
		
		
		
		
		
		


	}

}
