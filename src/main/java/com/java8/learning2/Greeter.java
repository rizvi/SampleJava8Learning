package com.java8.learning2;

public class Greeter {
	public static void main(String[] args) {

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
// Hello World lambdaGreeting...
// Hello World Inner class greeting...
