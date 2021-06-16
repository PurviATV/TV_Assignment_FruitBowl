package com.tv.assignment;

import java.util.ArrayList;

public class FruitBowl {

	ArrayList<String> fruitBowl = new ArrayList<>();

	public FruitBowl(String[] fruits) {
		for (String fr : fruits)
			fruitBowl.add(fr);
	}

	public int getCountOfAllFruits() {
		return fruitBowl.size();
	}

	public ArrayList<String> getBowlOfFruits() {
		return fruitBowl;

	}
	public void displayBowlOfFruits() {
		System.out.println(fruitBowl);

	}

	public void segregateFruits() {
		for (String fruit : fruitBowl) {
			switch (fruit) {
			case "apple":
				Apple.getInstance().addApples(fruit);
				break;
			case "orange":
				Orange.getInstance().addOranges(fruit);
				break;
			case "banana":
				Banana.getInstance().addBananas(fruit);
				break;
			default:
				System.out.println("Unknown fruit");
				break;
			}

		}
	}

}
