package com.daryn.Lab1;

import java.lang.reflect.Array;

public class SearchCheck {

	public static void main(String [] args)
	{
		String [] stringList = new String [4];
		stringList[0] = "hello";
		stringList[1] = "there";
		stringList[2] = "Mr";
		stringList[3] = "Jones";
		stringList[4] = "Good";
		
		LinearSearch search = new LinearSearch();
		
		search.search(stringList, "hello");
		
		System.out.print(search.stringPosition);
		
	}
}
