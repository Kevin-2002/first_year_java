/* Kevin McShane
   Student ID: G00401808
   26/02/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/
import java.util.Scanner;

public class JoeBidenQuestion4
{
	public static void main(String[] args)
	{
		//create objects
		Customer obj1 = new Customer("Jane");
		Customer obj2 = new Customer("Charlie", "Smith");
		Customer obj3 = new Customer();
		Customer obj4 = new Customer();

		//declare keyboard and var
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;

		//prompt user to set obj4
		System.out.print("Enter customer firstname: ");
		name = keyboard.nextLine();
		obj4.setFirstname(name);
		System.out.print("Enter customer surname: ");
		name = keyboard.nextLine();
		obj4.setSurname(name);
		System.out.print("Enter customer age: ");
		age = keyboard.nextInt();
		obj4.setAge(age);

		//output
		System.out.printf("%s%n%s%n%d%n\n\n", obj1.getFirstname(), obj1.getSurname(), obj1.getAge());
		System.out.printf("%s%n%s%n%d%n\n\n", obj2.getFirstname(), obj2.getSurname(), obj2.getAge());
		System.out.printf("%s%n%s%n%d%n\n\n", obj3.getFirstname(), obj3.getSurname(), obj3.getAge());
		System.out.printf("%s%n%s%n%d%n", obj4.getFirstname(), obj4.getSurname(), obj4.getAge());
	}//main()
}//class bracket