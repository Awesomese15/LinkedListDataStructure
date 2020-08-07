package com.home;

import java.util.Arrays;

public class MergeTwoArrays {
    public static  void main (String args []){
        int arr1[] = new int[]{2};
       int arr2[] = new int[]{1, 5, 9, 10, 15, 20};
       int m=arr1.length;
       int n=arr2.length;
        for (int i=n-1; i>=0; i--)
        {
            /* Find the smallest element greater than ar2[i]. Move all
               elements one position ahead till the smallest greater
               element is not found */
            int j, last = arr1[m-1];
            for (j=m-2; j >= 0 && arr1[j] > arr2[i]; j--)
                arr1[j+1] = arr1[j];

            // If there was a greater element
            if (j != m-2 || last > arr2[i])
            {
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
