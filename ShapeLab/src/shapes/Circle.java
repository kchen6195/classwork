package shapes;


/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private double radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return(radius*radius*pi);
	}

	@Override
	public double calculatePerimeter() {
		return(radius*2*pi);
	}

	@Override
	public String toString() {
		return "Circle radius: "+ radius + "\t Area: "
				+ this.calculateArea() + "\t Perimeter: "+
				this.calculatePerimeter();
	}
}
