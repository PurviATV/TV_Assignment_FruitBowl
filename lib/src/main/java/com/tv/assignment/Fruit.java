package com.tv.assignment;

import java.util.ArrayList;

public class Fruit {

	static ArrayList<String> fruitBowl = new ArrayList<>();
	static int countOfFruits;

	public Fruit() {
		countOfFruits = 0;
	}

	public void addFruit(String fruit) {
		fruitBowl.add(fruit);
		countOfFruits++;
	}

	public static int getCountOfFruits() {
		return countOfFruits;
	}

	public ArrayList<String> getBowlOfFruits() {
		return fruitBowl;

	}
	
	

}
