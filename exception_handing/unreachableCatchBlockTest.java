package exception_handing;

public class unreachableCatchBlockTest {

	public static void main(String[] args) {
		 try
	        {
	            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
	        }
	  
		 
		 //order is changed 
		 //correct order is subclass and then super class
	        catch(Exception ex)
	        {
	            System.out.println("This block handles all exception types");
	        }
	  
	        catch(NumberFormatException ex)
	        {
	            //Compile time error
	            //This block becomes unreachable as
	            //exception is already caught by above catch block
	        }

	}

}
