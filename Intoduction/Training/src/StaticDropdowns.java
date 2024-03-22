import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement we = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dp = new Select(we);
		dp.selectByIndex(1);
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByVisibleText("USD");
		System.out.println(dp.getFirstSelectedOption().getText());
		dp.selectByValue("AED");
		System.out.println(dp.getFirstSelectedOption().getText());
		
		
	}

}