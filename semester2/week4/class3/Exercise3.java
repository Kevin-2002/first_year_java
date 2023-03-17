public class Exercise3
{
	public static void main(String[] args)
	{
		//create instances
		Phones obj1 = new Phones();
		Phones obj2 = new Phones();
		Phones obj3 = new Phones();

		//set names
		obj1.setName("Apple iPhone");
		obj2.setName("Samsung S20");
		obj3.setName("Nokia 5310");

		//set prices
		obj1.setPrice(599.99);
		obj2.setPrice(549.45);
		obj3.setPrice(95.00);

		//set stock
		obj1.setStock(11);
		obj2.setStock(4);
		obj3.setStock(6);

		//output (test get method)
		System.out.println(obj1.getName() + " " + obj1.getPrice());
		System.out.println(obj2.getName() + " " + obj2.getPrice());
		System.out.println(obj3.getName() + " " + obj3.getPrice());
	}
}