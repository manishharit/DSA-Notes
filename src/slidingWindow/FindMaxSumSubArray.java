package slidingWindow;

public class FindMaxSumSubArray {
    // problem like - https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
    public static void main(String[] args) {
        int result = findMaxSumSub(new int[]{4, 2, 1, 7, 8, 1}, 2);
        System.out.println("Maximum sum for give size of subArray is: " + result);
    }
    public static int findMaxSumSub(int[] arr, int k) {
        int maxSum = 0;
        int sum = 0;
        int i = 0;
        int j = 0;

        while (j < arr.length) {
        // calc
            sum += arr[j];
       // move till get the window size
            if(j-i+1<k){
                j++;
            }
       // once have windows size get answer remove i effect from window and move on
            else if(j-i+1 == k){
                maxSum = Math.max(maxSum,sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
}
