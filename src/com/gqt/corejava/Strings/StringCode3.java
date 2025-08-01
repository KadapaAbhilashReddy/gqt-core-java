/**
 * String object equals case
 */
package com.gqt.corejava.Strings;

/**
 * @author Abhilash Reddy
 * @category Strings
 * @description To check the Strings objects are equal or not in equals case
 */
public class StringCode3 {

	/**
	 * @param args
	 * @description This source code is used to check whether strings objects are equal and reference are equals in equals case
	 */
	public static void main(String[] args) {
		String s1 = new String("RAMA");
		String s2 = new String("RAMA");
		String s3 = new String("rama");
		String s4 = new String("SITA");
		System.out.println("Case-1 : Same Strings");
		if(s1.equals(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-------------------------");
		if(s1==s2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("==================");
		System.out.println("Case-2 : Different Strings");
		if(s1.equals(s4)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-------------------------");
		if(s1==s4) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("==================");
		System.out.println("Case-3 : Same Strings but different cases");
		if(s1.equals(s3)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		System.out.println("-------------------------");
		if(s1==s3) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
	}

}
