package com.ds.array;

public class MissingNumberExample {

    public static void main(String[] args) {

        //Time Complexity O(2n) = O(n)
        int[] items = {1,2,3,4,5,7,8,9};
        int sum1 =0,sum2 =0;
        for(int i=0;i<items.length;i++)
            sum1 = sum1 + items[i];

        for(int j=1;j<=9;j++)
            sum2 = sum2 + j;
        int missingNumber = sum2 - sum1;
        System.out.println(missingNumber);
    }
}
