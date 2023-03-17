public class Phones
{
	//member var
	private String name;
	private double price;
	private int stock;

	public String setName(String known)
	{
		return name = known;
	}

	public double setPrice(double known)
	{
		return price = known;
	}

	public int setStock(int known)
	{
		return stock = known;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}
}