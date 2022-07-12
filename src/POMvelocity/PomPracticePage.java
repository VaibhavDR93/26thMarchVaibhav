package POMvelocity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPracticePage 
{

	//1.data members
	
	@FindBy(xpath = "(//input[@type='radio'])[3]")private WebElement radioButton;
	@FindBy(xpath = "//input[@list='mah-district']")private WebElement dropDown;
	@FindBy(xpath = "//h3[text()='Latest News']")private WebElement  latestNews;
	@FindBy(xpath = "//h1//strong[text()='Chinchwad Branch']")private WebElement katrajBranch;
	
	//2.constructor
	public PomPracticePage(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void clickRadioButton() 
	{
		radioButton.click();
	}
	public void handlingDropdown() 
	{
		dropDown.click();
	}
	public void textLatestNews()
	{
		String text = latestNews.getText();
		System.out.println(text);
	}
	public void textKatarjBranch()
	{
		String textkatarj = katrajBranch.getText();
		System.out.println(textkatarj);
		
	}

}
