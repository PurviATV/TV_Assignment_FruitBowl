package com.tv.assignment;

import java.util.ArrayList;

public class Banana {


	static ArrayList<String> bananaList = new ArrayList<>();


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
