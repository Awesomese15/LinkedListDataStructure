package com.home;

public class SortLength {

    public static  void main(String [] args){
        String[] arrayOfStrings={"Australia","India", "America","USA","RSA", "UK","Chin"};


        for(int i=1; i<arrayOfStrings.length; i++){
            String temp=arrayOfStrings[i];
            int j=i-1;
            while(j>=0 && arrayOfStrings[j].length()>temp.length()){
                    arrayOfStrings[j+1]=arrayOfStrings[j];
                arrayOfStrings[j]=temp;
                j--;

            }


        }
       for (int i=0; i<arrayOfStrings.length; i++){
           System.out.println(arrayOfStrings[i]);
       }
    }
}
