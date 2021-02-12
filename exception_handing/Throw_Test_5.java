package exception_handing;

public class Throw_Test_5 {

	
	//create a new Exception object and throw it
	
	
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} 
		catch(NullPointerException e) 
		{
			System.out.println("Null pointer exception caught : "+e);
		}
	}

}
