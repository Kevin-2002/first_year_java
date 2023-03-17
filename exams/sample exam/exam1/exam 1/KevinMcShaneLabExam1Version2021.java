/* Kevin McShane
   Student ID: G00401808
   04/11/2021
   sample Lab Exam 20211 - Software Design and Program Development Year 1
*/

import java.util.Scanner;

public class KevinMcShaneLabExam1Version2021
{
	public static void main(String[] args)
	{
		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		double num1, num2, calc;3
		int counter = 0;
		String password;
		char operator, contin;

		//ask for password
		System.out.print("Input password to enter: ");
		password = keyboard.nextLine();

		//if
		if(password.equalsIgnoreCase("pass"))
		{

			//calculator
			System.out.println("\n----------WELCOME TO CALCULATOR-----------");
			System.out.println("Enter two numbers for calculation");

			//do while
			do
			{
			//ask for first number
			System.out.println("------------------------------------------");
			System.out.print("Enter first number: ");
			num1 = keyboard.nextDouble();
			//ask for second number
			System.out.print("Enter second number: ");
			num2 = keyboard.nextDouble();

			//ask for operation
			System.out.println("what calculation do you wish to preform?");
			System.out.print("Enter A for add, S for subtract, M for multiply, D for divide, R for remainder: ");
			operator = keyboard.next().charAt(0);

			//switch operator
			switch(operator)
			{
				//addition
				case 'A':
				case 'a':
					calc = num1 + num2;
					System.out.printf("\n\t%,.2f plus %,.2f is : %,.2f%n", num1, num2, calc);
					break;

				//subtraction
				case 'S':
				case 's':
					calc = num1 - num2;
					System.out.printf("\n\t%,.2f minus %,.2f is : %,.2f%n", num1, num2, calc);
					break;

				//multiplication
				case 'M':
				case 'm':
					calc = num1 * num2;
					System.out.printf("\n\t%,.2f by %,.2f is : %,.2f%n", num1, num2, calc);
					break;

				//divide
				case 'D':
				case 'd':
					calc = num1 / num2;
					System.out.printf("\n\t%,.2f divide %,.2f is : %,.2f%n", num1, num2, calc);
					break;

				//modulus
				case 'R':
				case 'r':
					calc = num1 % num2;
					System.out.printf("\n\t%,.2f modulus %,.2f is : %,.2f%n", num1, num2, calc);
					break;

				//denounce exeptions
				default:
					System.out.printf("%s is not a valid option!", operator);
			}//switchclose

					//ask to repeat and increment counter
					System.out.print("\nEnter Y to perform another calculation: ");
					contin = keyboard.next().charAt(0);
					++counter;
					}while(contin == 'y' || contin == 'Y');
			}//ifclose
			else
			{
				System.out.println("Invalid password entered");
			}

			//closing and counter statement
			System.out.println("------------------------------------------");
			System.out.println("\n\nEND OF PROGRAM REACHED");
			System.out.printf("The program performed %d calculation(s)\n\n", counter);
	}//main bracket
}//class bracket