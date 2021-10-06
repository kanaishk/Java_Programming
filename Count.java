class Variable
{
	// Static Variable
	static int count=0;

	// Instance Variable
	int a;

	// Constructor
	Variable()
	{
		count++;
	}

	Variable(int b)
	{
		this();
		a=b;
	}

	// Methods
	public void display()
	{
		System.out.println("Current Count: "+count);
		System.out.println("This object's value "+a);
	}
}

public class Count
{
	public static void main(String[] args)
	{
		Variable v1=new Variable(5);
		v1.display();
		Variable v2=new Variable(10);
		v1.display();
		v2.display();
	}
}