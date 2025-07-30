/**
 * 
 */
package com.gqt.corejava.pattern;

import java.util.Scanner;
/*
 * - - - - - $
 * - - - - $ $ $
 * - - - $ $ $ $ $
 * - - $ $ $ $ $ $ $
 * - $ $ $ $ $ $ $ $ $
 */

/**
 * @author India
 * @category Pyramid pattern
 * @description Printing the pyramid  patter
 */
public class NewPattern3 {

	/**
	 * @param args
	 * @description This is the source code for Pyramid Pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = i; j<=n; j++) {
				System.out.print("- ");
			}
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print("& ");
			}
			System.out.println();
		}
		sc.close();
	}

}
