public class Store
{
	//member var
	private String name;
	private double price;

	public String setName(String known)
	{
		return name = known;
	}

	public double setPrice(double known)
	{
		return price = known;
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