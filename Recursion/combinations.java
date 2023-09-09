package Recursion;
import java.util.Scanner;

public class combinations {
	void combine(String s,int i,String x) {
		if(s.length()==i) {
			System.out.println(x+" ");
			return;
		}
		combine(s,i+1,x+s.charAt(i));
		combine(s,i+1,x);
	}
	public static void main(String args[]) {
		combinations ob=new combinations();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string = ");
		String s=sc.next();
		sc.close();
		
		ob.combine(s,0,"");
	}
}
