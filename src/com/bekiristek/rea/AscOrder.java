package com.bekiristek.rea;

/*	
@Author= bekir istek
@Date= 15.07.2021

Question-2 ==> Your function receives an array of positive integers as input. 
Your task is to determine whether the numbers are in ascending order.

*/

public class AscOrder {

	public static boolean isAscOrder(int[] array) {
		
		  for (int i = 0; i < array.length - 1; i++)
	        {
	            if (array[i] > array[i + 1]) {
	                return false;
	            }
	        }
	 
	        return true;
	}

}
