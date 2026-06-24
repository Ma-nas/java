public class sumofallrows {
    public static void main(String[]ars){
        int arr[][]={{20,3,100},
                    {4,5,6},
                    {7,8,9},
                    {10,11,12}};
        
        for(int i=0;i<4;i++){
            int rowsum=0;
            for(int j=0;j<3;j++){
                rowsum+=arr[i][j];
                
            
              
            }
            System.out.println("Sum of row " + i + ": " + rowsum);
        }
    }
}
