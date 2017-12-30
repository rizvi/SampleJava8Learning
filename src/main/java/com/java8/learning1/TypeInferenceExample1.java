package com.java8.learning1;

public class TypeInferenceExample1 {
	public static void main(String[] args) {
		// First
		StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Mr Rizvi"));

		// Second
		StringLengthLambda myNewLambda = s -> s.length();
		printLambda(myNewLambda);

		// Third
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambda strLenLambda) {
		System.out.println(strLenLambda.getLength("Hello Miss Sofia..."));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
