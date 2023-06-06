package lab;
import java.util.*;
class Pass{
	int room;
	long ph;
	Scanner scan = new Scanner(System.in);
	Pass(){
		System.out.println("Enter Room number ");
		room = scan.nextInt();
		System.out.println("Enter Phone number ");
		ph = scan.nextLong();
		}
	
	
}

public class Password {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Pass word = new Pass();
		System.out.println("Enter your name");
		String name = scan.nextLine();
		int rem,sum=0;
		char sym[] = {'!','@','#','$','%','^','&','&','*','(',')'};
		while(word.room%10!=0) {
			rem = word.room%10;
			sum += rem;
			word.room /=10;
			if(sum>=10) {
				word.room = sum;
				sum =0;
			}
		}
		
		String pw = ""+name.charAt(0)+(word.ph%10)+sum + sym[rand.nextInt(sym.length-1)]+ name.charAt(name.length()-1);
		System.out.println(pw);
	}
}
