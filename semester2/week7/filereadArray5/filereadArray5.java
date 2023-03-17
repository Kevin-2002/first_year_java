public class filereadArray5
{
	public static void main(String[] args)
	{
		//declare grid
		int[][] myGrid = new int[1][3];

		//populate grid
		myGrid[0][0] = 99;
		myGrid[0][1] = 98;
		myGrid[0][2] = 97;

		//output
		System.out.println("Value at 0, 0 is: " + myGrid[0][0]);
		System.out.println("Value at 0, 1 is: " + myGrid[0][1]);
		System.out.println("Value at 0, 2 is: " + myGrid[0][2]);
	}
}