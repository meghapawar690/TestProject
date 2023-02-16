package policyBazarApp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HealthInsurance {
	
	private WebDriver driver;
	private Actions act;
	private Select select;
	
	@FindBy (xpath="//p[text()='Health']")
	private WebElement health;
	
	@FindBy (xpath="(//i[@class='checkbox'])[6]")
	private WebElement motheroption;
	
	@FindBy (xpath="//input[@id='submitButton']")
	private WebElement continu;
	
	
	
	

	public HealthInsurance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions (driver);
	}
	
    public void health1()
    {
    	health.click();
    }
    public void motheroption1()
    {
    	act=new Actions (driver);
    	act.moveToElement(motheroption).click().build().perform();
      }
	public void continu1()
	{
		continu.click();
	}
	
}
