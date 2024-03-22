import org.testng.annotations.Test;

public class Met4 {

	int a;
	public Met4(int a)
	{
		this.a = a;
	}

	

	@Test
	public int multiplyFour(int a) {
		a = a * 4;
		return a;
	}

}
