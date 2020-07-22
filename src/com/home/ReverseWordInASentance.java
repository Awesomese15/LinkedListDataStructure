/*
Write a simple program that reads a line from the keyboard and outputs the same line where every word is reversed. A word is defined as a continuous sequence of alphanumeric characters or hyphen (‘-’). For instance, if the input is
“We are at Zazzy Solutions! Their email-id is careers@zazzy.tech” the output should be
“eW era ta yzzaZ snoituloS! riehT di-liame si sreerac@yzzaz.hcet”

* */



package com.home;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ReverseWordInASentance {
    public static  void main(String [] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        String inputLine=br.readLine();
       System.out.println(reversLine(inputLine));
    }

    private static String reversLine(String inputLine) {
        String [] inputArray=inputLine.split(" ");
        String reverseString="";
        for(int i=0; i<inputArray.length; i++){
            StringBuilder builder;

            String [] spacialCharArray;
            String temp=inputArray[i];
            Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(inputArray[i]);
            boolean b = m.find();

            if (b || inputArray[i].contains("!")) {
                spacialCharArray = temp.replaceAll("[a-zA-Z]+", " ").trim().split(" ");
                String[] subString = inputArray[i].split("[\\s!@&.?$+-]+");

                for (int j = 0; j < subString.length; j++) {
                    builder = new StringBuilder(subString[j]);
                    if(subString.length==1){
                        reverseString = reverseString + builder.reverse().toString() + spacialCharArray[j]+" ";
                    }

                    else if (j < subString.length - 1) {
                        reverseString = reverseString + builder.reverse().toString() + spacialCharArray[j];
                    }
                    else {
                        reverseString = reverseString + builder.reverse().toString() + " ";
                    }
                }
            }

           /* StringBuilder builder;
            if(inputArray[i].contains("\\W")){
                String[] subString=inputArray[i].split("\\W");
                for(int j=0; j<subString.length; j++){
                    builder=new StringBuilder(subString[j]);
                    if(j<subString.length-1){
                        reverseString=reverseString+builder.reverse().toString()+"-";
                    }else{
                        reverseString=reverseString+ builder.reverse().toString()+" ";
                    }

                }*/

            else{
                builder=new StringBuilder(inputArray[i]);

                reverseString=reverseString+ builder.reverse().toString()+" ";
          }

        }

        return reverseString;
    }
}
