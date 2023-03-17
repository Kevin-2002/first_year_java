/* Kevin McShane
   Student ID: G00401808
   04/11/2021
   Lab Exam 2 - Software Design and Program Development Year 1
*/

import java.util.Random;

public class KevinMcShaneLabExam2Q3
{
	public static void main(String[] args)
	{
		//declare variables
		int cardInt, suitInt;
		String card = " ";
		String suit = " ";

		//declare random class
		Random randomNumber = new Random();

		//generate card
		cardInt = randomNumber.nextInt(14);

		//generate suit
		suitInt = randomNumber.nextInt(5);

		//switch (card related)
		switch(cardInt)
		{
			case 0://ace

				card = "Ace";

				break;
			case 1://2

				card = "2";

				break;
			case 2://3

				card = "3";

				break;
			case 3://4

				card = "4";

				break;
			case 4://5

				card = "5";

				break;
			case 5://6

				card = "6";

				break;
			case 6://7

				card = "7";

				break;
			case 7://8

				card = "8";

				break;
			case 8://9

				card = "9";

				break;
			case 9://10

				card = "10";

				break;
			case 10://Jack

				card = "Jack";

				break;
			case 11://Quenn

				card = "Queen";

				break;
			case 12://King

				card = "King";

				break;
		}//switch

		//switch (suit related)
		switch(suitInt)
		{
			case 0://Hearts

				suit = "Hearts";

				break;
			case 1://Diamonds

				suit = "Diamonds";

				break;
			case 2://Clubs

				suit = "Clubs";

				break;
			case 3://Spades

				suit = "Spades";

				break;
		}//switch

		//output message
		System.out.printf("This program will deal a card from a deck of 52 cards.\nYour card is the %s of %s%n", card, suit);

	}//main bracket
}//class bracket