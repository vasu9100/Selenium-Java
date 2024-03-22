package seleniumfwpractise.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import seleniumfwpractise.AbstractComponents.AbstractComponent;
   
public class ThankyouPage  extends AbstractComponent {

	WebDriver driver;
	public ThankyouPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(css = ".hero-primary")
	WebElement msg;
	
    public String verifyTqMsg()
    {
    	 return msg.getText();
    }
}
