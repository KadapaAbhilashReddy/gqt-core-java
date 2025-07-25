package com.gqt.corejava.pattern;

import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many times the number to print :");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("1");
		}
		sc.close();
	}

}
