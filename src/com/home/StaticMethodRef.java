package com.home;

interface  Sayable{
    void say();
}
public class StaticMethodRef {
    public static  void saySomething(){
        System.out.println("Hi this is a static method");
    }
    public void saySomethingWhichIsNotStatic(){
        System.out.println("Hi !! This is not a static method");
    }

    public StaticMethodRef() {
    }

    public StaticMethodRef(String secret) {
        System.out.println("I have a secret");
    }

    public  static  void main(String  args []){
        Sayable sayable= StaticMethodRef::saySomething;
        sayable.say();

//        StaticMethodRef staticMethodRef=new StaticMethodRef();
     //   Sayable sayable1=staticMethodRef::saySomethingWhichIsNotStatic;
    Sayable sayable1=new StaticMethodRef()::saySomethingWhichIsNotStatic;
        sayable1.say();

        Sayable sayable2=StaticMethodRef::new;
}
}
