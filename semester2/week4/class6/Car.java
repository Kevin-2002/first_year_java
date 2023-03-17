public class Car
{
	//member var
	private String make;
	private int speed, yearModel;

	public String setMake(String known)
	{
		return make = known;
	}

	public int setSpeed(int known)
	{
		return speed = known;
	}

	public int setYearModel(int known)
	{
		return yearModel = known;
	}

	public String getMake()
	{
		return make;
	}

	public int getSpeed()
	{
		return speed;
	}

	public int getYearModel()
	{
		return yearModel;
	}

	public void Accelerate()
	{
		speed = speed + 5;
	}

	public void Brake()
	{
		speed = speed - 5;
	}
}