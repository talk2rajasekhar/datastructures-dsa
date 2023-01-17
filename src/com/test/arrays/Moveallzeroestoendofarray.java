package com.test.arrays;

import java.util.Arrays;

public class Moveallzeroestoendofarray {
    //https://www.geeksforgeeks.org/move-zeroes-end-array/
    public static void main(String[] args) {
    int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

    moveZerosToEnd(arr);
    }

    private static void moveZerosToEnd(int[] arr) {

        for (int i=0;i<arr.length-1;i++){
            if (arr[i] ==0){
                int temp=arr[i];
                arr[i] =arr[i+1];
                arr[i+1] =temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
