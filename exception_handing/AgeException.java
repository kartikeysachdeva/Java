package exception_handing;

public class AgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;

	AgeException(int age) {
		this.age = age;

	}

	public String toString() {
		return " Please Enter a valid age" + age;
	}
}
