package com.java8.learning;

/**
 * Created by rizvi on 12/29/17.
 */
public class Sample5 {
    public static void main(String args[]) {
        Sample5 tester = new Sample5();
        MathOperation addition = (int a, int b) -> {
            return a + b;
        };
        System.out.println("5 + 6 = " + addition.operation(5, 6));
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}


