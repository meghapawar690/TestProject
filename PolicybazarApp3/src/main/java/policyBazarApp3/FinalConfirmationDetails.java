package policyBazarApp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FinalConfirmationDetails {
	private WebDriver driver;
	private Actions act1;
	private Select select;
	
	
	
	@FindBy (xpath="//em[text()='Female']")
	private WebElement femaleoption;
	
	@FindBy (xpath="//input[@id='fullname']")
	private WebElement fullname;
	
	@FindBy (xpath="//input[@id='pmobile']")
	private WebElement mobileno2;
	
	@FindBy (xpath="//span[text()='Continue']")
	private WebElement countinu3;
	

	public FinalConfirmationDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act1=new Actions (driver);
	}
   
	
	public void Gender()
	{
		femaleoption.click();
	}
	
	public void FullName1()
	{
		fullname.click();
		fullname.sendKeys("Megha Pawar");
	}
	
	public void Mnumber()
	{
		 act1.moveToElement(mobileno2).click().build().perform();
		 act1.sendKeys("7276844423").build().perform();
    }
	
	public void contin3()
	{
		countinu3.click();
	}
}
