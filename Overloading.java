class MethodOverload
{
    public static void area(float x)
    {
        System.out.println("The area of the square is "+Math.pow(x,2)+" sq units");
    }
    public static void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+(x*y)+" sq units");
    }
    public static void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}

public class Overloading
{
    public static void main(String args[]) 
	{
	   MethodOverload ob = new MethodOverload();
	   ob.area(2);
	   ob.area(21,14);
	   ob.area(3.5);
    }
}