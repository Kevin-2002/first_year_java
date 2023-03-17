public class Exercise2
{
	public static void main(String[] args)
	{
		System.out.printf("100 Euro to Dollar: %.2f%n", Currency.eurosToDollar(100));
		System.out.printf("100 Dollar to Euro: %.2f%n", Currency.dollarsToEuro(100));
		System.out.printf("100 Euro to Sterling: %.2f%n", Currency.eurosToSterling(100));
		System.out.printf("100 Sterling to Euro : %.2f%n", Currency.sterlingToEuro(100));
		System.out.printf("100 Sterling to Dollar : %.2f%n", Currency.SterlingToDollar(100));
		System.out.printf("100 Dollar to Sterling : %.2f%n", Currency.dollarToSterling(100));
	}
}