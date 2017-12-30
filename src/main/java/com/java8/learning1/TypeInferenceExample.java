package com.java8.learning1;

/**
 * Parentheses removal also work here for single variable
 *  Here s is single param, so we can remove parenthesis
 * @author Rizvi
 *
 */
public class TypeInferenceExample {

	public static void main(String[] args) {
		// Parentheses removal also work here for single variable
		// StringLengthLambda myLambda = (s) -> s.length();
		StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Mr Rizvi"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
