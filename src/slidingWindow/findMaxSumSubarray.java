package slidingWindow;

public class findMaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1};
        int k = 2;
        int result = findMaxSumSubarray.findMaxSumSub(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
    public static int findMaxSumSub(int[] arr, int k) {
        int Sum = 0;
        int windowSum = 0;
        int i = 0;
        int j = 0;
        int N = arr.length;

        while (j < N) {
            windowSum += arr[j];
            if(j-i+1 == k){
                Sum = Math.max(windowSum,Sum);
                windowSum -= arr[i];
                i++;
            }
            j++;
        }

        return Sum;
    }
}
