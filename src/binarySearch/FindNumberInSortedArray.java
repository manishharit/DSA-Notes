package binarySearch;

public class FindNumberInSortedArray {
    // Basic Example of Binary Search problem like: https://www.naukri.com/code360/problems/binary-search_972?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11};

        System.out.println(findN(arr,16));
    }

    private static int findN(int[] arr, int k) {
        // create two pointers to represent start and end of array
        int start = 0;
        int end = arr.length-1;

        // loop until start end pointer overlap
        while (start<=end){
            // determine the mid  in order to move pointers
            int mid = (start + end)/2;

            // store ans from when mid finds target element
            if (arr[mid] == k) return mid;

            // move start and end pointers accordingly
            if(arr[mid] < k) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}
