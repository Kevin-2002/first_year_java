public class Sandwich
{
	//member var
	private double price;
	private String bread, main;

	//constructers
	public Sandwich()
	{
		 main = "cheese";
		 bread = "Sliced white";
		 price = 3.50;
	}

	public Sandwich(double price)
	{
		this.price = price;
	}

	public Sandwich(String main)
	{
		this.main = main;
	}

	public Sandwich(String bread, String main, double price)
	{
		this.price = price;
		this.bread = bread;
		this.main = main;
	}

	//gets and sets
	public String getMain()
	{
		return main;
	}

	public String getBread()
	{
		return bread;
	}

	public double getPrice()
	{
		return price;
	}
	//any other methods
}