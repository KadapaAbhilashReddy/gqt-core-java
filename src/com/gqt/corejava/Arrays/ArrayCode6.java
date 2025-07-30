/**
 * Example of a Structured Three dimensional Jagged array for collecting  data
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Array
 * @description Structured Example of a Three dimensional Jagged Array in which we collect n students names in each 3 class
 */
class Code6 {
	String arr[][][];
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Enter School count :");
		int scl = sc.nextInt();
		
		//Creating an Array
		arr = new String[scl][][];
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter the number of classes in school no-" + (i+1));
			arr[i] = new String[sc.nextInt()][];
		}
		for(int i =0; i<arr.length; i++) {
			System.out.println("inside School no "+ (i+1));
			for(int j =0; j<arr[i].length; j++) {
				System.out.println("Enter the number of students in class no-" + (j+1));
				arr[i][j] = new String[sc.nextInt()];
			
			}
				
		}
		
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
public class ArrayCode6 {

	/**
	 * @param args
	 * @description This source code represents the Structured Three dimensional Jagged Array for multiple data collection Example
	 */
	public static void main(String[] args) {
		Code6 c = new Code6();
		c.createArray();
		c.collectData();
		c.displayData();

	}

}
