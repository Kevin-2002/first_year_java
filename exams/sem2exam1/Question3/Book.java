public class Book
{
	//member var
	private String name, author;
	private int pageCount;
	private double price;

	//constructors

	//gets and sets
	public String setName(String name)
	{
		return this.name = name;
	}

	public String setAuthor(String author)
	{
		return this.author = author;
	}

	public int setPageCount(int pageCount)
	{
		return this.pageCount = pageCount;
	}

	public double setPrice(double price)
	{
		return this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public String getAuthor()
	{
		return author;
	}

	public int getPageCount()
	{
		return pageCount;
	}

	public double getPrice()
	{
		return price;
	}

	//additional methods
	public double getReduction(int quantity)
	{
		//declare variables
		double discountPrice, total;

		//calculate discount
		discountPrice = price*0.90;

		//multiply by quantity to get total
		total = discountPrice*quantity;

		//return total
		return total;
	}
}//class