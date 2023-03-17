public class Employee
{
	//member var
	private String name, department, posit;
	private int idNumber;

	public String setName(String known)
	{
		return name = known;
	}

	public String setDepartment(String known)
	{
		return department = known;
	}

	public String setPosit(String known)
	{
		return posit = known;
	}

	public int setIdNumber(int known)
	{
		return idNumber = known;
	}

	public String getName()
	{
		return name;
	}

	public String getDepartment()
	{
		return department;
	}

	public String getPosit()
	{
		return posit;
	}

	public int getIdNumber()
	{
		return idNumber;
	}
}