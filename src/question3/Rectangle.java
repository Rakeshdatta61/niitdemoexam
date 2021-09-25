package question3;

public class Rectangle extends Shape
{
 private double length,breadth;

public Rectangle(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}
 public double area()
 {
	 return length * breadth;
 }
}
