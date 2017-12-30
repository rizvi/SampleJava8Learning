package com.java8.learning1;

public class GreeterNew {
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		// Lambda Expression
		Greeting lambdaGreeting = () -> System.out.println("Hello World lambdaGreeting...");

		// Anonymous Inner Class
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello World Inner class greeting...");
			}
		};

		GreeterNew master = new GreeterNew();
		master.greet(lambdaGreeting);
		master.greet(innerClassGreeting);
	}

}
