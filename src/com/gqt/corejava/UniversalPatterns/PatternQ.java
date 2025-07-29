/**
 * Q
 */
package com.gqt.corejava.UniversalPatterns;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Universal Pattern
 * @description Printing the Pattern Q
 */
public class PatternQ {

	/**
	 * @param args
	 * @description This source code is for Printing Pattern Alphabet Q
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program is to print alphabet Q");
		System.out.println("Enter the size");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if((i==0 && j<=(n-2) && j!=0 && j!=(n-2))|| (j==0 && i<=(n-2) && i!=0 && i!=(n-2)) || (j==(n-2) && i<=(n-2) && i!=0 && i!=(n-2)) || (i==(n-2) && j<=(n-2) && j!=0 && j!=(n-2)) || (i==j && i>=(n-3))) {
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
