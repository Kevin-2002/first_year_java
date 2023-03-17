public class Car
{
	//member var
	private int year;
	private double engine;
	private String make, model, colour;

	//constructers
	public Car()
	{
		year = 2022;
	}
	public Car(String make, String model, String colour)
	{
		this.make = make;
		this.model = model;
		this.colour = colour;
	}

	public Car(String make, String model, double engine, int year, String colour)
	{
		this.make = make;
		this.model = model;
		this.engine = engine;
		this.year = year;
		this.colour = colour;
	}

	//gets and sets
	public String setMake(String make)
	{
		return this.make = make;
	}

	public String setModel(String model)
	{
		return this.model = model;
	}

	public String setColour(String colour)
	{
		return this.colour = colour;
	}

	public int setYear(int year)
	{
		return this.year = year;
	}

	public double setEngine(double engine)
	{
		return this.engine = engine;
	}

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public String getColour()
	{
		return colour;
	}

	public double getEngine()
	{
		return engine;
	}

	public int getYear()
	{
		return year;
	}

	//any other methods
}