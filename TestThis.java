class Student
{
	// Instance Variable  
	int rollno;
	String name,course;
	float fee;

	// Constructors
	Student()
	{
		rollno=0;
		name="NULL";
		course="NULL";
		fee=0.0f;
	}
	Student(int rollno)
	{
		this();						// Reusing constructor
		this.rollno=rollno;
	}
	Student(int rollno,String name)
	{
		this(rollno); 				// Reusing constructor
		this.name=name;
	}
	Student(int rollno,String name,String course)
	{
		this(rollno,name); 			// Reusing constructor
		this.course=course;
	}
	Student(int rollno,String name,String course,float fee)
	{  
		this(rollno,name,course); 	// Reusing constructor
		this.fee=fee;
	} 
	
	// Methods
	void display()
	{
		System.out.println("RNo:\t"+rollno);
		System.out.println("Name:\t"+name);
		System.out.println("Course:\t"+course);
		System.out.println("Fees:\t"+fee);
	}  
}  

public class TestThis
{  
	public static void main(String args[])
	{  
		Student s1=new Student(1,"Kanaishk","Java");
		Student s2=new Student(2,"Aman","Java",6000f);
		s1.display();
		System.out.println("");
		s2.display();
	}
}  