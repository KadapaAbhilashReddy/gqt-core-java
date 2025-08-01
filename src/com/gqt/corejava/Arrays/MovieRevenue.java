/**
 * To know whether the Movie made profit or not in terms of revenue
 */
package com.gqt.corejava.Arrays;

import java.util.Scanner;
/**
 * @author Abhilash Reddy
 * @category Array
 * @description To check Movie revenue
 */
class Movie {
	    long arr[][][];
	    long total_investment;
	    long previous_profit;
	    long sum_of_revenue;
	    Scanner sc = new Scanner(System.in);
	    void createArray(){
	    System.out.println("Enter how many languages :");
	    int n = sc.nextInt();
	    arr = new long[n][][];
	    for(int i =0; i<arr.length; i++){
	        System.out.println("Enter the how many category of films in language : " + (i+1));
	        arr[i] = new long [sc.nextInt()][];
	    }
	    for(int i = 0; i<arr.length; i++){
	        System.out.println("Inside the Language  :" + (i+1));
	        for(int j = 0; j<arr[i].length; j++){
	            System.out.println("Enter the no of movies in category:"+ (j+1));
	            arr[i][j] = new long[sc.nextInt()];
	        }
	    }
	        System.out.println("Array created");
	        System.out.println("------------");
	    }
	    void collectData(){
	        for(int i = 0; i<arr.length; i++){
	            System.out.println("Inside Language :" + (i+1));
	            for(int j =0; j<arr[i].length; j++){
	                System.out.println("Inside category :" + (j+1));
	                for(int k =0; k<arr[i][j].length; k++){
	                    System.out.println("Enter the movie revenue :" + (k+1));
	                    arr[i][j][k] = sc.nextLong();
	                    sum_of_revenue += arr[i][j][k];
	                }
	            } 
	        }
	    System.out.println("Data collected");
	    System.out.println("------------");
	    }
	    void calculateData() {
	    	System.out.println("Enter the investment : ");
	    	total_investment = sc.nextLong();
	    	System.out.println("The investment is: " + total_investment);
	    	System.out.println("The total revenue is: "+ sum_of_revenue);
	    	if(total_investment<sum_of_revenue) {
	    		System.out.println("Hemanth made profit of " + (sum_of_revenue - total_investment));
	    	}
	    	else {
	    		System.out.println("Hemanth incured loss of " + (total_investment-sum_of_revenue));
	    	}
	    	long profit = sum_of_revenue - total_investment;
	    	System.out.println("Enter Previous year profit :");
	    	previous_profit = sc.nextLong();
	    	System.out.println("The previous year profit is : " + previous_profit);
	    	if(profit<previous_profit) {
	    		System.out.println("Hemanth got less profit than previous year.");
	    	}
	    	else {
	    		System.out.println("Hemanth got more profit than previous year and the more profit than previous year is: " + (sum_of_revenue - total_investment-previous_profit));
	    	}
	    }
	    void displayData(){
	        for(int i = 0; i<arr.length; i++){
	            System.out.println("Inside Language :" + (i+1));
	            for(int j =0; j<arr[i].length; j++){
	                System.out.println("Inside category :" + (j+1));
	                for(int k =0; k<arr[i][j].length; k++){
	                    System.out.println("The revenue movie " + (k+1) + " made " + "is : " + arr[i][j][k]);
	                }
	            }
	        }
	        System.out.println("--------------");
	    }
}

public class MovieRevenue {

	/**
	 * @param args
	 * @description This main source is used to retrive data for Movie revenue
	 */
	public static void main(String[] args) {
		 Movie m = new Movie();
	        m.createArray();
	        m.collectData();
	        m.displayData();
	        m.calculateData();
	}

}
