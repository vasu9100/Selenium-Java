import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebtableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> li = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> ol = li.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sl = ol.stream().sorted().collect(Collectors.toList());
		Assert.assertEquals(ol, sl);
		System.out.println("####");
		List<String> price;
		do {
			List<WebElement> lee = driver.findElements(By.xpath("//tr/td[1]"));
			price = lee.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();

			}
		} while (price.size() < 1);

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String pricee = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricee;
	}

}
