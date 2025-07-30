package com.gqt.corejava.pattern;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.print("A ");
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
        sc.close();

	}

}
