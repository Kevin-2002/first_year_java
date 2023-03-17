public class Exercise4
{
	public static void main(String[] args)
	{
		//create an instance of the circle class
		Bike Trek = new Bike("Red", 599.95);
		Bike Focus = new Bike("Green", 499.99);
		Bike Felt = new Bike("Blue", 399.95);
		Bike Raleigh = new Bike("Matt Black", 950.95);


		//call the getName()
		System.out.printf("Trek bike costs %.2f and the colour is %s%n", Trek.getPrice(), Trek.getColour());
		System.out.printf("Focus bike costs %.2f and the colour is %s%n", Focus.getPrice(), Focus.getColour());
		System.out.printf("Felt bike costs %.2f and the colour is %s%n", Felt.getPrice(), Felt.getColour());
		System.out.printf("Raleigh bike costs %.2f and the colour is %s%n", Raleigh.getPrice(), Raleigh.getColour());
	}
}