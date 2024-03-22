import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement country : countries)
		{
			if(country.getText().equalsIgnoreCase("india"))
			{
				country.click();
			break;
			}
		}
		
		//checkboxes
		//System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).isSelected());
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("size: "+cb.size());
	}

}