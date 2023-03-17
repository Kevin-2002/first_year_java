public class Exercise5
{
	public static void main(String[] args)
	{
		//declare objects
		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob", "Smith");
		Student s3 = new Student();

		//output
		System.out.println(s1.getFirstname());
		System.out.println(s1.getSurname());
		System.out.println(s1.getAge()+"\n\n\n");

		System.out.println(s2.getFirstname());
		System.out.println(s2.getSurname());
		System.out.println(s2.getAge()+"\n\n\n");

		System.out.println(s3.getFirstname());
		System.out.println(s3.getSurname());
		System.out.println(s3.getAge());
	}
}