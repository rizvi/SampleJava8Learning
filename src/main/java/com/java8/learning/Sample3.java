package com.java8.learning;

/**
 * Created by rizvi on 12/29/17.
 */
public class Sample3 {
    public static void main(String args[]) {
        SimpleOperation giveValueOperation = () -> 42;
        System.out.println("It returns: " + giveValueOperation.operation());
    }

    interface SimpleOperation {
        int operation();
    }
}


