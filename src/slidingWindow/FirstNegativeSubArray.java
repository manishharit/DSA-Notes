package slidingWindow;

import java.util.*;

public class FirstNegativeSubArray {
    // problem like - https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
    public static void main(String[] args) {
        List<Integer>  res=  FirstNegativeInWindow(new int[]{-8,2,3,-6,10},2);
        System.out.println(Arrays.asList(res));

    }
    public static List<Integer> FirstNegativeInWindow(int[] nums, int k){
        int i=0;
        int j=0;
        List<Integer> result = new ArrayList<>();
        Deque<Integer> tempArr = new LinkedList<>();

        while (j<nums.length){
        // calc
            if(nums[j]<0) tempArr.add(nums[j]);

        // if window size is achieved then get answer remove i effect from window and move on
            if (j-i+1 == k) {
                if(tempArr.isEmpty()) result.add(0);
                else {
                    result.add(tempArr.peekFirst());
                    if(tempArr.peekFirst() == nums[i]) tempArr.pollFirst();
                }
                i++;
            }

        // move j one single place rather than writing separate window size condition and incrementing same to move window
            j++;
        }
        return result;
    }
}
