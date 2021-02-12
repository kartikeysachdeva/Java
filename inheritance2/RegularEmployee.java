package inheritance2;

public class RegularEmployee extends Employee{
	double basic;
	
	public RegularEmployee()
	{
		//Base class can also be initialized
		firstName = "";
		lastName = "";
		basic = 0.0;
	}

	
	public RegularEmployee(String fName,String lName,double sal)
	{
		firstName = fName;
		lastName = lName;
		basic = sal;
	}
	
	public void showSal()
	{
		System.out.println("Basic salary : "+basic);
	}
}
