public class Personal
{
	//member var
	private String name, address, phone;
	private int age;

	public String setName(String known)
	{
		return name = known;
	}

	public String setAddress(String known)
	{
		return address = known;
	}

	public int setAge(int known)
	{
		return age = known;
	}

	public String setPhone(String known)
	{
		return phone = known;
	}

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public String getPhone()
	{
		return phone;
	}

	public int getAge()
	{
		return age;
	}
}