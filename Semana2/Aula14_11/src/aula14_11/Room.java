package aula14_11;

public class Room {
	private double length;
	private double breadth;
	private double height;

	public Room(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateArea() {
		return length * breadth;
	}

	public double calculateVolume() {
		return length * breadth * height;
	}

}
