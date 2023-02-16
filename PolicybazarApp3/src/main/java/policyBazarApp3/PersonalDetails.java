package policyBazarApp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetails {
	private WebDriver driver;
	private Actions act;
	private Select select;

	
	
	
	
	@FindBy (xpath="//select[@id='Self']")
	private WebElement selfAge;
	
	@FindBy (xpath="//select[@id='Mother']")
	private WebElement motherAge;
	
	@FindBy (xpath="//input[@id='submitButton']")
	private WebElement continu2;
	
	public PersonalDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions (driver);
	}
	
	public void selfAge1()
	{
		selfAge.click();
		select=new Select(selfAge);
		select.selectByValue("32");
	}
	public void motherAge1()
	{
		motherAge.click();
		select=new Select(motherAge);
		select.selectByValue("52");
	}
	public void cont()
	{
		continu2.click();
	}
		
}

