class Calc
{
	// Static Variables
	static int a;
	static int a3;

	// Constructor
	Calc()
	{
		a=0;
		a3=0;
	}

	Calc(int a)
	{
		this.a=a;
		a3=cube();
	}

	// Static Method
	static int cube()
	{
		return (a*a*a);
	}

	// Instance Method
	public void display()
	{
		System.out.println("Value is: "+a);
		System.out.println("It's cube is: "+a3);
	}
}

public class StaticMethod
{
	public static void main(String[] args)
	{
		Calc c=new Calc(8);
		c.display();
	}
}