package exception_handing;

public class Test_NumberFormatException {

	public static void main(String[] args) {
		
		
		
		//This exception will be raised whenever you trying 
		//to store any input value in the un-authorized datatype.
		
		String s="hello";  
		int i=Integer.parseInt(s);//NumberFormatException  
	}

}
