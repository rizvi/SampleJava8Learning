package com.java8.learning;

public class Sample6 {

    public static void main(String args[]) {
        MathOperation addition = (a, b) -> {
            return a + b;
        };
        System.out.println("5 + 6 = " + addition.operation(5, 6));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

}
