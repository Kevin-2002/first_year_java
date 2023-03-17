public class Exercise3
{
	public static void main(String[] args)
	{
		System.out.printf("The area of a circle with a radius of 20.0 is %.2f%n", Area.circles(20.0));
		System.out.printf("The area of a rectangle with a length of 10 and a width of 20 is %.2f%n", Area.rectangles(10, 20));
		System.out.printf("The area of a rectangle with a radius of 10.0 and a height of 15.0 is %.2f%n", Area.cylinders(10.0, 15.0));
	}
}