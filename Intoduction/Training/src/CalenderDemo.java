import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String mm = "9";
   String dd = "2";
   String yy = "2022";
   String[] cal = {mm,dd,yy};
   System.setProperty("webdriver.chrome.driver",
			"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.cssSelector(".react-date-picker")).click();
	
	driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
	driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
	
	driver.findElement(By.xpath("//button[text()='"+yy+"']")).click();
	driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(mm)-1).click();
	driver.findElement(By.xpath("//abbr[text()='"+dd+"']")).click();
	//react-date-picker__inputGroup__input 
	List<WebElement> actual = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
	for(int i=0;i<actual.size();i++)
{
	System.out.println(actual.get(i).getAttribute("value"));
	Assert.assertEquals(actual.get(i).getAttribute("value"), cal[i]);
}
	
	}

}
