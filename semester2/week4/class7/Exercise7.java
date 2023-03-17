public class Exercise7
{
	public static void main(String[] args)
	{
		//create instances
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();

		//set names
		obj1.setName("Susan Meyers");
		obj2.setName("Mark Jones");
		obj3.setName("Joy Rogers");

		//set IdNumber
		obj1.setIdNumber(47899);
		obj2.setIdNumber(39119);
		obj3.setIdNumber(81774);

		//set Dept
		obj1.setDepartment("Accounting");
		obj2.setDepartment("IT");
		obj3.setDepartment("Manufacturing");

		//set posit
		obj1.setPosit("Vice President");
		obj2.setPosit("Programmer");
		obj3.setPosit("Engineer");

		//output info 1(test get method)
		System.out.printf("Employee #1\n");
		System.out.printf("Name: %s%n", obj1.getName());
		System.out.printf("ID Number: %d%n", obj1.getIdNumber());
		System.out.printf("Position: %s%n", obj1.getPosit());

		//output info 2(test get method)
		System.out.printf("\nEmployee #2\n");
		System.out.printf("Name: %s%n", obj2.getName());
		System.out.printf("ID Number: %d%n", obj2.getIdNumber());
		System.out.printf("Position: %s%n", obj2.getPosit());

		//output info 1(test get method)
		System.out.printf("\nEmployee #3\n");
		System.out.printf("Name: %s%n", obj3.getName());
		System.out.printf("ID Number: %d%n", obj3.getIdNumber());
		System.out.printf("Position: %s%n", obj3.getPosit());
	}
}