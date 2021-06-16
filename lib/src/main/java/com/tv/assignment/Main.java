package com.tv.assignment;

public class Main {

	public static void main(String[] args) {
		String[] fruitBowl = { "apple", "orange", "banana", "banana", "orange", "banana" };
		
		FruitBowl fruits = new FruitBowl(fruitBowl);
		
		fruits.segregateFruits();
		
		Apple apple=new Apple();
		apple.displayBowlOfApples();
		
		Banana banana=new Banana();
		banana.displayBowlOfBananas();
		
		Orange orange=new Orange();
		orange.displayBowlOfOranges();
		
		fruits.displayBowlOfFruits();


	}

}
