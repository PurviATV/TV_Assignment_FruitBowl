package com.tv.assignment;

import java.util.ArrayList;

public class Orange {

	private static Orange instance = null;

	private Orange() {
	}

	public static Orange getInstance() {
		if (instance == null) {
			instance = new Orange();
		}
		return instance;
	}

	private ArrayList<String> orangeList = new ArrayList<>();

	public void addOranges(String orange) {
		orangeList.add(orange);
	}

	public int getCountOfOranges() {
		return orangeList.size();
	}

	public ArrayList<String> getBowlOfOranges() {
		return orangeList;

	}
	public void displayBowlOfOranges() {
		System.out.println(orangeList);
	}

}
