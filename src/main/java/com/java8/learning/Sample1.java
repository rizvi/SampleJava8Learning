package com.java8.learning;

/**
 * Created by rizvi on 12/29/17.
 */
public class Sample1 {
    public static void main(String args[]) {
        MyLambda myLambda = () -> System.out.println("My name is Rizvi");
        myLambda.foo();
    }

    interface MyLambda {
        void foo();
    }
}


