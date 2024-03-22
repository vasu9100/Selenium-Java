package seleniumfwpractise.Tests;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class FirstPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String productName = "ZARA COAT 3";
		System.setProperty("webdriver.chrome.driver","C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("swa@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Swahyd@2024");
		driver.findElement(By.id("login")).click();
		//LandingPage lp = new landingPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-body")));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
		for(WebElement product:products)
		{
			if(product.findElement(By.cssSelector("b")).getText().equals(productName))
			{
				System.out.println(driver.findElement(By.cssSelector(".card")));
				//System.out.println(product.findElement(By.cssSelector("b")).getText());
				//product.findElement(By.cssSelector(".w-10")).click();
				System.out.println("OK.....");
			}
		}
		
	/*	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		
		
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		//Thread.sleep(2000);
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cart li"));
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
		a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "india").build().perform();					
		driver.findElement(By.cssSelector(".form-group button:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
		String confirmedMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmedMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close(); */
		
	}
}
