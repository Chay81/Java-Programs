package com.chay;

import java.util.Arrays;
import java.util.List;


public class ArrayDiff {

	
		   public static void main(String args[]){
		      
			   List<Integer> Arr = Arrays.asList(23,93,56,92,39);
			  
		      int Len = Arr.size();
		      
		      int max = Arr.get(2); 
		      
		      int min = Arr.get(4);
		      
		      int result = Integer.MAX_VALUE;
		      
		      result = Math.min(max - min, result);
		    		  
		    		  
		      
		     System.out.println("Size of the Array: " + Len);
		      
		     System.out.println("First Element: " + max);
		      
		     System.out.println("Second Element: " + min);
		     
		     System.out.println("Distance between Two Elements of an Array: " + result);
		      
		   }
		   
		}

