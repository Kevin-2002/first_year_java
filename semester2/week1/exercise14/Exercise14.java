import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Exercise14
{
	public static void main(String[] args) throws IOException
	{
		//declare variables
		double length, width, radius, area1, area2, circumference;
		String fileName;

		//specify file to use
		File myFile = new File("rectangle.txt");

		//Use scanner to read from the file
		Scanner inputFile = new Scanner(myFile);

		//read from file
		//length
		length = inputFile.nextDouble();
		//width
		width = inputFile.nextDouble();
		//radius
		radius = inputFile.nextDouble();

		//calculations
		//rectangle
		area1 = length*width;
		//circle
		area2 = 3.14159265359*(radius)*(radius);
		circumference = 3.14159265359*(radius)*2;

		//text
		System.out.printf("Rectangle\nLength = %.2f , width = %.2f , area = %.2f%n\nCircle:\nRadius = %.2f, area = %.2f, circumference = %.2f%n\n", length, width, area1, radius, area2, circumference);

		//file close
		inputFile.close();
	}
}