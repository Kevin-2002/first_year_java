public class Exercise2
{
	public static void main(String[] args)
	{
		//create an instance of the circle class
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		Rectangle c = new Rectangle();
		Rectangle d = new Rectangle();

		//call the getRadius()
		System.out.println(a.getLength());
		System.out.println(a.getWidth());
		System.out.printf("Rectangle a length is %d%n", a.getLength());
		System.out.printf("Rectangle a length is %d%n", a.getWidth());
		System.out.printf("Rectangle b length is %d%n", b.getLength());
		System.out.printf("Rectangle b length is %d%n", b.getWidth());
		System.out.printf("Rectangle c length is %d%n", c.getLength());
		System.out.printf("Rectangle c length is %d%n", c.getWidth());
		System.out.printf("Rectangle d length is %d%n", d.getLength());
		System.out.printf("Rectangle d length is %d%n", d.getWidth());
	}
}