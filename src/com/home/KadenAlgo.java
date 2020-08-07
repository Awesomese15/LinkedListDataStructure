package com.home;

public class KadenAlgo {

    public static  void main(String args []){
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int max_so_far=0;
        int max_ending_here=0;
        boolean trigger=true;
        for(int i=0; i<arr.length; i++){

        max_so_far=max_so_far+arr[i];
            if(max_so_far<0){
                max_so_far=0;
            }
            else if(max_so_far>=max_ending_here) {
                max_ending_here = max_so_far;
            }


        }
        System.out.println(max_ending_here);
    }
}
