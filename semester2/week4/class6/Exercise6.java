public class Exercise6
{
	public static void main(String[] args)
	{
		//create instances
		Car obj1 = new Car();

		//set yearModel
		obj1.setYearModel(2004);

		//set make
		obj1.setMake("Porsche");

		//set speed
		obj1.setSpeed(0);

		//output info 1(test get method)
		System.out.printf("Current status of the car:\n");
		System.out.printf("Year model: %d%n", obj1.getYearModel());
		System.out.printf("Make: %s%n", obj1.getMake());
		System.out.printf("Speed: %d%n", obj1.getSpeed());

		//call accelerate 5 times
		for(int i = 1; i <=5; i++)
		{
			obj1.Accelerate();
		}
		System.out.printf("\nAccelerating...\nNow the speed is %d%n", obj1.getSpeed());

		//call accelerate 5 times
		for(int i = 1; i <=5; i++)
		{
			obj1.Brake();
		}
		System.out.printf("\nBraking...\nNow the speed is %d%n", obj1.getSpeed());
	}
}