package Project;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		// Get the size of the array from the user
		System.out.print("Enter the number of rows: ");
		int rows = kb.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = kb.nextInt();

		// Create the multidimensional array
		int[][] array = new int[rows][cols];
		// Fill the array with random numbers between 1 and 100
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = (int) (Math.random() * 100) + 1;
			}
		}

		// Print the original array
		System.out.println("Original Array:");
		printArray(array);

		// Get the number to be removed from the user
		System.out.print("Enter the number to remove: ");
		int targetNumber = kb.nextInt();

		// Search for the target number in the array and replace it with zero
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (array[i][j] == targetNumber) {
					array[i][j] = 0;
				}
			}
		}

		// Print the modified array
		System.out.println("Modified Array:");
		printArray(array);
		kb.close();

	}
	// Helper method to print the array
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
