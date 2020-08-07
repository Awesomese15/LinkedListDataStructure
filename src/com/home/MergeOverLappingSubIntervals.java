package com.home;

/*Given a set of time intervals in any order, merge all overlapping intervals into one and
output the result which should have only mutually exclusive intervals.
Let the intervals be represented as pairs of integers for simplicity.
For example,
let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }.
The intervals {1,3} and {2,4} overlap with each other, so they should be merged and become {1, 4}. Similarly {5, 7} and {6, 8}
should be merged and become {5, 8}*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverLappingSubIntervals {
    public static void mergeIntervals(Interval arr[])
    {
        // Test if the given set has at least one interval
        if (arr.length <= 0)
            return;

        // Create an empty stack of intervals
        Stack<Interval> stack=new Stack<>();

        // sort the intervals in increasing order of start time
        Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });

        // push the first interval to stack
        stack.push(arr[0]);

        // Start from the next interval and merge if necessary
        for (int i = 1 ; i < arr.length; i++)
        {
            // get interval from stack top
            Interval top = stack.peek();

            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end < arr[i].start)
                stack.push(arr[i]);

                // Otherwise update the ending time of top if ending of current
                // interval is more
            else if (top.end < arr[i].end)
            {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }

        // Print contents of stack
        System.out.print("The Merged Intervals are: ");
        while (!stack.isEmpty())
        {
            Interval t = stack.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        }
    }

    public static void main(String args[]) {
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(1,3);
        arr[1]=new Interval(2,4);
        arr[2]=new Interval(5,7);
        arr[3]=new Interval(6,8);
        mergeIntervals(arr);
    }

}


class Interval
{
    int start,end;
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}
