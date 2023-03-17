public class Exercise4
{
	public static void main(String[] args)
	{
		//create instances
		Store obj1 = new Store();
		Store obj2 = new Store();
		Store obj3 = new Store();
		Store obj4 = new Store();

		//set names
		obj1.setName("Twix bar");
		obj2.setName("Daz Washing powder 10Kg");
		obj3.setName("Colegate Toothpaste");
		obj4.setName("Granny Smiths 6-pack Apples");

		//set prices
		obj1.setPrice(0.40);
		obj2.setPrice(6.05);
		obj3.setPrice(1.25);
		obj4.setPrice(1.10);

		//output product 1(test get method)
		System.out.println("Product Detials:");
		System.out.printf("Product 1 Name: %s%n", obj1.getName());
		System.out.printf("Product 1 Cost price: %.2f%n", obj1.getPrice());
		System.out.printf("Product 1 Cost price: %.2f%n", (obj1.getPrice()*145)/100);

		//output product 2(test get method)
		System.out.println("Product Detials:");
		System.out.printf("\nProduct 2 Name: %s%n", obj2.getName());
		System.out.printf("Product 2 Cost price: %.2f%n", obj2.getPrice());
		System.out.printf("Product 2 Cost price: %.2f%n", (obj2.getPrice()*145)/100);

		//output product 2(test get method)
		System.out.println("Product Detials:");
		System.out.printf("\nProduct 2 Name: %s%n", obj3.getName());
		System.out.printf("Product 2 Cost price: %.2f%n", obj3.getPrice());
		System.out.printf("Product 2 Cost price: %.2f%n", (obj3.getPrice()*145)/100);

		//output product 2(test get method)
		System.out.println("Product Detials:");
		System.out.printf("\nProduct 2 Name: %s%n", obj4.getName());
		System.out.printf("Product 2 Cost price: %.2f%n", obj4.getPrice());
		System.out.printf("Product 2 Cost price: %.2f%n", (obj4.getPrice()*145)/100);
	}
}