package com.gqt.corejava.Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String res = "";
		for(int i = str.length()-1; i>=0; i--) {
			res = res + str.charAt(i);
		}
		System.out.println("The reversed String is : " + res);
		if(str.equals(res) == true) {
		System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not a Palindrome");
		}
		sc.close();
	}
	
}

