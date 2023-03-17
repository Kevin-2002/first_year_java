public class Bike
{
	//member var
	private double price;
	private String colour;

	//constructer
	public Bike(String colour, double price)
	{
		this.colour = colour;
		this.price = price;
	}

	//gets and sets
	public String getColour()
	{
		return colour;
	}

	public double getPrice()
	{
		return price;
	}

	//any other methods
}