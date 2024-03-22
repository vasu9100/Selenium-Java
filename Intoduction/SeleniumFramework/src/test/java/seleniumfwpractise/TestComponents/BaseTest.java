package seleniumfwpractise.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import seleniumfwpractise.pageobjects.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage lp;
	
	// C:\Users\srigo\eclipse-workspace\Intoduction\SeleniumFramework\src\main\java\seleniumfwpractise\resources\GlobalData.properties
	// System.getProperty("user.dir")
	
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\seleniumfwpractise\\resources\\GlobalData.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			//
		} else if (browsername.equalsIgnoreCase("edge")) {
			//
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	@BeforeMethod
	public LandingPage launchApp() throws IOException
	{
		driver=initializeDriver();
		lp = new LandingPage(driver);
		lp.goTo();
		return lp;
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
