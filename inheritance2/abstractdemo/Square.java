package abstractdemo;

public class Square extends Shape{

	 double side;
	@Override
	
	public double calculateArea() {
		side=10;
		double area=side*side;
		System.out.println("Area of Square="+area);
		return  area;
	}

}
