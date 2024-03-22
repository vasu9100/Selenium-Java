import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greencart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		String[] items = { "Cucumber", "Brocolli", "Beetroot" };
		List<String> newitems = Arrays.asList(items);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,newitems);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//span.promoInfo
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	private static void addItems(WebDriver driver, List<String> newitems) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		int j = 0;
		List<WebElement> pnames = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < pnames.size(); i++) 
		{
			String fullname = pnames.get(i).getText();
			String veg = fullname.split("-")[0].trim();
			System.out.println(veg);
			if (newitems.contains(veg))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(2000);
				System.out.println("This " + veg + " ADD TO CART button is clicked.");
				System.out.println("This " + veg + " is available ");
				j++;
				if (j == newitems.size())
				{
					break;
				}
			}

		}

	}

}


//String veggie = veg[0].trim();
//System.out.println(veggie);

/*
 * String orgname = fullname.split("-")[0].trim();
 * if(newitems.contains(orgname)) { //div[@class='product-action']/button j++;
 * driver.findElements(By.xpath("div[@class='product-action']/button")).get(i).
 * click(); if(j==items.length) { break; }
 * 
 * }
 */
