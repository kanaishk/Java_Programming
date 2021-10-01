import java.util.Scanner;

public class BubbleSort
{
	private static void disparr(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	private static void bubblesort(int[] arr, int n)
	{
		int temp = 0;  
        for(int i=0; i<n; i++)
        {  
        	for(int j=1; j<(n-i); j++)
        	{  
            	if(arr[j-1]>arr[j])
            	{
                	temp = arr[j-1];  
                  	arr[j-1] = arr[j];  
                   	arr[j] = temp;  
               	}      
            }  
      	}  
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter element of the array:");
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Array is:");
		disparr(arr,n);
		bubblesort(arr,n);
		System.out.println("\nSorted Array is:");
		disparr(arr,n);
	}
}