package com.bekiristek.rea;

/*	

@Author= bekir istek
@Date= 15.07.2021

 Driver code

*/

public class Main {

	public static void main(String[] args) {

		// Question-1
		SumOfTheNumbers sum = new SumOfTheNumbers();
		
		System.out.println("The sum of the numbers between given two integers : "+sum.getSum(-1, 2));

		
		
		// Question-2
		int array[] = { 23, 40, 73, 327, 700 };

		if (AscOrder.isAscOrder(array)) {
			System.out.println("The array is ascending order.");
		} else {
			System.out.println("The array isn't ascending order.");
		}

		
		
		// Question-3
		int arr[] = { 1, 100, 50, -51, 1, 1};
		System.out.println("Index number : "+FindIndex.findEvenIndex(arr));
		
		
		
		// Question-4
		System.out.println("Number of years to wait : "+Calculate.calculateYears(1000.0, 0.05, 0.18, 1100.0));

	}

}
