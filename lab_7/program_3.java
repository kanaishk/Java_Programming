class program_3
{
    public static void main(String[] args) {
      try {
        int[] numb = {1, 2, 3};
        int n = numb.length;
        System.out.println(numb[n+1]);
      } catch (Exception e) {
        System.out.println("Something went wrong.");
      } finally{
        System.out.println("This is last statement.");
      }
    }
  }