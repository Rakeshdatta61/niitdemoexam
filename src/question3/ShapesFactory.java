package question3;
import java.util.Random;

import question3.*;
public class ShapesFactory 
{
 public static Shape produceShape()
 {
	 int n = new Random().nextInt();
	 switch(n%3)
	 {
	 case 0:
		 return new Circle(4.5);
	 case 1:
		 return new Triangle(4.5,5.0);
	 default:
		 return new Rectangle(6,5);
	 }
 }
}
