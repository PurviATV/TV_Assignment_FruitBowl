package com.tv.assignment;

import java.util.ArrayList;

public class Banana extends Fruit{
	static ArrayList<String> bananaList = new ArrayList<>();
	static int countOfBanana;

	public Banana() {
		countOfBanana = 0;
	}

	public void addBananas(String banana) {
		bananaList.add(banana);
		countOfBanana++;
	}

	public int getCountOfBanana() {
		return countOfBanana;
	}
	public ArrayList<String> getBowlOfBanana() {
		return bananaList;

	}

}
