public class Exercise5
{
	public static void main(String[] args)
	{
		//create instances
		Personal obj1 = new Personal();
		Personal obj2 = new Personal();
		Personal obj3 = new Personal();

		//set names
		obj1.setName("Joe Mahoney");
		obj2.setName("Geri Rose");
		obj3.setName("John Carbonni");

		//set age
		obj1.setAge(27);
		obj2.setAge(24);
		obj3.setAge(28);

		//set address
		obj1.setAddress("724 22nd Street");
		obj2.setAddress("149 East Bay Street");
		obj3.setAddress("22 King Street");

		//set phone
		obj1.setPhone("(555)555-1234");
		obj2.setPhone("(555)555-5678");
		obj3.setPhone("(555)555-0123");

		//output info 1(test get method)
		System.out.printf("My information:\n");
		System.out.printf("Name: %s%n", obj1.getName());
		System.out.printf("Age: %d%n", obj1.getAge());
		System.out.printf("Address: %s%n", obj1.getAddress());
		System.out.printf("Phone: %s%n", obj1.getPhone());

		//output info 2(test get method)
		System.out.printf("\nFriend #1's information:\n");
		System.out.printf("Name: %s%n", obj2.getName());
		System.out.printf("Age: %d%n", obj2.getAge());
		System.out.printf("Address: %s%n", obj2.getAddress());
		System.out.printf("Phone: %s%n", obj2.getPhone());

		//output info 2(test get method)
		System.out.printf("\nFriend #2's information:\n");
		System.out.printf("Name: %s%n", obj3.getName());
		System.out.printf("Age: %d%n", obj3.getAge());
		System.out.printf("Address: %s%n", obj3.getAddress());
		System.out.printf("Phone: %s%n", obj3.getPhone());

	}
}