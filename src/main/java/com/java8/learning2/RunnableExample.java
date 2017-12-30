package com.java8.learning2;

public class RunnableExample {

	public static void main(String[] args) {

		// With Anonymous Inner Class[Runnable]
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("print runnable with boilerplate code");
			}
		});

		myThread.run();

		// With Lambda Expression
		Thread myLambdaThread = new Thread(() -> System.out.println("print runnable with lambdaExpression"));
		myLambdaThread.run();
	}

}
