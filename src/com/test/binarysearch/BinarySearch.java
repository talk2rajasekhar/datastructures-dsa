package com.test.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int num[] = {3,9,18,26,37,118,312};
        int target = 1;
      //  search(num,target);
        System.out.println( binarySearch(num,target));
    }

    private static void search(int[] num, int target) {
        int start =0;
        int end = num.length-1;
        System.out.println( binarysearch(num,target,start,end));

    }

    private static int binarysearch(int[] num, int target, int start, int end) {

        int mid = (start + end)/2;

        if (num[mid] == target){
            return mid;
        } else if (target < num[mid]){
            if (mid == start)
                return -1;
           return binarysearch(num,target,start,mid);

        } else if (target > num[mid]){
            if (mid == start)
              return -1;
           return binarysearch(num,target,mid,end);
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
