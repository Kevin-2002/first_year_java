/* Kevin McShane
   Student ID: G00401808
   26/04/2022
   Lab Exam 4 - Software Design and Program Development Year 1
*/
public class KevinMcShaneQuestion4
{
	public static void main(String[] args)
	{
		Technology customer1 = new Technology("Dell", "Optiplex", 'C', 599.99);
		Technology customer2 = new Technology("Apple", "iPhone", 'P', 999.99);
		Technology customer3 = new Technology("Dell", "Optiplex", 'C', 599.99);
		Technology customer4 = new Technology("Samsung", "S20", 'P', 299.99);
		Technology customer5 = new Technology("Samsung", "A10", 'P', 199.99);
		Technology customer6 = new Technology("Bose", "ZA1", 'S', 50.00);
		Technology customer7 = new Technology("Nokia", "3310", 'C', 599.99);
		Technology customer8 = new Technology("HP", "Deskpro", 'C', 799.99);
		Technology customer9 = new Technology("Lenovo", "ThinkPad", 'C', 799.99);
		Technology customer10 = new Technology("SanDisk", "USB Pen Drive", 'O', 9.99);

		//output
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		System.out.println(customer3.toString());
		System.out.println(customer4.toString());
		System.out.println(customer5.toString());
		System.out.println(customer6.toString());
		System.out.println(customer7.toString());
		System.out.println(customer8.toString());
		System.out.println(customer9.toString());
		System.out.println(customer10.toString());
		System.out.println(customer1.report());

	}//main()
}//class bracket