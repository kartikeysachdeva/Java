package exception_handing;

public class TestAgeException {

	public static void main(String[] args) {
		int age=-1;
				
		
		if(age<0)
		{ 
			try {
				throw new AgeException(age);
								
			} catch (AgeException e) {
				
				e.printStackTrace();
			}
			
		}
		
		else
		{
			System.out.println("Your age is"+age);
		}
		
		

	}

}
