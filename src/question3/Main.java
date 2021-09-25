package question3;
import question3.ShapesFactory;
public class Main {

	public static void main(String[] args) 
	{
		Shape s = null;
		for(int i = 1;i <= 10;i++)
		{
			s = ShapesFactory.produceShape();
			System.out.println(s.area());
			
		}

	}

}
