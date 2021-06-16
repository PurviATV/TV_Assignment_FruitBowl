package com.tv.assignment;

import java.util.ArrayList;

public class Apple extends Fruit {

	static ArrayList<String> appleList = new ArrayList<>();
	static int countOfApples=0;

	


	public void addApples(String apple) {
		appleList.add(apple);
		countOfApples++;
	}

	public int getCountOfApples() {
		return countOfApples;
	}

	public ArrayList<String> getBowlOfApples() {
		return appleList;

	}
}
