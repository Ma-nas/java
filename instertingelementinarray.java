import java.util.Scanner;

public class instertingelementinarray {

    public static void main(String[]args){
        int arr[] = new int[10];
        Scanner sc= new Scanner(System.in);
        for( int i=0;i<4;i++){
            arr[i]=sc.nextInt();

        }
        int n = 5;
        int val = 2;
        int pos=1;
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = val;
        for (int i = n;i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

}