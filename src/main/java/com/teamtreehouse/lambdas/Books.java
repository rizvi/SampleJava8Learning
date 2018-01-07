package com.teamtreehouse.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Books {

	public static List<Book> all() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Function Programming in Java", "Venket Subramaniam", 2014));
		books.add(new Book("Clean Code", "Robert C. Martin", 2008));
		books.add(new Book("Java Generics and Collections", "Maurich Naftalin", 2008));
		books.add(new Book("Effective Java 3rd Edition", "Joshua Bloch", 2017));
		books.add(new Book("JavaFX Essentials", "Mohammad Taman", 2015));
		return books;

	}
}
