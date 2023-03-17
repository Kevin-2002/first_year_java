public class Person
{
	//declare private member var
	private String firstName;
	private String lastName;

	//declare member var
	private static int instanceCount = 0;

	public Person(String f, String l)
	{
		firstName = f;
		lastName = l;
		instanceCount++;
	}

	public int getInstanceCount()
	{
		return instanceCount;
	}

	public static String Count()
	{
		String str;
		str = "The number of Person objects is " + instanceCount;
		return str;
	}
}