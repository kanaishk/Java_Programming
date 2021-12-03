class program_4
{
    public static void is_positive(int number){
        if(number < 0){
            throw new ArithmeticException("Number is not positive!");
        }
        else{
            System.out.println("Number is positive!");
        }
    }
    public static void main(String[] args) {
        is_positive(100);
        is_positive(-100);
    }
  }