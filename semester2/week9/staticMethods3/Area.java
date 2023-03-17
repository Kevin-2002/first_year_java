public class Area
{
	public static double circles(double radius)
	{
		return 3.14159*(radius*radius);
	}

	public static double rectangles(double length, double width)
	{
		return width*length;
	}

	public static double cylinders(double radius, double height)
	{
		return 3.14159*(radius*radius)*height;
	}
}