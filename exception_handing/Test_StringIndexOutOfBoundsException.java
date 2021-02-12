package exception_handing;

public class Test_StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		String s="Hello"; 
		s.charAt(3);
		System.out.println(s.charAt(4));
		s.charAt(10); // Exception raised

	}

}
