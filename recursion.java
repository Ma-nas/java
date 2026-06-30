public class recursion {
    public static void naturalno2(int n ){
        if (n ==0) {
            return;
        }
        
        System.out.println(n);
        naturalno2(n-1);
        
    }
    public static void naturalno(int n) {
        if (n == 0) {
            return;
        }
        naturalno(n - 1);
        System.out.println(n);
       
    }
    public static int factorial(int n){
        if (n <= 0) {
            return 0;
        }
        System.out.println(n);
        return n * factorial(n - 1);
        
    }

    public static int getsum(int n){
        if (n == 0) {
            return 0;
        }
       
        int temp = n + getsum(n - 1);
        
        return temp;
        
    }
    public static String reverse(String str){
        if(str.isEmpty() || str.length() == 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static int reverseno(int n){
        int rev = 0;
        solu(n, rev);
        return rev;
    }
    
    public static int solu(int n, int rev){
        if (n == 0) {
            return rev;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;
        return solu(n/10, rev);
    }
    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    

    public static void main(String[] args) {
        naturalno(5);
        System.out.println();
        
        naturalno2(5);
        System.out.println();

       
        factorial(5);
        System.out.println();
        
        int n =5;
        System.out.println(getsum(n));
        System.out.println();

        System.out.println(reverse(String.valueOf(6)));
        System.out.println();


        System.out.println(reverseno(123));
        System.out.println();

        
        int n2= 7;
        for (int i = 0; i < n2; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();



    }
}


