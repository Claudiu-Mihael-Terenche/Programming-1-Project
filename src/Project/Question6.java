package Project;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Array length: ");
		int n = kb.nextInt();
		System.out.println("Enter numbers: ");
		int nums[] = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = kb.nextInt();
		}
		kb.close();
		int copy[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			copy[i] = 0;
		}
		for (int i = 0; i < copy.length; i++) {
			if (nums[i] > 0) {
				copy[nums[i] - 1] = 1;
			}
		}
		int missing = 0;
		for (int i = 0; i < copy.length; i++) {
			if (copy[i] == 0) {
				missing = i + 1;
			}
		}
		System.out.printf("Missing Number is: %d", missing);
	}
}