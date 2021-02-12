package abstractdemo;

public class rectangle extends Shape {

	double length,breadth;
	
	@Override
	public double calculateArea() {
		length=5;
		breadth=10;
		double area=length*breadth;
		System.out.println("Area of rectangle="+area);
		return area;
	}

}
