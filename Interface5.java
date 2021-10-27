import java.util.Scanner;

interface printable 
{
	void print();
}

class Interface5 implements printable
{
	String str;

	public void input()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the string: ");
		str=input.nextLine();
		input.close();
	}

	public void print()
	{
		System.out.println(this.str);
	}

	public static void main(String[] args)
	{
		Interface5 obj = new Interface5();
		obj.input();
		obj.print();
	}
}