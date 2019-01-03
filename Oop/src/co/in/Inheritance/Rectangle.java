package co.in.Inheritance;

public class Rectangle extends Shape {
	private int lenght = 0;
	private int width = 0;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double area() {
		return lenght * width;
	}

}
