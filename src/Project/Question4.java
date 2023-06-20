package Project;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Array length: ");
		int length = kb.nextInt();
		System.out.println("Enter numbers: ");
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = kb.nextInt();
		}
		kb.close();
		System.out.println("Before sorting:");
		printArray(array);
		bubbleSort(array);
		System.out.println("After sorting:");
		printArray(array);
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swap array[j] and array[j+1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
			// If no two elements were swapped in the inner loop, then the array is already
			// sorted
			if (!swapped) {
				break;
			}
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}