/*
User defined methods with return type and actual/formal parameters
Used to break a problem into small managable pieces
Simplify programs - Preform one task only
If a specific task is preformed in several places in the program
a method can be written once and executed numerous times
a method is made up of a method header and a body and a method call
*/

import java.util.Scanner;

public class JDemoMethods1
{
	public static void main(String[] args)
	{
		//declare variable
		int answer; //hold the return from the methods add and subtract
		int num = 8; //one of the perameters for the subtract method

		System.out.println("In main() method");

		displayMessage(); //calls displayMessage method

		answer = add(); // calls add method
		System.out.println("Add answer is : " + answer);

		answer = subtract(16, num); //calls subtract method passes perameters
		System.out.println("Subtract answer is : " + answer);

		System.out.println("End of main() method");

	}//end of main

	//user defined methods ////////////////////////////////////////////////////////

	//Method displays message
	public static void displayMessage() // Return: void - no perameters inside the ()
	{
		System.out.println("In displayMessage() method");
		System.out.println("This program demonstrates methods");
	}//displayMessage close

	//method that adds 2 integers together and returns and integer
	public static int add() //return : int - no perameters
	{
		System.out.println("In add() method");
		int result;
		result = (8+3);
		return result;
	}//add close

	//Method that subtracts 2 integers and returns result
	public static int subtract(int first, int second)
	{
		System.out.println("In subtract() method");
		return(first - second);
	}

///////////////////////////////////////////////////////////////////////////////////
}//end of class