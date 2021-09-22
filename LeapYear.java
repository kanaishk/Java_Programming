import java.util.Scanner;

public class LeapYear
{
	private static boolean isLeap(int n)
	{
		if(n%400==0)
			return true;
		if(n%100==0)
			return false;
		if(n%4==0)
			return true;

		return false;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year=input.nextInt();
		if(isLeap(year)==true)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}
}