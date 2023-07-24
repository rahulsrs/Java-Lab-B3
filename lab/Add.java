package lab;
import java.util.*;
class method
{
		void method(int a[][], int b[][]) {
		int c[][] = new int[3][3];
		System.out.println("Sum of 2 matrices is ");
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
	
}

public class Add {

	public static void main(String[] args) {
		
		int arr1[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int arr2[][] = {{1,1,1},{2,2,2},{3,3,3}};
		method obj = new method();
		obj.method(arr1, arr2);
		
	
	}

}