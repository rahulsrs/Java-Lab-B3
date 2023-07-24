	package lab;

import java.util.Scanner;

public class Calc {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		Double a,b;
		System.out.println("Enter Operand 1 ");
		a = scan.nextDouble();
		System.out.println("Enter Operand 2 ");
		b = scan.nextDouble();
		System.out.print("Enter the operator for the operation ");
		char op = scan.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
			System.out.println("Invalid input");
			
		}
	
	}
}
