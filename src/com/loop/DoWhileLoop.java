package com.loop;
/**
 * DoWhileLoop the condition is check later. it will  execute the block atleast once. 
 * if we want to execute the block atleast once even codition is false.
 * @author 91952
 *
 */
public class DoWhileLoop { // created class dowhileloop
	/**
	 * main method for the execution 
	 * @param args
	 */
	public static void main(String [] args) { // main method for execution
		int i= 1; //Initialized variable i =1
		do { // using do for the task
			System.out.println(i); //printing value of i 
			i++; //incrementing i
		}
		while(i<=10); //exit condition check if condition fail then loop will break
		}
	}


