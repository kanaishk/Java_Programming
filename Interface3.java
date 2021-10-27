import java.util.Scanner;

interface input
{
	void input();
}

interface printable 
{
	void print();
}

class SubInterface3
{
	public String str;
}

class Interface3 extends SubInterface3 implements input, printable
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

	public static void main(String[] args)
	{
		Interface3 obj = new Interface3();
		obj.input();
		obj.print();
	}
}