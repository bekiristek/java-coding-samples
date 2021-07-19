package com.bekiristek.rea;

/*	
 
@Author= bekir istek
@Date= 15.07.2021

Question-4 ==> You have a sum of money, p, that you want to invest. 
You want to know how many years, y, 
this sum has to be kept in the bank in order for this sum of money to amount to a predetermined dollar amount, d. 
The sum is kept for y years in the bank where interest, i, is paid yearly, and the new sum is re-invested yearly after paying tax, t. 
Note that the principal is not taxed; only the year's accrued interest is taxed.

*/

public class Calculate {

	static int year = 0;

	public static int calculateYears(Double principal, Double interest, Double tax, Double desiredPrincipal) {

		while (principal < desiredPrincipal) {

			double afterInterestPrincipal = principal * interest;

			double taxCut = afterInterestPrincipal * tax;

			double totalMoney = principal + (afterInterestPrincipal - taxCut);

			principal = totalMoney;

			year++;
		}

		return year;
	}

}
