package Project;

import java.util.Scanner;

public class Question5 {

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
		for (int i = 0; i < nums.length; i++) {
			int check = 1;
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[i] == nums[j+1]) {
					check++;
				}
			}
			if (check >= n / 2) {
				System.out.printf("Majority element is: %d", nums[i]);
				break;
			}
		}
	}
}