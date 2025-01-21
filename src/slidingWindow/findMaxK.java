package slidingWindow;

import java.util.*;

public class findMaxK {
    public static void main(String[] args) {
//        List<Integer> res=  printKMax(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6},3);
        printKMax(new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6},3);
    }

    public static void  printKMax(int[] arr, int k){
//        List<Integer> result = new ArrayList<>();
        int i=0,j=0;
        int value =0;
        Deque<Integer> deque = new LinkedList<Integer>();

        for(i=0;i<k;++i){
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        while (i<arr.length){
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            i++;
        }
        System.out.print(arr[deque.peek()]);

//        while (j<arr.length){
//            if(arr[j] > value) value = arr[j];
//
//            if(j-i+1 ==k){
//                result.add(value);
//                if(arr[i] >= value) {
//                    for (int v=i;v<j;v++){
//                        value = arr[v+1];
//                        if(arr[v+1] >=value) value = arr[v+1];
//                    }
//                }
//                i++;
//            }
//            j++;
//        }
//        return result;

    }
}
