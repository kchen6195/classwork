package shapes;



/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		return(length * width);
	}


	public double calculatePerimeter() {
		return(length*2 + width*2);
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
