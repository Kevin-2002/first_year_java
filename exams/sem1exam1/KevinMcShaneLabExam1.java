/* Kevin McShane
   Student ID: G00401808
   04/11/2021
   Lab Exam 1 - Software Design and Program Development Year 1
*/

import java.util.Scanner;

public class KevinMcShaneLabExam1
{
	public static void main(String[] args)
	{
		//declare keyboard
		Scanner keyboard = new Scanner(System.in);

		//declare variables
		byte option;
		float timespent;
		int bookings = 0;
		char discount, contin;
		String username;
		String name = "";

			//output heading
			System.out.println("\t\t\t\t\t======================================");
			System.out.println("\t\t\t\t\t         The Galway Guesthouse        ");
			System.out.println("\t\t\t\t\t======================================\n");

			//prompt username
			System.out.print("Enter Username: ");
			username = keyboard.nextLine();

			//if - else if - else
			if(username.equalsIgnoreCase("manager"))
			{
				System.out.printf("WELCOME TO THE HOTEL BOOKING SYSTEM - You are the %S%n", username);
			}
			else if(username.equalsIgnoreCase("owner"))
			{
				System.out.printf("WELCOME TO THE HOTEL BOOKING SYSTEM - You are the %S%n", username);
			}
			else
			{
				System.out.printf("WELCOME TO THE HOTEL BOOKING SYSTEM\n");
			}//if - else if - else close

				//system option menu
				System.out.println("\n======== SYSTEM OPTIONS ========");
				System.out.println("1. Guest Check-in");
				System.out.println("2. Reservations");
				System.out.println("3. Generate Bill");
				System.out.println("4. View all reservations");
				System.out.println("5. Show Used Room Count");
				System.out.println("6. Purchase Items");
				System.out.println("================================");

				//do - while
				do
				{

				//prompt user to select an item
				System.out.print("Specify Item 1, 2, 3, 4, 5 or 6: ");
				option = keyboard.nextByte();

					//switch statement
					switch(option)
					{
						case 1:
						{
							System.out.println("\n\n======== Guest check in ========");

							//prompt user to enter name and number of nights staying
							System.out.print("ENTER GUEST NAME: ");
							name = keyboard.nextLine();
							System.out.print("NUMBER OF NIGHTS: ");
							timespent = keyboard.nextFloat();
							System.out.print("DISCOUNT COUPON (Y or N): ");
							discount = keyboard.next().charAt(0);
							System.out.printf("Cost per night: 75\n");
							System.out.printf("%.0f nights @ %.0f euros per night is", timespent, (timespent*75));

							//calculate cupon
								//if - else if - else
								if(discount == 'Y')
								{
								System.out.printf("\nTotal cost is %f%n", ((timespent*75) - (timespent*75*.15)));
								}
								else
								{
								System.out.printf("Total cost is %.0f%n", (timespent*75));
								}
							System.out.println("================================");
							//increment
							++bookings;
							break;
						}
						case 2:
						{
							//output option 2
							System.out.println("\n\n======== RESERVATIONS ========");
							System.out.printf("NAME: %s%n", name);
							//System.out.printf("NIGHTS: %.0f", timespent);
							System.out.println("==============================");
							break;
						}
						case 3:
						{
							System.out.println("\n\n======== VIEW BILL ========");
							System.out.printf("CUSTOMER NAME: %s%n", name);
						/*	System.out.printf("BOOKED FOR %.0f NIGHTS\n", timespent);
							System.out.printf("Total cost: %.0f nights is %f", timespent, (timespent*75));
							System.out.printf("15% discount has been applied, total is: %.2f", ((timespent*75) - (timespent*75*.15)));*/
							System.out.println("===========================");
							break;
						}
						case 4:
						{
							System.out.println("\n\n======== RESERVATIONS ========");
							/*System.out.printf("%s is staying for %.0f nights", name, timespent);
							System.out.printf("%s is staying for %.0f nights/n", name, timespent);*/
							System.out.println("==============================");
							break;
						}
						case 5:
						{
							System.out.printf("Number of rooms booked: %.0f%n", bookings);
							break;
						}
						case 6:
						{
							System.out.println("\n\n======== PURCHASE ITEMS ========");
							System.out.println("Enter item for purchase:");
							System.out.println("Enter P for Pepsi:");
							System.out.println("Enter C for Coke:");
							System.out.println("Enter N for no purchase:");

							System.out.println("\n\n================================");
						}
						default:
						{
							System.out.println("Invalid options selected");
						}
					}//switch close

					//ask user would they like to continue
					System.out.println("Enter Y to return to menu, or type N to quit: ");
					contin = keyboard.next().charAt(0);
				}while(contin == 'y' || contin == 'Y');

	}//main bracket
}//class bracket