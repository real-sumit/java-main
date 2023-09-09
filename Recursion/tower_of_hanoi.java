package Recursion;
import java.util.Scanner;

public class tower_of_hanoi {
	void hanoi(int n,int start,int end) {
		if(n==1)
			print_move(start,end);
		else {
			int other=6-(start+end);
			hanoi(n-1,start,other);
			print_move(start,end);
			hanoi(n-1,other,end);
		}
	}
	void print_move(int start,int end) {
		System.out.println(start+"->"+end);
	}
	public static void main(String args[]) {
		
		tower_of_hanoi ob=new tower_of_hanoi();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of discs : ");
		int n=sc.nextInt();
		
		System.out.print("Enter the start stack(1/2/3) : ");
		int start=sc.nextInt();
		
		System.out.print("Enter the end stack(1/2/3) : ");
		int end=sc.nextInt();
		sc.close();

		if(start==end || n<1)
			System.out.println("Please enter correctly");
		else 
			ob.hanoi(n, start, end);
	}
}