import java.util.Scanner;

public class JavaForBonus6
{
	public static void main(String[] args)
	{

	//declare instance of keyboard
	Scanner keyboard = new Scanner(System.in);

	//declare variable
	int input;

	//output
	System.out.print("Specify size of triangle: ");

	//promt user to enter size of triangle
	input = keyboard.nextInt();

		//for1
		for(int a = ; a <= input; a++)
		{
			System.out.println("*");
			//for2
			for(int b = input; b <= (input+1); b++)
			{
				System.out.print("*");
				//if
				if(b == (input+1))
				{
					System.out.print("\n");
				}
			}//for2
			//for3
				for(int c = input; c <= (input+2); c++)
				{
					System.out.print("*");
					//if
					if(c == (input+2))
					{
						System.out.print("\n");
					}
				}//for3
		}//for1
	}
}