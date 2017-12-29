package com.java8.learning1;

public class Greeter {
	public static void main(String[] args) {
		// Object Creation and method calling
		HelloWorldGreeting hwGreeting = new HelloWorldGreeting();
		hwGreeting.perform();

		// Lambda Expression
		Greeting lambdaGreeting = () -> System.out.println("Hello World lambdaGreeting...");
		lambdaGreeting.perform();

		// Anonymous Inner Class
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World Inner class greeting...");
			}
		};
		innerClassGreeting.perform();
	}
}

// Output:
// ======
// Hello World Greeting...
// Hello World lambdaGreeting...
// Hello World Inner class greeting...
