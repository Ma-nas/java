public class sumofallcolums {
    public static void main(String[]args){
        int arr[][]={{20,3,100},
                    {4,5,6},
                    {7,8,9},
                    {10,11,12}};
        
        for(int j=0;j<3;j++){
            int colsum=0;
            for(int i=0;i<4;i++){
                colsum+=arr[i][j];
                
            
              
            }
            System.out.println("Sum of column " + j + ": " + colsum);
        }
    }
}
