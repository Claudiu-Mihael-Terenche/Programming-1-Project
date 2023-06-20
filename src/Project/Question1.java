package Project;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 2 digit numbers:");
		Scanner kb = new Scanner(System.in);
		int n1, n2, n3;
		n1 = kb.nextInt();
		n2 = kb.nextInt();
		n3 = kb.nextInt();
		kb.close();
		int x;
		System.out.println();
		if ((n1+n2+n3) % 3 == 0 && (n1+n2+n3) % 5 != 0) {
			if (n1+n3 >= 100) {
				x = n1+n3+ ((n2/10)*1000);
			} else {
				x = n1+n3+ ((n2/10)*100);
			}
		} else if ((n1+n2+n3) % 3 != 0 && (n1+n2+n3) % 5 == 0) {
			x = (n1+n3)*10 + (n2 % 10);
		} else if ((n1+n2+n3) % 3 == 0 && (n1+n2+n3) % 5 == 0) {
			x = n2*1000 + n1 * 10 + 1;
		} else {
			x = n1*10000 + n2*100 + n3;
		}
		System.out.printf("Your magic number is %d", x);
	}

}
