public class Square
{
	//member var
	private int length;

	//member method
	public void setLength(int len)
	{
		length = len;
	}

	public int getLength()
	{
		return length;
	}

	public int getArea()
	{
		return length * length;
	}
}