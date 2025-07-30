package com.gqt.corejava.pattern;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		// Upper half including middle
        for (int i = 1; i <= n; i++) {
            // Spaces before numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            System.out.print(i+ " "); // First number

            if (i != 1) {
                // Spaces between numbers
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("  ");
                }
                System.out.print(i); // Second number
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces before numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            System.out.print(i + " "); // First number

            if (i != 1) {
                // Spaces between numbers
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("  ");
                }
                System.out.print(i); // Second number
            }

            System.out.println();
        }
        sc.close();
	}
	
}

