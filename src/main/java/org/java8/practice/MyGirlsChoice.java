package org.java8.practice;

import java.util.Arrays;
import java.util.List;

public class MyGirlsChoice {
	public static void main(String[] args) {
		// A list of ingredients
		List<String> ingredients = Arrays.asList("flour", "salt", "baking powder", "eggs", "butter", "milk");

		// Check ingredients contains eggs or not
		boolean hasEggs = false;

		// *****************First*******************************
		for (int i = 0; i < ingredients.size(); i++) {
			String ingredient = ingredients.get(i);
			if (ingredient.contains("eggs")) {
				hasEggs = true;
				break;
			}
		}
		// *****************First*******************************
		// *****************Alternate***************************
		// After optimization
		for (String ingredient : ingredients) {
			if (ingredient.contains("eggs")) {
				hasEggs = true;
				break;
			}
		}
		// *****************Alternate***************************
		// if eggs found, say sorry to your baby, as she dislikes
		if (hasEggs) {
			System.out.println("Sorry SweetHeart...It has eggs... :(");
		}
	}

}
