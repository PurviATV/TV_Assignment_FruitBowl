package com.tv.assignment;

import java.util.ArrayList;

public class Apple  {

	private static Apple instance = null;

	private Apple() {
	}

	public static Apple getInstance() {
		if (instance == null) {
			instance = new Apple();
		}
		return instance;
	}

	private ArrayList<String> appleList = new ArrayList<>();

	public void addApples(String apple) {
		appleList.add(apple);
	}

	public int getCountOfApples() {
		return appleList.size();
	}

	public ArrayList<String> getBowlOfApples() {
		return appleList;

	}
	public void displayBowlOfApples() {
		System.out.println(appleList);
	}
}
