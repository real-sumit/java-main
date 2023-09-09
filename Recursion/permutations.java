package Recursion;
import java.util.Scanner;

public class permutations {
	void permute(String s, String x) {
		if(s.length() == 0) {
			System.out.println(x + " ");
			return;
		}
		for(int j = 0; j < s.length(); j++)
			permute(s.substring(0, j) + s.substring(j + 1), x + s.charAt(j));
	}
	public static void main(String args[]) {
		permutations ob = new permutations();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string = ");
		String s = sc.next();
		sc.close();
		
		ob.permute(s, "");
	}
}