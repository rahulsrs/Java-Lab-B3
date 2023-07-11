package lab;
import java.util.*;
public class lexico 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 5 strings:");
		String[] words= new String[5];
		words[0]=sc.next();
		words[1]=sc.next();
		words[2]=sc.next();
		words[3]=sc.next();
		words[4]=sc.next();
		System.out.println("Unsorted:");
		for(int i=0;i<5;i++) 
		{
			System.out.print(words[i]+ " ");
		}
		System.out.println();
		Arrays.sort(words);
		System.out.println("Lexicographical order:");
		for(int i=0;i<5;i++) 
		{
			System.out.print(words[i]+ " ");
		}
		
	}
} 