  class Is_Positive_Exception extends Exception  
{  
    public Is_Positive_Exception (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
} 

class program_7 {  
    static void check(int numb) throws Is_Positive_Exception {
       if (numb <= 0){
           throw new Is_Positive_Exception("The number is negative!");
       }
       else{
           System.out.println("The number is positive!");
       }
    }  
    public static void main(String[] args) {
        int[] numb = {1, 2, 3};
      try {
        int val = numb[0];
        try{// try#1
            val = numb[1] + val;
            System.out.println("The value of val is : "+val);
            check(val);
         }
        catch(Is_Positive_Exception e){
            System.out.println("We hava an issue!: " + e);
        }
        try{ // try#2
            val = numb[10];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("We hava an issue!: " + e);
        }
    }
    catch(Exception e)  
    {  
        System.out.println("We hava an issue!: " + e);
    }    
    }
}  
