/**
 * Example of a Structured array
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Array
 * @description Structured Example of an Array
 */
class ArrayOperations {
	int arr[];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the number of Students :");
		int n = sc.nextInt();
		
		//Creating an Array
		arr = new int[n];
		System.out.println("Array Created");
		System.out.println("---------------");
	}
	void collectData() {
		//Collecting the data from user
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter the marks of Student no " + (i+1) + ":");
			arr[i] = sc.nextInt();
		}
		System.out.println("Data stored into the array");
		System.out.println("----------------");
	}
	void displayData() {
			//Displaying the Students data
			for(int i = 0; i<arr.length; i++) {
				System.out.println("The marks of Student no -" + (i+1) + " is = " + arr[i]);
			}
	}
}
public class ArrayCode2 {

	/**
	 * @param args
	 * @description This source code represents the Structured Array Example
	 */
	public static void main(String[] args) {
		ArrayOperations a0 = new ArrayOperations();
		a0.createArray();
		a0.collectData();
		a0.displayData();

	}

}
