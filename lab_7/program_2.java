class program_2
{
    public static void main(String[] args) {
      try {
        int[] numb = {1, 2, 3};
        int n = numb.length;
        System.out.println(numb[n+1]);
      } 
      catch(ArithmeticException e)  
      {  
       System.out.println("Arithmetic Exception occurs");  
      }    
   catch(ArrayIndexOutOfBoundsException e)  
      {  
       System.out.println("ArrayIndexOutOfBounds Exception occurs");  
      }    
   catch(Exception e)  
      {  
       System.out.println("Parent Exception occurs");  
      }  
      finally   
      {
        System.out.println("Part#1");  
      } 
      try {
        int[] numb = {1, 2, 3};
        int val = numb[0]/(numb[0]-1);
        System.out.println(val);
      } 
      catch(ArithmeticException e)  
      {  
       System.out.println("Arithmetic Exception occurs");  
      }    
   catch(ArrayIndexOutOfBoundsException e)  
      {  
       System.out.println("ArrayIndexOutOfBounds Exception occurs");  
      }    
   catch(Exception e)  
      {  
       System.out.println("Parent Exception occurs");  
      }  
      finally   
      {
        System.out.println("Part#2");  
      }             
    }
  }