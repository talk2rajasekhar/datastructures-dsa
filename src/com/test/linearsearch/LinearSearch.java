package com.test.linearsearch;

public class LinearSearch {

    public static void main(String[] args) {
        int num[] = {3,9,8,6,7,18,32};
        int target = 1;
        System.out.println(  find(num,target));
    }

    private static int find(int[] num, int target) {
        for (int i=0;i<num.length;i++){
            if (target == num[i]){
                return i;
            }
        }
        return -1;
    }
}
