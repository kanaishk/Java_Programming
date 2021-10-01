/*
WAP to display the use of this keyword.
*/
class usingThis{
    int a;
    int b;
    usingThis(){ 
        this(10, 20);
        System.out.println("Inside  default constructor ");
    }
    usingThis(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
 
    public static void main(String[] args){
        usingThis object = new usingThis();
        System.out.println("The object has the following Instances: \n a = " + object.a + "\n b = "+object.b+'\n');
        usingThis object1 = new usingThis(1,2);
        System.out.println("The object has the following Instances: \n a = " + object1.a + "\n b = "+object1.b);
    }
}