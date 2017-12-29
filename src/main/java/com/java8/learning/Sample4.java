package com.java8.learning;

/**
 * Created by rizvi on 12/29/17.
 */
public class Sample4 {
    public static void main(String args[]) {
        SimpleOperation giveStringOperation = (String str) -> {
           return "Hello ".concat(str);
        };
        System.out.println("Output: " + giveStringOperation.operation("Rizvi"));
    }

    interface SimpleOperation {
        String operation(String str);
    }
}


