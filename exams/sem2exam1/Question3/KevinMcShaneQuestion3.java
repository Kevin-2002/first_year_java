/* Kevin McShane
   Student ID: G00401808
   01/03/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/
public class KevinMcShaneQuestion3
{
	public static void main(String[] args)
	{
		//create objects
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();

		//use setter methods on b1
		b1.setName("Harry Potter");
		b1.setAuthor("J.K. Rowling");
		b1.setPageCount(250);
		b1.setPrice(10.99);

		//use setter methods on b2
		b2.setName("The Catcher in the Rye");
		b2.setAuthor("J.D. Salinger");
		b2.setPageCount(192);
		b2.setPrice(8.99);

		//use setter methods on b3
		b3.setName("Wuthering Heights");
		b3.setAuthor("Emily Bronte");
		b3.setPageCount(422);
		b3.setPrice(14.99);

		//output
		System.out.printf("%s%n%s%n%.2f%n%d%n\n", b1.getName(), b1.getAuthor(), b1.getPrice(), b1.getPageCount());
		System.out.printf("%s%n%s%n%.2f%n%d%n\n", b2.getName(), b2.getAuthor(), b2.getPrice(), b2.getPageCount());
		System.out.printf("%s%n%s%n%.2f%n%d%n\n", b3.getName(), b3.getAuthor(), b3.getPrice(), b3.getPageCount());
		System.out.printf("Reduced price for quantity of 1 %s book is %.2f%n", b1.getName(), b1.getReduction(1));
		System.out.printf("Reduced price for quantity of 4 %s book is %.2f%n", b1.getName(), b1.getReduction(4));
	}//main()
}//class bracket