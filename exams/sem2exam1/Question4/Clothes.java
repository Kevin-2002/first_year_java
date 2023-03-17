public class Clothes
{
	//member var
	private String garment, brand;
	private float price;
	private boolean available;
	private char stock;

	//constructors
	public Clothes()
	{
		garment = "No Detail Provided";
		brand = "No Detail Provided";
		price = 100.00f;
	}

	public Clothes(String garment)
	{
		this.garment = garment;
	}

	public Clothes(float price, boolean available)
	{
		this.price = price;
		this.available = available;
	}

	public Clothes(String garment, String brand, float price, char stock)
	{
		this.garment = garment;
		this.brand = brand;
		this.price = price;

		//if
		if(stock == 'y' || stock == 'Y')
		{
			available = true;
		}
		else
		{
			available = false;
		}
	}


	//gets and sets
	public String setGarment(String garment)
	{
		return this.garment = garment;
	}

	public String setBrand(String brand)
	{
		return this.brand = brand;
	}

	public float setPrice(float price)
	{
		return this.price = price;
	}

	public boolean setAvailable(boolean available)
	{
		return this.available = available;
	}

	public char setStock(char stock)
	{
		return this.stock = stock;
	}

	public String getGarment()
	{
		return garment;
	}

	public String getBrand()
	{
		return brand;
	}

	public float getPrice()
	{
		return price;
	}

	public boolean getAvailable()
	{
		return available;
	}

	public char getStock()
	{
		return stock;
	}

	//additional methods

}//class