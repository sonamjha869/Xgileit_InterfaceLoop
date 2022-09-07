package com.loop;

/**
 * Neasted loop we have one loop under another loop
 * @author 91952
 *
 */
public class NeastedLoop { // created a class nested loop
	/**
	 * main method
	 * @param args
	 */
	public static void main(String [] args) { //main method for execution the code
		for(int i=1; i<=4; i++) // outer loop everything in one line initialization condition check and incrementation
		{
			for(int j=1; j<=4; j++) //inner loop everything in one line initialization,condition check and incrementation
			{
				System.out.print("*");
			}
			System.out.print("*");
		}
		System.out.print("*");
	}
}
