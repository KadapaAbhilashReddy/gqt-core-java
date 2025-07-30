/**
 * 
 */
package com.gqt.corejava.pattern;

import java.util.Scanner;
/*
 * #
 * # #
 * # - #
 * # - - #
 * # # # # #
 */

/**
 * @author Abhi
 * @category Conditional Statements
 * @description This is an example for the pattern 2
 */
public class NewPattern2 {

	/**
	 * @param args
	 * @description This is the source code for the Pattern - 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0 || i==n-1|| j==0 || j==i) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
