package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiValueGame {
    public static char getPartner(char value){
        int inAscii=(int)value;
        int outAscii=inAscii+3;
        boolean small=false;
        boolean capital=false;
        if(inAscii>=65 && inAscii<=90){
            capital=true;
        }
        if(inAscii>=97 && inAscii<=122){
            small=true;
        }
        if(capital && outAscii>90){
            outAscii=outAscii-26;
        }
        if(small && outAscii>122){
            outAscii=outAscii-26;
        }



        return (char)outAscii;
    }
    public static  void main (String [] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String inputLine=br.readLine();
        String [] inputArray=inputLine.split(" ");
        String [] outputArray=new String[inputArray.length];
        String outputString="";
        for(int i=0; i<inputArray.length; i++){
            String outputSubstring="";
            int lengthWord=inputArray[i].length();
            for(int j=0; j<lengthWord; j++){
                outputSubstring=outputSubstring+ getPartner(inputArray[i].charAt(j));
            }
            outputArray[i]=outputSubstring;
        }
        for(int k=0; k<outputArray.length; k++){
            outputString=outputString+outputArray[k]+" ";
        }

        System.out.println(outputString);
    }
}
