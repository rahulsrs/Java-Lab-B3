package lab;
import java.util.*;
public class Pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i=0,j=0,n;
		System.out.println("Enter the level");
		n = sc.nextInt();
		for(i=0;i<=n-1;i++){
			for(j=0;j<2*n;j++){
				if(j>n+i||j < n-i) {
					System.out.print(" ");
				}
				else {
					if(j<=n){
						System.out.print(j-n+2*(i)+1);
					}
					if(j>n){
						System.out.print(n-j+2*(i)+1);
					}
				}
			}
			System.out.println();
		}
	}
}
