/*
Java Program to get the cube of a given number using the static method
*/
import java.util.*;

class StaticCube{
    static double val;
    StaticCube(double val){
        this.val = val;
    }
    static double ReturnCube(){
        return val*val*val;
    }
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StaticCube number = new StaticCube(input.nextDouble());
        input.close();
        System.out.println("The Cube of "+number.val+" via static method is "+number.ReturnCube());
    }
}