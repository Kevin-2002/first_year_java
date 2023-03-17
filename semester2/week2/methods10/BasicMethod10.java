public class BasicMethod10
{
	public static void main(String[] args)
	{
		age("Donald", 1946);

		age("Hilary", 1947);

		age("Bill Gates", 1955);
	}

	public static void age(String name, int YOB)
	{
		//calculate age
		int age;
		age = 2022 - YOB;

		System.out.printf("Hello %s , you are %d years of age\n", name, age);
	}
}