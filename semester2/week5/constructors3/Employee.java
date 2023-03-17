public class Employee
{
	//member var
	private int age;
	private String name;

	//constructer
	public Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//gets and sets
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	//any other methods
}