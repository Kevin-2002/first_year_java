public class Exercise1
{
	public static void main(String[] args)
	{
		//create square box object
		Square box1 = new Square();

		//using setLength method set the length to 10
		box1.setLength(10);

		//next square instance
		Square Shape1 = new Square();

		//set the length of shape1
		Shape1.setLength(55);

		//next square instance
		Square Alpha = new Square();

		//set the length of shape1
		Alpha.setLength(512);

		//test the lenghtget
		System.out.print("Testing the length getter method\nThe box1 length is : ");
		System.out.println(box1.getLength());
		System.out.print("The shape1 length is : ");
		System.out.println(Shape1.getLength());
		System.out.print("The alpha length is : ");
		System.out.println(Alpha.getLength() + "\n\n");

		//Test the area getter
		System.out.print("Testing the Area Getter Method\nThe box1 area is : ");
		System.out.println(box1.getArea());
		System.out.print("The Shape1 area is : ");
		System.out.println(Shape1.getArea());
		System.out.print("The Alpha area is : ");
		System.out.println(Alpha.getArea());
	}
}