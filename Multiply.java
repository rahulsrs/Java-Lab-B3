package lab;

import java.util.Scanner;

public class Multiply {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The number of rows for 1st Array");
		int rows = scan.nextInt();
		System.out.println("Enter The number of columns for 1st Array");
		int columns = scan.nextInt();
		int[][] array1 = new int[rows][columns];
		System.out.println("Enter The number of rows for 2nd Array");
		rows = scan.nextInt();
		System.out.println("Enter The number of columns for 2nd Array");
		columns = scan.nextInt();
		int[][] array2 = new int[rows][columns];
		int i;
		int j;		
		if(!(array1[0].length == array2.length)){
			System.out.print("Multiplication not Possible");
			return;
		}
		System.out.println("Enter the values for array 1");
		for(i=0;i<array1.length;i++){
			for(j=0;j<array1[0].length;j++){
			System.out.println("Enter value for row " +i +" and Column " + j+" ");
			array1[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter the values for array 2");
		for(i=0;i<array2.length;i++){
			for(j=0;j<array2[0].length;j++){
			System.out.println("Enter value for row " +i +" and Column " + j+" ");
			array2[i][j] = scan.nextInt();
			}
		}
		//Multiplying Matrices
		
		int[][] res = new int[2][2];
		
		for(i=0;i<array1.length;i++) {
			for(j=0;j<array1[0].length;j++) {
				int sum=0;
				for(int k=0;k<array2.length;k++){
					sum += array1[i][k] * array2[k][j];
				}
			res[i][j]= sum;
			}
		}
		System.out.println();
		for(i=0;i<res.length;i++) {
			for(j=0;j<res[0].length;j++){
				System.out.print(res[i][j]+ " ");
			}
				System.out.println();
			}
		
	}
}
