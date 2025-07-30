package com.gqt.corejava.pattern;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			for(int k = 2; k<=i; k++) {
				System.out.print((i-k)+1 + " ");
			}
			System.out.println();
		}
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("  ");
			}
			for(int j = n-1; j>=i; j--) {
				System.out.print((n-j) + " ");
			}
			for(int j = n-1; j>i; j--) {
				System.out.print((j-i) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
