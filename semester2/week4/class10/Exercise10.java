import java.util.Scanner;

public class Exercise10
{
	public static void main(String[] args)
	{
		//create instances
		TestScores obj1 = new TestScores();
		TestScores obj2 = new TestScores();
		TestScores obj3 = new TestScores();

		//declare var and keyboard
		Scanner keyboard = new Scanner(System.in);
		int score1, score2, score3;

		//prompt user for info
		System.out.print("Enter test score #1: ");
		score1 = keyboard.nextInt();
		System.out.print("Enter test score #2: ");
		score2 = keyboard.nextInt();
		System.out.print("Enter test score #3: ");
		score3 = keyboard.nextInt();

		//set score
		obj1.setScore(score1);
		obj2.setScore(score2);
		obj3.setScore(score3);

		//call average
		obj1.Average(score1, score2, score3);

		//output average
		System.out.printf("The average test score is %.2f%n", obj1.getAverage());
	}
}