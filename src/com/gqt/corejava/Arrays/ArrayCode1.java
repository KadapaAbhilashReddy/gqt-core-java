/**
 * Example of Unstructured Array
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Array
 * @description Example for Array
 */
public class ArrayCode1 {

	/**
	 * @param args
	 * @description This source code represents the Unstructured Array Example  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students :");
		int n = sc.nextInt();
		//Creating an Array
		int arr[] = new int[n];
		
		//Collecting the data from user
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter the marks of Student no-" + (i+1) + ":");
			arr[i] = sc.nextInt();
		}
		System.out.println("-----------");
		
		//Displaying the Students data
		for(int i = 0; i<arr.length; i++) {
			System.out.println("The marks of Student no -" + (i+1) + " is = " + arr[i]);
		}
		sc.close();
	}
	
}
