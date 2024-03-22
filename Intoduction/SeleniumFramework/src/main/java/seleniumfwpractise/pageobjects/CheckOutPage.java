package seleniumfwpractise.pageobjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumfwpractise.AbstractComponents.AbstractComponent;

public class CheckOutPage extends AbstractComponent{
	WebDriver driver;
	public CheckOutPage(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
    @FindBy(css = "input[placeholder='Select Country']")
    WebElement countryTxtBox;
    
    @FindBy(css = ".form-group button:nth-child(3)")
    WebElement desCountry;
    
    @FindBy(css = ".action__submit")
    WebElement placeOrder;
    
   /* 
						
	driver.findElement(By.cssSelector(".form-group button:nth-child(3)")).click();
	driver.findElement(By.cssSelector(".action__submit")).click();*/
	
    public void selectCountry(String countryName)
    {
    	Actions a = new Actions(driver);
    	a.sendKeys(countryTxtBox, countryName).build().perform();
    	desCountry.click();
    	
    	 }
    public ThankyouPage OrderBtn()
    {
    	placeOrder.click();
    	ThankyouPage typ = new ThankyouPage(driver);
    	return typ;
   
    	
    }
}
