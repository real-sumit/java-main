package Bit;
import java.util.Scanner;

public class bit_difference {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number = ");
		int n = sc.nextInt();
		
		System.out.print("Enter another number = ");
		int m = sc.nextInt();
		sc.close();

		int c = 0;
		while(n > 0 || m > 0) {
			if((n & 1) != (m & 1))
				c++;
			
			n = n >> 1;
			m = m >> 1;
		}
		System.out.println("No. of different bits : " + c);
	}
}
