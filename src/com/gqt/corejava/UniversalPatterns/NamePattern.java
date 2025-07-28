/**
 * KADAPA ABHILASH REDDY
 */
package com.gqt.corejava.UniversalPatterns;

import java.util.Scanner;

/**
 * @author Abhilash Reddy
 * @category Name Pattern
 * @description Aim to print the Author Name
 */
public class NamePattern {

	/**
	 * @param args
	 * @description This source code is used for Printing Author Name
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size to print the Name : KADAPA ABHILASH REDDY");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(j==0 || i+j==(n/2) || i-j==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if((i==0  && j<=(n/2)) || (i==(n/2) && j<=(n/2)) || j==0 || (j==(n/2) && i<=(n/2))) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if((i==0 && j<=(n/2)) || i+j==(n/2) || i-j==(n/2) || (i==(n-1) && j<=(n/2)) || j==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(j==0 || i==(n/2) || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || j==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(j==0 || i==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || j==0 || j==(n-1) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || (j==0 && i<=(n/2)) || (j==n-1 && i>=(n/2)) || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(j==0 || i==(n/2) || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if((i==0 && j<=(n/2)) || i+j==(n/2) || i-j==(n/2) || j==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || j==0 || i==(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("\t");
			for(int j = 0; j<n; j++) {
				if((i==j && i<=(n/2)) || (i+j==(n-1) && i<=(n/2)) || (j==(n/2)) && i>=(n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
