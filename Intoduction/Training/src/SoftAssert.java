import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftAssert {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//SoftAssert sf = new SoftAssert();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
			String url = links.get(i).getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int res= conn.getResponseCode();
			System.out.println(res);
			if(res>400)
			{
				continue;
			}
			 
		}
	}

}
