package com.tv.assignment;

import java.util.ArrayList;

public class Orange extends Fruit {

	static ArrayList<String> orangeList = new ArrayList<>();
	static int countOfOranges;

	public Orange() {
		countOfOranges = 0;
	}

	public void addOranges(String orange) {
		orangeList.add(orange);
		countOfOranges++;
	}

	public int getCountOfOranges() {
		return countOfOranges;
	}
	public ArrayList<String> getBowlOfOranges() {
		return orangeList;

	}

}
