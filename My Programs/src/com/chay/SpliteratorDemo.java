package com.chay;

import java.util.ArrayList;

public class SpliteratorDemo
{
    public static void main(String[] args) 
    {
        // Create an array list for doubles.
        ArrayList<Integer> al = new ArrayList<>();
              
        // Add values to the array list.
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        
        //to print odd numbers
        System.out.println("Odd Numbers:");  
        al.stream().filter(o -> o % 2 != 0).
        forEach(System.out::println);

      //to print even numbers
        System.out.println("Even Numbers:");  
        al.stream().filter(o -> o % 2 == 0).
        forEach(System.out::println);

        
    }
    
}
        


