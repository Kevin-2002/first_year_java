import java.util.Scanner;

public class JavaScanner11
{
	public static void main(String[] args)
	{
		//Scanner system
		Scanner keyboard = new Scanner(System.in);

		//Declare variable
		String firstName, surname;
		int empId;
		double PRSI, rate, annualPay, monthlyPay, Salary;

		//Name declaration
		System.out.print("\nEnter first name: ");
		firstName = keyboard.nextLine();
		System.out.print("Enter surname: ");
		surname = keyboard.nextLine();
		System.out.print("Enter employee id: ");
		empId = keyboard.nextInt();
		System.out.print("Enter Salary: ");
		Salary = keyboard.nextDouble();
		System.out.print("Enter current tax rate: ");
		rate = keyboard.nextDouble();

		//Calculations
		PRSI = Salary * rate /100;
		annualPay = Salary - PRSI;
		monthlyPay = annualPay/12;

		//Output
		System.out.println("\n|---------------------------------------------------------------|");
		System.out.println("| PAYSLIP: ");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("| EMPLOYEE: " + firstName + " " + surname);
		System.out.println("| ID: " + empId);
		System.out.println("\n| SALARY: " + Salary);
		System.out.println("| PRSI: " + PRSI);
		System.out.println("| ANNUAL TAKE HOME: " + annualPay);
		System.out.println("| MONTHLY TAKE HOME: " + monthlyPay);
		System.out.println("|---------------------------------------------------------------|");

	}
}