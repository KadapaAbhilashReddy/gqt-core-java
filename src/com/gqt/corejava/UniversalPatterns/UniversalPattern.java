/**
 * 
 */
package com.gqt.corejava.UniversalPatterns;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category This is an universal pattern
 * @description This pattern helps to print all alphabets and numbers and its logic is great.
 */
public class UniversalPattern {

	/**
	 * @param args
	 * @description This source code is used to print Universal Pattern, in which all Alphabets and numbers will be there. 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ||
				   i==(n/2) || j==(n/2) ||
				   i==j || i+j==(n-1) ||
				   i+j==(n/2) || j-i==(n/2) || i-j==(n/2) || i+j==((n-1)+(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) ||
				   i==(n/2) || j==(n/2) ||
				   i==j || i+j==(n-1) ||
				   i+j==(n/2) || j-i==(n/2) || i-j==(n/2) || i+j==((n-1)+(n/2))) 
				{
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
