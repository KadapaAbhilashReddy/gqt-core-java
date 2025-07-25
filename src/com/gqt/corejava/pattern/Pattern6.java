package com.gqt.corejava.pattern;

import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be print :");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("1 ");
		}
		sc.close();
	}

}
