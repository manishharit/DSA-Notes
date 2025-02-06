package slidingWindow;


public class LongestSubArrayWithSumK {
    // problem like: to get max sub array size for positive int array with condition subArray sum
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,1,2,1}, 3));
    }

    private static int subarraySum(int[] arr, int k) {
        int i=0,j=0;
        int maxSize =0,tempSum =0;

        while (j<arr.length){
        // calc
            tempSum += arr[j];
        // remove ith till tempSum is larger than k in order to move forward
            while (tempSum > k && i<=j) {
                tempSum -=arr[i];
                i++;
            }
        // store ans
            if(tempSum == k) maxSize = Math.max(maxSize,j-i+1);
        // move when temSum is small then k or if stored and to move window
            j++;
        }
        return maxSize;
    }
}
