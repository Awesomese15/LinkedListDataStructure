package com.home;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

    public static void main(String args []){
        int n=2;
        int arr[]={1, 2};
        if (arr.length==1){
            if(arr[0]==1){
                System.out.println(0);
            }else{
                System.out.println(1);
            }

        }else{
            Arrays.sort(arr);
            for(int i=0; i<n-1; i++){
                if(arr[i+1] != arr[i]+1){
                    System.out.println(arr[i]+1);
                }
            }
            if(arr[0]!=0){
                System.out.println("0");
            }

            if(arr[n-1] != n){
                System.out.println(n);
            }
        }




    }

    }

