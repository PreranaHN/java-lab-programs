package week7;

import java.util.Scanner;
public class diagonal {
	public static void main(String args[]) {
		int matrix[][]=new int[3][3];
		Scanner inScanner = new Scanner(System.in);
		System.out.println("Enter matrix elements one by one:  ");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				matrix[i][j] = inScanner.nextInt();
			}
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i==j) {
					System.out.println(matrix[i][j] + " ");
				}
				else {
					System.out.println(" * ");
				}
			}
			System.out.println(" \t ");
		}
		inScanner.close();
	}
}