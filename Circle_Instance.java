/*
1. WAP that creates a class circle with instance variables for the centre and the radius. Initialize and display its variables.
*/

import java.util.*;

class MyCircle{
    double abscissa = 0  , ordinate = 0 , radius = 1;
    public void getCentre(){
        System.out.println("The Co-ordinates of centre of the Circle are ("+abscissa+","+ordinate+")."  );
    }
    public void getRadius(){
        System.out.println("The Radius of the Circle is "+ radius  +" units");
    }
}

public class Circle_Instance{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MyCircle circle = new MyCircle();
        System.out.println( "Enter the Co-ordinates for the Centre of Circle :" );
        circle.abscissa = input.nextDouble();
        circle.ordinate = input.nextDouble();
        System.out.println( "Enter the Radius of the Circle :" );
        circle.radius = input.nextDouble();
        input.close();
        circle.getCentre();
        circle.getRadius();
	}
}