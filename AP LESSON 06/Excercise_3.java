import java.util.Scanner;
public class Excercise_3
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("Put in a String: ");
		String s = kb.nextLine();
		for(int i = s.length(); i >= 0; i--)
		{
			System.out.println(s.substring(0,i));
		}
	}
}