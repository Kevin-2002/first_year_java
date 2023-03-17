public class Exercise3
{
	public static void main(String[] args)
	{
		//create an instance of the circle class
		Employee emp1 = new Employee("Donald", 75);
		Employee emp2 = new Employee("Alice", 20);
		Employee emp3 = new Employee("Bob", 30);
		Employee emp4 = new Employee("Charlie", 40);

		//call the getName()
		System.out.printf("Emp1 name is %s and age is %d%n", emp1.getName(), emp1.getAge());
		System.out.printf("Emp2 name is %s and age is %d%n", emp2.getName(), emp2.getAge());
		System.out.printf("Emp3 name is %s and age is %d%n", emp3.getName(), emp3.getAge());
		System.out.printf("Emp4 name is %s and age is %d%n", emp4.getName(), emp4.getAge());

	}
}