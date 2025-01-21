package test;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] num = {10,2,5,7,9,1};
        maximumSumSubarray(num,2);

    }

    public static int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int i=0;
        int j=0;
        int max =0;
        int sum =0;

        while(j<arr.length){
            // calculation
            sum += arr[j];
            // move j till get window size
            if(j-i+1<k){
                j++;
                // once get size get ans and move window
            }else if(j-i+1==k){
                max = Math.max(sum,max);
                sum = sum-arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
    private static boolean twoSum(int[] num, int k) {
        HashSet set = new HashSet<>();
        for(int i:num){
            int t = k-i;
            if(set.contains(t)){
                return true;
            }else set.add(i);
        }
        return false;
    }

}
