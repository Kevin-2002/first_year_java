/* Kevin McShane
   Student ID: G00401808
   01/03/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/
public class KevinMcShaneQuestion2
{
	public static void main(String[] args)
	{
		weekly("Alice", "Smith", 35000);
		weekly("Bob", "Jones", 20000);
		weekly("Charlie", "Smith", 28000);
	}//main()

	public static void weekly(String firstName, String surName, double annualWage)
	{
		//declare variables
		double weeklyWage;
		char taxBand = ' ';

		//Calculate weekly wage
		weeklyWage = annualWage/52;

		//calculate tax band
		if(annualWage < 25000)
		{
			taxBand = 'C';
		}
		else if(annualWage > 30000)
		{
			taxBand = 'A';
		}
		else
		{
			taxBand = 'B';
		}

		//output message
		System.out.printf("The weekly wage of %s %s is %.2f%n%s is in tax band %s%n\n", firstName, surName, weeklyWage, firstName, taxBand);
	}
}//class bracket