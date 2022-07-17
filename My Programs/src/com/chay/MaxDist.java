package com.chay;

public class MaxDist {
	
	// Java Program to implement
	// the above approach
	
	// Function to find the minimum
		// distance between the minimum
		// and the maximum element}
		public static int minDistance(int a[], int n)
		{

			// Stores the minimum and maximum
			// array element
			int max = -1, min = Integer.MAX_VALUE;

			// Stores the most recently traversed
			// indices of the minimum and the
			// maximum element
			int min_index = -1, max_index = -1;

			// Stores the minimum distance
			// between the minimum and the
			// maximum
			int min_dist = n + 1;

			// Find the maximum and
			// the minimum element
			// from the given array
			for (int i = 0; i < n; i++) {
				if (a[i] > max)
					max = a[i];
				if (a[i] < min)
					min = a[i];
			}

			// Find the minimum distance
			for (int i = 0; i < n; i++) {

				// Check if current element
				// is equal to minimum
				if (a[i] == min)
					min_index = i;

				// Check if current element
				// is equal to maximum
				if (a[i] == max)
					max_index = i;

				// If both the minimum and the
				// maximum element has
				//	 occurred at least once
				if (min_index != -1
					&& max_index != -1)
					min_dist
						= Math.min(min_dist,
								Math.abs(min_index
											- max_index));
			}
			return min_dist;
		}

		// Driver Code
		public static void main(String[] args)
		{
			int n = 12;
			int a[] = { 3, 2, 1, 2, 1, 4,
						5, 8, 6, 7, 8, 2 };
			System.out.println(minDistance(a, n));
		}
	}


