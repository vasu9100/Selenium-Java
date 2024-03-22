package seleniumfwpractise.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumfwpractise.AbstractComponents.AbstractComponent;

public class ProductCatalogue extends AbstractComponent {
	
	WebDriver driver;
	public ProductCatalogue(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
	
	//List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
	
	@FindBy(css=".card-body")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productsBy = By.cssSelector(".card-body");
	By productBy = By.cssSelector(".card-body b");
	By cartBtn =By.cssSelector(".w-10");
	By toast = By.cssSelector("#toast-container");
	//.card .w-10
	
	public List<WebElement> getProducts()
	{
		waitForElementToAppear(productsBy);
		return products;
	}
	
	public WebElement getDesiredProduct(String productName)
	{
		
		for(WebElement product:products)
		{
			if(product.findElement(productBy).getText().equals(productName))
			{
			
				return product;
			}		
	       }
		//throw new NoSuchElementException("Desired product not found: " + productName);
		return null;
		}
	
	
	public void clickOnDesiredprodCartBtn(String productName)
	{
		WebElement dp = getDesiredProduct(productName);
		dp.findElement(cartBtn).click();
		waitForElementToAppear(toast);
		waitForElementToDisappear(spinner);
	}
	
	}
