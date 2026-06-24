public class movezeros {
    public static void moveZeroes(int[] nums) {
        int i =0;
        int j = nums.length-1;
        
            {
            int temp = nums[i];
            nums [j] = nums [i];
            nums [i] = temp;
            i++;
            j--;
        }
        
    }

}
    

