package keyboardInput;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Sum of two numbers");
		int number1,number2,sum;
		
		System.out.println("Enter the first integer");
		number1=(int) sc.nextFloat();
		
		
		
		System.out.println("Enter the Second integer");
		number2=sc.nextInt();
		
		sum=number1+number2;
		System.out.println("Sum of two numbers"+sum);
		
		
	}

}
