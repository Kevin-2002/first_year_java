public class Exercise7
{
	public static void main(String[] args)
	{
		//declare objects
		Sandwich s1 = new Sandwich("Wheat", "Tuna", 4.99);
		Sandwich s2 = new Sandwich("Brown", "Tuna", 2.99);
		Sandwich s3 = new Sandwich("Cheese");
		Sandwich s4 = new Sandwich(3.99);
		Sandwich s5 = new Sandwich();

		//output s1
		System.out.printf("Sandwich 1: you have ordered a %s sandwhich on %s bread, and the price is %.2f%n", s1.getMain(), s1.getBread(), s1.getPrice());

		//output s2
		System.out.printf("Sandwich 2: you have ordered a %s sandwhich on %s bread, and the price is %.2f%n", s2.getMain(), s2.getBread(), s2.getPrice());

		//output s3
		System.out.printf("Sandwich 3: you have ordered a %s sandwhich on %s bread, and the price is %.2f%n", s3.getMain(), s3.getBread(), s3.getPrice());

		//output s4
		System.out.printf("Sandwich 4: you have ordered a %s sandwhich on %s bread, and the price is %.2f%n", s4.getMain(), s4.getBread(), s4.getPrice());

		//output s5
		System.out.printf("Sandwich 5: you have ordered a %s sandwhich on %s bread, and the price is %.2f%n", s5.getMain(), s5.getBread(), s5.getPrice());
	}
}