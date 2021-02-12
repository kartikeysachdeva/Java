package exception_handing;

public class Finally_Test_4 {

	public static void main(String[] args) {
		
		int a=10, ans=0;
		try
		{
		ans=a/0;
		}
		catch (Exception e)
		{
		System.out.println("Denominator not be zero");
		}	
		finally
		{
		System.out.println("I am from finally block");
		}
		}
		}