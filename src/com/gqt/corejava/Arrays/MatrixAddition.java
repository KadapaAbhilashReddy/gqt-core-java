/**
 * To perform Matrix Addition
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Array
 * @description This code is used to Perform Matrix Addition
 */
class Addition{
	Scanner sc = new Scanner(System.in);
	int arr[][];
	int brr[][];
	int crr[][];
	void createArray() {
		System.out.println("To perform Matrix Addition please enter values.....");
		System.out.println("Enter the number of rows of array A: ");
		int r1 = sc.nextInt();
		System.out.println("Enter the nuber of columns of array A: ");
		int c1 = sc.nextInt();
		arr = new int[r1][c1];
		System.out.println("------------------------------------------");
		System.out.println("Enter the number of rows in array B: ");
		int r2 = sc.nextInt();
		System.out.println("Enter the nuber of columns of array B: ");
		int c2 = sc.nextInt();
		brr = new int[r2][c2];
		
		if (r1 != r2 || c1 != c2) {
			System.out.println("Error: Matrices must have the same dimensions for addition.");
			System.out.println("Please restart the program and enter matching dimensions.");
			System.exit(0);
		}
		crr = new int[r1][c1];
		System.out.println("---------------------------");
		System.out.println("Array created");
		System.out.println("---------------------------");
		}
	void collectData() {
		System.out.println("Enter the data for Matrix A:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside row :" + (i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the column " + (j+1) + " value");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("----------------------------");
		System.out.println("Enter the data for Matrix B:");
		for(int i=0;i<brr.length;i++) {
			System.out.println("Inside row :" + (i+1));
			for(int j=0;j<brr[i].length;j++) {
				System.out.println("Enter the column " + (j+1) + " value");
				brr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Data collected");
		System.out.println("-----------------------------");
	}
	void additionOfMatrix() {
		System.out.println("Performing Matrix addition");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
			}
		}
		System.out.println("Processing................");
		System.out.println("Matrix Addition completed.");
		System.out.println("--------------------------");
	}
	void displayData() {
		System.out.println("The matrix A is: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println("The matrix B is: ");
		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println("The final Matrix after additon of A and B matrices is : ");
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				System.out.print(crr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
public class MatrixAddition {

	/**
	 * @param args
	 * @description This source code is used to call methods for performing Matrix Addition.
	 */
	public static void main(String[] args) {
		Addition a = new Addition();
		a.createArray();
		a.collectData();
		a.additionOfMatrix();
		a.displayData();
	}

}
