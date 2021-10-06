import java.util.Scanner;

class Circle
{
	// Instance Variables
	int centx;
	int centy;
	float r;

	// Default Constructor and Parmeterized Constructor
	Circle()
	{
		centx=0;
		centy=0;
		r=0.0f;
		System.out.println("Initialized by default constructor");
	}

	Circle(int x, int y, float rad)
	{
		centx=x;
		centy=y;
		r=rad;
		System.out.println("Initialized by parameterized constructor");
	}


	// Methods
	public void setval()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Center X: ");
		centx=input.nextInt();
		System.out.print("Enter Center Y: ");
		centy=input.nextInt();
		System.out.print("Enter Radius: ");
		r=input.nextFloat();
	}
	public void display()
	{
		System.out.println("Center is ("+centx+", "+centy+")");
		System.out.println("Radius is "+r);
	}
}

public class CircleClass
{
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.display();
		Circle c2=new Circle(3,4,6.5f);
		c2.display();
		c1.setval();
		c1.display();
	}
}