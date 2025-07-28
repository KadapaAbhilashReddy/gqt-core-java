/**
 * 4
 */
package com.gqt.corejava.UniversalPatternsNumbers;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Universal Pattern
 * @description Printing the Pattern Number 4
 */
public class PatternNumericNo4 {

	/**
	 * @param args
	 * @description This source code is for Printing Pattern Number 4
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program is to print Numeric No 4");
		System.out.println("Enter the size");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(j==(n/2) || i==(n/2) || i+j==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}

