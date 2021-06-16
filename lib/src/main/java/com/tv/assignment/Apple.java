package com.tv.assignment;

import java.util.ArrayList;

public class Apple extends FruitBowl{


	static ArrayList<String> appleList = new ArrayList<>();


	public void displayCount() {
		System.out.println(appleList.size());
	}

	public void displayFruits() {
		System.out.println(appleList);
	}
}
