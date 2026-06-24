//check if array is sorted or not 

public class sortingarray {
    public static void main (String[]args){
        int arr[] ={2,3,1,1,3,4,5,6,7,8,9,};
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        if (flag) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
    
}
