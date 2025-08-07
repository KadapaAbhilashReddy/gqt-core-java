package com.gqt.corejava.Encapsulation;

class Lion{
	private String name;
	private String color;
	private String country;
	private int age;
	
	void setData1() {
		name = "Kiran";
		color = "Yellow";
		country = "Africa";
		age = 9;
	}
	
	void getData() {
		System.out.println("Name = " + name);
		System.out.println("Color = " + color);
		System.out.println("Country = " + country);
		System.out.println("Age = " + age);
	}
	
	void setData2(String a, String b, String c, int d) {
		name = a;
		color = b;
		country = c;
		age = d;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
//		l.name; // private members cannot be accessed outside the class
//		l.color; // private members cannot be accessed outside the class
//		l.country; // private members cannot be accessed outside the class
//		l.age; // private members cannot be accessed outside the class
		l.setData1();
		l.getData();
		System.out.println("----------------");
		l.setData2("Rame", "White", "India", 14);
		l.getData();
	}

}
