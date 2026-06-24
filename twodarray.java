import java.util.Scanner;

public class twodarray{
    public static void main (String[]arg){
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int w=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}       