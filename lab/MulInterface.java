package lab;
import java.util.*;
// Declare the interfaces
interface sub {
	void sub(int a, int b);
}

interface mul {
	void mul(int a, int b);
}

// Implement the interfaces in a class
class MulInterface implements sub,mul {
	public void sub(int a, int b)
	{
        int diff = a-b;
		System.out.println("Difference of a & b is "+diff);
	}

	public void mul(int a, int b)
	{
        int pro = a*b;
		System.out.println("Product of a & b is "+pro);
	}
}

// Use the class to call the methods from the interfaces
class Main {
	public static void main(String[] args)
	{
		MulInterface obj = new MulInterface();
		obj.sub(18,10);
		obj.mul(18,10);
	}
}