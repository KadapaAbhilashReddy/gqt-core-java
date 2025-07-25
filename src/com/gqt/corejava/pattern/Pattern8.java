package com.gqt.corejava.pattern;

import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array to be print with star ;");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
