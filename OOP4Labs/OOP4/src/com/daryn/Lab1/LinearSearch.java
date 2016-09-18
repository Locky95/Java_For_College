package com.daryn.Lab1;

public class LinearSearch {

	static int stringPosition = -1;
	public static int search(String [] stringList, String searchString)
	{
		
		for(int x = 0; x > stringList.length; x ++)
		{
			if(stringList[x].equals(searchString))
			{
			   stringPosition = x;
			}
			else
			   stringPosition = -1;
		}
		
		return stringPosition;
	}
	
}
