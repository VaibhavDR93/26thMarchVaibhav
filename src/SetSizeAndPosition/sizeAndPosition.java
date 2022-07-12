package SetSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeAndPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\SW TESTING\\AUTOMATION TESTING\\Selenium\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		//set size
		System.out.println(driver.manage().window().getSize());
		Dimension dim=new Dimension(750, 400);
		driver.manage().window().setSize(dim);;
		
		//set position
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(500, 200);
		driver.manage().window().setPosition(p);

	}

}
