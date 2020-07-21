package com.home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGCD {

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Driver method
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("I! am a string");
        boolean b = m.find();

        if (b)
            System.out.println("There is a special character in my string");
    }
}
