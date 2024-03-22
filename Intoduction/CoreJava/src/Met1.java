import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Met1 {
	@Test
	public void data()
	{
		System.out.println("This is in super class");
	}
	@BeforeMethod
    public void before()
    {
		System.out.println("This is  before method in super class");
    }
	
	@AfterMethod
    public void after()
    {
		System.out.println("This is  After method in super class");
    }
}
