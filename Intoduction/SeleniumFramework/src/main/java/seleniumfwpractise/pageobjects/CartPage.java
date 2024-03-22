package seleniumfwpractise.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

import seleniumfwpractise.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent {
	
	 @FindBy(css = ".cart li")
     List<WebElement> cartPrdts;
	 
	 @FindBy(css = ".totalRow .btn-primary" )
	 WebElement check;
	 
	WebDriver driver;
    
     public CartPage(WebDriver driver)
     {
    	 super(driver);
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
    	 
     }
	
     public Boolean VerifyProdDisplay(String productName)
     {
    	 for(WebElement cartPrdt:cartPrdts)
 		{
 			if(cartPrdt.findElement(By.cssSelector(".cart h3")).getText().equals(productName))
 				
 			{
 				System.out.println("Selected Product is in the Cart");
 				//Assert.assertTrue(true);
 			   return true;
 			}
 		}
    	 return null;
     }
  
     public CheckOutPage checkOut()
     {
    	 check.click();
    	 CheckOutPage cop = new CheckOutPage(driver);
    	 return cop;
    	 
     }
     
}
