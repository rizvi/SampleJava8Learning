package com.java8.learning;

/**
 * Created by rizvi on 12/29/17.
 */
public class Sample2 {
    public static void main(String args[]) {
        MathOperation addition = (int a, int b) -> {
            return a + b;
        };
        System.out.println("5 + 6 = " + addition.operation(5, 6));
    }

    interface MathOperation {
        int operation(int a, int b);
    }
}


