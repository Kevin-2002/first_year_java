public class RetailItem
{
	//member var
	private String description;
	private int unitsOnHand;
	private double price;

	public String setDescription(String known)
	{
		return description = known;
	}

	public int setUnitsOnHand(int known)
	{
		return unitsOnHand = known;
	}

	public double setPrice(double known)
	{
		return price = known;
	}

	public String getDescription()
	{
		return description;
	}

	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}

	public double getPrice()
	{
		return price;
	}
}