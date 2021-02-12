package exception_handing;

public class Exception_Test_2 {

	public static void main(String[] args) {
		int a=10, ans;
		try
		{
		ans=a/0; //monitored by JVM
		}
		
		catch (Exception e) //user friendly messages
		{
		System.out.println("Denominator not be zero");
		
		}	
	}

}
