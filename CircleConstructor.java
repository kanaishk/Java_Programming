/*
2.Modify experiment 1 to have a constructor in class circle to
initialize its variables.
*/

import java.util.*;

class Circle{
    double abscissa = 0  , ordinate = 0 , radius = 1;
    public Circle(double abscissa, double ordinate, double radius){
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        this.radius = radius;
    }
    public void getCentre(){
        System.out.println("The Co-ordinates of centre of the Circle are ("+abscissa+","+ordinate+")."  );
    }
    public void getRadius(){
        System.out.println("The Radius of the Circle is "+ radius  +" units");
    }
}

public class CircleConstructor{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the Co-ordinates for the Centre of Circle and Radius of Circle:" );
        Circle MyCircle = new Circle(input.nextDouble(),input.nextDouble(),input.nextDouble());
        input.close();
        MyCircle.getCentre();
        MyCircle.getRadius();
	}
}