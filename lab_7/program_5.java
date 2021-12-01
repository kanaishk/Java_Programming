class program_5 {  
    public static int element(int[] arr, int idx) throws ArrayIndexOutOfBoundsException {  
        int val = arr[idx];  
        return val;  
    }  
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        try {  
            System.out.println(element(arr, arr.length+1));  
        }  
        catch (ArrayIndexOutOfBoundsException e){  
            System.out.println("\nIndex out of bound!\nUse a smaller Index.");  
        }  
    }  
}  