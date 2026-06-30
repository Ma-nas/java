public class maxsumofkthterm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while (j < n) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            } 
        }

        System.out.println(max);
    }
}


