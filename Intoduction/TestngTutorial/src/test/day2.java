package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {
  
	//@Parameters({"URL"})
	@Test(dataProvider="getData")
	public void dummy(String un, String pwd)
	{
		System.out.println("helloo.... day 2!!!");
		System.out.println("User name is "+un+"Password is "+pwd);
		}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest");
		}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "First Uname"; //set 1 
		data[0][1] = "First Pwd";
		
		data[1][0]= "Sec Uname";
		data[1][1]="Sec Pwd"; //set2
		
		data[2][0]="Third Uname";
		data[2][1]="Third Pwd"; //set 3
		
		return data;
		
	}
}
