package shapes;

public class Parallelogram {
	private double base;
	private double height;
	private double side;
	public Parallelogram(double base, double height, double side) {
		this.base = base;
		this.height = height;
		this.side = side;
	}


	public double calculateArea() {
		return(base * height );
	}


	public double calculatePerimeter() {
		return(2* (base * side));
	}


	public String toString() {
		return "Parallelogram height: " + height + " base: " + base + " side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
