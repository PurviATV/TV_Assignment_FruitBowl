package com.tv.assignment;

public class Main {

	public static void main(String[] args) {
		String[] fruitBowl = { "apple", "orange", "banana", "orange", "banana" };
		Apple apples = new Apple();
		Banana bananas = new Banana();
		Orange oranges = new Orange();

		Fruit fruits = new Fruit();
		for (int index = 0; index < fruitBowl.length; index++) {
			switch (fruitBowl[index]) {
			case "apple":
				apples.addApples(fruitBowl[index]);
				fruits.addFruit(fruitBowl[index]);
				break;
			case "orange":
				oranges.addOranges(fruitBowl[index]);
				fruits.addFruit(fruitBowl[index]);
				break;
			case "banana":
				bananas.addBananas(fruitBowl[index]);
				fruits.addFruit(fruitBowl[index]);
				break;
			default:
				System.out.println("Unknown fruit");
				fruits.addFruit(fruitBowl[index]);
				break;
			}

		}
		System.out.println(apples.getCountOfApples());
		System.out.println(oranges.getCountOfOranges());
		System.out.println(bananas.getCountOfBanana());
		System.out.println(bananas.getBowlOfBanana());

	}
	

}
