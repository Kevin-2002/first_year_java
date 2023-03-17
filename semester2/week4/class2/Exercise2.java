public class Exercise2
{
	public static void main(String[] args)
	{
		//create instances
		Toy obj1 = new Toy();
		Toy obj2 = new Toy();
		Toy obj3 = new Toy();

		//set names
		obj1.setName("Spinner");
		obj2.setName("Baby Yoda");
		obj3.setName("Batmobile");

		//set prices
		obj1.setPrice(10.99);
		obj2.setPrice(19.99);
		obj3.setPrice(35.49);

		//output (test get method)
		System.out.println(obj1.getName() + " " + obj1.getPrice());
		System.out.println(obj2.getName() + " " + obj2.getPrice());
		System.out.println(obj3.getName() + " " + obj3.getPrice());
	}
}