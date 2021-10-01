/*
WAP that describes a class person. It should have instance variables to record name, age and salary. Create a person object. Set and display its instance variables. 
*/
import java.util.*;

class Person{
    static String name = "";
    static int age = -1;
    static double salary = 0.0;
    Person(String name, int age , double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public static void info(){
        System.out.println("Mr./Mrs. "+name+", age "+age+" years, earns "+salary+" per month.");
    }
    static String RandomStringGenerator(int len){
        String str = "";
        Random rand = new Random();
        for(int i =0;i<len;i++){
            int ch = rand.nextInt(122-77) + 77;
            str += (char)ch  ;
        }
    return str;
    }
    public static void main(String[] args){
        Random rand = new Random();
        String RandomName = RandomStringGenerator(15); 
        int age = rand.nextInt(100);
        double salary = rand.nextDouble(100000-3000) + 3000;
        Person people = new Person(RandomName, age, salary) ;
        people.info();
    }
}