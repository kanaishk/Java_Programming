import java.util.Scanner;

class Person
{
	// Instance Variables
	String name;
	int age;
	float sal;

	// Constructors
	Person()
	{
		name="NULL";
		age=0;
		sal=0.0f;
	}

	Person(String name, int age, float sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}

	// Instance Method
	public void setval(String name, int age, float sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}

	public void display()
	{
		System.out.println("Name:\t"+name);
		System.out.println("Age:\t"+age);
		System.out.println("Salary:\t"+sal);
	}
}

public class PersonDisp
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Name:\t");
		String name=new String(input.nextLine());
		System.out.print("Enter Age:\t");
		int age=input.nextInt();
		System.out.print("Enter Salary:\t");
		float sal=input.nextFloat();
		input.close();
		Person p=new Person();
		p.setval(name,age,sal);
		p.display();
	}
}