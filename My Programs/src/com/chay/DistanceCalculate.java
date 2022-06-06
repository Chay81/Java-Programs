package com.chay;

import java.util.HashMap;

public class DistanceCalculate {
	
	// Java program to find the minimum distance
	// between two occurrences of the same element
	

			// Function to find the minimum
		// distance between the same elements
		static int minimumDistance(int[] a)
		{

			// Create a HashMap to
			// store (key, values) pair.
			HashMap<Integer, Integer> hmap = new HashMap<>();
			int minDistance = Integer.MAX_VALUE;

			// Initialize previousIndex
			// and currentIndex as 0
			int previousIndex = 0, currentIndex = 0;

			// Traverse the array and
			// find the minimum distance
			// between the same elements with map
			for (int i = 0; i < a.length; i++) {

				if (hmap.containsKey(a[i])) {
					currentIndex = i;

					// Fetch the previous index from map.
					previousIndex = hmap.get(a[i]);

					// Find the minimum distance.
					minDistance
						= Math.min(
							(currentIndex - previousIndex),
							minDistance);
				}

				// Update the map.
				hmap.put(a[i], i);
			}

			// return minimum distance,
			// if no such elements found, return -1
			return (
				minDistance == Integer.MAX_VALUE
					? -1
					: minDistance);
		}

		// Driver code
		public static void main(String args[])
		{

			// Test Case 1:
			int a1[] = { 1, 2, 3, 2, 1 };
			System.out.println(minimumDistance(a1));

			// Test Case 2:
			int a2[] = { 3, 5, 4, 6, 5, 3 };
			System.out.println(minimumDistance(a2));

			// Test Case 3:
			int a3[] = { 1, 2, 1, 4, 1 };
			System.out.println(minimumDistance(a3));
		}
	}
