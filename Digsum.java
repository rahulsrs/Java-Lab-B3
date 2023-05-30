package lab;
import java.util.Scanner;
public class Digsum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number ");
		int a = scan.nextInt();
		int count =1;
		while(a>10) {
			System.out.print(count + ": "+ a );
			a = digsum(a);
			count++;
			System.out.println();
		}
		System.out.print(count + ": "+ a );
		
	}
	
	public static int digsum(int x){
		int dig1,dig2,res=x;
		
		if(x>10) {
			dig1 = x%10;
			dig2=x/10;
			res = dig1+dig2;
		}
		return res;
	}
	
}
