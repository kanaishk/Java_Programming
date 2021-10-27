import java.util.Scanner;

interface input
{
	void input();
}

interface printable 
{
	void print();
}

interface printable_multi extends printable
{
	void printmul(int n);
}

class SubInterface4
{
	public String str;
}

class Interface4 extends SubInterface4 implements input, printable_multi
{
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

	public void printmul(int n)
	{
		for(int i=0; i<n; i++)
		{
			print();
		}
	}

	public static void main(String[] args)
	{
		Interface4 obj = new Interface4();
		obj.input();
		obj.printmul(5);
	}
}