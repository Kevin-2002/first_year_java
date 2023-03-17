public class Exercise5
{
	public static void main(String[] args)
	{
		Account a = new Account("Grace", "Hopper", 100);
		Account b = new Account("Bill", "Gates" , 300);
		Account c = new Account("Ada", "Lovelace", 400);
		Account d = new Account("James", "Gosling", 230);

		System.out.printf("The vault currently has %.2f%n", Account.vault());
	}
}