package question2;

public class Box {

	private double width, height, depth;

	public Box() {
		this(1, 1, 1);
	}

	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public Box(double side) {
		this(side, side, side);
	}

	public double volume() {
		return height * width * depth;
	}

	public double surfaceArea() {
		return height * width * 2 + height * depth * 2 + width * depth * 2;
	}

	public String toString() {
		return "Box with dimensions " + width + " x " + height + " x " + depth;
	}

	public double diagonalLength() {
		return Math.sqrt(height * height + width * width + depth * depth);
	}

	// Getters and Setters

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

}
