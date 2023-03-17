public class Variables6
{
	public static void main(String[] args)
	{
		byte b1 = -128;
		byte b2 = 127;
		short s1 = -32768;
		short s2 = 32767;
		int i1 = -2147483648;
		int i2 = 2147483647;
		long l1 = -9223372036854775808L;
		long l2 = 9223372036854775807L;
		System.out.println("Min byte value is: " + b1);
		System.out.println("Max byte value is: " + b2);
		System.out.println("Min Short value is: " + s1);
		System.out.println("Max Short value is: " + s2);
		System.out.println("Min Int value is: " + i1);
		System.out.println("Max Int value is: " + i2);
		System.out.println("Min Long value is: " + l1);
		System.out.println("Max Long value is: " + l2);
	}
}
