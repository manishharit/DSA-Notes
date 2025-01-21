package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstNegativeinSubArray {
    public static void main(String[] args) {
        List<Integer>  res=  FirstNegativeInWindow(new int[]{2,-1,4,5,-2,4,5,9},3);
        System.out.println(Arrays.asList(res));

    }
    public static List<Integer> FirstNegativeInWindow(int[] nums, int k){
        int i=0,j=0;
        List<Integer> result = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        while (j<nums.length){
            if(nums[j] <0) negative.add(nums[j]);
            if(j-i+1 == k){
                if(!negative.isEmpty()){
                    result.add(negative.get(0));
                    if(negative.get(0) == nums[i]) negative.remove(0);
                }else { result.add(0); }
                i++;
            }
            j++;
        }

        return result;
    }
}
