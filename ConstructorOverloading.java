/*
Modify experiment 2 to show constructor overloading.
*/

import java.util.*;

class ClassCircle{
    double abscissa = 0  , ordinate = 0 , radius = 1;
    public ClassCircle(double abscissa, double ordinate, double radius){
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        this.radius = radius;
        System.out.println("We got all three!");
    }
    public ClassCircle(double abscissa, double ordinate){
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        System.out.println("We got the Co-ordinates for the Centre of the Circle!");
    }
    public ClassCircle(double radius){
        this.radius = radius;
        System.out.println("We got the Radius of the Circle!");
    }
    public ClassCircle(){
        System.out.println("Nothing happened?");
    }

    public void getCentre(){
        System.out.println("The Co-ordinates of centre of the Circle are ("+abscissa+","+ordinate+")."  );
    }
    public void getRadius(){
        System.out.println("The Radius of the Circle is "+ radius  +" units");
    }
}

public class ConstructorOverloading{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the Co-ordinates for the Centre of Circle and Radius of Circle:" );
        double x = input.nextDouble(), y = input.nextDouble(), r = input.nextDouble();
        input.close();
        System.out.println("");
        ClassCircle  myCircle1 = new ClassCircle();
        System.out.println("For the 'Empty' Constructor we get: ");
        myCircle1.getCentre();
        myCircle1.getRadius();
        System.out.println("");
        ClassCircle  myCircle2 = new ClassCircle(r);
        System.out.println("For the one variable Constructor we get: ");
        myCircle2.getCentre();
        myCircle2.getRadius();
        System.out.println("");
        ClassCircle  myCircle3 = new ClassCircle(x,y);
        System.out.println("For the two variable Constructor we get: ");
        myCircle3.getCentre();
        myCircle3.getRadius();
        System.out.println("");
        ClassCircle  myCircle4 = new ClassCircle(x,y);
        System.out.println("For the three(all) variable Constructor we get: ");
        myCircle4.getCentre();
        myCircle4.getRadius();
	}
}