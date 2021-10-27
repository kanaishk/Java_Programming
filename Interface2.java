import java.util.Scanner;

interface input
{
	void input();
}

interface printable 
{
	void print();
}

class Interface2 implements input, printable
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
		Interface2 obj = new Interface2();
		obj.input();
		obj.print();
	}
}