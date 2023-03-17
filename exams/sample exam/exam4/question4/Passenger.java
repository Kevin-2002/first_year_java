public class Passenger
{
	//declare member variables
	private String first;
	private String last;
	private int YOB;
	private boolean type;
	private double price;
	private static int personCount = 0;

	//constructors
	public Passenger(String first, String last, int YOB, boolean type, double price)
	{
		setPerson(first, last, YOB, type, price);
	}

	//more methods
	public void setPerson(String first, String last, int YOB, boolean type, double price);
	{
		setFirst(first);
		setLast(last);
		setYOB(YOB);
		setType(type);
		setPrice(price);
	}

	public String setFirst(String first);
	{
		return this.first = first;
	}

	public String setLast(String last);
	{
		return this.last = last;
	}

	public int setYOB(int YOB);
	{
		return this.YOB = YOB;
	}

	public boolean setType(boolean type);
	{
		return this.type = type;
	}

	public double setPrice(double price);
	{
		return this.price = price;
	}

}//class bracket