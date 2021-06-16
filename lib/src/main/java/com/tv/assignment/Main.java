package com.tv.assignment;

public class Main {

	public static void main(String[] args) {
		String[] fruitBowl = { "apple", "orange", "banana", "banana", "orange", "banana" };
		FruitBowl fruits = new FruitBowl(fruitBowl);
		fruits.segregateFruits();
		Apple.getInstance().displayBowlOfApples();
		Orange.getInstance().displayBowlOfOranges();
		Banana.getInstance().displayBowlOfBananas();
		fruits.displayBowlOfFruits();


	}

}
