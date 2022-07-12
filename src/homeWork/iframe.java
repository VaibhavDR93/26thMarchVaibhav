package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\1.SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		String text = driver.findElement(By.xpath("//div[@class='popup']")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.switchTo().frame("courses-iframe");
		String text2 = driver.findElement(By.linkText("About us")).getText();
		System.out.println(text2);

	}

}
