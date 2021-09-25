package question3;

public class Circle extends Shape
{
  private double radius;
  public Circle(double radius) {
	super();
	this.radius = radius;
}
  public double area()
  {
	  return 3.14 * radius * radius;
  }
  
}
