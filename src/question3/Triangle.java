package question3;

public class Triangle extends Shape
{
  public double base,height;

public Triangle(double base, double height) {
	super();
	this.base = base;
	this.height = height;
}
  public double area()
  {
	  return 0.5 * base * height;
  }
}
