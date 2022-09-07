package com.loop;

/**
 * when you don't know starting and ending point. like u don't know how many times user will type the message
 * @author 91952
 *
 */
public class WhileLoop { // created a class while loop
	/**
	 * main method for execution the code
	 * @param args
	 */
	public static void main(String [] args) { // created a main method for execution the code.
		int i=1; //Initialization variable i =1
		while(i<=10) { // entry condition check if if condition fail then loop will break
			System.out.println(i); //printing value i
			i++; // incrementing i
		}
	}

}
