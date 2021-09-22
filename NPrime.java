import java.util.Scanner;

public class NPrime
{
	private static boolean isPrime(int n)
	{
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to which the prime is to be printed: ");
		int n=input.nextInt();
		if(n<2)
		{
			System.out.println("Invalid Input. Should be greater than 1");
			System.exit(1);
		}
		for(int i=2; i<n; i++)
		{
			if(isPrime(i)==true)
			{
				System.out.print(i+"\t");
			}
		}
	}
}