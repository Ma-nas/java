//find the first occurence and last occurence of an element in an array
import java.util.Scanner;

public class firstlast {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,7,4,7,5,7,6,7,8};
        int n = sc.nextInt();

        int first = -1;
        //int second = -1;    
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }


        System.out.println("first: "+ first );
        System.out.println("last: "+ last);

        sc.close();
    }
    
}
