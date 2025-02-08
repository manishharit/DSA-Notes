package slidingWindow;

public class MaxConsecutiveOnesLeetCode1004 {
    // problem like: https://leetcode.com/problems/max-consecutive-ones-iii/description/
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }

    private static int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, zeroCount = 0, size = 0;

        while (j < nums.length) {
            // calc
            if (nums[j] == 0) zeroCount++;
            // remove from ith side if exceeds k
            while (zeroCount > k) {
                if (nums[i] == 0) zeroCount--;
                i++;
            }
            // store ans
            size = Math.max(size, j - i + 1);
            // move window
            j++;
        }
        return size;
    }
}
