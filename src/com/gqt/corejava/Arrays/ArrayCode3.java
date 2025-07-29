/**
 * Example of a Structured Two dimensional array
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Array
 * @description Structured Example of a Two dimensional Array in which we collect 3 students names in each 3 class
 */
class Code3 {
	String arr[][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter Class count :");
		int cls = sc.nextInt();
		System.out.println("Enter Student count :");
		int stu = sc.nextInt();
	
		//Creating an Array
		arr = new String[cls][stu];
		System.out.println("Array Created");
		System.out.println("---------------");
	}
	void collectData() {
		//Collecting the data from user
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Inside class no: " + (i+1));
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("Enter the name of the student no: " + (j+1));
			arr[i][j] = sc.next();
			}
		}
		System.out.println("Data collected");
		System.out.println("----------------");
	}
	void displayData() {
			//Displaying the Students data
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Inside class no: " + (i+1));
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("The name of the student no: " + (j+1) + " is = " + arr[i][j]);
			}
		}
		System.out.println("----------------");
	}
}
public class ArrayCode3 {

	/**
	 * @param args
	 * @description This source code represents the Structured Array Example
	 */
	public static void main(String[] args) {
		Code3 c = new Code3();
		c.createArray();
		c.collectData();
		c.displayData();

	}

}
