package Project;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Joker:");
		Scanner kb = new Scanner(System.in);
		int joker, nums;
		joker = kb.nextInt();
		System.out.println("Number :");
		nums = kb.nextInt();
		System.out.println("Enter numbers:");
		int arr[] = new int[nums];
		for (int i = 0; i < nums; i++) {
			arr[i] = kb.nextInt();
		}
		kb.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < joker) {
				arr[i] = 0;
			}
			while (arr[i] >= joker) {
				arr[i] -= joker;
			}
		}
		
		System.out.println();
		System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			System.out.printf(" %d", arr[i]);
		}
		
	}

}
