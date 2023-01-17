package com.test.arrays;

import java.util.Arrays;

public class ReorganizeTheArray {
    //https://www.geeksforgeeks.org/rearrange-array-arri/
/*    Examples:

    Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
    Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

    Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
            11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
    Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19]*/

    public static void main(String[] args) {
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
           //
     /*  int n = arr.length;
        rearrangeArray(arr,n);
      Arrays.stream(arr).sequential().forEach(i -> {System.out.print(i);
          System.out.print(" ");
      });*/



      //  int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        for (int i = 0; i < arr.length;)
        {
            if (arr[i] >= 0 && arr[i] != i)
            {
                int ele = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = ele;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void rearrangeArray(int[] arr, int size) {
        for (int i =0;i<size;i++){
            for (int j =0;j<size;j++){

                if (arr[j] == i){
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }

        for (int i=0;i<size;i++){
            if (arr[i] !=i){
                arr[i] = -1;
            }
        }
    }



}
