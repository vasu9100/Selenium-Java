package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"URL"})
	@Test
	public void homeloandummy(String uname)
	{
		System.out.println("helloo..day3....."+uname);
		}
	@Test(groups= {"swar"})
	public void homeloannn()
	{
		System.out.println("helloo....this is my home three..");
		}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite in day 3");
		}
	
}
