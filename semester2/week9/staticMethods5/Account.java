public class Account
{
	//declare member var
	private String name;
	private String surName;
	private double balance;
	private static double total = 0;

	public Account(String f, String l, double deposit)
	{
		name = f;
		surName = l;
		balance = deposit;
		total = total + deposit;
	}

	public static double vault()
	{
		return total;
	}
}