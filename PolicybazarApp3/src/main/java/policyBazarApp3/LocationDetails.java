package policyBazarApp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LocationDetails {
	private WebDriver driver;
	
	
	@FindBy (xpath="//span[text()='Pune']")
	private WebElement city;
	

	public LocationDetails (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	public void cityname()
	{
		city.click();
	}
}
