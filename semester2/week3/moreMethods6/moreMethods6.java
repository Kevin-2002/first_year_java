import java.util.Scanner;
import javax.swing.JOptionPane;

public class moreMethods6
{
	public static void main(String[] args)
	{
		//declare var
		int length, width, area;

		//call length
		length = getLength();

		//call length
		width = getWidth();

		//call length
		area = getArea(length, width);

		//call display
		displayData(length, width, area);
	}

	public static int getLength()
	{
		//declare
		String str;
		int length;

		//prompt length
		str = JOptionPane.showInputDialog("Enter the rectangle's length", "10");

		//parse
		length = Integer.parseInt(str);

		//return length
		return length;
	}

	public static int getWidth()
	{
		//declare
		String str;
		int width;

		//prompt length
		str = JOptionPane.showInputDialog("Enter the rectangle's length", "5");

		//parse
		width = Integer.parseInt(str);

		//return length
		return width;
	}

	public static int getArea(int length, int width)
	{
		//declare
		int area;

		//calculate
		area = length*width;

		//return
		return area;
	}

	public static void displayData(int length, int width, int area)
	{
		JOptionPane.showMessageDialog(null, "Length = " + length + "\nWidth = " + width + "\narea = " + area);
	}
}