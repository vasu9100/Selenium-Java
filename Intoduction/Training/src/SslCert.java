import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sets behaviour foe the driver.....
		
		ChromeOptions op = new ChromeOptions(); 
		op.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());		

	}

}