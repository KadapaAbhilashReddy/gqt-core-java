/**
 * Example of a Structured Three dimensional Constant array for collecting  data
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Array
 * @description Structured Example of a Three dimensional Constant Array in which we collect n students names in each 3 class
 */
class Code5 {
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter School count :");
		int scl = sc.nextInt();
		System.out.println("Enter Class count in each school :");
		int cls = sc.nextInt();
		System.out.println("Enter Student count in each class :");
		int stu = sc.nextInt();
	
		//Creating an Array
		arr = new String[scl][cls][stu];
		
		System.out.println("Array Created");
		System.out.println("---------------");
	}
	void collectData() {
		//Collecting the data from user
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Inside school no: " + (i+1));
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("Inside class no: " + (j+1));
				for(int k = 0; k<arr[i][j].length; k++) {
					System.out.println("Enter the name of the student no: " + (k+1));
					arr[i][j][k] = sc.next();
				}
			
			}
		}
		System.out.println("Data collected");
		System.out.println("----------------");
	}
	void displayData() {
			//Displaying the Students data
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Inside school no: " + (i+1));
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println("Inside class no: " + (j+1));
				for(int k = 0; k<arr[i][j].length; k++) {
					System.out.println("The name of the student no: " + (k+1) + " is = " + arr[i][j][k]);
				}
			}
		}
		System.out.println("----------------");
	}
}
public class ArrayCode5 {

	/**
	 * @param args
	 * @description This source code represents the Structured Three dimensional Constant Array for multiple data collection Example
	 */
	public static void main(String[] args) {
		Code5 c = new Code5();
		c.createArray();
		c.collectData();
		c.displayData();

	}

}
