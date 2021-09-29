public class ArrSumSym
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
	private static int arrsumsym(int[] arr, int n)
	{
		int suml=arrsum(arr,n);
		int sumr=0;
		for(int i=0; i<n; i++)
		{
			sumr+=arr[i];
			suml-=arr[i];
			if(sumr==suml)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr1={1,2,7,3,4,3};
		int[] arr2={3,4,5,2,3,8};
		int res1=arrsumsym(arr1,6);
		int res2=arrsumsym(arr2,6);
		if(res1==-1)
		{
			System.out.println("No such index in first array");
		}
		else
		{
			System.out.println("First Array: At "+res1+" index");
		}
		if(res2==-1)
		{
			System.out.println("No such index in second array");
		}
		else
		{
			System.out.println("Second Array: At "+res2+" index");
		}
	}
}