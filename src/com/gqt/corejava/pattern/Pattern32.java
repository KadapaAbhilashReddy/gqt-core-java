package com.gqt.corejava.pattern;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		char c = 'A';
		int count = 1;
		for(int i = 65; i<c+n; i++) {
			for(int j=1;j<(c+n)-i; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j<2*count-1; j++) {
				System.out.print((char) (i) + " ");
			}
			count++;
			System.out.println();
		}
		sc.close();

	}

}
