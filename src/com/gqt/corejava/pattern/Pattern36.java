package com.gqt.corejava.pattern;

import java.util.Scanner;
public class Pattern36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j-1) + " ");
            }
            System.out.println();
        }
        sc.close();
	}

}
