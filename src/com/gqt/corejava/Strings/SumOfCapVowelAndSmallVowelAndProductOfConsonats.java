package com.gqt.corejava.Strings;

import java.util.Scanner;

public class SumOfCapVowelAndSmallVowelAndProductOfConsonats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		int Cap_vowel_count = 0;
		int Small_vowel_count = 0;
		int product = 1;
		for(int i = 0; i<str.length(); i++) {
			if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >='a' && str.charAt(i) <= 'z')) {
				if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || 
					str.charAt(i) == 'O' || str.charAt(i) == 'U') {
					Cap_vowel_count = Cap_vowel_count + str.charAt(i);
				}
				else if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					Small_vowel_count = Small_vowel_count + str.charAt(i);
				}
				else {
					product = product * str.charAt(i);
				}
			}
		}
		System.out.println("The Capital Case vowels sum in string is : " + Cap_vowel_count);
		System.out.println("The Small Case vowels sum in string is : " + Small_vowel_count);
		System.out.println("The product of Cosonant in string is : " + product);
		sc.close();
	}

}
