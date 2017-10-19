package shapes;

public class Triangle implements Shape{

	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}


	public double calculateArea() {
		return(base * height * 1/2);
	}


	public double calculatePerimeter() {
		return(base *3);
	}


	public String toString() {
		return "Triangle height: " + height + " base: " + base + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
