package shape;
import java.util.Random;;


public class ShapeUtility {
	public static double sumPerimeter(Shape[] ShapeArray)
	{
		double sum = 0;
		for(int x = 0; x < ShapeArray.length;x++)
		{
			sum+= ShapeArray[x].perimeter();
		}
		return sum;
	}
	public static double sumArea(Shape[] ShapeArray)
	{
		double sum = 0;
		for(int x = 0; x < ShapeArray.length;x++)
		{
			sum+= ShapeArray[x].area();
		}
		return sum;
	}
	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x)
		{
			case 0:
				return new Circle(r.nextInt(100)+1);
			case 1:
				return new Rectangle(r.nextInt(100)+1,r.nextInt(100)+1);
			default:
				return new Square(r.nextInt(100)+1);
		}
	}
}
