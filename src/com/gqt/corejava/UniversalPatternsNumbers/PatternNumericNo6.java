/**
 * 6
 */
package com.gqt.corejava.UniversalPatternsNumbers;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Universal Pattern
 * @description Printing the Pattern Number 6
 */
public class PatternNumericNo6 {

	/**
	 * @param args
	 * @description This source code is for Printing Pattern Number 6
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program is to print Numeric No 6");
		System.out.println("Enter the size");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if((i==0 && j!=0 && j!=(n-1)) || (i==(n-1) && j!=0 && j!=(n-1)) || (i==(n/2) && j!=(n-1)) || (j==0 && i!=0 && i!=(n-1)) || (j==(n-1) && i>(n/2) && i!=0 && i!=(n-1))) {
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
