/* Kevin McShane
   Student ID: G00401808
   26/02/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/

public class JoeBidenQuestion2
{
	public static void main(String[] args)
	{
		calculate(2, 6, 'm');
		calculate(2, 6, 'a');
		calculate(2, 6, 'x');
	}//main()

	//Calculate method togo below:
	public static void calculate(int num1, int num2, char operator)
	{
		//declare result
		int result;

		switch(operator)
		{
			case 'a':	case 'A':
			System.out.printf("%d plus %d is: %d%n", num1, num2, num1+num2);
			break;

			case 'm':	case 'M':
			System.out.printf("%d multiplied by %d is: %d%n", num1, num2, num1*num2);
			break;

			default:
			System.out.println("This is not a valid operator!");
			break;
		}
	}//calculate()
}//class bracket