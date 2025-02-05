package slidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxElementOfSubArray {
    // problem like: https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

    public static void main(String[] args) {
        System.out.println(findMaxNumber(new int[]{1,1000,2,1,5,4},3));
    }

    private static ArrayList<Integer> findMaxNumber(int[] arr,int k) {
        int i=0,j=0;
        Deque<Integer> tempQueue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (j<arr.length){
        // calc
            while (!tempQueue.isEmpty() && arr[j]>tempQueue.peekLast()) tempQueue.removeLast();
            tempQueue.add(arr[j]);
        // once window size is achieved get ans and remove calc for ith index and move window
            if(j-i+1 == k){
                result.add(tempQueue.peekFirst());
                if (arr[i] == tempQueue.peekFirst()) {
                    tempQueue.removeFirst();
                }
                i++;
            }
            j++;
        }
        return result;
    }
}
