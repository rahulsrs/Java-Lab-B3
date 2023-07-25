package lab;
import java.util.*;
interface yes{
    int check(int num);
}

class Happy_no implements yes {
    public int check(int num) {
        int rem = 0, sum = 0;
        // calculate the sum of squares of each digit
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }}
    
    public class Happy{
    public static void main(String[] args) {
        // Take num
        Happy_no obj = new Happy_no();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number greater than 0:");
        int num = sc.nextInt();
        int finalVal = num;
        while (finalVal != 1 && finalVal != 4) {
            finalVal = obj.check(finalVal);
        }
        if (finalVal == 1) {
            System.out.println("The number entered is a Happy Number");
        } else {
            System.out.println(" The number entered is not a Happy Number");
        }
    }
}