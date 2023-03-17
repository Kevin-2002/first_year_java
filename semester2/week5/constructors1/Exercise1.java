public class Exercise1
{
	public static void main(String[] args)
	{
		//create an instance of the circle class
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		Circle c4 = new Circle();

		//call the getRadius()
		System.out.println(c1.getRadius());
		System.out.printf("Circle object c1 radius is %d%n", c1.getRadius());
		System.out.printf("Circle object c2 radius is %d%n", c2.getRadius());
		System.out.printf("Circle object c3 radius is %d%n", c3.getRadius());
		System.out.printf("Circle object c4 radius is %d%n", c4.getRadius());
	}
}