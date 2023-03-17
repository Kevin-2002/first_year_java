import java.util.Scanner;

public class JavaIf5
{
	public static void main(String[] args)
	{
		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variables
		int age = 18;

		//Output
		System.out.println("If you are " + age + " years old . . . You are:");

		//If statements too young
		if(age < 13)
			{
				System.out.println("\ttoo young to create a Facebook account");
			}
		if(age < 16)
			{
				System.out.println("\ttoo young to get a driver's license");
			}
		if(age < 18)
			{
				System.out.println("\ttoo young to vote");
			}
		if(age < 18)
			{
				System.out.println("\ttoo young to drink alcohol");
			}
		if(age < 21)
			{
				System.out.println("\ttoo young to become a T.D");
			}
		if(age > 50)
			{
				System.out.println("\tyou may be getting old");
			}

		//if statements old enough for
		if(age >= 13)
			{
				System.out.println("\told enough to create a Facebook account");
			}
		if(age >= 16)
			{
				System.out.println("\told enough to get a driver's license");
			}
		if(age >= 18)
			{
				System.out.println("\told enough to vote");
			}
		if(age >= 18)
			{
				System.out.println("\told enough to drink alcohol");
			}
		if(age >= 21)
			{
				System.out.println("\told enough to become a T.D");
			}
	}
}