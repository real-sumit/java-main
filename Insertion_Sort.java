import java.util.*;

public class Insertion_Sort {
	void sort(int x[]) {
		int key,j;
		for(int i=1;i<x.length;i++) {
			key=x[i];
			j=i-1;
			while(j>=0 && key<x[j]) {
				x[j+1]=x[j];
				j--;
			}
			x[j+1]=key;
		}
	}
	
	public static void main(String args[]) {
		Insertion_Sort ob=new Insertion_Sort();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of the array");
		int n=sc.nextInt();
		
		int x[]=new int[n];
		System.out.println("Enter elements in the array");
		for(int i=0;i<n;i++)
			x[i]=sc.nextInt();
		
		ob.sort(x);
		
		System.out.println("After sorting : ");
		for(int i=0;i<n;i++)
			System.out.print(x[i]+" ");
		
		sc.close();
	}
}
