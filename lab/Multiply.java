package lab;

import java.util.Scanner;

public class Multiply {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The number of rows for 1st Array");
		int rows1 = scan.nextInt();
		System.out.println("Enter The number of columns for 1st Array");
		int columns1 = scan.nextInt();
		int[][] array1 = new int[rows1][columns1];
		System.out.println("Enter The number of rows for 2nd Array");
		int rows2 = scan.nextInt();
		System.out.println("Enter The number of columns for 2nd Array");
		int columns2 = scan.nextInt();
		int[][] array2 = new int[rows2][columns2];
		int i;
		int j;
		if (!(columns1 == rows2)) {
			System.out.print("Multiplication not Possible"); 
			return;
		}
		System.out.println("Enter the values for array 1");
		for (i = 0; i < rows1; i++) {
			for (j = 0; j < columns1; j++) {
				System.out.println("Enter value for row " + i + " and Column " + j + " ");
				array1[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter the values for array 2");
		for (i = 0; i < rows2; i++) {
			for (j = 0; j < columns2; j++) {
				System.out.println("Enter value for row " + i + " and Column " + j + " ");
				array2[i][j] = scan.nextInt();
			}
		}
		// Multiplying Matrices

		int[][] res = new int[rows1][columns2];

		for (i = 0; i < rows1; i++) {
			for (j = 0; j < columns2; j++) {
				int sum = 0;
				for (int k = 0; k < rows2; k++) {
					sum += array1[i][k] * array2[k][j];
				}
				res[i][j] = sum;
			}
		}
		System.out.println();
		for (i = 0; i < res.length; i++) {
			for (j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

	}
}
