package com.gqt.corejava.Strings;

public class MutableBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sd1 = new StringBuilder("Ramayana");
		StringBuilder sd2 = new StringBuilder(" is a best mythological story");
		sd1.append(sd2);
		System.out.println(sd1);
		StringBuffer sd3 = new StringBuffer("Mahabharath");
		StringBuffer sd4 = new StringBuffer(" is the best mythological history");
		sd3.append(sd4);
		System.out.println(sd3);
	}

}
