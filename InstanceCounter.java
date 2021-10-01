/*
Write a program that can count the number of instances created for the class.
*/
class InstanceCounter{
    int a;
    static int Instances = 0;
    { Instances += 1;  }
    InstanceCounter(){ 
        this(10);
    }
    InstanceCounter(int a){
        this.a = a;
    }
 
    public static void main(String[] args){
        InstanceCounter object = new InstanceCounter();
        System.out.println("\nThe Object#1 made is initialized with Instance = "+ object.a + '\n');
        InstanceCounter object1 = new InstanceCounter(1);
        System.out.println("\nThe Object#2 made is initialized with Instance = "+ object1.a + '\n');
        InstanceCounter object2 = new InstanceCounter(2);
        System.out.println("\nThe Object#3 made is initialized with Instance = "+ object2.a + '\n');
        System.out.println("\nTill now we have made #3 instances, as per the System total Instances made = "+InstanceCounter.Instances+'\n');
    }
}