package org.java8.practice;

import java.util.Arrays;
import java.util.List;

public class MyGirlsChoice1 {
	public static void main(String[] args) {
		// A list of ingredients
		List<String> ingredients = Arrays.asList("flour", "salt", "baking powder", "eggs", "butter", "milk");

		// Check ingredients contains eggs or not
		// if eggs found, say sorry to your baby, as she dislikes
		if (ingredients.contains("eggs")) {
			System.out.println("Sorry SweetHeart...It has eggs... :(");
		}
	}

}
