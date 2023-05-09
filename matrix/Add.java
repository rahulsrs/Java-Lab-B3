package matrix;
import java.util.Scanner;
public class Add {


		public static void main(String arg[]) {
			int[][] array1 = new int[2][2];
			int[][] array2 = new int[2][2];
			int i;
			int j;
			
			Scanner scan = new Scanner(System.in);
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
			int[][] res = new int[5][5];
			for(i=0;i<array1.length;i++) {
				for(j=0;j<array2[0].length;j++) {
					res[i][j] = array1[i][j] + array2[i][j];
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}	

			
			
		}
	}

