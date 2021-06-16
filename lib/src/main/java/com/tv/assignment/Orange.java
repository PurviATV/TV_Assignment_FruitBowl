package com.tv.assignment;

import java.util.ArrayList;

public class Orange extends FruitBowl{


	static ArrayList<String> orangeList = new ArrayList<>();


	public void displayCount() {
		System.out.println(orangeList.size());
	}

	public ArrayList<String> getBowlOfOranges() {
		return orangeList;

	}
	public void displayFruits() {
		System.out.println(orangeList);
	}

}
