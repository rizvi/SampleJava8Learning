package com.teamtreehouse.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void usingAnonymousInlineClass() {
		List<Book> books = Books.all();
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {
				return b1.getmTitle().compareTo(b2.getmTitle());
			}
		});
		for (Book book : books) {
			System.out.println(book);
		}
	}

	public static void usingLambdasInLongForm() {
		List<Book> books = Books.all();
		Collections.sort(books, (Book b1, Book b2) -> {
			return b1.getmTitle().compareTo(b2.getmTitle());
		});

		for (Book book : books) {
			System.out.println(book);
		}
	}

	public static void usingLambdasInShortForm() {
		List<Book> books = Books.all();
		Collections.sort(books, (b1, b2) -> b1.getmTitle().compareTo(b2.getmTitle()));

		books.forEach(book -> System.out.println(book));
	}

	public static void main(String[] args) {
		usingAnonymousInlineClass();
		System.out.println("##########################################");
		usingLambdasInLongForm();
		System.out.println("##########################################");
		usingLambdasInShortForm();
	}

}
