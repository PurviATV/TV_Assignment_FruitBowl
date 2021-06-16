package com.tv.assignment;

public class Main {

	public static void main(String[] args) {
		String[] fruitBowl = { "apple", "orange", "banana", "banana", "orange", "banana" };
		
		FruitBowl fruits = new FruitBowl();
		
		fruits.addFruits(fruitBowl);
		fruits.segregateFruits();
		
		Apple apple=new Apple();
		apple.displayFruits();
		
		Banana banana=new Banana();
		banana.displayFruits();
		
		Orange orange=new Orange();
		orange.displayFruits();
		
		fruits.displayFruits();


	}

}
