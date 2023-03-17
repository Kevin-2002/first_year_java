import java.util.Scanner;

public class JavaForBonus2
{
	public static void main(String[] args)
	{
		//declare instance of scanner
		Scanner keyboard = new Scanner(System.in);

		//decalre variables
		int width, height;

		//promt user to enter width and height - output
		System.out.print("\n\nEnter width of rectangle: ");
		width = keyboard.nextInt();
		System.out.print("\n\nEnter height of rectangle: ");
		height = keyboard.nextInt();
		System.out.print("\n\n");

			//outer for loop
			for(int i = 0; i < height; i++)
			{
				//inner for loop
				for(int x = 0; x <  width; x++)
				{
					System.out.print("*");
				}//forcloseinner

				System.out.print("\n");

		}//forcloseouter

		//print new line
		System.out.print("\n\n");

	}
}