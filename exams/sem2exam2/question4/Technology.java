public class Technology
{
	//declare private member variables
	private String brand, model;
	private char type;
	private double cost;

	//declare member variables
	private static int phones = 0;
	private static int computers = 0;
	private static int speakers = 0;
	private static int otherItems = 0;
	private static int total = 0;

	//constructor
	public Technology(String brand, String model, char type, double cost )
	{
		setBrand();
		setModel();
		setType();
		setCost();
		toString();

		//increment static variables
		if(type == 'P')
		{
			phones++;
		}

		else if(type == 'C')
		{
			computers++;
		}

		else if(type == 'S')
		{
			speakers++;
		}

		else if(type == 'O')
		{
			otherItems++;
		}
		total++;
	}

	//gets and sets
	//sets
	public String setBrand()
	{
		this.brand = brand;
		return brand;
	}

	public String setModel()
	{
		this.model = model;
		return model;
	}

	public char setType()
	{
		this.type = type;
		return type;
	}

	public double setCost()
	{
		this.cost = cost;
		return cost;
	}

	//gets
	public String getBrand()
	{
		return brand;
	}

	public String getModel()
	{
		return model;
	}

	public char getType()
	{
		return type;
	}

	public double getCost()
	{
		return cost;
	}

	//other methods
	public String toString()
	{
		String output;
		output = "{ brand='" + brand +  "', model='" + model + "', type'" + type + "', cost='" + cost + "'}";
		return output;
	}

	public static String report()
	{
		String output;
		output = "----------------------------------------------------\n" + "Number of Phones: " + phones + "\nNumber of Computers: " + computers + "\nNumber of Speakers: " + speakers + "\nNumeber of Other Items: " + otherItems + "\nTotal Items: " + total;
		return output;
	}
}
