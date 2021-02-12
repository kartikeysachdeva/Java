package inheritance2;

public class EmpTest {
	public static void main(String[] args){
		Employee e1 = new Employee("samya","Atul");
		RegularEmployee r1 = new RegularEmployee("Arvind","Behra",10000.00);
		HourlyEmployee h1=new HourlyEmployee("Shivika","Ragav",100,500);
		
		System.out.println("\nEmployee e1");
		e1.showName();

		System.out.println("\nRegular Employee r1");

		r1.showName();
		r1.showSal();

		System.out.println("\nHourly Employee h1");

		h1.showName();
		h1.showSal();
		
	}

}
