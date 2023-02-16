package policyBazarApp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Viewproceed {
	
	
	private WebDriver driver;
	private Actions act;
	@FindBy (xpath="(//i[@class='radio'])[2]")
	private WebElement female;
	
	@FindBy (xpath="//input[@placeholder='Enter Your Name']")
	private WebElement name;
	
	@FindBy (xpath="//input[@id='dob']")
	private WebElement dateofbirth;
	
	@FindBy (xpath="//input[@id='mobileNo']")
	private WebElement mobileno;
	
	
	@FindBy (xpath="//span[@class='proceed']")
	private WebElement view1;
	
	
	
	public  Viewproceed(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions (driver);
	}
	
	
	public void Gender1()
	{
		female.click();
	}
	public void name1()
	{
		name.click();
		name.sendKeys("Megha");
	}
	
	public void dateofbirth1()
	{
		dateofbirth.click();
		dateofbirth.sendKeys("6/3/1997");
	}
	public void mNumber()
	{
		mobileno.click();
		mobileno.sendKeys("7276844423");
	}
	
	public void view2()
	{
		view1.click();
	}


}
