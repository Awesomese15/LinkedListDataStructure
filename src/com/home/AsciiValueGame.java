/*
Consider the following pattern:
A → D M → P X → A a → d m → p x → a
Now, write a program to solve the following message using Python, JavaScript or Ruby.
Vrphwklqj phdqlqjixo
Hint: The answer is something meaningful
* */

package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiValueGame {
    public static char getPartner(char value){
        int inAscii=(int)value;
        int outAscii=inAscii+23;
        boolean small=false;
        boolean capital=false;
        if(inAscii>=65 && inAscii<=90){
            capital=true;
        }
        if(inAscii>=97 && inAscii<=122){
            small=true;
        }
        if(capital){
            if(outAscii>90){
                outAscii=outAscii-26;
                return (char) outAscii;
            }else{
                return (char) outAscii;
            }

        }
        if(small ){
            if(outAscii>122){
                return (char) (outAscii-26);
            }else{
                return (char)outAscii;
            }

        }


        return value;

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
