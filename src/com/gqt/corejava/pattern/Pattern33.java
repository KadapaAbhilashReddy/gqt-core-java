package com.gqt.corejava.pattern;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
            // Print leading spaces for pyramid shape
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Starting character for this row
            char ch = (char) ('A' + (2 * i - 2));

            // Print characters in reverse
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print((char)(ch - j) + " ");
            }

            System.out.println();
        }
		sc.close();

	}

}
