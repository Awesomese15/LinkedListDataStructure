package com.home;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sortAnArray {

    public static void sortWithAlgo(){
        int arr []=  {1, 0, 0, 2, 1};
        Arrays.sort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static  void sortWithoutAlgoAndExtraSpace(){
        int arr []=  {1, 0, 0, 2, 1};
        int count0=0, count1=0, count2=0;
        for(int i=0; i<arr.length; i++ ){
            switch (arr[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }

        }

        int k=0;
        while (count0>0){
            arr[k]=0;
            k++;
            count0--;
        }
        while (count1>0){
            arr[k]=1;
            k++;
            count1--;
        }
        while (count2>0){
            arr[k]=2;
            k++;
            count2--;
        }

        for(int itr=0; itr<arr.length;itr++){
            System.out.println(arr[itr]);
        }
    }

    public static void main(String args []){
        sortWithoutAlgoAndExtraSpace();
    }
}
