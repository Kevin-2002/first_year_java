import java.util.Scanner;

public class JavaSwitch7
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare constant
		final double bonusa = 100;
		final double bonusb = 50;
		final double bonusc = 15;

		//declare variable
		double wage, total;
		char grade;

		//output
		System.out.println("Enter Employee current weekly wage: ");
		wage = keyboard.nextDouble();
		System.out.println("Enter Employee grade (A, B or C): ");
		grade = keyboard.next().charAt(0);

		//switch
		switch(grade)
		{
			case 'a':
			case 'A':
				total = bonusa + wage;
				System.out.println("Grade A Employee: This weeks wage plus bonus is " + total);
				break;
			case 'b':
			case 'B':
				total = bonusb + wage;
				System.out.println("Grade B Employee: This weeks wage plus bonus is " + total);
				break;
			case 'c':
			case 'C':
				total = bonusb + wage;
				System.out.println("Grade A Employee: This weeks wage plus bonus is " + total);
			default:
				System.out.println("This weeks wage is " + wage + ", there is no bonus");
				break;
		}
	}
}