package Bit;
import java.util.Scanner;

public class set0_bit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		
		System.out.print("Enter position of the bit = ");
		int bitPosition = sc.nextInt();
		sc.close();

		int mask = ~(1 << bitPosition);
		System.out.println("The new number is = " + (n & mask));
	}
}
