import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Put in a number: ");
		num1 = kb.nextDouble();
		
		System.out.println("Put in another number: ");
		num2 = kb.nextDouble();
		
		System.out.println("Put in another number: ");
		num3 = kb.nextDouble();
		
		average();
		
		print();
	}
	
	public static void average()
	{
		avg = (num1 + num2 + num3)/3;
	}
	
	public static void print()
	{
		System.out.printf("The average of " + num1 + " " + num2 + " and " + num3 + " is " + "%.5f" + ".",avg);
	}
}