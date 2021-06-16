package com.tv.assignment;

import java.util.ArrayList;

public class Banana extends FruitBowl{


	static ArrayList<String> bananaList = new ArrayList<>();


	public void displayCount() {
		System.out.println(bananaList.size());
	}

	public ArrayList<String> getBowlOfBanana() {
		return bananaList;

	}

	public void displayFruits() {
		System.out.println(bananaList);
	}

}
