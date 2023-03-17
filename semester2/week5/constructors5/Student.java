public class Student
{
	//member var
	private int age;
	private String firstname, surname;

	//constructers
	public Student()
	{
		firstname = "No name provided";
		surname = "No name provided";
	}
	public Student(String firstname)
	{
		this.firstname = firstname;
	}
	public Student(String firstname, String surname)
	{
		this.firstname = firstname;
		this.surname = surname;
	}

	//gets and sets
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

	//any other methods
}