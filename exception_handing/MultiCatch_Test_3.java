package exception_handing;

import java.util.Scanner;

public class MultiCatch_Test_3 {

	public static void main(String[] args) {
		int a,b,ans=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		try
		{
			a=s.nextInt(); // 10.5
			b=s.nextInt(); //12.5
			ans=a/b;
			System.out.println("Result: "+ans);
		}
		catch(ArithmeticException e)
		{
		System.out.println("Denominator not be zero");
		}	
		catch(Exception e)
		{
		System.out.println("Enter valid number");
		}	
		}
		}

