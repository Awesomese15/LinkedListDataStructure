/*Write a function that takes an array of integers and returns that array rotated by N positions using Python or Ruby or JavaScript.
For example, if N=2, given the input array [1, 2, 3, 4, 5, 6] the function should return [5, 6, 1, 2, 3, 4]:
*/

package com.home;

public class RotationOfArray {

    void leftRotate(int arr[], int d, int n)
    {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static  void main(String [] args){
    RotationOfArray obj=new RotationOfArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14 };
        int n=4;
        obj.leftRotate(arr, n, arr.length);
        obj.printArray(arr, arr.length);


}
}
