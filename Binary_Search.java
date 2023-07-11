package lab;
import java.util.*;
public class Binary_Search 
{
	public static void bsearch(int arr[],int low, int high, int key)
	{
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(arr[mid]<key)
			{
				low=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("Element found at index " + mid);
				break;
			}
			else
			{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if(high<low)
			System.out.println("Element not found");
		
	}

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter a array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Enter the element you want to find:");
		int key=scan.nextInt();
		
		int high=size-1;
		bsearch(arr,0,high,key);

	}

}