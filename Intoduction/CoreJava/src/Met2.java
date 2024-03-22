import org.testng.annotations.Test;

public class Met2 extends Met1 {
	@Test
	public void data1()
	{ 
		int a =5;
	
		data();
		System.out.println("after data method is called.....");
		Met3 ob = new Met3(a);
		System.out.println("incremented "+ob.increment());
		System.out.println(ob.multiplyFour(a));
	}

}
