package policyBazarApp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TermInsurance {
	
	private WebDriver driver;
	private Actions act;
	private Select select;
	
	@FindBy (xpath="//i [@class='icon-bg homeIconsBg term-life']")
	private WebElement termInsurance;
	

	public TermInsurance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions (driver);
	}
	
	public void termInsurance1()
	{
		termInsurance.click();
	}
	
	
		
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


