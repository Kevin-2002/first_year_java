import java.util.Scanner;

public class Array11
{
	public static void main(String[] args)
	{
		//declare keyboard and variables
		Scanner keyboard = new Scanner(System.in);
		String name;
		boolean found = false;

		//prompt user to enter how many values are in the array
		System.out.print("Check if name is on list?: ");
		name = keyboard.nextLine();

		//declare an array
		String[] names = {"Emily", "Madison", "Emma", "Olivia", "Hannah", "Abigail", "Isabella", "Samantha", "Elizabeth", "Ashley", "Alexis", "Sarah", "Sophia", "Alyssa", "Grace", "Ava", "Taylor", "Brianna", "Lauren", "Chloe", "Natalie", "Kayla", "Jessica", "Anna", "Victoria", "Mia", "Hailey", "Sydney", "Jasmine", "Julia", "Morgan", "Destiny", "Rachel", "Ella", "Kaitlyn", "Megan", "Katherine", "Savannah", "Jennifer", "Alexandra", "Allison", "Haley", "Maria", "Kaylee", "Lily", "Makayla", "Brooke", "Mackenzie", "Nicole", "Addison", "Stephanie", "Lillian", "Andrea", "Zoe", "Faith", "Kimberly", "Madeline", "Alexa", "Katelyn", "Gabriella", "Gabrielle", "Trinity", "Amanda", "Kylie", "Mary", "Paige", "Riley", "Jenna", "Leah", "Sara", "Rebecca", "Michelle", "Sofia", "Vanessa", "Jordan", "Angelina", "Caroline", "Avery", "Audrey", "Evelyn", "Maya", "Claire", "Autumn", "Jocelyn", "Ariana", "Nevaeh", "Arianna", "Jada", "Bailey", "Brooklyn", "Aaliyah", "Amber", "Isabel", "Danielle", "Mariah", "Melanie", "Sierra", "Erin", "Molly", "Amelia", "Isabelle", "Madelyn", "Melissa", "Jacqueline", "Marissa", "Shelby", "Angela", "Leslie", "Katie", "Jade", "Catherine", "Diana", "Aubrey", "Mya", "Amy", "Briana", "Sophie", "Gabriela", "Breanna", "Gianna", "Kennedy", "Gracie", "Peyton", "Adriana", "Christina", "Courtney", "Daniela", "Kathryn", "Lydia", "Valeria", "Layla", "Alexandria", "Natalia", "Angel", "Laura", "Charlotte", "Margaret", "Cheyenne", "Mikayla", "Miranda", "Naomi", "Kelsey", "Payton", "Ana", "Alicia", "Jillian", "Daisy", "Mckenzie", "Ashlyn", "Caitlin", "Sabrina", "Summer", "Ruby", "Rylee", "Valerie", "Skylar", "Lindsey", "Kelly", "Genesis", "Zoey", "Eva", "Sadie", "Alexia", "Cassidy", "Kylee", "Kendall", "Jordyn", "Kate", "Jayla", "Karen", "Tiffany", "Cassandra", "Juliana", "Reagan", "Caitlyn", "Giselle", "Serenity", "Alondra", "Lucy", "Kiara", "Bianca", "Crystal", "Erica", "Angelica", "Hope", "Chelsea", "Alana", "Liliana", "Brittany", "Camila", "Makenzie", "Veronica", "Lilly", "Abby", "Jazmin", "Adrianna", "Karina", "Delaney", "Ellie", "Jasmin"};
		String[] names2 = {"Jacob", "Michael", "Joshua", "Matthew", "Daniel", "Christopher", "Andrew", "Ethan", "Joseph", "William", "Anthony", "David", "Alexander", "Nicholas", "Ryan", "Tyler", "James", "John", "Jonathan", "Noah", "Brandon", "Christian", "Dylan", "Samuel", "Benjamin", "Zachary", "Nathan", "Logan", "Justin", "Gabriel", "Jose", "Austin", "Kevin", "Elijah", "Caleb", "Robert", "Thomas", "Jordan", "Cameron", "Jack", "Hunter", "Jackson", "Angel", "Isaiah", "Evan", "Isaac", "Mason", "Luke", "Jason", "Gavin", "Jayden", "Aaron", "Connor", "Aiden", "Aidan", "Kyle", "Juan", "Charles", "Luis", "Adam", "Lucas", "Brian", "Eric", "Adrian", "Nathaniel", "Sean", "Alex", "Carlos", "Bryan", "Ian", "Owen", "Jesus", "Landon", "Julian", "Chase", "Cole", "Diego", "Jeremiah", "Steven", "Sebastian", "Xavier", "Timothy", "Carter", "Wyatt", "Brayden", "Blake", "Hayden", "Devin", "Cody", "Richard", "Seth", "Dominic", "Jaden", "Antonio", "Miguel", "Liam", "Patrick", "Carson", "Jesse", "Tristan", "Alejandro", "Henry", "Victor", "Trevor", "Bryce", "Jake", "Riley", "Colin", "Jared", "Jeremy", "Mark", "Caden", "Garrett", "Parker", "Marcus", "Vincent", "Kaleb", "Kaden", "Brady", "Colton", "Kenneth", "Joel", "Oscar", "Josiah", "Jorge", "Cooper", "Ashton", "Tanner", "Eduardo", "Paul", "Edward", "Ivan", "Preston", "Maxwell", "Alan", "Levi", "Stephen", "Grant", "Nicolas", "Omar", "Dakota", "Alexis", "George", "Collin", "Eli", "Spencer", "Gage", "Max", "Cristian", "Ricardo", "Derek", "Micah", "Brody", "Francisco", "Nolan", "Ayden", "Dalton", "Shane", "Peter", "Damian", "Jeffrey", "Brendan", "Travis", "Fernando", "Peyton", "Conner", "Andres", "Javier", "Giovanni", "Shawn", "Braden", "Jonah", "Cesar", "Bradley", "Emmanuel", "Manuel", "Edgar", "Erik", "Mario", "Edwin", "Johnathan", "Devon", "Erick", "Wesley", "Oliver", "Trenton", "Hector", "Malachi", "Jalen", "Raymond", "Gregory", "Abraham", "Elias", "Leonardo", "Sergio", "Donovan", "Colby", "Marco", "Bryson", "Martin"};

		//for loop to search for name
		for(int i = 0; i < names.length; i++)
		{
			if(name.equalsIgnoreCase(names[i]) || name.equalsIgnoreCase(names2[i]))
			{
				found = true;
				System.out.println(name + " is number " + (1+i) + "on the list");
			}
			else
			{
				found = false;
				System.out.println(name + "is not in the array");
			}//else
		}//for
	}//main
}