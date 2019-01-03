package co.in.Inheritance;

public class Circle  extends Shape{
	private int radius = 0;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		return radius * radius;
	}

}
