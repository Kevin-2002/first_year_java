public class Customer
{
	//member var
	private String firstname, surname;
	private int age;

	//constructors
	public Customer()
	{
		firstname = "none";
		surname = "none";
		age = 0;
	}

	public Customer(String firstname)
	{
		this.firstname = firstname;
	}

	public Customer(String firstname, String surname)
	{
		this.firstname = firstname;
		this.surname = surname;
	}

	public Customer(String firstname, String surname, int age)
	{
		this.firstname = firstname;
		this.surname = surname;
		this.age = age;
	}

	//gets and sets
	public String setFirstname(String firstname)
	{
		return this.firstname = firstname;
	}

	public String setSurname(String surname)
	{
		return this.surname = surname;
	}

	public int setAge(int age)
	{
		return this.age = age;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public String getSurname()
	{
		return surname;
	}

	public int getAge()
	{
		return age;
	}
}//class