package com.gqt.corejava.Strings;

import java.util.Scanner;

public class CompareCaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = sc.next();
		System.out.println("Enter String 2 : ");
		String str2 = sc.next();
		if(str1.compareTo(str2) == 0) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}
		System.out.println("-----------------");
		System.out.println("Enter string 1 :");
		str1 = sc.next();
		System.out.println("Enter String 2 : ");
		str2 = sc.next();
		if(str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}
		sc.close();
	}

}
