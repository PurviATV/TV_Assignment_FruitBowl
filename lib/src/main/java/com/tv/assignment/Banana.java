package com.tv.assignment;

import java.util.ArrayList;

public class Banana {

	private static Banana instance = null;

	private Banana() {
	}

	public static Banana getInstance() {
		if (instance == null) {
			instance = new Banana();
		}
		return instance;
	}

	private ArrayList<String> bananaList = new ArrayList<>();

	public void addBananas(String banana) {
		bananaList.add(banana);
	}

	public int getCountOfBanana() {
		return bananaList.size();
	}

	public ArrayList<String> getBowlOfBanana() {
		return bananaList;

	}

	public void displayBowlOfBananas() {
		System.out.println(bananaList);
	}

}
