package inheritance2;

public class HourlyEmployee extends Employee {

	double hours;
	double wage;

	public HourlyEmployee() {

		firstName = "";
		lastName = "";
		hours = 0.0;
		wage = 0.0;
	}

	public HourlyEmployee(String fName, String lName, double hrs, double sal) {

		firstName = fName;
		lastName = lName;
		hours = hrs;
		wage = sal;
	}

	public void showSal() {
		System.out.println("salary : " + hours * wage);
	}
}
