import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//driver scope is reduced..... to footer
		WebElement mini = driver.findElement(By.id("gf-BIG"));
		System.out.println(mini.findElements(By.tagName("a")).size());
		//limiting driver scope to first column...
		WebElement coldriver = mini.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		for(int i=1;i<coldriver.findElements(By.tagName("a")).size();i++)
		{
			//keyboard action....
			String clickaction = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(clickaction);
			Thread.sleep(5000);
			
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
		  driver.switchTo().window(it.next());
		  System.out.println(driver.getTitle());
			
		}
		}

}
