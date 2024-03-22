package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void carloan()
	{
		System.out.println("helloo....this is my car1...");
		}
	@Test(enabled=false)
	public void data()
	{
		System.out.println("helloo....this is my firstday of Testng FM...");
		}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite in day 4 ");
		}

}
