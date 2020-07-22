package com.home;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitalRootIteration {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while (t--!=0){
                long a = Long.parseLong(br.readLine());
                long c =0;
                while(a>=10){
                    long b =a;
                    long d=0;
                    while(b!=0){
                        d=d+b%10;
                        b=b/10;
                    }
                    c++;
                    a=d;
                }
                System.out.println(a+" "+c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}



