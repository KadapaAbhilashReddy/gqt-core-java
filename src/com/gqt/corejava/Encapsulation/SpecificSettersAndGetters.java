package com.gqt.corejava.Encapsulation;

import java.util.Scanner;
class Dog2{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
public class SpecificSettersAndGetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog2 d2 = new Dog2();
		System.out.println("Enter Name : ");
		d2.setName(sc.nextLine());
		System.out.println("Enter Color : ");
		d2.setColor(sc.nextLine());
		System.out.println("Enter Breed : ");
		d2.setBreed(sc.nextLine());
		System.out.println("Enter age : ");
		d2.setAge(sc.nextInt());
		System.out.println("Enter Cost : ");
		d2.setCost(sc.nextInt());
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		sc.close();
	}
}

