package com.chay;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class ElementDiff_Scanner {
	

	public static void main(String args[]){
	      
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Enter the length of the array: ");  
		  //reading the number of elements from the that we want to enter  
		  Integer length=sc.nextInt();  
		  
		//creates an array in the memory of length  
		  Integer[] array = new Integer[length];  
		  System.out.println("Enter the elements of the array: ");
		  
		  for(int i=0; i<length; i++ ) {
		         array[i] = sc.nextInt();
		      }
		  	
		  	  System.out.println("Elements of array:");	
		      System.out.println(Arrays.toString(array));
		      
//		      Converting Array into Collections
		      
		      List<Integer> Arr = Arrays.asList(array);
		      int Len = Arr.size();
		      System.out.println("Size of the New Collections Array: " + Len);
		      
//		      Enter the Index First Element to be Calculated for difference
		      
		      Integer E1 = Arr.get(3);
		      System.out.println("First Element: " + E1);
		      
		      
//		      Enter the Index Second Element to be Calculated for difference
		      
		      Integer E2 = Arr.get(5);
		      System.out.println("Second Element: " + E2);
		      
		      
//		      Result 
		      int result = Integer.MAX_VALUE;
		      
		      result = Math.min(E1 - E2, result);
		      
		      System.out.println("Distance between Two Elements in an Array: " + result);
		      
		      
		      
		      

	}
		    
		
}