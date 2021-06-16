package com.tv.assignment;

import java.util.ArrayList;

public class Apple  {

    static ArrayList<String> appleList = new ArrayList<>();


	public int getCountOfApples() {
		return appleList.size();
	}

	public void displayBowlOfApples() {
		System.out.println(appleList);
	}
}
