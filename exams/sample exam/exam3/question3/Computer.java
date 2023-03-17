public class Computer
{
	//member var
	private String name;
	private int Ram;
	private double disc;

	//constructors

	//gets and sets
	public String setName(String known)
	{
		return name = known;
	}

	public int setRam(int known)
	{
		return Ram = known;
	}

	public double setDisc(double known)
	{
		return disc = known;
	}

	public String getName()
	{
		return name;
	}

	public int getRam()
	{
		return Ram;
	}

	public double getDisc()
	{
		return disc;
	}

	//other methods
	public static char Rating(int Ram, double disc)
	{
		//declare rating var
		char rating = ' ';

		if(Ram >= 8 && disc >= 1)
		{
			rating = 'A';
		}
		else
		{
			rating = 'B';
		}

		//return rating
		return rating;
	}

}