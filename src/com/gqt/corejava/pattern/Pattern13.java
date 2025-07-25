package com.gqt.corejava.pattern;

import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			int count = i;
			for(int j = 1; j<=n; j++) {
				System.out.print(count + "	");
				count = count+n;
			}
			System.out.println();
		}
		sc.close();
	}

}
