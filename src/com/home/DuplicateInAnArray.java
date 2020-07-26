/*Find duplicate values in array where the array can contain values from 0 to n-1*/

package com.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateInAnArray {

    public static void main(String args []){
        int[] checkArray={0,2,300,5,0,300};
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<checkArray.length; i++){
            int count=1;

            if(map.containsKey(checkArray[i])){

                map.put(checkArray[i], count+1);
            }else{
                map.put(checkArray[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
