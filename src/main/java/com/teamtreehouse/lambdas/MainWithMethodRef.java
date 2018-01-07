package com.teamtreehouse.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithMethodRef {

	public static void usingMethodRefs() {
		List<Book> books = Books.all();
		Collections.sort(books, Comparator.comparing(b -> b.getmTitle()));
		books.forEach(book -> System.out.println(book));
	}

	public static void usingMethodRefs1() {
		List<Book> books = Books.all();
		Collections.sort(books, Comparator.comparing(Book::getmTitle));
		books.forEach(System.out::println);
	}

	public static void main(String[] args) {
		System.out.println("##########################################");
		usingMethodRefs();
		System.out.println("##########################################");
		usingMethodRefs1();
	}

}
