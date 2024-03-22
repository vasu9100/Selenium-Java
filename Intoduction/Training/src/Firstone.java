//import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/srigo/OneDrive/Desktop/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("swarna");
		driver.findElement(By.name("inputPassword")).sendKeys("hello");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String msg = driver.findElement(By.cssSelector(".error")).getText();
		System.out.println(msg);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("swarna");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("swarna");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//String[] s1 = s.split("password").s[0].trim();
		//driver.close();

	}

}
