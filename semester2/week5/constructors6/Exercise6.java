public class Exercise6
{
	public static void main(String[] args)
	{
		//declare objects
		Car car1 = new Car();
		Car car2 = new Car("Toyota", "Corolla", 1.4, 2019, "Red");
		Car car3 = new Car("Skoda", "Octavia", 1.9, 2019, "Gold");
		Car car4 = new Car("Toyota", "Avnsis", "Green");
		Car car5 = new Car();

		//use setters for car5
		car5.setMake("Nissan");
		car5.setModel("Qashqai");
		car5.setMake("Black");
		car5.setEngine(1.6);
		car5.setYear(2012);

		//output car 1
		System.out.println("------- CAR 1 -------");
		System.out.printf("Make: %s%n", car1.getMake());
		System.out.printf("Model: %s%n", car1.getModel());
		System.out.printf("Colour: %s%n", car1.getColour());
		System.out.printf("Engine size: %.1f%n", car1.getEngine());
		System.out.printf("Year: %d%n\n", car1.getYear());

		//output car 2
		System.out.println("------- CAR 2 -------");
		System.out.printf("Make: %s%n", car2.getMake());
		System.out.printf("Model: %s%n", car2.getModel());
		System.out.printf("Colour: %s%n", car2.getColour());
		System.out.printf("Engine size: %.1f%n", car2.getEngine());
		System.out.printf("Year: %d%n\n", car2.getYear());

		//output car 3
		System.out.println("------- CAR 3 -------");
		System.out.printf("Make: %s%n", car3.getMake());
		System.out.printf("Model: %s%n", car3.getModel());
		System.out.printf("Colour: %s%n", car3.getColour());
		System.out.printf("Engine size: %.1f%n", car3.getEngine());
		System.out.printf("Year: %d%n\n", car3.getYear());

		//output car 4
		System.out.println("------- CAR 4 -------");
		System.out.printf("Make: %s%n", car4.getMake());
		System.out.printf("Model: %s%n", car4.getModel());
		System.out.printf("Colour: %s%n", car4.getColour());
		System.out.printf("Engine size: %.1f%n", car4.getEngine());
		System.out.printf("Year: %d%n\n", car4.getYear());

		//output car 5
		System.out.println("------- CAR 5 -------");
		System.out.printf("Make: %s%n", car5.getMake());
		System.out.printf("Model: %s%n", car5.getModel());
		System.out.printf("Colour: %s%n", car5.getColour());
		System.out.printf("Engine size: %.1f%n", car5.getEngine());
		System.out.printf("Year: %d%n\n", car5.getYear());

	}
}