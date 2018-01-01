package com.java8.learning3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolution {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));

		// Step1: Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});

		// Step2: Create a method that prints all elements in the list
		System.out.println("Printing all persons:");
		printAll(people);

		// Step3: Create a method that prints all people that have last name
		// beginning with C
		System.out.println("****************************************************");
		System.out.println("Printing all persons with last name beginning with C");
		printLastNameBeginningWithC(people);

		// Step4: Create a method that prints all people that have last name
		// beginning with C
		System.out.println("****************************************************");
		System.out.println("Printing all persons with first name beginning with C");
		printFirstNameBeginningWithC(people);
	}

	private static void printFirstNameBeginningWithC(List<Person> people) {
		for (Person p : people) {
			if (p.getFirstName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		for (Person p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}

	}

}
