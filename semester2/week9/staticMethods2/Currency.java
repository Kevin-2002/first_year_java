public class Currency
{
	public static double eurosToDollar(double euro)
	{
		return 1.1914447 * euro;
	}

	public static double dollarsToEuro(double dollar)
	{
		return dollar / 1.1914447;
	}

	public static double eurosToSterling(double euro)
	{
		return 0.8660 * euro;
	}

	public static double sterlingToEuro(double sterling)
	{
		return sterling / 0.8660;
	}

	public static double SterlingToDollar(double sterling)
	{
		return sterling / 0.7274;
	}

	public static double dollarToSterling(double dollar)
	{
		return 0.7274 * dollar;
	}
}