package com.tv.assignment;

import java.util.ArrayList;

public class Orange {


	static ArrayList<String> orangeList = new ArrayList<>();


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
