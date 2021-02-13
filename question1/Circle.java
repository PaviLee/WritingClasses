package question1;

public class Circle {

	private static final double DEFAULT_RADIUS = 1;
	private double radius;

	public Circle() {
		this(DEFAULT_RADIUS);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double circumference() {
		return 2 * Math.PI * radius;
	}

	public double diameter() {
		return 2 * radius;
	}

	public String toString() {
		return "Circle with radius " + radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

}
