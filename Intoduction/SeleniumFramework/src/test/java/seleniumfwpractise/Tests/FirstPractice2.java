package seleniumfwpractise.Tests;
import java.io.IOException;
import java.time.Duration;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumfwpractise.TestComponents.BaseTest;
import seleniumfwpractise.pageobjects.CartPage;
import seleniumfwpractise.pageobjects.CheckOutPage;
import seleniumfwpractise.pageobjects.LandingPage;
import seleniumfwpractise.pageobjects.ProductCatalogue;
import seleniumfwpractise.pageobjects.ThankyouPage;
public class FirstPractice2 extends BaseTest{

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		@Test
		public void FirstPractise2() throws IOException
		{
		String productName = "ZARA COAT 3";
		String countryName = "india";
		//System.setProperty("webdriver.chrome.driver","C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//LandingPage lp = new LandingPage(driver);
		//lp.goTo();
		//LandingPage lp = launchApp();
		ProductCatalogue pc  = lp.loginApp("swa@gmail.com", "Swahyd@2024");
		List<WebElement> allProducts = pc.getProducts();
		pc.clickOnDesiredprodCartBtn(productName);
		CartPage cp = pc.gotoCart();
		//CartPage cp =new CartPage(driver);
	    Boolean res=cp.VerifyProdDisplay(productName);
	    Assert.assertTrue(res);
	    CheckOutPage cop =  cp.checkOut();
	    cop.selectCountry(countryName);
	    ThankyouPage typ = cop.OrderBtn();
	    String TqMsg = typ.verifyTqMsg();
	    Assert.assertTrue(TqMsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		//driver.close();
	}
}
		
		
		/*for(WebElement product:products)
		{
			if(product.findElement(By.cssSelector("b")).getText().equals(productName))
			{
				System.out.println(product.findElement(By.cssSelector("b")).getText());
				product.findElement(By.cssSelector(".w-10")).click();
				System.out.println("OK.....");
			}
		}*/
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		//driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		//Thread.sleep(2000);
		/*List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cart li"));
		for(WebElement cartProduct:cartProducts)
		{
			if(cartProduct.findElement(By.cssSelector(".cart h3")).getText().equals(productName))
				
			{
				System.out.println("Selected Product is in the Cart");
				Assert.assertTrue(true);
			}
		}
		driver.findElement(By.cssSelector(".totalRow .btn-primary")).click();
	  Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), countryName).build().perform();					
		driver.findElement(By.cssSelector(".form-group button:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".action__submit")).click(); */
	     //String TqMsg = driver.findElement(By.cssSelector(".hero-primary")).getText();
		
	    
		
