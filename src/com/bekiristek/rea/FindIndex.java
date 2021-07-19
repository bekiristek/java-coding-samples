package com.bekiristek.rea;

/*	
 
@Author= bekir istek
@Date= 15.07.2021

Question-3 ==> You are given an array of integers. 
Your job is to take that array and find an index, n, where the sum of the integers to the left of n is equal to the sum of the integers to the right of n. 
If there is no such index that would make this happen, return -1.

*/

public class FindIndex {
	
	public static int findEvenIndex(int arr[]) {

		int [] prefixSum = new int[arr.length];
		
		prefixSum[0] = arr[0];
		for (int i = 1; i <arr.length ; i++)
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		

		int[] suffixSum = new int[arr.length];
		
		suffixSum[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--)
			suffixSum[i] = suffixSum[i + 1] + arr[i];
		

		for (int i = 1; i < arr.length - 1; i++) {
			if (prefixSum[i] == suffixSum[i]) {
				return i;
			}
				
		}

		return -1;
	}

}
