class Is_Positive_Exception extends Exception  
{  
    public Is_Positive_Exception (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
} 

class program_6 {  
    static void check(int numb) throws Is_Positive_Exception {
       if (numb < 0){
           throw new Is_Positive_Exception("The number is negative!");
       }
       else{
           System.out.println("The number is positive!");
       }
    }  
    public static void main(String[] args) {
        try{
            check(55);
            check(-55);
        }
        catch(Is_Positive_Exception e){
            System.out.println("We hava an issue!: " + e);
        }
    }
}  