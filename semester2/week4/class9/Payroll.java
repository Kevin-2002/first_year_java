public class Payroll
{
	//member var
	private String name;
	private int idNumber;
	private double pay, hours;

	public String setName(String known)
	{
		return name = known;
	}

	public double setHours(double known)
	{
		return hours = known;
	}

	public int setIdNumber(int known)
	{
		return idNumber = known;
	}

	public double setPay(double known)
	{
		return pay = known;
	}

	public String getName()
	{
		return name;
	}

	public int getIdNumber()
	{
		return idNumber;
	}

	public double getHours()
	{
		return hours;
	}

	public double getPay()
	{
		return pay;
	}
}