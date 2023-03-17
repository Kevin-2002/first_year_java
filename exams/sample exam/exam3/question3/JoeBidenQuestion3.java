/* Kevin McShane
   Student ID: G00401808
   26/02/2022
   Lab Exam 3 - Software Design and Program Development Year 1
*/

public class JoeBidenQuestion3
{
	public static void main(String[] args)
	{
		//create objects
		Computer obj1 = new Computer();
		Computer obj2 = new Computer();
		Computer obj3 = new Computer();

		//use setter methods for obj1
		obj1.setName("Dell optiplex");
		obj1.setRam(4);
		obj1.setDisc(1.0);

		//use setter methods for obj2
		obj2.setName("Dell Dimesion");
		obj2.setRam(8);
		obj2.setDisc(1.5);

		//use setter methods for obj3
		obj3.setName("Apple Mac");
		obj3.setRam(16);
		obj3.setDisc(1.25);

		/*get ratings
		 = obj1.Rating(obj1.getRam(), obj1.getDisc());
		 = obj2.Rating(obj2.getRam(), obj2.getDisc());
		 = obj3.Rating(obj3.getRam(), obj3.getDisc());*/

		//output
		System.out.printf("%s%n%d%n%.1f%n%s%n", obj1.getName(), obj1.getRam(), obj1.getDisc(), obj1.Rating(obj1.getRam(), obj1.getDisc()));
		System.out.printf("\n%s%n%d%n%.1f%n%s%n", obj2.getName(), obj2.getRam(), obj2.getDisc(), obj2.Rating(obj2.getRam(), obj2.getDisc()));
		System.out.printf("\n%s%n%d%n%.2f%n%s%n\n", obj3.getName(), obj3.getRam(), obj3.getDisc(), obj3.Rating(obj3.getRam(), obj3.getDisc()));
	}//main()
}//class bracket