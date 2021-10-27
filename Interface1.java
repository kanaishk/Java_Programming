import java.util.Scanner;

interface printable 
{
	void print(String str);
}

class Interface1 implements printable
{
	public void print(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=input.nextLine();
		Interface1 obj = new Interface1();
		obj.print(str);
	}
}