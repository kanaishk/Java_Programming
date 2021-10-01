import java.util.Random;

public class ArrIni
{
	private static int arrsum(int[] arr, int n)
	{
		int sum=0;
		for(int i=0; i<n; i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int n=4;
		int[] arr=new int[n];
		Random random= new Random();
		for(int i=0; i<n; i++)
		{
			arr[i]= random.nextInt(101);
		}
		int sum=arrsum(arr,n);
		int avg=sum/n;
		System.out.println("Array:");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\nAverage: "+avg);
	}
}