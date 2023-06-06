package lab;
import java.util.Scanner;
public class SquareInMat {
	public static void main(String artgs[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of square matrix ");
		int n = scan.nextInt();
		if(n<0) {
			System.out.println("Invalid input");
			return;
		}
		int res=0;
		for(int i=0;i<=n;i++){
			res+= Math.pow(i, 2);
		}
		System.out.print("The number of square matrices in the matrix is " + res);
	}
}
