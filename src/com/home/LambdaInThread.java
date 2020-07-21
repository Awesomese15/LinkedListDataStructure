package com.home;

public class LambdaInThread {

    public static void main(String [] args){
        Runnable r1= new Runnable() {
            @Override
            public void run() {
                System.out.println("Therad1 is running baby");

            }
        };
        Thread t1=new Thread(r1);
        t1.start();

       Runnable r2=()->{
           System.out.println("Therad2 is running baby");
        };

       Thread t2=new Thread(r2);
       t2.start();
    }
}
