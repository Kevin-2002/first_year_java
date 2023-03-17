/* Kevin McShane
   Student ID: G00401808
   04/11/2021
   Lab Exam 1 - Software Design and Program Development Year 1
*/

import java.util.Scanner;

public class KevinMcShaneLabExam1Version2020
{
	public static void main(String[] args)
	{
		//declare new keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
			int counter = 0;
			short option;
			double terminate = 3;
			float amount;
			String contin, name;
			String history = "";

		//output menu
			System.out.println("\t\t\t\t\t=======================================");
			System.out.println("\t\t\t\t\t          JAVA MULTI-CONVERTER         ");
			System.out.println("\t\t\t\t\t=======================================\n\n");
			System.out.println("\t\t\t\t************************* MENU *************************");
			System.out.println("\t\t\t\t*                                                      *");
			System.out.println("\t\t\t\t*    Choose from one of the following menu options     *");
			System.out.println("\t\t\t\t*                                                      *");
			System.out.println("\t\t\t\t*    1. Convert Distance:      Miles to Kilometers     *");
			System.out.println("\t\t\t\t*    2. Convert Distance:      Kilometres to Miles     *");
			System.out.println("\t\t\t\t*    3. Convert temperature:   Celsius to Farenheit    *");
			System.out.println("\t\t\t\t*    4. Convert temperature:   Farenheit to Celsius    *");
			System.out.println("\t\t\t\t*    5. Convert Length:        Inches to Millimeters   *");
			System.out.println("\t\t\t\t*    6. Convert Length:        Millimeters to Inches   *");
			System.out.println("\t\t\t\t*    7. Convert Finance:       Euros to Sterling       *");
			System.out.println("\t\t\t\t*    8. Convert Finance:       Sterling to Euros       *");
			System.out.println("\t\t\t\t*                                                      *");
			System.out.println("\t\t\t\t********************************************************\n\n\n");

		//do-while
			do
			{

		//promt the user to enter an option
			System.out.print("\t\t\tEnter option (1 to 8): ");
			option = keyboard.nextShort();

		//if - else if - else statements
			switch(option)
				{
					case 1:
					{
						System.out.println("\t\t\t\t\t1. Convert Miles to Kilometers");
						System.out.print("\t\t\t\t\t\tEnter Miles: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//promt user for answer
						System.out.println("\t\t\t\t\t" + amount + " Miles is " + (amount*1.60934) + " in Kilometers");

						//history
						history = history + amount + " miles is " + (amount*1.60934) + " in Kilometers\n\t\t\t\t";
						break;
					}

					case 2:
					{
						System.out.println("\t\t\t\t\t2. Convert Kilometres to Miles");
						System.out.print("\t\t\t\t\t\tEnter Kilometres: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//output answer
						System.out.println("\t\t\t\t\t" + amount + " Kilometres is " + (amount*0.621371) + " in Miles");

						//history
						history = history + amount + " in Kilometers " + (amount*0.621371) + " miles is\n\t\t\t\t";
						break;
					}

					case 3:
					{
						System.out.println("\t\t\t\t\t3. Convert Celsius to Farenheit");
						System.out.print("\t\t\t\t\t\tEnter Celsius: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//output answer
						System.out.println("\t\t\t\t\t" + amount + " Celsius is " + ((amount*9/5)+32) + " in Farenheit");

						//history
						history = history + amount + " Celsius is " + ((amount*9/5)+32) + " in Farenheit\n\t\t\t\t";
						break;
					}

					case 4:
					{
						System.out.println("\t\t\t\t\t4. Convert Farenheit to Celsius");
						System.out.print("\t\t\t\t\t\tEnter Farenheit: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//output answer
						System.out.println("\t\t\t\t\t" + amount + " Farenheit is " + ((amount-32)*5/9) + " in Celsius");

						//history
						history = history + amount + " Farenheit is " + ((amount-32)*5/9) + " Celsius is\n\t\t\t\t";
						break;
					}

					case 5:
					{
						System.out.println("\t\t\t\t\t5. Convert Inches to Millimeters");
						System.out.print("\t\t\t\t\t\tEnter Inches: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//output answer
						System.out.printf("\t\t\t\t\t%.2f Inches is %.2f in Millimeters\n", amount, (amount*25.4));

						//history
						history = history + amount + " Inches is " + (amount*25.4) + " in Millimeters\n\t\t\t\t";
						break;
					}

					case 6:
					{
						System.out.println("\t\t\t\t\t6. Convert Millimeters to Inches");
						System.out.print("\t\t\t\t\t\tEnter Millimeters: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//output answer
						System.out.printf("\t\t\t\t\t%.2f Millimeters is %.2f in Inches\n", amount, (amount/25.4));

						//history
						history = history + amount + " Millimeters is " + (amount/25.4) + " in Inches\n\t\t\t\t";
						break;

					}
					case 7:
					{
						System.out.println("\t\t\t\t\t7. Convert Euros to Sterling");
						System.out.print("\t\t\t\t\t\tEnter Euros: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//output answer
						System.out.printf("\t\t\t\t\t%.2f Euros is %.2f in Sterling\n", amount, (amount*0.85285));

						//history
						history = history + amount + " Euros is " + (amount*0.85285) + " in Sterling\n\t\t\t\t";
						break;

					}
					case 8:
					{
						System.out.println("\t\t\t\t\t8. Convert Sterling to Euros");
						System.out.print("\t\t\t\t\t\tEnter Sterling: ");

						//promt user for amount
						amount = keyboard.nextFloat();

						//output answer
						System.out.printf("\t\t\t\t\t%.2f Sterling is %.2f in Euros\n", amount, (amount*1.17247));

						//history
						history = history + amount + " Sterling is " + (amount*1.17247) + " in Euros\n\t\t\t\t";
						break;

					}
					default:
					{
						System.out.println("\t\t\t\t\t\tInvalid option entered");
						break;
					}
				}//switchclose

				//ask user to continue
					System.out.println("\n");
					System.out.print("\t\t\tContinue? Enter Yes: ");
					contin = keyboard.nextLine();
					contin = keyboard.nextLine();

				//terminate counter and calculator counter
				--terminate;
				++counter;

			//close do-while loop
			}while(contin.equalsIgnoreCase("yes") && terminate > 0);

			//output completions
				System.out.println("\t\t\tCalculations complete!");

			//Promt user to enter name
				System.out.print("\t\t\tEnter your name: ");
				name = keyboard.nextLine();

			//end program text
			System.out.printf("\n\n\t\t\t\tEND OF PROGRAM REACHED %S!\n", name);
			System.out.printf("\n\n\t\t\t\tThere were %d calculations in total\n", counter);
			System.out.printf("\n\n\t\t\t\t%s, the Calculations were:\n\t\t\t\t", name);
			System.out.print(history);


	}//main bracket
}//class bracket