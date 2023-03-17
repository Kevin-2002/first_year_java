import java.util.Scanner;

public class Exercise9
{
	public static void main(String[] args)
	{
		//create instances
		Payroll obj1 = new Payroll();

		//declare var and keyboard
		Scanner keyboard = new Scanner(System.in);
		String name;
		int IDnum;
		double pay, hours;

		//prompt user for info
		System.out.print("Enter the employee's name: ");
		name = keyboard.nextLine();
		System.out.print("Enter the employee's ID number: ");
		IDnum = keyboard.nextInt();
		System.out.print("Enter the employee's hourly pay rate: ");
		pay = keyboard.nextDouble();
		System.out.print("Enter the number of hours worked by the employee: ");
		hours = keyboard.nextDouble();

		//set names
		obj1.setName(name);

		//set units on hand
		obj1.setIdNumber(IDnum);

		//set pay
		obj1.setPay(pay);

		//set hours
		obj1.setHours(hours);

		//output payroll data(test get method)
		System.out.printf("\nEmployee Payroll Data\n");
		System.out.printf("Name: %s%n", obj1.getName());
		System.out.printf("ID Number: %d%n", obj1.getIdNumber());
		System.out.printf("Hourly pay rate: %.1f%n", obj1.getPay());
		System.out.printf("Hours worked: %.1f%n", obj1.getHours());
		System.out.printf("Gross pay: eur %.1f%n", (obj1.getPay()*obj1.getHours()));
	}
}