public class Exercise8
{
	public static void main(String[] args)
	{
		//create instances
		RetailItem obj1 = new RetailItem();
		RetailItem obj2 = new RetailItem();
		RetailItem obj3 = new RetailItem();

		//set decription
		obj1.setDescription("Jacket");
		obj2.setDescription("Designer Jeans");
		obj3.setDescription("Shirt");

		//set units on hand
		obj1.setUnitsOnHand(12);
		obj2.setUnitsOnHand(40);
		obj3.setUnitsOnHand(20);

		//set Dept
		obj1.setPrice(59.95);
		obj2.setPrice(34.95);
		obj3.setPrice(24.95);

		//output info 1(test get method)
		System.out.printf("Item #1\n");
		System.out.printf("Description: %s%n", obj1.getDescription());
		System.out.printf("Units on hand: %d%n", obj1.getUnitsOnHand());
		System.out.printf("Price: %.2f%n", obj1.getPrice());

		//output info 2(test get method)
		System.out.printf("\nItem #2\n");
		System.out.printf("Description: %s%n", obj2.getDescription());
		System.out.printf("Units on hand: %d%n", obj2.getUnitsOnHand());
		System.out.printf("Price: %.2f%n", obj2.getPrice());

		//output info 1(test get method)
		System.out.printf("\nItem #3\n");
		System.out.printf("Description: %s%n", obj3.getDescription());
		System.out.printf("Units on hand: %d%n", obj3.getUnitsOnHand());
		System.out.printf("Price: %.2f%n", obj3.getPrice());
	}
}