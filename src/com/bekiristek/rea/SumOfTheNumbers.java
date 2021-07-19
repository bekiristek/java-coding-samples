package com.bekiristek.rea;

/*	
 
@Author= bekir istek
@Date= 15.07.2021

Question-1 ==> Given two integers, a and b, find the inclusive sum of all the integers between them and return it. 
If a equals b, return either a or b. Note that a and b are not ordered and that integers can be either positive or negative. 
	
*/

public class SumOfTheNumbers {

	int sum;

	public int getSum(int a, int b) {

		if (b > a || a == b) {
			while (a <= b) {
				sum += a;
				a++;
			}
		}

		else {
			while (a >= b) {
				sum += a;
				a--;
			}

		}

		return sum;

	}

}
