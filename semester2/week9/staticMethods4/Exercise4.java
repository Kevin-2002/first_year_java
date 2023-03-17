public class Exercise4
{
	public static void main(String[] args)
	{
		Person a = new Person("Grace", "Hopper");
		Person b = new Person("Bill", "Gates");
		Person c = new Person("Kevin", "McShane");
		Person d = new Person("Cian", "Martyn");

		System.out.println(Person.Count());
	}
}