package exception_handing;

public class UserDefinedException extends Exception {

		private static final long serialVersionUID = 1L;
		
		String msg;
		
		/**
		 * Provide one parameter constructor and override toString() method
		 */
		
		
		// parameterised constrcutor to read the custom message
		
		UserDefinedException(String msg)
		{
			this.msg=msg;
		}

		//to display the message
		
		public String toString()
		{
			return this.msg;
		}
		
		
}
