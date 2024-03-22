package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {
    
	@Test(groups= {"swar"})
	public void data()
	{
		System.out.println("helloo....this is my firstday of Testng FM...");
		}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
		}
	@BeforeMethod
	public void beforeMethos()
	{
		System.out.println("BeforeMethod in day ");
		}
	
	
}
