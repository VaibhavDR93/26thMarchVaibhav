package waitSynchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//static wait
		//Thread.sleep(5000);
		
		//Dynamic wait-->1.Implicit wait-->used for complete webpage
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.close();

	}

}
