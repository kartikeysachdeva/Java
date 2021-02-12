package abstractdemo;

public class Circle extends Shape {

	double radius, area;

	@Override
	public double calculateArea() {
		radius = 5.0;
		area = 3.14 * radius * radius;
		System.out.println("Area of a cirlce=" + area);
		return area;
	}

}
