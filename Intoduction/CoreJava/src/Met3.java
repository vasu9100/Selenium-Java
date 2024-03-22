import org.testng.annotations.Test;

public class Met3 extends Met4{
	
	int a;
	
	public Met3(int a) {
		// TODO Auto-generated constructor stub
		super(a);
		this.a=a;
		
	}
    @Test
	public int increment()
	{
		a=a+1;
		return a;
		//681607
		//java-/string/exc/static keyword/coll/oops
		//architecture/stale element exc/xpath/
	}

}
